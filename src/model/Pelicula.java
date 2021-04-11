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

    private Video video;
    
    public Pelicula() {
    }

    public Pelicula(String id, String titulo, String descripcion, Image imagen, Categoria categoria, Video video) {
        super(id, titulo, descripcion, imagen, categoria);
        this.video = video;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

}
