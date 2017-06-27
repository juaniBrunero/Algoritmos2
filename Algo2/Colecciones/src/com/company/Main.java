package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> cadenas = new ArrayList<>();

        cadenas.add("1");           //Para agregar
        cadenas.add("2");
        cadenas.add("3");

        for (String cadena: cadenas){    //Para recorrer
            System.out.println(cadena);
        }

        Boolean existe = cadenas.contains("1"); //Busca la cadena

        if(existe){
            cadenas.remove("1");      //Elimina dato
        }

        for (String cadena: cadenas){    //Para recorrer
            System.out.println(cadena);
        }


        HashMap<String, String> tablaNombres = new HashMap<>();

    }
}

