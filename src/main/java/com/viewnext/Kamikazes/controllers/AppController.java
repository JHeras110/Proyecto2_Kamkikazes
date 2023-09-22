package com.viewnext.Kamikazes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String mostrarPaginaInicio() {
        return "inicio.html";
    }


}
