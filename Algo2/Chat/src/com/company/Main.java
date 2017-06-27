package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	    Particiante juan  = new Particiante("Juan");
        Particiante jose  = new Particiante("Jose");
        Particiante maria = new Particiante("Maria");

        HashMap<String, Particiante> tabla = new HashMap<>();

        tabla.put(juan.getNickname() , juan);
        tabla.put(jose.getNickname() , jose);
        tabla.put(maria.getNickname(), maria);

        if(tabla.containsKey("Juan")){
            Particiante nuevo = tabla.get("Juan");
            System.out.println(nuevo.getNickname());
            tabla.remove("Juan");
        }
    }
}

class Particiante{
    private String nickname;

    Particiante(String nickname){
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }
}
