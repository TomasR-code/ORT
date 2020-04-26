package main;

import java.util.Scanner;
import clases.Corredores;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Corredores corredores = new Corredores();
        String nombre;
        float segundos;
        int i = 0;

        while (i != 1) {
            System.out.print("Ingrese el nombre corredor: ");
            nombre = lector.next();
            System.out.print("Ingrese los segundos del corredor: ");
            segundos = lector.nextInt();
            System.out.print("Desea terminar indique 1 = ");
            i = lector.nextInt();
            corredores.agregarCorredorLista(nombre, segundos);
        }
        corredores.ordenarListarPorSegundos();
        corredores.mostrarGanadores();
    }
}