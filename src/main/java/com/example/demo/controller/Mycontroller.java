package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Mycontroller {

    @GetMapping("/g40")
    public String saludar1(){
        return "<h1>Hola a todos!</h1>";
    }

    @GetMapping("/g4")
    public String saludar2(){
        return "<h1>Hola a todos como estan</h1>";

    }
}

