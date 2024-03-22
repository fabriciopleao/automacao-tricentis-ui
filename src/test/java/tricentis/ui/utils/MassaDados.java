package tricentis.ui.utils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.github.javafaker.Faker;

public class MassaDados {

	// GERADORES DE MASSA RANDOMICA

	private static final Faker faker = new Faker(new Locale("en-US"));

	// Gerador de numeros randomicos especifico para este site
	public static final List<String> numerosRandomicos(int quantidade) {
		List<String> numerosGerados = new ArrayList<String>();

		for (int i = 0; i < quantidade; i++) {
			int numero = faker.number().numberBetween(500, 1001);
			numerosGerados.add(String.valueOf(numero));
		}

		return numerosGerados;
	}

	// Gerador de primeiro nome randomico
	public static final List<String> nomeRandomico(int quantidade) {
		List<String> nomesGerados = new ArrayList<String>();

		for (int i = 0; i < quantidade; i++) {
			nomesGerados.add(faker.name().firstName());
		}

		return nomesGerados;
	}

	// Gerador de sobrenome randomico
	public static final List<String> sobrenomeRandomico(int quantidade) {
		List<String> sobrenomesGerados = new ArrayList<String>();

		for (int i = 0; i < quantidade; i++) {
			sobrenomesGerados.add(faker.name().lastName());
		}

		return sobrenomesGerados;
	}

	// Gerador de cidade randomica
	public static final List<String> cidadeRandomico(int quantidade) {
		List<String> cidadeGeradas = new ArrayList<String>();

		for (int i = 0; i < quantidade; i++) {
			cidadeGeradas.add(faker.address().city());
		}

		return cidadeGeradas;
	}

	// Gerador de cep randomico especifico para este site
	public static final List<String> cepRandomico(int quantidade) {
		return IntStream.range(0, quantidade).mapToObj(i -> faker.number().randomNumber(8, true)).map(String::valueOf)
				.collect(Collectors.toList());
	}

	// Gerador de data randomica no padrão americano
	public static final List<String> dataRandomica(int quantidade) {
		List<String> dataGeradas = new ArrayList<String>();

		for (int i = 0; i < quantidade; i++) {
			LocalDate data = faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			String dataFormatada = String.format("%02d/%02d/%04d", data.getMonthValue(), data.getDayOfMonth(),
					data.getYear());
			dataGeradas.add(dataFormatada);
		}

		return dataGeradas;
	}

	// Gerador de data futura randomica no padrão americano
	public static final List<String> dataFuturaRandomica(int quantidade) {
		return IntStream.range(0, quantidade)
				.mapToObj(i -> LocalDate.now().plusYears(ThreadLocalRandom.current().nextInt(3, 6)))
				.filter(data -> data.getYear() >= 2025)
				.map(data -> data.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"))).collect(Collectors.toList());
	}

	// Gerador de endereco randomico
	public static final List<String> enderecoRandomico(int quantidade) {
		List<String> enderecoGerados = new ArrayList<String>();

		for (int i = 0; i < quantidade; i++) {
			enderecoGerados.add(faker.address().fullAddress());
		}

		return enderecoGerados;
	}

	// Gerador de website randomico
	public static final List<String> siteRandomico(int quantidade) {
		List<String> siteGerados = new ArrayList<String>();

		for (int i = 0; i < quantidade; i++) {
			String palavra1 = faker.lorem().word();
			String palavra2 = faker.lorem().word();
			String dominio = "net.com";
			String url = String.format("https://%s/%s-%s", dominio, palavra1, palavra2);
			siteGerados.add(url);
		}

		return siteGerados;
	}
	
	// Gerador de email randomico
	public static final List<String> emailRandomico(int quantidade) {
		List<String> emailGerados = new ArrayList<String>();

		for (int i = 0; i < quantidade; i++) {
			emailGerados.add(faker.internet().emailAddress());
		}

		return emailGerados;
	}
	
	// Gerador de telefone especifico para este site
	public static final List<String> phoneRandomico(int quantidade) {
	List<String> numerosGerados = new ArrayList<String>();

	for (int i = 0; i < quantidade; i++) {
		int numero = faker.number().numberBetween(10000000, 1000000000);
		numerosGerados.add(String.valueOf(numero));
	}

	return numerosGerados;
	
	}
	
	// Gerador de senha randomica
		public static final List<String> senhaRandomico(int quantidade) {
			List<String> senhaGerados = new ArrayList<String>();

			for (int i = 0; i < quantidade; i++) {
				senhaGerados.add(faker.internet().password());
			}

			return senhaGerados;
		}

}
