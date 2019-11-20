package com.example.demo.Common;

import java.net.URI;
import java.net.http.*;

public class HttpRequestSender {

    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();

    private String apiKey = "0Kva5FncbGXzLXiFZ4BbwVKLMHN2";

    public static String getResponse(String url) {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = null;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e){

        }

        return response.body();
    }

}
