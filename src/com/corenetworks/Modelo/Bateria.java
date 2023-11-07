package com.corenetworks.Modelo;

public class Bateria extends InstrumentoMusical{
    private int noPlatillos;

    @Override
    public String emitirSonid() {
        return "pom pom";
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "noPlatillos=" + noPlatillos +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Bateria() {
    }

    public Bateria(String marca, int noPlatillos) {
        super(marca);
        this.noPlatillos = noPlatillos;
    }

    public int getNoPlatillos() {
        return noPlatillos;
    }

    public void setNoPlatillos(int noPlatillos) {
        this.noPlatillos = noPlatillos;
    }
}
