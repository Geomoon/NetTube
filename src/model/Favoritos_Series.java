/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class Favoritos_Series {
    
    private String id;
    private Favoritos favorito;
    private Serie serie;

    public Favoritos_Series(String id, Favoritos favorito, Serie serie) {
        this.id = id;
        this.favorito = favorito;
        this.serie = serie;
    }

    public Favoritos_Series() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Favoritos getFavorito() {
        return favorito;
    }

    public void setFavorito(Favoritos favorito) {
        this.favorito = favorito;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    
    
    
}
