package model;

/**
 *
 * @author LUNA
 */
public class Capitulo {

    private String id;
    private String titulo;
    private String descripcion;
    private Video video;
    private Serie serie;

    public Capitulo() {
    }

    public Capitulo(String id, String titulo, String descripcion, Video video, Serie serie) {
        this.id = id;
        this.descripcion = descripcion;
        this.video = video;
        this.titulo = titulo;
        this.serie = serie;
    }

    public Capitulo(String id, String titulo, String descripcion, Serie serie) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.serie = serie;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

}
