package service;

import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;
import model.ServicioTuristico;
import java.util.ArrayList;

public class GestorServicios {

    public ArrayList<ServicioTuristico> crearServicios() {
        ArrayList<ServicioTuristico> lista = new ArrayList<>();

        lista.add(new RutaGastronomica("Sabores del Lago", 4, 5));
        lista.add(new RutaGastronomica("Ruta Chilota", 3, 3));

        lista.add(new PaseoLacustre("Crucero Llanquihue", 2, "Tucapel"));
        lista.add(new PaseoLacustre("Paseo al Volcán", 3, "Lancha"));

        lista.add(new ExcursionCultural("Fuertes Coloniales", 5, "Fuerte Bulnes"));
        lista.add(new ExcursionCultural("Puerto Varas Histórico", 4, "Casa Kuschel"));

        return lista;
    }
}