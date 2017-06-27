package com.company;

public class Sensor implements Interesado {
    Double temperatura;

    @Override
    public void actualizar(Termocupla termpocupla) {
        this.temperatura = termpocupla.getTemperatura();
        System.out.println("Actualo temperatura a " + this.temperatura);
    }
}