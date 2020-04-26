package clases;

public class Atleta implements Comparable<Atleta>{

    private String nombreAtleta;
    private float segundos;

    public String getNombreAtleta() {
        return nombreAtleta;
    }

    public void setNombreAtleta(String nombreAtleta) {
        this.nombreAtleta = nombreAtleta;
    }

    public float getSegundos() {
        return segundos;
    }

    public void setSegundos(float segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return "Atleta [nombreAtleta=" + nombreAtleta + ", segundos=" + segundos + "]";
    }

    @Override
    public int compareTo(Atleta a){
        if(this.segundos>a.getSegundos()){
            return -1;
        }else if(this.segundos<a.getSegundos()){
            return 1;
        }
       return 0;
    }
}