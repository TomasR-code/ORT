package ejercicios;

import ejercicios.ejercicio5.clases.AnioEnum;

public class Ejercicio5 {

	public static void main(String[] args) {
		AnioEnum anio = new AnioEnum();
		System.out.println("El tercer mes es " + anio.nombreDelMes(3));
		System.out.println("Los días pasados antes de este mes fueron " + anio.diasTranscurridos(AnioEnum.Mes.MARZO));
		System.out.println(String.format("Mi cumpleanios es el dia %d del anio.", anio.diasTranscurridos(AnioEnum.Mes.ABRIL) + 19));
	}

}
