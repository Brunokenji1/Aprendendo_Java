package br.com.bruk.modelos;

import java.util.ArrayList;
import java.util.List;

public class Credito {
    private double limiteDeCredito;
    private double saldo;
    private List<Compra> listaDeCompras;

    public Credito(double limite){
        this.limiteDeCredito = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra){
        if(this.saldo > compra.getPreco()){
            this.saldo-=compra.getPreco();
            listaDeCompras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }


    public List<Compra> getListaDeCompras(){
        return listaDeCompras;
    }

}
