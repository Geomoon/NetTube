package model;

/**
 *
 * @author LUNA
 */
public class Capitulo {

    private String id;
    private String descripcion;
    private Video video;

    public Capitulo(String id, String descripcion, Video video) {
        this.id = id;
        this.descripcion = descripcion;
        this.video = video;
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

}
