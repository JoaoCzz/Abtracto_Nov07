package com.corenetworks.Modelo;

public class Flauta extends InstrumentoMusical {
    private String material;

    @Override
    public String emitirSonid() {
        return "C-medio (C4";
    }

    public Flauta() {
    }

    public Flauta(String marca, String material) {
        super(marca);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
