package clases;

import java.util.ArrayList;

public class Corredores {

    ArrayList<Atleta> corredor = new ArrayList<Atleta>();
    ArrayList<ArrayList<Atleta>> ganadores = new ArrayList<ArrayList<Atleta>>();

    public ArrayList<Atleta> getCorredor() {
        return corredor;
    }

    public void setCorredor(ArrayList<Atleta> corredor) {
        this.corredor = corredor;
    }

    public ArrayList<ArrayList<Atleta>> getGanadores() {
        return ganadores;
    }

    public void setGanadores(ArrayList<ArrayList<Atleta>> ganadores) {
        this.ganadores = ganadores;
    }

    @Override
    public String toString() {
        return "Corredores [corredor=" + corredor + ", ganadores=" + ganadores + "]";
    }

    public void agregarCorredorLista(String nombre, float tiempo) {
        Atleta atleta = new Atleta();
        atleta.setNombreAtleta(nombre);
        atleta.setSegundos(tiempo);
        this.corredor.add(atleta);
    }

    /*
     * public void ordenarListarPorSegundos(float mayor) {
     * Collections.sort(corredor); }
     */

    public void ordenarListarPorSegundos() {
        int i = 0;
        float mayor = 0;
        float segundo = 0;
        float tercero = 0;
        ArrayList<Atleta> corredorGanador = new ArrayList<>();
        ArrayList<Atleta> corredorSegundo = new ArrayList<>();
        ArrayList<Atleta> corredorTercero = new ArrayList<>();

        while (i < corredor.size()) {
            if (corredor.get(i).getSegundos() > mayor) {
                mayor = corredor.get(i).getSegundos();
                corredorGanador.clear();
                corredorGanador.add(corredor.get(i));
            } else if (corredor.get(i).getSegundos() == mayor) {
                mayor = corredor.get(i).getSegundos();
                corredorGanador.add(corredor.get(i));

            } else if (corredor.get(i).getSegundos() > segundo) {
                segundo = corredor.get(i).getSegundos();
                corredorSegundo.clear();
                corredorSegundo.add(corredor.get(i));

            } else if (corredor.get(i).getSegundos() == segundo) {
                segundo = corredor.get(i).getSegundos();
                corredorSegundo.add(corredor.get(i));

            } else if (corredor.get(i).getSegundos() > tercero) {
                tercero = corredor.get(i).getSegundos();
                corredorTercero.clear();
                corredorTercero.add(corredor.get(i));

            } else if (corredor.get(i).getSegundos() == segundo) {
                tercero = corredor.get(i).getSegundos();
                corredorTercero.add(corredor.get(i));
            }
            i++;
        }
        ganadores.add(corredorGanador);
        ganadores.add(corredorSegundo);
        ganadores.add(corredorTercero);
    }

    public void mostrarGanadores() {
        for (int i = 0; i < 3; i++) {
            System.out.println("PUESTO " + i + " " + ganadores.get(i));
        }
    }

}