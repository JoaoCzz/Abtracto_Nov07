package com.corenetworks.Modelo;

public class Guitarra extends InstrumentoMusical{

    private String TiposCuerdas;

    @Override
    public String emitirSonid() {
        return "Cordófono";
    }

    @Override
    public String toString() {
        return "Guitarra{" +
                "TiposCuerdas='" + TiposCuerdas + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Guitarra() {
    }

    public Guitarra(String marca, String tiposCuerdas) {
        super(marca);
        TiposCuerdas = tiposCuerdas;
    }

    public String getTiposCuerdas() {
        return TiposCuerdas;
    }

    public void setTiposCuerdas(String tiposCuerdas) {
        TiposCuerdas = tiposCuerdas;
    }
}
