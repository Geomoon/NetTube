/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author LUNA
 */
public interface Listable<T> {
    
    List<T> listar();
  
    T buscar(String id);
}
