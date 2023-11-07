package com.corenetworks.Presentacion;

import com.corenetworks.Modelo.Figura;
import com.corenetworks.Modelo.Rectangulo;

public class ProbarRectangulo {
    public static void main(String[] args) {
       // Figura f1= new Figura() {
       Rectangulo r1= new Rectangulo(0,0,4,2);
        System.out.println(r1.calcularArea());

    }
}
