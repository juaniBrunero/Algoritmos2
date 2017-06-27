package com.company;

public class Main {

    public static void main(String[] args) {
	    API facebookApi = new FacebookAPI();
	    Mensaje texto = new Texto("Hello world");

	    facebookApi.publicar(texto);



    }
}

abstract class Mensaje
{
    abstract void postear(API api);
}

class Texto extends Mensaje {
    String valor;

    Texto(String valor) {
        this.valor = valor;
    }

    @Override
    void postear(API api) {
        api.publicar(this);
    }
}

class Multimedia extends Mensaje {
    String url;

    Multimedia (String url){
        this.url = url;
    }


    @Override
    void postear(API api) {
        api.publicar(this);
    }
}

abstract class API {
    abstract void publicar(Mensaje mensaje);
    abstract void publicar(Texto mensaje);
    abstract void publicar(Multimedia mensaje);
}

class FacebookAPI extends API {

    @Override
    void publicar(Mensaje mensaje) {
       mensaje.postear(this);
    }

    @Override
    void publicar(Texto mensaje) {
        System.out.printf("Enviando mensaje de texto a Facebook");
    }

    @Override
    void publicar(Multimedia mensaje) {
        System.out.printf("Enviando mensaje multimedia a Facebook");
    }
}

class TwitterAPI extends API {

    @Override
    void publicar(Mensaje mensaje) {

    }

    @Override
    void publicar(Texto mensaje) {
        System.out.printf("Enviando mensaje de texto a Twitter");
    }

    @Override
    void publicar(Multimedia mensaje) {
        System.out.printf("Enviando mensaje multimedia a Twitter");
    }
}


