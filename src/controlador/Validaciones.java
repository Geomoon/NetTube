/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 *
 * @author LUNA
 */
public class Validaciones {

    private static final String RGX_NOMBRES = "^[\\p{L} .'-]+$";
    private static final String RGX_CORREO = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";

    private static final Pattern P_NOMBRES = Pattern.compile(RGX_NOMBRES);
    private static final Pattern P_CORREO = Pattern.compile(RGX_CORREO);

    protected static boolean validarNombre(String nombre) {
        Matcher matcher = P_NOMBRES.matcher(nombre);
        return matcher.matches();
    }

    protected static boolean validarCorreo(String correo) {
        Matcher matcher = P_CORREO.matcher(correo);
        return matcher.matches();
    }

    public void ValidarLetras(JTextField campo) {
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracterT = e.getKeyChar();
                if (((caracterT < 'a' | caracterT > 'z') & (caracterT < 'A' | caracterT > 'Z') & (caracterT != 32))) {
                    e.consume();
                }
            }
        });
    }

    public void ValidarNumeros(JTextField campo) {
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
    }

    public void LimitarCaracteres(JTextField campo, int cant) {
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                int tamaño = campo.getText().length();
                if (tamaño >= cant) {
                    e.consume();
                }
            }
        });
    }
}
