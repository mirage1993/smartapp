package com.smartapp.project.config.spring.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class UserAuthenticationProvider implements AuthenticationProvider {

    private UserAuthenticationProvider() {

    }

    public static UserAuthenticationProvider create() {
        return new UserAuthenticationProvider();
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return authentication;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.equals(authentication);
    }
}
