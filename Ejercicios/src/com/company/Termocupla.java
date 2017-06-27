package com.company;

import java.util.ArrayList;

public class Termocupla {
    Double temperatura;
    ArrayList<Interesado> interesados =  new ArrayList<>();

    public void subscribir(Interesado interesado){
        this.interesados.add(interesado);
    }

    public void desuscribir(Interesado interesado) {
        this.interesados.remove(interesado);
    }

    public void setTemperatura(Double temperatura){
        this.temperatura = temperatura;
        notificar();
    }

    public Double getTemperatura(){
        return this.temperatura;
    }

    private void notificar() {
        for (Interesado interesado : interesados) {
            interesado.actualizar(this);
        }
    }
}
