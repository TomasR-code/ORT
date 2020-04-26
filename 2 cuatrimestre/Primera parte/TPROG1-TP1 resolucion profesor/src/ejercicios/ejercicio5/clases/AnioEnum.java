package ejercicios.ejercicio5.clases;

public class AnioEnum {
	public enum Mes {
		ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE
	};

	private final static int[] diasDelMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	private int[] acumuladosPrevios;

	public AnioEnum() {
		prepararAcumulados();
	}

	public String nombreDelMes(int numeroDeMes) {
		return Mes.values()[numeroDeMes - 1].name();
	}

	/**
	 * Prepara los acumulados de d�as previos al mes en curso.
	 */
	private void prepararAcumulados() {
		acumuladosPrevios = new int[Mes.values().length];
		int acum = 0;
		for (int m = 0; m < Mes.values().length; m++) {
			acumuladosPrevios[m] = acum;
			acum += diasDelMes[m];
		}
	}

	/**
	 * Devuelve la cantidad de d�as transcuridos en el a�o antes del comienzo
	 * del mes en cuestion.
	 * 
	 * @param mes El mes
	 * @return La cantidad de d�as transcurridos antes del comienzo del mes.
	 */
	public int diasTranscurridos(Mes mes) {
		return acumuladosPrevios[mes.ordinal()];
	}

}
