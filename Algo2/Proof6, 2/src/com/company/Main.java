package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    }
}

class Pila<T>{
    int cantidad;
    ArrayList<T> valores = new ArrayList<>();
    public Pila(){
        cantidad = 0;
    }
    public void Pponer(T valor){
        cantidad++;
        valores.add(valor);
    }
    public T Psacar(){
        cantidad--;
        return valores.get(cantidad);
    }
    public int Plong(){
        return cantidad;
    }
}
