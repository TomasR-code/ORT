package ejercicios;

import ejercicios.ejercicio4.clases.Anio;

public class Ejercicio4 {
	public static void main(String[] args) {
		Anio anio = new Anio();
		System.out.println("El tercer mes es " + anio.nombreDelMes(3));
		System.out.println("Los días pasados antes de este mes fueron " + anio.diasTranscurridos(3));
		System.out.println(String.format("Mi cumpleanios es el dia %d del anio.", anio.diasTranscurridos(4) + 19));
	}
}
