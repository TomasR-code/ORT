package ejercicios;

import ejercicios.ejercicio2.clases.Atleta;
import ejercicios.ejercicio2.clases.MinimoMultiple;

public class Ejercicio2 {

	public static void main(String[] args) {
		MinimoMultiple<Atleta> ganador = new MinimoMultiple<>();

		ganador.procesar(9.1, new Atleta("Rapi Dito"));
		mostrar(ganador);
		ganador.procesar(10.4, new Atleta("Horacio Calzado"));
		mostrar(ganador);
		ganador.procesar(9.1, new Atleta("Bernardo Ortiz"));
		mostrar(ganador);
		ganador.procesar(7.8, new Atleta("Speedy Gonzalez"));
		mostrar(ganador);
	}

	private static void mostrar(MinimoMultiple<Atleta> ganadores) {
		// mas adelante vamos a ver como
		System.out.println(ganadores.getValor());
		for (Atleta corredor : ganadores.getElementos()) {
			System.out.println(corredor);
		}
	}

}
