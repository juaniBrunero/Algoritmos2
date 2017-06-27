package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(1, 2);
        Fraccion f2 = new Fraccion(1, 2);

        Calculadora<Fraccion> calculadora = new CalculadoraFraccion();
        Fraccion f3 = calculadora.suma(f1, f2);

        ArrayList listaSinGenerico = new ArrayList();
        listaSinGenerico.add("hello");
        listaSinGenerico.add(123);

        ArrayList<String> listaConGenerico = new ArrayList<>();
        listaConGenerico.add("Hello");
        listaConGenerico.add("World");

        System.out.println(listaSinGenerico.get(0));

    }

}

abstract class Numero {

}

abstract class Calculadora<T> {
    abstract T suma(T x, T y);
}

class CalculadoraFraccion extends Calculadora<Fraccion> {

    @Override
    Fraccion suma(Fraccion x, Fraccion y) {
        return null;
    }
}

class CalculadoraMatriz extends Calculadora<Matriz> {

    @Override
    Matriz suma(Matriz x, Matriz y) {
        return null;
    }
}

class Fraccion extends Numero {
    private Integer numerador;
    private Integer denominador;

    public Fraccion(Integer numerador, Integer denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
}

class Vector extends Numero {

}

class Matriz extends Numero {

}

class Complejo extends Numero {

}