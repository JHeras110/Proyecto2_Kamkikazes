package com.viewnext.Kamikazes.controllers;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.viewnext.Kamikazes.models.Piloto;
import com.viewnext.Kamikazes.repositories.PilotoRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controlador del Listado de Pilotos
 */
@Controller
public class PilotosController {

    /**
     * Metodo que se encarga de mostrar la vista y pasarle la 
     * lista de Pilotos ordenado por puntos
     * @param model
     * @return
     */
    @GetMapping("/piloto")
    public String mostrarPilotos(Model model) {
        
        List<Piloto> pilotos = PilotoRepository.obtenerListaPilotos();

        Collections.sort(pilotos, new Comparator<Piloto>() {
            @Override
            public int compare(Piloto piloto1, Piloto piloto2) {
                return Integer.compare(piloto2.getPuntos(), piloto1.getPuntos());
            }
        });

        for (Piloto piloto : pilotos) {
            System.out.println(piloto.toString());
        }
        model.addAttribute("pilotos", pilotos);

        return "pilotos";
    }

    /**
     * Metodo para eliminar un piloto y recargar la pagina con los datos nuevos con
     * el parametro ue recibe
     * @param id
     */
    @PostMapping("/eliminarPiloto")
    public String eliminarPiloto(@RequestParam int id) {
        PilotoRepository.eliminarPilotos(id);
        return "redirect:/piloto";
    }

}
