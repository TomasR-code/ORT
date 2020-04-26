package clases;

public class Rubro {

    private String nombre;
    private float gastosPorMes;
    private float[] importes = new float[12];
    private Mes[] nombreMesesDelAnio = new Mes[12];
    Mes mes;

    public float getGastosPorMes() {
        return gastosPorMes;
    }

    public void setGastosPorMes(float gastosPorMes) {
        this.gastosPorMes = gastosPorMes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float[] getImportes() {
        return importes;
    }

    public void setImportes(float[] importes) {
        this.importes = importes;
    }

    public Mes[] getNombreMesesDelAnio() {
        return nombreMesesDelAnio;
    }

    public void setNombreMesesDelAnio(Mes[] nombreMesesDelAnio) {
        this.nombreMesesDelAnio = nombreMesesDelAnio;
    }

    public Mes getMes() {
        return mes;
    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }

    public void cargarMeses() {
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

    public Rubro(String nombre) {
        this.nombre = nombre;
    }

    public Rubro() {
	}

	private void inicializarGastos() {
        importes = new float[12];
    }

    public void agregarGasto(Mes mes, float importe) {
        int i = 0;
        boolean result = false;

        while (i < nombreMesesDelAnio.length && !result) {
            if (nombreMesesDelAnio[i].equals(mes)) {
                importes[i] += importe;
                result = true;
            }
            i++;
        }
    }

    public double getTotalGastos(Mes mes){
        int i = 0;
        boolean result = false;

        while (i < nombreMesesDelAnio.length && !result) {
            if (nombreMesesDelAnio[i].equals(mes)) {
                gastosPorMes = importes[i];
                result = true;
            }
        }
        return gastosPorMes;
    }

}