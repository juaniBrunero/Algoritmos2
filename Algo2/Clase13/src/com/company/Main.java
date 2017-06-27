package com.company;

public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        try {
            Integer r = c.dividir(4, 0);

        } catch (CalculadoraException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Fin");
        }
    }
}

class Calculadora{
    Integer dividir(Integer a, Integer b) throws CalculadoraException{
        if(b == 0){
            throw new CalculadoraException("Dividir por cero no se puede");
        }else{
            return a/b;
        }
    }
}

class CalculadoraException extends Exception{
    CalculadoraException(){
        super();
    }
    CalculadoraException(String msj){
        super(msj);
    }
}