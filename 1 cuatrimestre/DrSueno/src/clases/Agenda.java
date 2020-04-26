package clases;
import java.util.ArrayList;
public class Agenda {
	private ArrayList<Paciente>pacientes;
	private int cantTurnos;
	
	public Agenda(int cantTurnos) {
		super();
		this.pacientes = new ArrayList<>();
		this.cantTurnos = cantTurnos;
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public int getCantTurnos() {
		return cantTurnos;
	}

	public void setCantTurnos(int cantTurnos) {
		this.cantTurnos = cantTurnos;
	}

	@Override
	public String toString() {
		return "Agenda [pacientes=" + pacientes + ", cantTurnos=" + cantTurnos + "]";
	}
	
	public void registrarTurno (String nombre, String apellido, String telefono, String dni, Genero genero) {
		Paciente p = null;
		if(this.pacientes.size()<this.cantTurnos) {
			p=this.buscarPaciente(dni);
			if(p==null) {
				this.pacientes.add(new Paciente(nombre, apellido, telefono, dni, genero));
			}
			else {
				System.out.println("Este paciente ya tiene un turno asignado");
			}
		}
		else {
			System.out.println("No hay mas turnos");
			}
	}
	
	public Paciente buscarPaciente(String dni){
		Paciente p = null,pAux;
		int i=0;
		while(i<this.pacientes.size()&&p==null) {
				pAux=this.pacientes.get(i);
				if(pAux.getDni().equals(dni)) {
					p=pAux;
				}
				else {
					i++;
				}
			}
		return p;
		}
	
		public void listarTurnos() {
			for (Paciente paciente : pacientes) {
				System.out.println(paciente);
			}
		}
		
		public void anularTurno(String dni) {
			Paciente p=null,pAux;
			int i=0;
			while(i<this.pacientes.size()&&p==null) {
					pAux=this.pacientes.get(i);
					if(pAux.getDni().equals(dni)) {
						p=pAux;
						this.pacientes.remove(i);
					}
					else {
						i++;
					}
		}
	}
		public double porcentajePorGenero(Genero genero) {
			int cont=0;
			double porcentaje;
			for (Paciente paciente : pacientes) {
				if(paciente.getGenero()==genero) {
					cont++;
				}
			}
			porcentaje=this.porcentaje(this.pacientes.size(), cont);
			return porcentaje;
		}
		public double porcentaje(double total, double parcial) {
			double porcent;
			porcent=100/total*parcial;
			return porcent;
		}
		
}