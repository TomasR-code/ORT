package clases;

public class Anio {

    private String[] nombreMesesDelAnio = new String[12];
    private int[] cantidadDiasDelMes = new int[12];

    public String[] getNombreMesesDelAnio() {
        return nombreMesesDelAnio;
    }

    public void setNombreMesesDelAnio(String[] nombreMesesDelAnio) {
        this.nombreMesesDelAnio = nombreMesesDelAnio;
    }

    public int[] getCantidadDiasDelMes() {
        return cantidadDiasDelMes;
    }

    public void setCantidadDiasDelMes(int[] cantidadDiasDelMes) {
        this.cantidadDiasDelMes = cantidadDiasDelMes;
    }

    public void cargarMesesDelAnio() {
        nombreMesesDelAnio[0] = "Enero";
        nombreMesesDelAnio[1] = "Febrero";
        nombreMesesDelAnio[2] = "Marzo";
        nombreMesesDelAnio[3] = "Abril";
        nombreMesesDelAnio[4] = "Mayo";
        nombreMesesDelAnio[5] = "Junio";
        nombreMesesDelAnio[6] = "Julio";
        nombreMesesDelAnio[7] = "Agosto";
        nombreMesesDelAnio[8] = "Septiembre";
        nombreMesesDelAnio[9] = "Octubre";
        nombreMesesDelAnio[10] = "Noviembre";
        nombreMesesDelAnio[11] = "Diciembre";
    }

    public void cargarDiasDelAnio() {
        cantidadDiasDelMes[0] = 31;
        cantidadDiasDelMes[1] = 28;
        cantidadDiasDelMes[2] = 31;
        cantidadDiasDelMes[3] = 30;
        cantidadDiasDelMes[4] = 31;
        cantidadDiasDelMes[5] = 30;
        cantidadDiasDelMes[6] = 31;
        cantidadDiasDelMes[7] = 31;
        cantidadDiasDelMes[8] = 30;
        cantidadDiasDelMes[9] = 31;
        cantidadDiasDelMes[10] = 30;
        cantidadDiasDelMes[11] = 31;
    }

    public String getNombreDelMes(int numeroMes) {
        String mes;
        mes = nombreMesesDelAnio[numeroMes - 1];
        System.out.println("El numero del mes es " + numeroMes + " y el nombre: " + mes);
        return mes;
    }

    public int diasTranscurridos(int numeroMes) {
        int cantidaDias = 0;
        int i = 0;

        while (i < cantidadDiasDelMes.length && i <= numeroMes - 1) {
            cantidaDias += cantidadDiasDelMes[i];
            i++;
        }
        return cantidaDias;
    }

    public int calcularCumpleanios(int numeroMes, int diaCumpleanios) {
        int cantidaDias;
        cantidaDias = diasTranscurridos(numeroMes);
        cantidaDias += diaCumpleanios;
        System.out.println("El dia del año que cumples años es: " + cantidaDias);
        return cantidaDias;
    }
}
