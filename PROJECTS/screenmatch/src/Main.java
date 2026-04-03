import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Circulo de fogo");
        meuFilme.setAnoDeLancamento(2010);
        meuFilme.setDuracao(150);

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(20);
        meuFilme.avalia(30);
        meuFilme.avalia(40);
        System.out.println(meuFilme.getSomaAvaliacao());
        System.out.println(meuFilme.getTotalDeAvaliacao());


        Serie dark = new Serie();
        dark.setNome("Dark");
        dark.setAnoDeLancamento(2017);
        dark.exibirFichaTecnica();

        dark.setTemporadas(3);
        dark.setEpisodiosPorTemporada(12);
        dark.setMinutisPorEpisodio(50);
        System.out.println("Duração para maratonar dark: " + dark.getDuracao());

        Filme outroFilme = new Filme();
        outroFilme.setNome("homem de ferro");
        outroFilme.setAnoDeLancamento(2013);
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
    }
}