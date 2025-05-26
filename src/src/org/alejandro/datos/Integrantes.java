package org.alejandro.datos;

import java.time.LocalDate;

public class Integrantes {
    private String nombre;
    private String instrumento;
    private LocalDate anoNacimiento;

    public Integrantes(String nombre, String instrumento, LocalDate anoNacimiento) {
        this.nombre = nombre;
        this.instrumento = instrumento;
        this.anoNacimiento = anoNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public LocalDate getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(LocalDate anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }
}
