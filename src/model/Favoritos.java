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
public class Favoritos {
    
    private int id;
    private UsuarioApp user;

    public Favoritos(int id, UsuarioApp user) {
        this.id = id;
        this.user = user;
    }

    public Favoritos(int id) {
        this.id = id;
    }

    
    public Favoritos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(UsuarioApp user) {
        this.user = user;
    }

    
    
    
}
