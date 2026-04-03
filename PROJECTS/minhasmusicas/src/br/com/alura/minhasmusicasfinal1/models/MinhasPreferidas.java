package br.com.alura.minhasmusicasfinal1.models;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + "It's awesome");
        }
        else{
            System.out.println(audio.getTitulo() + "It's good");
        }
    }

}
