package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Titulo  {
    private String nome;
    private int duracao;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacao;


    //ALT + INS -> atalho fazer setters e getters

    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    public double getSomaAvaliacao(){
        return somaAvaliacao;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setNome(String n) { // é possivel, mas não é uma boa pratica
        nome = n;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibirFichaTecnica(){
        System.out.println("Nome do filme:" + nome);
        System.out.println("Ano de lançamento:" + anoDeLancamento);
    }

    public void avalia(double nota){
        somaAvaliacao += nota;
        totalDeAvaliacao++;
    }

    public double pegarMedia(){

        return somaAvaliacao / totalDeAvaliacao;
    }


}
