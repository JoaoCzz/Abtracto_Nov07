package com.corenetworks.Presentacion;

import com.corenetworks.Modelo.Gerente;
import com.corenetworks.Modelo.Operador;
import com.corenetworks.Modelo.Vendedor;

public class ProbarEmpleado {
    public static void main(String[] args) {
        Vendedor v1= new Vendedor("Luis",1200,9000,0.10);
        System.out.println(v1.toString());
        System.out.println(v1.calcularSueldo());
        Gerente g1= new Gerente("Paul",5000,1000);
        System.out.println(g1.toString());
        System.out.println(g1.calcularSueldo());
        Operador o1= new Operador("George",3000,500,0.10);
        System.out.println(o1.toString());
        System.out.println(o1.calcularSueldo());
    }
}
