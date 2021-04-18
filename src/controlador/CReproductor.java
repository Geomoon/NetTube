/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import model.Pelicula;
import model.Serie;
import model.Video;
import vista.vistaReproductorVideo;

/**
 *
 * @author LUNA
 */
public class CReproductor {

    private Pelicula pelicula;
    private Serie serie;

    private Video video;
    private String url;

    private vistaReproductorVideo vRep;

    private final JFXPanel jfxPanel;
    private MediaView view;
    private MediaPlayer player = null;

    public CReproductor(vistaReproductorVideo vRep) {
        this.vRep = vRep;

        jfxPanel = new JFXPanel();
        addListeners();
    }

    public void initControl() {
        vRep.getPanelVideo().removeAll();
        
        vRep.getPanelVideo().setLayout(new BorderLayout());
        vRep.getPanelVideo().add(jfxPanel, BorderLayout.CENTER);

        createScene();
    }

    private void createScene() {

        Platform.runLater(() -> {
            player = null;
            player = new MediaPlayer(
                    new Media(url)
            );

            view = new MediaView(player);
            view.setFitWidth(800);
            view.setFitHeight(600);

            System.out.println("H: " + player.getMedia().getHeight());
            System.out.println("W: " + player.getMedia().getWidth());

            //añade video al jfxPanel
            jfxPanel.setScene(new Scene(new Group(view)));
            player.setVolume(0.7);
            player.setCycleCount(MediaPlayer.INDEFINITE);//repite el video
            addListeners();
        });
    }

    private void addListeners() {
        vRep.getBtnPlay().addActionListener(l -> player.play());
        vRep.getBtnPausa().addActionListener(l -> player.pause());
        vRep.getBtnStop().addActionListener(l -> player.stop());
        vRep.getBtnRegresar().addActionListener(l -> regresar());
    }

    private void regresar() {
        ((CardLayout) vRep.getParent().getLayout()).show(vRep.getParent(), "cardPrincipal");
        this.player.stop();
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
        this.url = pelicula.getVideo().getDir();
        vRep.getLblTitulo().setText(pelicula.getTitulo());
        initControl();
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

}
