package main;

import clases.GastosAnuales;
import clases.Mes;
import clases.Rubro;

public class Main {
    public static void main(String[] args) {
        
        Rubro rubro = new Rubro("Coronavirus");

        rubro.cargarMeses();
        rubro.agregarGasto(Mes.ENERO, 30);
        rubro.getTotalGastos(Mes.ENERO);

        GastosAnuales gastosAnuales = new GastosAnuales();
    }
}