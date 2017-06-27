package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Interesado i1 = new Sensor();
        Interesado i2 = new Sensor();

        Termocupla termocupla = new Termocupla();
        termocupla.subscribir(i1);
        termocupla.subscribir(i2);

        termocupla.setTemperatura(100.0);
        termocupla.setTemperatura(101.0);
        termocupla.setTemperatura(99.0);
    }
}





