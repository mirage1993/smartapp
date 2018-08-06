package com.smartapp.project.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Scope("prototype")
public class DefaultPageController {

    @GetMapping("/signin")
    public String login() {
        return "login";
    }

}
