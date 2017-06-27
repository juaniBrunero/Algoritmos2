package com.company;

import java.util.ArrayList;

public class Galaxia {
    Sol sol;
    ArrayList<Planeta>      planetas;
    ArrayList<ICondiciones> condiciones;

    public void setCondiciones(ArrayList<ICondiciones> condiciones) {
        this.condiciones = condiciones;
    }

    public void setPlanetas(ArrayList<Planeta> planetas) {
        this.planetas = planetas;
    }

    public ArrayList<Planeta> getPlanetas() {
        return planetas;
    }

    public ArrayList<ICondiciones> getCondiciones() {
        return condiciones;
    }

    public void setSol(Sol sol) {
        this.sol = sol;
    }

    public void actualizarCondiciones(double dias){
        for (ICondiciones condicion: condiciones) {
            condicion.cumpleCondicion(this.planetas, dias);
        }
    }

    public void mostar(double d){
        System.out.println("-----------------");
        System.out.print("Dia: ");
        System.out.println(d);
        for(Planeta pl: planetas){
            pl.mostrar(d);
        }
    }
}
