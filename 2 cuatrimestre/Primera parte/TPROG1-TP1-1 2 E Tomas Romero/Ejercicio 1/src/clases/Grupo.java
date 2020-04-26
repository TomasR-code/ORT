package clases;

import java.util.ArrayList;

public class Grupo {

    private String nombre;
    ArrayList<String> integrantes = new ArrayList<String>();

    public Grupo(String nombre, ArrayList<String> integrantes) {
        this.nombre = nombre;
        this.integrantes = integrantes;
    }

    public Grupo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<String> integrantes) {
        this.integrantes = integrantes;
    }

    public int getCantidadIntegrantes(ArrayList<String> integrantes) {
        int size = integrantes.size();
        return size;
    }

    public void setIntegrante(String nombre) {
        integrantes.add(nombre);
    }

    public void agregarIntegrante(String nombreIntegrante) {
        boolean result = false;
        int posicion = 0;

        posicion = obtenerPosicionIntegrante(nombreIntegrante);
        if(posicion==-1){
            integrantes.add(nombreIntegrante);
        }
    }

    private int obtenerPosicionIntegrante(String nombreIntegrante) {
        int i = 0;
        int posicion = -1;

        while (i < integrantes.size()) {
            if (integrantes.get(i).equals(nombreIntegrante)) {
                posicion = i;
                return posicion;
            }
            i++;
        }
        return posicion;
    }

    public String obtenerIntegrante(int posicion) {
        if ((posicion >= 1) && (posicion <= integrantes.size())) {
            return integrantes.get(posicion - 1);
        } else {
            return null;
        }
    }

    public String buscarIntegrante(String nombreIntegrante) {
        String integranteEncontrado = null;
        int posicion;

        posicion = obtenerPosicionIntegrante(nombreIntegrante);
        if (posicion != -1) {
            integranteEncontrado = integrantes.get(posicion);
        }

        return integranteEncontrado;
    }

    public String removerIntegrante(String nombreIntegrante) {
        String integranteEncontrado = null;
        int posicion;

        posicion = obtenerPosicionIntegrante(nombreIntegrante);
        if (posicion != -1) {
            integranteEncontrado = integrantes.remove(posicion);
        }
        return integranteEncontrado;
    }

    private void MostrarIntegrantes() {
        int i = 0;
        for (String index : integrantes) {
            i++;
            System.out.print(i + " ");
            System.out.println(index);
        }
    }

    public void mostrar() {
        System.out.println(this.nombre + ", cantidad de integrantes: " + integrantes.size());
        MostrarIntegrantes();
    }

    public void vaciar() {
        this.integrantes.clear();
    }

}