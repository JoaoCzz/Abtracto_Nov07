package com.corenetworks.Modelo;

public abstract class Figura {
    protected int x;
    protected int z;

    @Override
    public String toString() {
        return "Figura{" +
                "x=" + x +
                ", z=" + z +
                '}';
    }
    public abstract double calcularArea();

    public Figura() {
    }

    public Figura(int x, int z) {
        this.x = x;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
