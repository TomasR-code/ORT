package ejercicios.ejercicio1.clases;

import java.util.ArrayList;

public class Grupo {

	private String nombre;
	private ArrayList<String> integrantes;

	public Grupo(String nombre) {
		this.setNombre(nombre);
		integrantes = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarIntegrante(String nombreIntegrante) {
		if (obtenerPosicionIntegrante(nombreIntegrante) == -1) {
			integrantes.add(nombreIntegrante);
		}

	}

	public String buscarIntegrante(String nombreIntegrante) {
		return obtenerIntegrante(obtenerPosicionIntegrante(nombreIntegrante));
	}

	public int getCantidadIntegrantes() {
		return integrantes.size();
	}

	public String obtenerIntegrante(int posicion) {
		String integrante = null;
		if (posicion > 0 && posicion <= integrantes.size()) {
			integrante = integrantes.get(posicion - 1);
		}
		return integrante;
	}

	/**
	 * Remueve de la colección de integrantes a aquel cuyo nombre coincide con
	 * el nombre recibido como parámetro. Si lo encontró, luego de removerlo
	 * debe devolverlo con return, y si no debe devolver null.
	 * 
	 * @param nombreIntegrante
	 *            el dato que sirve para identificar al integrante (en este caso
	 *            el nombre)
	 * @return el integrante removido o null si no existe.
	 */
	public String removerIntegrante(String nombreIntegrante) {
		String integrante = null;
		int posicion = obtenerPosicionIntegrante(nombreIntegrante);
		if (posicion >= 0 && posicion < integrantes.size()) {
			integrante = integrantes.remove(posicion);
		}
		return integrante;
	}

	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		// Forma segun el lenguaje. Depende de que el arraylist "sepa" como
		// identificar sus objetos.
		// return integrantes.indexOf(nombreIntegrante);

		// Forma generica mas alla de Java, a traves de la busqueda de un
		// elemento por su "clave". Busca de atras para adelante para quedar en
		// -1 si no lo encuentra.
		int pos = integrantes.size() - 1;
		while (pos > -1 && !integrantes.get(pos).equals(nombreIntegrante)) {
			pos--;
		}
		return pos;
	}
	
	public void mostrar() {
		System.out.printf("Grupo: %s\n", nombre);
		System.out.printf("Candidad de integrantes: %d\n", getCantidadIntegrantes());
		mostrarIntegrantes();
	}
	
	private void mostrarIntegrantes() {
		for (String integrante : integrantes) {
			System.out.println(integrante);
		}
	}
	
	public void vaciar() {
		integrantes.clear();
	}
}
