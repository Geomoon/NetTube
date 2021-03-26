/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.sql.Date;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import javax.swing.JLabel;

/**
 *
 * @author LUNA
 */
public class CUtils {

    protected static Image redimensionarImagen(Image image, JLabel label) {
        BufferedImage bf = (BufferedImage) image;
        if (bf.getHeight() > label.getHeight() || bf.getWidth() > label.getWidth()) {
            return image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        } else {
            return image;
        }
    }

    /**
     * Convierte una instancia de java.util.Date
     *
     * @param utilDate de tipo {@code java.util.Date}
     * @return dato de tipo {@code java.sql.Date}
     */
    protected static Date toSQLDate(java.util.Date utilDate) {
        Instant instant = utilDate.toInstant();
        ZoneId zi = ZoneId.of("America/Guayaquil");
        ZonedDateTime time = ZonedDateTime.ofInstant(instant, zi);
        return Date.valueOf(time.toLocalDate());
    }
}
