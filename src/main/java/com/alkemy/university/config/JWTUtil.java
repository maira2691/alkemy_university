package com.alkemy.university.config;

import com.alkemy.university.model.MyUserDetails;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JWTUtil {
    private static final String KEY = "sh2v3";

    public String generateToken(UserDetails myUserDetails) {
        return Jwts.builder().setSubject(myUserDetails.getUsername()).setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 *60 * 10))
                .signWith(SignatureAlgorithm.HS256, KEY).compact();
    }
}
