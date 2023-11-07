package com.corenetworks.Modelo;

public class Rectangulo extends Figura{
    private int base;
    private int altura;

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", x=" + x +
                ", z=" + z +
                '}';
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    public Rectangulo() {
    }

    public Rectangulo(int x, int z, int base, int altura) {
        super(x, z);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
