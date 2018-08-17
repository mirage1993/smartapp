package com.smartapp.project.config.spring.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserLogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler {

    private Logger logger = LoggerFactory.getLogger(UserLogoutSuccessHandler.class);

    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response,
                                Authentication authentication) throws IOException, ServletException {
        super.onLogoutSuccess(request, response, authentication);
        logger.info("注销！");
    }

}
