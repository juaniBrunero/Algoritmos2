package com.company;

public class Main {

    public static void main(String[] args) {
        Lamparita l = new Lamparita();

        l.getEstado().mostrar();

        l.presionar();

        l.getEstado().mostrar();

        l.presionar();

        l.getEstado().mostrar();

        Lamparita l1 = new Lamparita();
        Lamparita l2 = new Lamparita();

        if (l1 == l2) {
            System.out.println(true);
        }
    }
}

class Lamparita {
    private Estado estado;

    Lamparita() {
        this.estado = new Apagado();
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void presionar() {
        this.estado.cambiar(this);
    }
}

abstract class Estado
{
    abstract void mostrar();
    abstract void cambiar(Lamparita lamparita);
}

class Encendido extends Estado {

    @Override
    void mostrar() {
        System.out.println("Lampara encendida. ");
    }

    @Override
    void cambiar(Lamparita lamparita) {
        lamparita.setEstado(new Apagado());
    }
}

class Apagado extends Estado {

    @Override
    void mostrar() {
        System.out.println("Lampara apagada. ");
    }

    @Override
    void cambiar(Lamparita lamparita) {
        lamparita.setEstado(new Encendido());
    }
}