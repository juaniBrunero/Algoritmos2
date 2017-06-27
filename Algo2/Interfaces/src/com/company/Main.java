package com.company;

public class Main {
    public static void main(String[] args) {
	    ISalaDeChat sala = new OtraSala();

	    sala.registrar(new Participante());
    }
}

interface ISalaDeChat{
    void registrar(Participante p);
    void enviar(Participante de, Participante a, String msj);
}

class OtraSala implements ISalaDeChat{
    @Override
    public void registrar(Participante p) { }
    @Override
    public void enviar(Participante de, Participante a, String msj) { }
}

class Participante{ }