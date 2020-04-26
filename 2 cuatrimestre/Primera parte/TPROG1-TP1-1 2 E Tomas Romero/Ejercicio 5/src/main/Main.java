package main;

import clases.AnioV2;

public class Main {
    public static void main(String[] args) {

        AnioV2 anio = new AnioV2();
        
        anio.cargarDiasDelAnio();
        anio.cargarMeses();
        anio.getNombreDelMes(5);
        anio.diasTranscurridos(12);
        anio.calcularCumpleanios(2, 25); //mes - dia
        anio.calcularCumpleanios(1, 23);
        anio.calcularCumpleanios(10, 14);
        anio.calcularCumpleanios(1, 22);
    }
}