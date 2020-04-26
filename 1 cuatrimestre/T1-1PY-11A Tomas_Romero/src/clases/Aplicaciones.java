package clases;

public class Aplicaciones {

	private String nombre;
	private int tamanio;
	private String fecha;
	
	public Aplicaciones(String nombre, int tamanio, String fecha) {
		super();
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.fecha = fecha;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getTamanio() {
		return tamanio;
	}
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	
	
	
}


