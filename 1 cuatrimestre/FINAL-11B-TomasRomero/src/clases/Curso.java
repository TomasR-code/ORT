package clases;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Alumno> alumno;
	
	public Curso() {
		super();
		this.alumno = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Curso [alumno=" + alumno + "]";
	}

	public ArrayList<Alumno> getAlumno() {
		return alumno;
	}

	public void setAlumno(ArrayList<Alumno> alumno) {
		this.alumno = alumno;
	}

	public void agregarAlumno(String nombre, String apellido, String dni, double primerParcial, double segundoParcial) {
		Alumno alum = null;

		alum = this.buscarAlumno(dni);
		if (alum != null) {
			informar("Alumno ya existe!");
		} else {
			this.alumno.add(new Alumno(nombre, apellido, dni, primerParcial, segundoParcial, Estado.VACIO));
			informar("Alumno agregado con exito!!");
		}
	}

	public void cargarNota(String dni, double nota) {
		Alumno alum = null, aluAux;
		int i = 0;
		while (i < this.alumno.size() && alum == null) {
			aluAux = this.alumno.get(i);
			if (aluAux.getDni().equals(dni)) {
				alum = aluAux;
				if (alum.getPrimerParcial() == 0) {
					this.alumno.get(i).setPrimerParcial(nota);
				} else if (alum.getSegundoParcial() == 0) {
					this.alumno.get(i).setSegundoParcial(nota);
					this.alumno.get(i).setEstado(actualizarEstado(alum));
				}
			}
			i++;
		}
	}
	
	private Estado actualizarEstado(Alumno alum) {
		Estado estado;
		if (alum.getPrimerParcial() >= 7 && alum.getSegundoParcial() >= 7) {
			estado = Estado.PROMOCIONADO;
		} else if (alum.getPrimerParcial() >= 4 && alum.getSegundoParcial() >= 4) {
			estado = Estado.FINAL;
		} else {
			estado = Estado.RECUPERA;
		}
		return estado;
	}

	public void listarPromocionados() {
		int i = 0;
		while (i < this.alumno.size()) {
			if (this.alumno.get(i).getEstado() == Estado.PROMOCIONADO) {
				System.out.print(" "+alumno.get(i).getNombre()+" ");
				System.out.print(alumno.get(i).getApellido()+" ");
				System.out.print(alumno.get(i).getDni()+" ");
				System.out.print(alumno.get(i).getEstado());
			}
			i++;
		}
	}

	private void informar(String mensaje) {
		System.out.println(mensaje);
	}

	private Alumno buscarAlumno(String dni) {
		Alumno alum = null, aluAux;
		int i = 0;

		while (i < alumno.size() && alum == null) {
			aluAux = alumno.get(i);
			if (aluAux.getDni().equals(dni)) 
				alum = aluAux;
			i++;
		}
		return alum;
	}
}
