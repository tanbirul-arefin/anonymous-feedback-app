package com.real.real_full_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@RequiredArgsConstructor
@Controller
public class Appcontroller {

    @GetMapping({"/", "/home"})
    public String homePage() {
    return "home-page";
    }
}

