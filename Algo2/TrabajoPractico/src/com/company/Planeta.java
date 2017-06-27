package com.company;

import javafx.geometry.Point2D;

public class Planeta {
    private double dis;
    private double velAng;
    private String nombre;

    Planeta(double dis, double velAng, String nombre){
        this.dis = dis;
        this.velAng = velAng;
        this.nombre = nombre;
    }

    Point2D getPos(double d){
        Point2D vec = new Point2D(this.dis * Math.cos((this.velAng * d) * Math.PI / 180), this.dis * Math.sin((this.velAng * d) * Math.PI / 180));
        return vec;
    }

    boolean pertenece(double m, double b, double d){
        Point2D pos = this.getPos(d);
        return pos.getY() == ((m * pos.getX()) + b);
    }

    void mostrar(double d){
        System.out.print(this.nombre);
        System.out.print(" ");
        System.out.print(this.getPos(d).getX());
        System.out.print(" ");
        System.out.println(this.getPos(d).getY());
    }

}
