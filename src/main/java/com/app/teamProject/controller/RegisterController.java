package com.app.teamProject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("register/*")
public class RegisterController {

    @GetMapping("registerMain")
    public void registerMain(){;}

    @GetMapping("registerNext")
    public void registerNext(){;}

    @GetMapping("registerOk")
    public void registerOk(){;}
}
