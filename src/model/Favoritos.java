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
    
    private String id;
    private UsuarioApp user;

    public Favoritos(String id, UsuarioApp user) {
        this.id = id;
        this.user = user;
    }

    public Favoritos(String id) {
        this.id = id;
    }

    
    public Favoritos() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(UsuarioApp user) {
        this.user = user;
    }

    
    
    
}
