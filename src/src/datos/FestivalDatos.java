package datos;

import java.util.ArrayList;
import java.util.List;

public class FestivalDatos {
    private List<FestivalMusica> festivales = new ArrayList<>();

    public void guardar(FestivalMusica f) {
        festivales.add(f);
    }
    public List<FestivalMusica> obtenerTodos() {
        return festivales;
    }
}
