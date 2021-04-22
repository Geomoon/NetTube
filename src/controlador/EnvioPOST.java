/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 *
 * @author LUNA
 */
public class EnvioPOST {

    protected static void send(File file) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        System.out.println(file.toPath());

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://192.168.0.115/recibir.php"))
                .headers("Content-Type", "multipart/form-data", "name", "video")
                .POST(HttpRequest.BodyPublishers.ofFile(file.toPath()))
                .build();

        System.out.println(request.headers().toString());
        System.out.println(request.bodyPublisher().isPresent());

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
