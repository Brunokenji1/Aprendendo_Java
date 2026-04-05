package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Circulo de fogo", 2010);
        meuFilme.setDuracao(150);

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(20);
        meuFilme.avalia(30);
        meuFilme.avalia(40);
        System.out.println(meuFilme.getSomaAvaliacao());
        System.out.println(meuFilme.getTotalDeAvaliacao());


        Serie dark = new Serie("Dark", 2017);
        dark.exibirFichaTecnica();

        dark.setTemporadas(3);
        dark.setEpisodiosPorTemporada(12);
        dark.setMinutisPorEpisodio(50);
        System.out.println("Duração para maratonar dark: " + dark.getDuracao());

        Filme outroFilme = new Filme("homem de ferro", 2013);
        outroFilme.setDuracao(100);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(dark);
        episodio.setTotalVisualizacoes(400);
        filtro.filtra(episodio);

        Filme filmeDoBruno = new Filme("Gigantes de Aço", 2011);
        filmeDoBruno.setDuracao(200);
        filmeDoBruno.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(filmeDoBruno);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro Filme " + listaDeFilmes.get(0).toString());

        System.out.println();

    }
}