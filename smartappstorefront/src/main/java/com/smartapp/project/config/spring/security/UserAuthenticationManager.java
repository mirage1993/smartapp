//package com.smartapp.project.config.spring.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//
//public class UserAuthenticationManager implements AuthenticationManager {
//
//    @Autowired
//    private UserAuthenticationProvider userAuthenticationProvider;
//
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        return userAuthenticationProvider.authenticate(authentication);
//    }
//
//}
