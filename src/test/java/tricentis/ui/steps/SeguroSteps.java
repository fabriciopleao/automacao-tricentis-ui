package tricentis.ui.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tricentis.ui.pages.SeguroPage;
import tricentis.ui.runner.Executa;
import tricentis.ui.utils.MassaDados;

public class SeguroSteps {

	SeguroPage securePage = new SeguroPage();

	@Given("acesse a aba de seguro veicular")
	public void acesseAAbaDeSeguroVeicular() {
		Executa.inicializarTeste("https://sampleapp.tricentis.com/101/app.php");
	}

	@When("preencha o formulario enter vehicle data")
	public void preenchaOFormularioEnterVehicleData() {
		securePage.preencherFormVehicleData(MassaDados.numerosRandomicos(7));
	}

	@When("preencha o formulario enter insurant data")
	public void preenchaOFormularioEnterInsurantData() {
		securePage.preencherFormInsurantData(MassaDados.nomeRandomico(1), MassaDados.sobrenomeRandomico(1),
				MassaDados.cidadeRandomico(1), MassaDados.cepRandomico(1), MassaDados.dataRandomica(1),
				MassaDados.enderecoRandomico(1), MassaDados.siteRandomico(1));
	}

	@When("preencha o formulario enter product data")
	public void preenchaOFormularioEnterProductData() {
		securePage.preencherFormProductData(MassaDados.dataFuturaRandomica(1));
	}

	@When("escolher plano de seguro")
	public void escolherPlanoDeSeguro() throws InterruptedException {
		securePage.selecionarPlano();
	}

	@When("enviar contacao")
	public void enviarContacao() throws InterruptedException {
		securePage.preencherSendQuote(MassaDados.emailRandomico(1), MassaDados.phoneRandomico(1),
				MassaDados.nomeRandomico(1), "Teste@123", "Eu posso alcançar tudo que me comprometo a realizar.");
	}

	@Then("cotacao enviada com sucesso")
	public void cotacaoEnviadaComSucesso() {
		securePage.validarEnvioCotacao("Sending e-mail success!");
		Executa.encerrarTeste();
	}

}
