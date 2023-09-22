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


@Controller
public class PilotosController {

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

    @PostMapping("/eliminarPiloto")
    public String eliminarPiloto(@RequestParam int id) {
        PilotoRepository.eliminarPilotos(id);
        return "redirect:/piloto";
    }

    @PostMapping("/agregarPiloto")
    public String agregarPiloto(@RequestParam String nombre,@RequestParam int puntos,@RequestParam int campeonatos ,@RequestParam String Escuderia) {

        List<Piloto> pilotos = PilotoRepository.obtenerListaPilotos();

        int maximoId = 0;
        for (Piloto piloto : pilotos) {
            int idPiloto = piloto.getId();
            if (idPiloto > maximoId) {
                maximoId = idPiloto;
            }
        }
        Piloto nuevoPiloto = new Piloto(maximoId++, puntos, campeonatos, nombre, Escuderia);
        pilotos.add(nuevoPiloto);

        return "redirect:/pilotos";
    }
}
