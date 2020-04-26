package ejercicios;

import ejercicios.ejercicio2.clases.Atleta;
import ejercicios.ejercicio3.clases.Podio;

public class Ejercicio3 {

	public static void main(String[] args) {
		Podio podio = new Podio();
		podio.procesar(30, new Atleta("Juan"));
		//podio.mostrar();
		podio.procesar(50, new Atleta("Luis"));
		//podio.mostrar();
		podio.procesar(50, new Atleta("Ruben"));
		//podio.mostrar();
		podio.procesar(60, new Atleta("Dany"));
		//podio.mostrar();
		podio.procesar(30, new Atleta("Jorge"));
		//podio.mostrar();
		podio.procesar(40, new Atleta("Carlos"));
		//podio.mostrar();
		podio.procesar(45, new Atleta("Diego"));
		//podio.mostrar();
		podio.procesar(20, new Atleta("Agustin"));
		//podio.mostrar();
		podio.procesar(20, new Atleta("Otromás"));
		podio.mostrar();

	}

}