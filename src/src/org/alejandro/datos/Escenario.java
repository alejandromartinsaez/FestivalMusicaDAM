package org.alejandro.datos;

import org.alejandro.datos.GruposMusicales;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Escenario {
    private UUID codigo;
    private String nombre;
    private int capacidadMaxima;
    private List<GruposMusicales> gruposMusicales_DAT = new ArrayList<>();

    public Escenario(UUID codigo, String nombre, int capacidadMaxima, List<GruposMusicales> gruposMusicales_DAT) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.gruposMusicales_DAT = gruposMusicales_DAT;
    }

    public UUID getCodigo() {
        return codigo;
    }

    public void setCodigo(UUID codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public List<GruposMusicales> getGruposMusicales_DAT() {
        return gruposMusicales_DAT;
    }

    public void setGruposMusicales_DAT(List<GruposMusicales> gruposMusicales_DAT) {
        this.gruposMusicales_DAT = gruposMusicales_DAT;
    }
}
