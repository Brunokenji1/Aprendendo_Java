package br.com.bruk.modelos;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private double preco;

    public Compra(String nome, double preco) {
        this.descricao = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Descrição = " + descricao +
                "Valor = " + preco;
    }

    @Override
    public int compareTo(Compra outraConta) {
        return Double.valueOf(this.preco).compareTo(Double.valueOf(outraConta.preco));
    }
}
