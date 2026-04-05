package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    // shift + F6 -> renomear
    public String diretor;

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    @Override
    public int getClassificacao() {
        return (int) pegarMedia() / 2;
    }

    @Override
    public String toString(){
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ") ";
    }

}
