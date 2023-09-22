package com.viewnext.Kamikazes.repositories;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.viewnext.Kamikazes.models.Escuderia;
import com.viewnext.Kamikazes.models.Piloto;


public class EscuderiasRepository {

    
    private List<Escuderia> listaEscuderias = new ArrayList<>();

    public List<Escuderia> obtenerEscuderias(List<Piloto> listaPilotos){        
        System.out.println("hola");
        crearEscuderiasBase();
        
        for (Escuderia escuderia : listaEscuderias) {
            int totalCampeonatos=0;
            int totalPuntos=0;
            for (Piloto piloto : listaPilotos) {
                if(escuderia.getNombre().equals(piloto.getEscuderia())){
                    totalCampeonatos+=piloto.getCampeonatos();
                    totalPuntos+=piloto.getPuntos();
                }
            }
            escuderia.setTotalPuntos(totalPuntos);
            escuderia.setTotalCampeonatos(totalCampeonatos);
        }

        for (Escuderia escuderia : listaEscuderias) {
            System.out.println(escuderia.toString());
        }
        return listaEscuderias;

    }

    private void crearEscuderiasBase(){
        Escuderia escuderia1 = new Escuderia("Ferrari");
        Escuderia escuderia2 = new Escuderia("Red Bull");
        Escuderia escuderia3 = new Escuderia("Aston Martin");
        Escuderia escuderia4 = new Escuderia("Alpha Tauri");
        Escuderia escuderia5 = new Escuderia("Alfa Romeo");
        Escuderia escuderia6 = new Escuderia("Mercedes");
        Escuderia escuderia7 = new Escuderia("Williams");
        Escuderia escuderia8 = new Escuderia("Mclaren");
        Escuderia escuderia9 = new Escuderia("Haas");
        Escuderia escuderia10 = new Escuderia("Alpine");

        listaEscuderias.add(escuderia1);
        listaEscuderias.add(escuderia2);
        listaEscuderias.add(escuderia3);
        listaEscuderias.add(escuderia4);
        listaEscuderias.add(escuderia5);
        listaEscuderias.add(escuderia6);
        listaEscuderias.add(escuderia7);
        listaEscuderias.add(escuderia8);
        listaEscuderias.add(escuderia9);
        listaEscuderias.add(escuderia10);

    }
}
