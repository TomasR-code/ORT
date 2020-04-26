package clases;

import java.util.ArrayList;

public class GastosAnuales {

    private ArrayList<Rubro> rubro = new ArrayList<>();

    public GastosAnuales() {
    }

    public ArrayList<Rubro> getRubro() {
        return rubro;
    }

    public void setRubro(ArrayList<Rubro> rubro) {
        this.rubro = rubro;
    }

    public GastosAnuales(ArrayList<Rubro> rubro) {
        this.rubro = rubro;
    }

}
