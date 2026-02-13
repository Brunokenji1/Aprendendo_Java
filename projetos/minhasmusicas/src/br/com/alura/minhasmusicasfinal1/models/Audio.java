package br.com.alura.minhasmusicasfinal1.models;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCutidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCutidas() {
        return totalCutidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir(){
        this.totalCutidas++;
    }

    public void reproduz(){
        this.totalReproducoes++;
    }
}
