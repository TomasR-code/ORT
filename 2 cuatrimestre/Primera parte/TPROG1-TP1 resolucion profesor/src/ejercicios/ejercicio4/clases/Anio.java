package ejercicios.ejercicio4.clases;

public class Anio {
	private final static String[] meses = { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO",
			"SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" };
	private final static int[] diasDelMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	private int[] acumuladosPrevios;

	public Anio() {
		prepararAcumulados();
	}

	/**
	 * Prepara los acumulados de d�as previos al mes en curso.
	 */
	private void prepararAcumulados() {
		acumuladosPrevios = new int[meses.length];
		int acum = 0;
		for (int m = 0; m < meses.length; m++) {
			acumuladosPrevios[m] = acum;
			acum += diasDelMes[m];
		}
	}

	public String nombreDelMes(int numeroDeMes) {
		return meses[numeroDeMes - 1];
	}

	public int diasTranscurridos(int numeroDeMes) {
		return acumuladosPrevios[numeroDeMes - 1];
	}

	public int diasTranscurridos(String nombreDelMes) {
		int pos = meses.length - 1;
		while (pos >= 0 && !nombreDelMes.toUpperCase().equals(meses[pos])) {
			pos--;
		}
		return acumuladosPrevios[pos];
	}
	
}
