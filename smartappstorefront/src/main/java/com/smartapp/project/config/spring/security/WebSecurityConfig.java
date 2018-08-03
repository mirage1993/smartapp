package com.smartapp.project.config.spring.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

import javax.servlet.Filter;

@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        CookieCsrfTokenRepository csrfTokenRepository = CookieCsrfTokenRepository.withHttpOnlyFalse();
        csrfTokenRepository.setCookieHttpOnly(true);

        http.csrf()
                .csrfTokenRepository(csrfTokenRepository)
                .and()
                .authorizeRequests()
                .antMatchers("/login").permitAll()
                .antMatchers("/img/**").permitAll()
                .antMatchers("/js/**").permitAll()
                .antMatchers("/css/**").permitAll()
                .antMatchers("/bootstrap/**").permitAll()
                .antMatchers("/fonts/**").permitAll()
                .antMatchers("/favicon.ico").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login")
                .usernameParameter("username")
                .passwordParameter("password")
                .defaultSuccessUrl("/home")
                .and()
                .logout()
                .invalidateHttpSession(true)
                .clearAuthentication(true)
                .and()
                .httpBasic();

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .parentAuthenticationManager(authenticationManager())
                .authenticationProvider(userAuthenticationProvider());
    }

    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }

    @Bean
    public UserAuthenticationProvider userAuthenticationProvider() {
        return UserAuthenticationProvider.create();
    }

    @Bean
    public AuthenticationManager authenticationManager() {
        return new UserAuthenticationManager();
    }

}
