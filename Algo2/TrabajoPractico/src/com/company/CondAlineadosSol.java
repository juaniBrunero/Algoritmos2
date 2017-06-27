package com.company;

import java.util.ArrayList;

public class CondAlineadosSol implements ICondiciones {

    @Override
    public void cumpleCondicion(ArrayList<Planeta> planetas, double d){
        double m = 0;
        boolean pertenecen = true;
        try{
            Planeta a = planetas.get(0);
            Planeta b = planetas.get(1);

            //Calcula pendiente con dos puntos; //CAMBIAR
            double alphaY = Math.abs(a.getPos(d).getY() - b.getPos(d).getY());
            double alphaX = Math.abs(a.getPos(d).getX() - b.getPos(d).getX());
            m = alphaY/alphaX;

        }catch (Exception e){
            System.out.println("No hay suficientes planetas");
        }

        for (Planeta p: planetas) {
            pertenecen = pertenecen && p.pertenece(m, 0, d);
        }
        //System.out.println(pertenecen);
    }

}
