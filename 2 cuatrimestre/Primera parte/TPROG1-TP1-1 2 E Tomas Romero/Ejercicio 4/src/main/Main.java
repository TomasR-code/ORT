package main;

import clases.Anio;

public class Main {
    public static void main(String[] args) {
        Anio anio = new Anio();
        anio.cargarMesesDelAnio();
        anio.cargarDiasDelAnio();

        anio.getNombreDelMes(5);
        anio.diasTranscurridos(12);
        anio.calcularCumpleanios(2, 25); //mes - dia
        anio.calcularCumpleanios(1, 23);
        anio.calcularCumpleanios(10, 14);
        anio.calcularCumpleanios(1, 22);

    }
}
