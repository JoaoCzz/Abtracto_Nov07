package com.corenetworks.Presentacion;

import com.corenetworks.Modelo.Bateria;
import com.corenetworks.Modelo.Flauta;
import com.corenetworks.Modelo.Guitarra;

public class ProbarInstrumentoMusical {
    public static void main(String[] args) {
        Guitarra g1= new Guitarra("fender stratocaster","Halfwound");
        System.out.println(g1.toString());
        System.out.println(g1.emitirSonid());
        Bateria b1= new Bateria("Ludwig Black Oyster Pearl",2);
        System.out.println(b1.toString());
        System.out.println(b1.emitirSonid());
        Flauta f1= new Flauta("Dulce Hohner","madera");
        System.out.println(f1.toString());
        System.out.println(f1.emitirSonid());
    }
}
