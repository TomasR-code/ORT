package ejercicios;

import ejercicios.ejercicio1.clases.Grupo;

public class Ejercicio1 {

	public static void main(String[] args) {
		Grupo miGrupo = new Grupo("Los Profes");
		agregarIntegranteAGrupo(miGrupo, "Carlos Cimino");
		agregarIntegranteAGrupo(miGrupo, "Julio Sejtman");
		agregarIntegranteAGrupo(miGrupo, "Alejandro Breitman");
		agregarIntegranteAGrupo(miGrupo, "Dany Vazquez");
		agregarIntegranteAGrupo(miGrupo, "Jack Sparrow");
		miGrupo.mostrar();
		comprobarExitenciaIntegrante(miGrupo, "Jack Sparrow");
		comprobarExitenciaIntegrante(miGrupo, "Chuck Norris");
		miGrupo.removerIntegrante("Jack Sparrow");
		miGrupo.mostrar();
		miGrupo.removerIntegrante("Jack Sparrow");
		miGrupo.mostrar();
		miGrupo.vaciar();
		miGrupo.mostrar();		
	}

	private static void agregarIntegranteAGrupo(Grupo grupo, String nombreIntegrante) {
		// para controlar si realmente se agregó un integrante (una de las formas)
		int integrantes = grupo.getCantidadIntegrantes();
		grupo.agregarIntegrante(nombreIntegrante);
		if (integrantes < grupo.getCantidadIntegrantes()) {
			System.out.println(nombreIntegrante +  " fue asignado al grupo " + grupo.getNombre());
		}
	}
	
	private static void comprobarExitenciaIntegrante(Grupo grupo, String nombreIntegrante) {
		if (grupo.buscarIntegrante(nombreIntegrante) != null) {
			System.out.println(nombreIntegrante +  " existe en el grupo " + grupo.getNombre());
		} else {
			System.out.println(nombreIntegrante +  " no existe en el grupo " + grupo.getNombre());
		}
	}

}
