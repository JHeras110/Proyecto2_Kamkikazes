package com.viewnext.Kamikazes.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.viewnext.Kamikazes.models.Piloto;
import com.viewnext.Kamikazes.repositories.PilotoRepository;

@Controller
public class AgregarPilotosController {

    @GetMapping("/agregarPiloto")
    public String mostrarPaginaAgregarPiloot(@ModelAttribute Piloto piloto) {
        return "agregarPilotos";
    }

    @PostMapping("/agregarPiloto/save")
    public String agregarPiloto(@ModelAttribute Piloto piloto) {
        System.out.println("hola");
        List<Piloto> listaPilotos = PilotoRepository.obtenerListaPilotos();

        listaPilotos.add(piloto);
        System.out.println(piloto);

        return "redirect:/piloto";
    }
}
