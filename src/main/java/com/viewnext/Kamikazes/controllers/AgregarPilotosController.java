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

/**
 * Controlador de la pagina Agregar Pilotos
 */
@Controller
public class AgregarPilotosController {

     /**
     * Metodo que se encarga de mostrar la vista
     * @param model
     * @return
     */
    @GetMapping("/agregarPiloto")
    public String mostrarPaginaAgregarPiloot(@ModelAttribute Piloto piloto) {
        return "agregarPilotos";
    }

    /**
     * Metodo que recibe 
     * @param piloto
     * y lo añade a la lista de Pilotos
     * @return
     */
    @PostMapping("/agregarPiloto/save")
    public String agregarPiloto(@ModelAttribute Piloto piloto) {
        List<Piloto> listaPilotos = PilotoRepository.obtenerListaPilotos();

        listaPilotos.add(piloto);
        System.out.println(piloto);

        return "redirect:/piloto";
    }
}
