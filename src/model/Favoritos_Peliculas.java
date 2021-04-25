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
public class Favoritos_Peliculas {
    
    private int id;
    private Favoritos favoritos;
    private Pelicula pelicula;

    public Favoritos_Peliculas(int id, Favoritos favoritos, Pelicula pelicula) {
        this.id = id;
        this.favoritos = favoritos;
        this.pelicula = pelicula;
    }

    public Favoritos_Peliculas() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Favoritos getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(Favoritos favoritos) {
        this.favoritos = favoritos;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
    
}
