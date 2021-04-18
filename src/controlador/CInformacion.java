/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.CardLayout;
import javax.swing.ImageIcon;
import model.Pelicula;
import model.Serie;
import vista.vistaInformacion;
import vista.vistaPrincipal;

/**
 *
 * @author LUNA
 */
public class CInformacion {

    private vistaInformacion vInfo;
    private vistaPrincipal vPrincipal;

    private Pelicula pelicula;
    private Serie serie;
    private CReproductor cRep;

    public CInformacion(vistaInformacion vInfo, vistaPrincipal vPrincipal, Pelicula pelicula) {
        this.vInfo = vInfo;
        this.vPrincipal = vPrincipal;
        this.pelicula = pelicula;
    }

    public CInformacion(vistaInformacion vInfo, vistaPrincipal vPrincipal, Serie serie) {
        this.vInfo = vInfo;
        this.vPrincipal = vPrincipal;
        this.serie = serie;
    }

    private void addEvents() {
        vInfo.getBtnReproducir().addActionListener(l -> iniciarRepro());
    }

    public void initControl() {
        vInfo.setVisible(true);
        if (pelicula != null) {
            controlPelicula();
        } else {
            controlSerie();
        }

        addEvents();
    }

    private void controlPelicula() {
        if (pelicula.getImagen() != null) {
            vInfo.getLbFoto().setIcon(new ImageIcon(pelicula.getImagen()));
        }
        vInfo.getTextInformacion().setText(pelicula.getDescripcion());
        vInfo.getLblTitulo().setText(pelicula.getTitulo());
    }

    private void controlSerie() {
        if (serie.getImagen() != null) {
            vInfo.getLbFoto().setIcon(new ImageIcon(serie.getImagen()));
        }
        vInfo.getTextInformacion().setText(serie.getDescripcion());
        vInfo.getLblTitulo().setText(serie.getTitulo());
    }

    private void iniciarRepro() {
        ((CardLayout) vPrincipal.getPanelCard().getLayout()).show(vPrincipal.getPanelCard(), "cardRep");
        vInfo.dispose();

        if (pelicula != null) {
            cRep.setPelicula(pelicula);
        } else {
            cRep.setSerie(serie);
        }
    }
    
    public void setCRep(CReproductor cRep) {
        this.cRep = cRep;
    }

}
