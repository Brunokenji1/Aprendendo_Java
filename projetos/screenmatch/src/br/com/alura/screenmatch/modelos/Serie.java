package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutisPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutisPorEpisodio() {
        return minutisPorEpisodio;
    }

    public void setMinutisPorEpisodio(int minutisPorEpisodio) {
        this.minutisPorEpisodio = minutisPorEpisodio;
    }


    @Override
    public int getDuracao() {
        return temporadas * episodiosPorTemporada * minutisPorEpisodio;
    }
}
