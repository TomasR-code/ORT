package main;

import clases.Grupo;

public class Main {

    public static void main(String[] args) {

        // agregarIntegrante
        Grupo grupo = new Grupo();
        grupo.setNombre("Coronavirus");
        grupo.agregarIntegrante("Lucas");
        grupo.agregarIntegrante("Lucia");
        grupo.agregarIntegrante("Tomas");
        grupo.agregarIntegrante("Luciano");
        String integranteReal, integranteFicticio;
        integranteReal = grupo.buscarIntegrante("tomas");
        integranteFicticio = grupo.buscarIntegrante("Luciano");
        System.out.println("----------");

        /*
         * obtenerPosicionIntegrante CAMBIAR A PUBLIC EL METODO int prueba; prueba =
         * grupo.obtenerPosicionIntegrante("comas"); System.out.println(prueba);
         */

        // obtenerIntegrante
/*         String obtenerIntegrante;
        obtenerIntegrante = grupo.obtenerIntegrante(3);
        System.out.println(obtenerIntegrante);
        System.out.println("----------2");

        String buscarIntegrante;
        buscarIntegrante = grupo.buscarIntegrante("tomas");
        System.out.println("----------3");
 */
        grupo.mostrar();
        System.out.println("----------");

        String removerIntegrante;
        removerIntegrante = grupo.removerIntegrante("Luciano");
        System.out.println("El integrante removido del grupo " + grupo.getNombre() + " fue: " + removerIntegrante);
        grupo.mostrar();
        removerIntegrante = grupo.removerIntegrante("Luciano");

        System.out.println("----------");
        grupo.vaciar();
        grupo.mostrar();   


    }

}
