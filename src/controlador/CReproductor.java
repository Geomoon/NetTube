/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import model.Capitulo;
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
    private Capitulo capitulo;

    private Video video;
    private String url;

    private vistaReproductorVideo vRep;

    private final JFXPanel jfxPanel;
    private MediaView view;
    private MediaPlayer player = null;

    public CReproductor(vistaReproductorVideo vRep) {
        this.vRep = vRep;

        jfxPanel = new JFXPanel();
       // addListeners();
    }

    public void initControl() {
        vRep.getPanelVideo().removeAll();
        System.out.println("initcontrol");
        vRep.getPanelVideo().setLayout(new BorderLayout());
        vRep.getPanelVideo().add(jfxPanel, BorderLayout.CENTER);
        jfxPanel.setBackground(new Color(38,11,32));
        jfxPanel.setLayout(new BorderLayout());
        createScene();
    }

    private void createScene() {
        System.out.println("escene");

        Platform.runLater(() -> {
            player = null;
            player = new MediaPlayer(
                    new Media(url)
            );

            view = new MediaView(player);
            view.setFitWidth(jfxPanel.getSize().getWidth());
            view.setFitHeight(jfxPanel.getSize().getHeight());

            System.out.println("H: " + player.getMedia().getHeight());
            System.out.println("W: " + player.getMedia().getWidth());

            //añade video al jfxPanel
            jfxPanel.setScene(new Scene(new Group(view)));
            player.setVolume(0.7);
            player.setCycleCount(MediaPlayer.INDEFINITE);//repite el video
            addListeners();
        });
        System.out.println("fin");

    }

    private void addListeners() {
        vRep.getBtnPlay().addActionListener(l -> player.play());
        vRep.getBtnPausa().addActionListener(l -> player.pause());
        vRep.getBtnStop().addActionListener(l -> player.stop());
        vRep.getBtnRegresar().addActionListener(l -> regresar());

        vRep.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent componentEvent) {
                view.setFitHeight(jfxPanel.getSize().getHeight());
                view.setFitWidth(jfxPanel.getSize().getWidth());
            }
        });
    }

    private void regresar() {
        ((CardLayout) vRep.getParent().getLayout()).show(vRep.getParent(), "cardPrincipal");
        if (player.getMedia() != null) {
            player.stop();
        }
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
        this.url = pelicula.getVideo().getDir();
        System.out.println(url);
        vRep.getLblTitulo().setText(pelicula.getTitulo());
        initControl();
    }

    public Capitulo getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(Capitulo capitulo) {
        this.capitulo = capitulo;
        this.url = capitulo.getVideo().getDir();
        vRep.getLblTitulo().setText(capitulo.getTitulo());
        initControl();
    }

}
