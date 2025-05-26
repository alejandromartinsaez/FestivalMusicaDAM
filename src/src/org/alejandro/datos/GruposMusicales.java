package org.alejandro.datos;

import java.util.ArrayList;
import java.util.List;

public class GruposMusicales {
    private String nombreGrupo;
    private String generoMusical;
    private String paisOrigen;
    private List<Integrantes> integrantesList = new ArrayList<>();

    public GruposMusicales(String nombreGrupo, String generoMusical, String paisOrigen, List<Integrantes> integrantesList) {
        this.nombreGrupo = nombreGrupo;
        this.generoMusical = generoMusical;
        this.paisOrigen = paisOrigen;
        this.integrantesList = integrantesList;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public List<Integrantes> getIntegrantesList() {
        return integrantesList;
    }

    public void setIntegrantesList(List<Integrantes> integrantesList) {
        this.integrantesList = integrantesList;
    }
}
