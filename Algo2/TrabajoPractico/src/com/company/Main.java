package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Galaxia sistemaSolar = new Galaxia();

        sistemaSolar.setPlanetas   (cargarDatos(new ArrayList<Planeta>()));
        sistemaSolar.setCondiciones(cargarCondiciones(new ArrayList<ICondiciones>()));
        sistemaSolar.setSol        (new Sol(0, 0));

        sistemaSolar.actualizarCondiciones(0);

        sistemaSolar.mostar(0);

        sistemaSolar.mostar(360);

        //System.out.println(sistemaSolar.getPlanetas().size());
        //System.out.println(sistemaSolar.getCondiciones().size());
    }

    public static ArrayList<Planeta> cargarDatos(ArrayList<Planeta> planetas){
        planetas.add(new Planeta(500 , 1 , "Alderaan"));
        planetas.add(new Planeta(2000, 3 , "Felucia"));
        planetas.add(new Planeta(1000, -5, "Pegarus"));
        return planetas;
    }

    public static ArrayList<ICondiciones> cargarCondiciones(ArrayList<ICondiciones> condiciones){
        condiciones.add(new CondAlineadosSol());
        //condiciones.add(new ());
        //c1ondiciones.add(new ());
        return condiciones;
    }
}
