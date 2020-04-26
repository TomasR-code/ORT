package programa;
import clases.Agenda;
import clases.Genero;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda agenda = new Agenda(3);
		agenda.registrarTurno("Juan", "Perez", "15399932", "33322222", Genero.MASCULINO);
		agenda.registrarTurno("Juan", "Perez", "15399932", "33322222", Genero.FEMENINO);
		agenda.registrarTurno("Gloria", "Garcia", "153996576", "55662222", Genero.FEMENINO);
		agenda.registrarTurno("Juan", "Aguirre", "1539322211", "11122222", Genero.MASCULINO);
		agenda.registrarTurno("Juan", "Contente", "153999787", "666622222", Genero.MASCULINO);
		agenda.listarTurnos();
		agenda.anularTurno("11122222");
		agenda.listarTurnos();
	}

}
