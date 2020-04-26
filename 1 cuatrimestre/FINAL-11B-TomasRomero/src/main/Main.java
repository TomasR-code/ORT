package main;

import clases.Curso;

public class Main {

	public static void main(String[] args) {

		Curso curso = new Curso();

		curso.agregarAlumno("Tomas", "Romero", "42409906", 0, 0);
		curso.cargarNota("42409906", 8);
		curso.cargarNota("42409906", 8);
		curso.agregarAlumno("Gabriel", "Sachez", "43457645", 0, 0);
		curso.cargarNota("43457645", 7);
		curso.cargarNota("43457645", 9);
		curso.agregarAlumno("Sandra", "Martinez", "35867586", 0, 0);
		curso.cargarNota("35867586", 3);
		curso.cargarNota("35867586", 8);
		curso.listarPromocionados();
	}

}
