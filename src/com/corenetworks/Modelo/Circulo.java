package com.corenetworks.Modelo;

public class Circulo extends Figura{
    private int radio;

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", x=" + x +
                ", z=" + z +
                '}';
    }

    public Circulo() {
    }

    public Circulo(int x, int z, int radio) {
        super(x, z);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
