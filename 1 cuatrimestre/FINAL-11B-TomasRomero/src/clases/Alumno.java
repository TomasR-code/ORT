package clases;

public class Alumno {
	private String dni;
	private String nombre;
	private String apellido;
	private double primerParcial;
	private double segundoParcial;
	Estado estado;
	
	public Alumno(String nombre, String apellido, String dni, double primerParcial2, double segundoParcial2, Estado estado) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.primerParcial = primerParcial2;
		this.segundoParcial = segundoParcial2;
		this.estado = estado;
	}


	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getPrimerParcial() {
		return primerParcial;
	}
	public void setPrimerParcial(double primerParcial) {
		this.primerParcial = primerParcial;
	}
	public double getSegundoParcial() {
		return segundoParcial;
	}
	public void setSegundoParcial(double segundoParcial) {
		this.segundoParcial = segundoParcial;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
}
