package com.alkemy.university.service;

import com.alkemy.university.model.MyUserDetails;
import com.alkemy.university.model.User;
import com.alkemy.university.repository.DAOUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlkemyUserDetailsService implements UserDetailsService {

    @Autowired
    DAOUser userDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user =  userDAO.findByUsername(username);
        user.orElseThrow(() -> new UsernameNotFoundException("Dni no encontrado"));
        return user.map(MyUserDetails::new).get();
    }
}
