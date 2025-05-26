package presentacion;

import dominio.FestivalMusicaDAM_Dominio;

public class FestivalMusicaDAM_Presentacion {
    public static void main(String[] args) {
        FestivalMusicaDAM_Dominio dominio = new FestivalMusicaDAM_Dominio();
        dominio.registrar("Festival 1", "21 Marzo");
        dominio.registrar("Festival 2", "32 Marzo");

        dominio.mostrarTodos();
    }
}
