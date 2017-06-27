package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList();
        valores.add(1);
        valores.add(3);
        valores.add(5);
        valores.add(8);
        valores.add(10);
        valores.add(18);
        valores.add(24);
        valores.add(30);

        Responsable respA = new RespA();
        Responsable respB = new RespB();
        Responsable respC = new RespC();

        respB.setSiguiente(respC);
        respA.setSiguiente(respB);

        for (Integer valor : valores) {
            respA.atender(valor);
        }

    }
}


abstract class Responsable {

    protected Responsable siguiente;

    public void setSiguiente(Responsable responsable) {
        this.siguiente = responsable;
    }

    public abstract void atender(Integer valor);
}

class RespA extends Responsable {

    @Override
    public void atender(Integer valor) {
        if (valor > 1 && valor <= 10) {
            System.out.println("Atiende A");
        } else {
            siguiente.atender(valor);
        }
    }
}

class RespB extends Responsable {

    @Override
    public void atender(Integer valor) {
        if (valor > 10 && valor <= 20) {
            System.out.println("Atiende B");
        } else {
            siguiente.atender(valor);
        }
    }
}

class RespC extends Responsable {

    @Override
    public void atender(Integer valor) {
        if (valor > 20 && valor <= 30) {
            System.out.println("Atiende C");
        }
    }
}
