package ViaCep.API;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        Gson gson =
                new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
        String busca = "";

        while(!busca.equalsIgnoreCase("sair")){
            System.out.println("Digite o cep para busca: ");
            busca = leitura.nextLine();
            if (busca.equalsIgnoreCase("sair")){
                break;
            }

            String cep = "https://viacep.com.br/ws/" + busca.replace("-", "" ) + "/json/";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(cep))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Endereco endereco = gson.fromJson(json, Endereco.class);
            System.out.println(endereco);

        }
    }
}
