package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String busca = "";
        List<Titulo> listaDeTitulos = new ArrayList<>();

        //configura como vem os atributos do json
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while(!busca.equalsIgnoreCase("sair")){
            System.out.println("Digite um filme para busca: ");
            busca = sc.nextLine();
            if(busca.equalsIgnoreCase("sair")){
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=ed7f6c6f";

            try{
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                System.out.println(response.body());
                String json = response.body();

                //O gson vai deserializar do formato json para o formato da class record
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb.toString());

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo já convertido");
                System.out.println(meuTitulo);

                //FileWriter escrita = new FileWriter("filmes.txt");
                //escrita.write(meuTitulo.toString());
                //escrita.close();

                listaDeTitulos.add(meuTitulo);
            } catch(NumberFormatException e){
                System.out.println("Aconteceu um erro");
                System.out.println(e.getMessage());
            } catch(ErroDeConversaoDeAnoException e){
                System.out.println(e.getMessage());
            }

        }
        System.out.println(listaDeTitulos);

        FileWriter escrita = new FileWriter("filmes.json");
        //O gson vai serializar para o formato json
        escrita.write(gson.toJson(listaDeTitulos));
        escrita.close();
        System.out.println("O programa finalizou corretamente");
    }
}
