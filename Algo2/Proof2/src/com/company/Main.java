package com.company;

public class Main {

    public static void main(String[] args) {
        Base a    = new A();
        Base b    = new B();
        Base c    = new C();
        Base base = new Base();
        //Sobrecarga    //metodo para entrar
        Runner runner = new Runner();
        runner.show(a);
        runner.show(b);
        runner.show(c);
        runner.show(base);
    }
}

class Runner {
    public void show(Base base) {
        base.show();
    }

    public void show(A a) {
        a.show();
    }

    public void show(B b) {
        b.show();
    }

    public void show(C c) {
        c.show();
    }
}

class Base {
    public void show() {
        System.out.println("Hola, soy base");
    }
}

class A extends Base {

    @Override
    public void show() {
        System.out.println("Hola, soy A");
    }
}

class B extends Base {

    @Override
    public void show() {
        System.out.println("Hola, soy B");
    }
}

class C extends Base {

    @Override
    public void show() {
        System.out.println("Hola, soy C");
    }
}
