package com.corenetworks.Presentacion;

import com.corenetworks.Modelo.Circulo;
import com.corenetworks.Modelo.Rectangulo;

public class ProbarFigura {
    public static void main(String[] args) {
       // Figura f1= new Figura() {
       Rectangulo r1= new Rectangulo(0,0,4,2);
        System.out.println(r1.calcularArea());
        System.out.println(r1.toString());
        Circulo c1= new Circulo(4,4,2);
        System.out.println(c1.calcularArea());
        System.out.println(c1.toString());

    }

}
