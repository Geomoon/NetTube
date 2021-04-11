package model;

import java.awt.Image;
import java.util.List;

/**
 *
 * @author LUNA
 */
public class Serie extends Contenido {

    private List<Capitulo> capitulos;

    public Serie() {
    }

    public Serie(String id, String titulo, String descripcion, Image imagen, Categoria categoria, List<Capitulo> capitulos) {
        super(id, titulo, descripcion, imagen, categoria);
        this.capitulos = capitulos;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(List<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

}
