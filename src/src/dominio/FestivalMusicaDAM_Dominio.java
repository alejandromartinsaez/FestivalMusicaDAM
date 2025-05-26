package dominio;

import datos.FestivalDatos;
import datos.FestivalMusica;

public class FestivalMusicaDAM_Dominio {
    private FestivalDatos repo = new FestivalDatos();

    public void registrar(String nombre, String fecha) {
        if (nombre == null || fecha == null || nombre.isEmpty() || fecha.isEmpty()) {
            System.out.println("Datos invalidos");
            return;
        }

        FestivalMusica f = new FestivalMusica(nombre, fecha);
        repo.guardar(f);
    }

    public void mostrarTodos() {
        for (FestivalMusica f : repo.obtenerTodos()) {
            System.out.println(f.nombreFestival + "-" + f.fecha);
        }
    }
}
