package br.com.alura.screenmath;

import br.com.alura.screenmath.model.DadosSerie;
import br.com.alura.screenmath.service.ConsumoApi;
import br.com.alura.screenmath.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmathApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmathApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		//System.out.printf(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.printf(String.valueOf(dados));
	}
}
