package clases;

//AGREGADOS PARA TEMA FECHA
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

import java.util.ArrayList;

public class Instalador {

	private int capacidadMemoria;
	private ArrayList<Aplicaciones> aplicaciones;

	public Instalador(int capacidadMemoria) {
		super();
		this.capacidadMemoria = capacidadMemoria;
		this.aplicaciones = new ArrayList<>();
	}

	public int getCapacidadMemoria() {
		return capacidadMemoria;
	}

	public void setCapacidadMemoria(int capacidadMemoria) {
		this.capacidadMemoria = capacidadMemoria;
	}

	public ArrayList<Aplicaciones> getAplicaciones() {
		return aplicaciones;
	}

	public void setAplicaciones(ArrayList<Aplicaciones> aplicaciones) {
		this.aplicaciones = aplicaciones;
	}

	public void instalar(String nombre, int tamanio, String fecha) {
		Aplicaciones apps;
		int memoria;

		memoria = getMemoriaDisponible(tamanio);

		if (memoria >= tamanio) {
			apps = this.buscarAplicacion(nombre);
			if (apps != null) {
				if (this.esFechaMayor(fecha, apps.getFecha())) {
					this.actualizar(nombre, tamanio, fecha);
					this.informar("La aplicacion se actualizo con exito!!");
				} else {
					this.informar("La aplicacion no se instalo");
				}
			} else {
				this.aplicaciones.add(new Aplicaciones(nombre, tamanio, fecha));
				this.informar("La aplicacion se instalo con exito!!");
			}
		} else {
			this.informar("Espacio insuficiente");
		}
	}

	
	private void informar(String mensaje) {
		System.out.println(mensaje);
	}

	private void actualizar(String nombre, int tamanio, String fecha) {
		Aplicaciones aplicaciones = null, appAux;
		int i = 0;

		while (i < this.aplicaciones.size() && aplicaciones == null) {
			appAux = this.aplicaciones.get(i);
			if (appAux.getNombre().equals(nombre)) {
				this.aplicaciones.get(i).setFecha(fecha);
				this.aplicaciones.get(i).setTamanio(tamanio);
				this.aplicaciones.get(i).setNombre(nombre);
				aplicaciones = appAux;
			}
			i++;
		}
	}

	private int getMemoriaDisponible(int tamanio) {
		int memoria;
		memoria = this.getCapacidadMemoria() - tamanio;
		return memoria;
	}

	public Aplicaciones buscarAplicacion(String nombre) {
		Aplicaciones aplicaciones = null, appAux;
		int i = 0;

		while (i < this.aplicaciones.size() && aplicaciones == null) {
			appAux = this.aplicaciones.get(i);
			if (appAux.getNombre().equals(nombre))
				aplicaciones = appAux;
			i++;
		}
		return aplicaciones;
	}

	// NO TOCAR
	public boolean esFechaMayor(String d1, String d2) {
		boolean resul = false;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date1 = sdf.parse(d1);
			Date date2 = sdf.parse(d2);

			if (date1.after(date2)) {
				resul = true;
			}

		} catch (ParseException ex) {
			ex.printStackTrace();
		}
		return resul;
	}

}
