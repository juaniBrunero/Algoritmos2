package com.company;

public class Main {

    public static void main(String[] args) {
	    Nave n1 = new Nave();
	    Nave n2 = new NaveGrande();

	    Asteroide a1 = new Asteroide();
	    Asteroide a2 = new AsteroideExplosivo();

        n1.colisionarCon(a1);
        n1.colisionarCon(a2);
        n2.colisionarCon(a1);
        n2.colisionarCon(a2);
    }
}

class Nave {
    public void colisionarCon(Asteroide asteroide) {
        asteroide.colisionarCon(this);
    }
}

class NaveGrande extends Nave {
    @Override
    public void colisionarCon(Asteroide asteroide) {
        asteroide.colisionarCon(this);
    }
}

class Asteroide {


    public void colisionarCon(Nave nave) {
        System.out.println( "Asteroide con Nave");
    }

    public void colisionarCon(NaveGrande naveGrande) {
        System.out.println( "Asteroide con NaveGrande");
    }
}

class AsteroideExplosivo extends Asteroide {
    @Override
    public void colisionarCon(Nave nave) {
        System.out.println( "AsteroideExplosivo con Nave");
    }
    @Override
    public void colisionarCon(NaveGrande nave) {
        System.out.println( "AsteroideExplosivo con NaveGrande");
    }
}
