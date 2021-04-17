package controlador;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.AbstractAction;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.Action;
import model.MPelicula;
import model.MSerie;
import vista.vistaPrincipal;

/**
 *
 * @author LUNA
 */
public class MenuBusqueda {

    /**
     * tf, TextField desde donde se realiza la búsqueda
     */
    private JTextField tf;

    /**
     * menu, JPopupMenu muestra las coincidencias de búsqueda
     */
    private JPopupMenu menu;

    private MPelicula mPeli;
    private MSerie mSerie;
    private vistaPrincipal vista;

    public MenuBusqueda(JTextField tf, MPelicula mPeli, MSerie mSerie, vistaPrincipal vista) {
        this.tf = tf;
        this.mPeli = mPeli;
        this.mSerie = mSerie;
        this.vista = vista;

        menu = new JPopupMenu();

        addEvent();
    }

    private void addEvent() {

        vista.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                limpiar();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                limpiar();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                limpiar();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                limpiar();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                limpiar();
            }

        });

        tf.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == 0) {  //se supone que oculta las opciones al dar backspace v:
                    limpiar();
                } else {
                    buscar(tf.getText());
                }
            }
        });

    }

    private void limpiar() {
        menu.setVisible(false);
        menu.removeAll();
    }

    public void addValue(String item) {
        menu.add(new AccionMenu(item));
        mostrarMenu();
    }

    private void mostrarMenu() {
        menu.setVisible(false);

        int num = menu.getSubElements().length;
        menu.setPopupSize(tf.getSize().width, (30 * num));

        Point point = new Point(
                tf.getLocationOnScreen().x,
                tf.getLocationOnScreen().y + tf.getSize().height
        );

        menu.setLocation(point);
        menu.setVisible(true);
    }

    /**
     * Para buscar entre peliculas y series, por el nombre
     *
     * @param text nombre a buscar
     */
    private void buscar(String text) {
        limpiar();
        buscarPeliculas(text);
        buscarSeries(text);
    }

    private void buscarPeliculas(String text) {
        mPeli.listar(text, 3).stream()
                .forEach(p -> addValue(p.getTitulo()));
    }

    private void buscarSeries(String text) {
        mSerie.listar(text, 3).stream()
                .forEach(s -> addValue(s.getTitulo()));
    }

    class AccionMenu extends AbstractAction {

        private String textoOpcion;

        public AccionMenu(String textoOpcion) {
            this.textoOpcion = textoOpcion;
            this.putValue(Action.NAME, textoOpcion);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            tf.setText("");
            tf.setText(textoOpcion);
        }
    }
}
