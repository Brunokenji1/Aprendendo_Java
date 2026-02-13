package br.com.alura.minhasmusicasfinal1.principal;

import br.com.alura.minhasmusicasfinal1.models.MinhasPreferidas;
import br.com.alura.minhasmusicasfinal1.models.Musica;
import br.com.alura.minhasmusicasfinal1.models.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Nights");
        minhaMusica.setCantor("Franck Ocean");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Flow PodCast");
        meuPodcast.setApresentador("Igor");
        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);

    }
}
