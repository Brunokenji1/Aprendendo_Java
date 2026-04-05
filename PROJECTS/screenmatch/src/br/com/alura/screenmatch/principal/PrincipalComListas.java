package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Circulo de fogo", 2010);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("homem de ferro", 2013);
        outroFilme.avalia(10);
        Filme filmeDoBruno = new Filme("Gigantes de Aço", 2011);
        filmeDoBruno.avalia(6);
        Serie dark = new Serie("Dark", 2017);
        dark.avalia(4);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoBruno);
        lista.add(dark);

        for (Titulo titulo : lista){
            System.out.println(titulo.getNome());
            if (titulo instanceof Filme filme && filme.getClassificacao() > 3){ //ja transforma o titulo em um Filme
                System.out.println("Classificacao " + filme.getClassificacao());
            }
        }

        List<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Michael B. Jordan");
        buscarPorArtista.add("Leonardo DiCaprio");
        buscarPorArtista.add("Adam Sandler");
        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscarPorArtista);

        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista); //compareTo
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
