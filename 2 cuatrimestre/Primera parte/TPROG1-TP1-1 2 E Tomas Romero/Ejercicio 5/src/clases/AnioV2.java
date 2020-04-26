package clases;

public class AnioV2 {

    private Mes[] nombreMesesDelAnio = new Mes[12];
    private int[] cantidadDiasDelMes = new int[12];

    public Mes[] getNombreMesesDelAnio() {
        return nombreMesesDelAnio;
    }

    public void setNombreMesesDelAnio(Mes[] nombreMesesDelAnio) {
        this.nombreMesesDelAnio = nombreMesesDelAnio;
    }

    public int[] getCantidadDiasDelMes() {
        return cantidadDiasDelMes;
    }

    public void setCantidadDiasDelMes(int[] cantidadDiasDelMes) {
        this.cantidadDiasDelMes = cantidadDiasDelMes;
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

    public void cargarMeses(){
        nombreMesesDelAnio[0] = Mes.ENERO;
        nombreMesesDelAnio[1] = Mes.FEBRERO;
        nombreMesesDelAnio[2] = Mes.MARZO;
        nombreMesesDelAnio[3] = Mes.ABRIL;
        nombreMesesDelAnio[4] = Mes.MAYO;
        nombreMesesDelAnio[5] = Mes.JUNIO;
        nombreMesesDelAnio[6] = Mes.JULIO;
        nombreMesesDelAnio[7] = Mes.AGOSTO;
        nombreMesesDelAnio[8] = Mes.SEPTIEMBRE;
        nombreMesesDelAnio[9] = Mes.OCTUBRE;
        nombreMesesDelAnio[10] = Mes.NOVIEMBRE;
        nombreMesesDelAnio[11] = Mes.DICIEMBRE;
        }

    public Mes getNombreDelMes(int numeroMes) {
        Mes mes;
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