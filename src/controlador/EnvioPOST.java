package controlador;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JOptionPane;

import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;

/**
 *
 * @author LUNA
 */
public class EnvioPOST {

    private static final String URL = "http://192.168.0.115/recibir.php";

    /**
     * Envía un archivo al servidor, con el uso del protocolo HTTP
     *
     * @param file, archivo de video .mp4
     * @param dir, dirección de destino
     */
    static boolean sendVideo(File file, String dir) {
        String v = file.getName();
        System.out.println("Archivo Name: " + v);

        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(URL);

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.addBinaryBody("video", file, ContentType.MULTIPART_FORM_DATA, v);

        HttpEntity multipart = builder.build();
        httpPost.setEntity(multipart);

        int code = 0;
        try (CloseableHttpResponse response = client.execute(httpPost)) {

            String r = EntityUtils.toString(response.getEntity());
            System.out.println(r);

            code = Integer.parseInt(r.split("<hr/>")[r.split("<hr/>").length - 1]);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return (code == 1);
    }
    
}
