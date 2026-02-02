package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >=  4){
            System.out.println("Está entre os queridinhos do momento");
        } else if (classificavel.getClassificacao()>=2) {
            System.out.println("Bom");
        } else {
            System.out.println("Assista depois");
        }
    }
}
