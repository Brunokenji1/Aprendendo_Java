package br.com.alura.screenmatch02;

import br.com.alura.screenmatch02.model.DadosSerie;
import br.com.alura.screenmatch02.service.ConsumoApi;
import br.com.alura.screenmatch02.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Screenmatch02Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Screenmatch02Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoapi = new ConsumoApi();
		var json = consumoapi.obterDados("https://www.omdbapi.com/?t=loki&apikey=ed7f6c6f");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
