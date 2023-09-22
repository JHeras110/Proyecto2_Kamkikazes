package com.viewnext.Kamikazes.repositories;

import java.util.ArrayList;
import java.util.List;

import com.viewnext.Kamikazes.models.Piloto;

public class PilotoRepository {

		private static List<Piloto> listaPilotos = crearPilotos();

    private static  List<Piloto> crearPilotos(){
        List<Piloto> pilotos = new ArrayList<>();
        
        Piloto piloto1 = new Piloto(1, 150, 1, "JHeras", "Alpha Tauri");
        Piloto piloto2 = new Piloto(2, 167, 0, "Skalera", "Alpha Tauri");
        Piloto piloto3 = new Piloto(3, 192, 4, "Erner0", "Aston Martin");
        Piloto piloto4 = new Piloto(4, 14, 0, "ValdesAnd", "Aston Martin");
        Piloto piloto5 = new Piloto(5, 4, 0, "Jordan", "Alpine");
        Piloto piloto6 = new Piloto(6, 60, 0, "JAJG", "Alpine");
        Piloto piloto7 = new Piloto(7, 82, 0, "Steff", "Mercedes");
        Piloto piloto8 = new Piloto(8, 80,  0, "AdriKirk", "Mercedes");
        Piloto piloto9 = new Piloto(9, 123, 1, "Kiki", "Alfa Romeo");
        Piloto piloto10 = new Piloto(10, 3, 2, "Juan", "Alfa Romeo");
        Piloto piloto11 = new Piloto(11, 9, 0, "Metraka", "Red Bull");
        Piloto piloto12 = new Piloto(12, 24, 1, "SweyK5", "Red Bull");
        Piloto piloto13 = new Piloto(13, 14, 0, "Mantas", "Williams");
        Piloto piloto14 = new Piloto(14, 17, 0, "Alvaro", "Williams");
        Piloto piloto15 = new Piloto(15, 19, 0, "Vitter0", "Haas");
        Piloto piloto16 = new Piloto(16, 79, 0, "Tete", "Ferrar");
        Piloto piloto17 = new Piloto(17, 75, 0, "Molina", "Ferrari");


        pilotos.add(piloto1);
        pilotos.add(piloto2);
        pilotos.add(piloto3);
        pilotos.add(piloto4);
        pilotos.add(piloto5);
        pilotos.add(piloto6);
        pilotos.add(piloto7);
        pilotos.add(piloto8);
        pilotos.add(piloto9);
        pilotos.add(piloto10);
        pilotos.add(piloto11);
        pilotos.add(piloto12);
        pilotos.add(piloto13);
        pilotos.add(piloto14);
        pilotos.add(piloto15);
        pilotos.add(piloto16);
        pilotos.add(piloto17);

        return pilotos;
    }

    public static List<Piloto> obtenerListaPilotos(){
		    return listaPilotos;
    }



    public static void eliminarPilotos(int id) {
      
      for (Piloto piloto : listaPilotos) {
          if (piloto.getId() == id) {
              listaPilotos.remove(piloto);
              return; 
          }
      }
    }

}
