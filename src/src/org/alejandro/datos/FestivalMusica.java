package org.alejandro.datos;

public class FestivalMusica {
    public String nombreFestival;
    public String fecha;

    public FestivalMusica(String nombreFestival, String fecha) {
        this.nombreFestival = nombreFestival;
        this.fecha = fecha;
    }

    public String getNombreFestival() {
        return nombreFestival;
    }

    public void setNombreFestival(String nombreFestival) {
        this.nombreFestival = nombreFestival;
    }
}
