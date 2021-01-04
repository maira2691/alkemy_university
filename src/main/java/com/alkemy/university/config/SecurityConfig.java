package com.alkemy.university.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    //Configuración de querys personalizadas para acceder a los nombres de usuario y las autoridades
    //Todos los usuarios tendrán autoridad 'USER'
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .jdbcAuthentication()
                .usersByUsernameQuery("select dni from user where dni=?")
                .authoritiesByUsernameQuery("select u.dni, r.role from user u " +
                        "inner join user_role ur on(u.id_user=ur.id_user) " +
                        "inner join role r on(ur.id_role=r.id_role) " +
                        "where u.dni=?")
                .dataSource(dataSource);
    }

    //Configuración de rutas y permisos necesarios para llegar a ellas
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()
                .antMatchers("/home").permitAll()
                .antMatchers("/user").permitAll()
                .anyRequest().hasAuthority("USER")
                .and()
                .csrf()
                .disable()
                .formLogin().loginPage("/login1")
                .defaultSuccessUrl("/home")
                .failureUrl("/login?error=true")
                .usernameParameter("dni")
                .and()
                .csrf()
                .disable()
                .headers().frameOptions().disable()
                .and()
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/user")
                .and()
                .exceptionHandling()
                .accessDeniedPage("/access-denied");
    }

    //Ignora la seguridad en ciertos direcctorios
    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**", "/vendor/**", "/fonts/**");
    }
}
