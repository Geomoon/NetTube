/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;

/**
 *
 * @author LUNA
 */
public class Pelicula extends Contenido {

    public static final String DIR = "/publico/peliculas/";

    private Video video;

    public Pelicula() {
    }

    public Pelicula(int id) {
        super(id);
    }

    public Pelicula(int id, String titulo, String descripcion, Image imagen, Categoria categoria, Video video) {
        super(id, titulo, descripcion, imagen, categoria);
        this.video = video;
    }

    public Pelicula(int id, String titulo, String descripcion, Image imagen, Categoria categoria) {
        super(id, titulo, descripcion, imagen, categoria);
    }
    
    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

}
