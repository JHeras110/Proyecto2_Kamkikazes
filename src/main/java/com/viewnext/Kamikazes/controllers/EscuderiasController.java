package com.viewnext.Kamikazes.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.viewnext.Kamikazes.models.Escuderia;
import com.viewnext.Kamikazes.models.Piloto;
import com.viewnext.Kamikazes.repositories.EscuderiasRepository;
import com.viewnext.Kamikazes.repositories.PilotoRepository;

@Controller
public class EscuderiasController {
    
    @GetMapping("/escuderia")
    public String mostrarPilotos(Model model) {
        EscuderiasRepository escuderiaRepository = new EscuderiasRepository();
        List<Piloto> pilotos = PilotoRepository.obtenerListaPilotos();
        List<Escuderia> escuderias = escuderiaRepository.obtenerEscuderias(pilotos);

        Collections.sort(escuderias, new Comparator<Escuderia>() {
            @Override
            public int compare(Escuderia escuderia1, Escuderia escuderia2) {
                return Integer.compare(escuderia2.getTotalPuntos(), escuderia1.getTotalPuntos());
            }
        });

        model.addAttribute("escuderias", escuderias);

        return "escuderias";
    }
}
