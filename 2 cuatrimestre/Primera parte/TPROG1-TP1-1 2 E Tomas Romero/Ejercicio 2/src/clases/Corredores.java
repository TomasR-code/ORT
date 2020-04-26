package clases;

import java.util.ArrayList;

public class Corredores {

    ArrayList<Atleta> corredor = new ArrayList<Atleta>();
    ArrayList<Atleta> ganadores = new ArrayList<Atleta>();

    public ArrayList<Atleta> getCorredor() {
        return corredor;
    }

    public void setCorredor(ArrayList<Atleta> corredor) {
        this.corredor = corredor;
    }

    public ArrayList<Atleta> getGanadores() {
        return ganadores;
    }

    public void setGanadores(ArrayList<Atleta> ganadores) {
        this.ganadores = ganadores;
    }

    public void agregarCorredorLista(String nombre, float tiempo) {
        Atleta atleta = new Atleta();
        atleta.setNombreAtleta(nombre);
        atleta.setSegundos(tiempo);
        this.corredor.add(atleta);
    }

    /*
     * public void ordenarListarPorSegundos() { Collections.sort(corredor); }
     */

    public void ordenarListarPorSegundos() {
        int i = 0;
        float mayor = 0;
        while (i < corredor.size()) {
            if (corredor.get(i).getSegundos() > mayor) {
                mayor = corredor.get(i).getSegundos();
                ganadores.clear();
                ganadores.add(corredor.get(i));
            }
            else if (corredor.get(i).getSegundos() == mayor){
                mayor = corredor.get(i).getSegundos();
                ganadores.add(corredor.get(i));
            }
            i++;
        }
    }

    public void mostrarGanadores() {
        for (Atleta atleta : ganadores) {
            System.out.println(atleta);
        }
    }

}