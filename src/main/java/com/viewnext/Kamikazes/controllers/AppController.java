package com.viewnext.Kamikazes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador de la Pagina principal
 */
@Controller
public class AppController {

    /**
     * Se encarga de mostrar la Vista
     */
    @GetMapping("/")
    public String mostrarPaginaInicio() {
        return "inicio.html";
    }


}
