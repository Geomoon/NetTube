/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.CardLayout;
import java.util.List;
import javax.swing.ImageIcon;
import model.Capitulo;
import model.MCapitulo;
import model.MSerie;
import model.Pelicula;
import model.Serie;
import vista.panelCapitulos;
import vista.vistaInformacion;
import vista.vistaInformacionSeries;
import vista.vistaPrincipal;

/**
 *
 * @author LUNA
 */
public class CInformacion {

    private vistaInformacion vInfo;
    private vistaInformacionSeries vInfoSeries;
    private vistaPrincipal vPrincipal;

    private Pelicula pelicula;
    private Serie serie;
    private CReproductor cRep;

    public CInformacion(vistaInformacion vInfo, vistaPrincipal vPrincipal, Pelicula pelicula) {
        this.vInfo = vInfo;
        this.vPrincipal = vPrincipal;
        this.pelicula = pelicula;
    }

    public CInformacion(vistaInformacionSeries vInfoSeries, vistaPrincipal vPrincipal, Serie serie) {
        this.vInfoSeries = vInfoSeries;
        this.vPrincipal = vPrincipal;
        this.serie = serie;
    }

    private void addEvents() {
        if (pelicula != null) {
            vInfo.getBtnReproducir().addActionListener(l -> iniciarRepro());
        }
    }

    public void initControl() {

        if (pelicula != null) {
            vInfo.setVisible(true);
            controlPelicula();
        } else {
            vInfoSeries.setVisible(true);
            controlSerie();
        }

        addEvents();
    }

    private void controlPelicula() {
        if (pelicula.getImagen() != null) {
            vInfo.getLbFoto().setIcon(new ImageIcon(CUtils.redimensionarImagen(pelicula.getImagen(), vInfo.getLbFoto())));
        }
        vInfo.getTextInformacion().setText(pelicula.getDescripcion());
        vInfo.getLblTitulo().setText(pelicula.getTitulo());
    }

    private void controlSerie() {
        if (serie.getImagen() != null) {
            vInfoSeries.getLbFoto().setIcon(new ImageIcon(CUtils.redimensionarImagen(serie.getImagen(), vInfoSeries.getLbFoto())));
        }
        vInfoSeries.getTextInformacion().setText(serie.getDescripcion());
        vInfoSeries.getLblTitulo().setText(serie.getTitulo());
        vInfoSeries.getBtnCancelar().addActionListener(l -> vInfoSeries.dispose());

        PanelesCapitulos();
    }

    private void iniciarRepro() {
        ((CardLayout) vPrincipal.getPanelCard().getLayout()).show(vPrincipal.getPanelCard(), "cardRep");
        vInfo.dispose();

        if (pelicula != null) {
            cRep.setPelicula(pelicula);
            System.out.println(pelicula.getId());
        } else {
            System.out.println("Es una serie");
        }
    }

    private void iniciarReproCap(Capitulo c) {
        ((CardLayout) vPrincipal.getPanelCard().getLayout()).show(vPrincipal.getPanelCard(), "cardRep");
        vInfoSeries.dispose();

        cRep.setCapitulo(c);
    }

    public void setCRep(CReproductor cRep) {
        this.cRep = cRep;
    }

    private void PanelesCapitulos() {
        MCapitulo mc = new MCapitulo();
        vInfoSeries.getPanelSeriesInfo().removeAll();
        List<Capitulo> listc = mc.buscarCapitulosSerie(serie.getId());
        listc.stream().forEach(p -> {
            panelCapitulos pc = new panelCapitulos();
            pc.getTextTitulo().setText(p.getTitulo());
            pc.getTextDescripcion().setText(p.getDescripcion());
            pc.getBtnVerEliminar().setText("REPRODUCIR");
            pc.getBtnVerEliminar().addActionListener(l -> iniciarReproCap(p));

            vInfoSeries.getPanelSeriesInfo().add(pc);
            vInfoSeries.getPanelSeriesInfo().updateUI();
        });

    }

}
