package tricentis.ui.pages;

import java.util.List;

import tricentis.ui.elements.Elementos;
import tricentis.ui.methods.Methods;

public class SeguroPage {

	Methods metodo = new Methods();
	Elementos el = new Elementos();

	public void preencherFormVehicleData(List<String> numerosAleatorios) {
		metodo.clicar(el.make);
		metodo.clicar(el.makeBMW);
		metodo.clicar(el.model);
		metodo.clicar(el.modelScooter);
		metodo.preencherCampoMassaRando(el.ccm, numerosAleatorios.get(0));
		metodo.preencherCampoMassaRando(el.kw, numerosAleatorios.get(1));
		metodo.clicar(el.calendarioBtn);
		metodo.clicar(el.dataAleatoria);
		metodo.clicar(el.numberSeats);
		metodo.clicar(el.numberSeats4);
		metodo.clicar(el.rightHandDriveYes);
		metodo.clicar(el.rightHandDriveNo);
		metodo.clicar(el.numberSeatsMotorcycle);
		metodo.clicar(el.numberSeatsMotorcycle2);
		metodo.clicar(el.fuelType);
		metodo.clicar(el.fuelTypePetrol);
		metodo.preencherCampoMassaRando(el.payloadKg, numerosAleatorios.get(2));
		metodo.preencherCampoMassaRando(el.totalWeightKg, numerosAleatorios.get(3));
		metodo.preencherCampoMassaRando(el.listPrice, numerosAleatorios.get(4));
		metodo.preencherCampoMassaRando(el.licensePlateNumber, numerosAleatorios.get(5));
		metodo.preencherCampoMassaRando(el.annualMileage, numerosAleatorios.get(6));
		metodo.clicar(el.nextBtn);

	}

	public void preencherFormInsurantData(List<String> nomeAleatorio, List<String> sobrenomeAleatorio,
			List<String> cidadeAleatorio, List<String> cepAleatorio, List<String> dataAleatoria,
			List<String> enderecoAleatorio, List<String> siteAleatorio) {

		metodo.preencherCampoMassaRando(el.firstName, nomeAleatorio.get(0));
		metodo.preencherCampoMassaRando(el.lastName, sobrenomeAleatorio.get(0));
		metodo.clicar(el.calendarioButton);
		metodo.preencherCampoMassaRando(el.calendarioInput, dataAleatoria.get(0));
		metodo.clicar(el.genderFemale);
		metodo.clicar(el.genderMale);
		metodo.preencherCampoMassaRando(el.streetAddress, enderecoAleatorio.get(0));
		metodo.clicar(el.country);
		metodo.clicar(el.countryGeorgia);
		metodo.preencherCampoMassaRando(el.zipCode, cepAleatorio.get(0));
		metodo.preencherCampoMassaRando(el.city, cidadeAleatorio.get(0));
		metodo.clicar(el.occupation);
		metodo.clicar(el.occupationPublicOfficial);
		metodo.clicar(el.hobbiesSpeeding);
		metodo.clicar(el.hobbiesBungeeJumping);
		metodo.clicar(el.hobbiesCliffDiving);
		metodo.clicar(el.hobbiesSkydiving);
		metodo.clicar(el.hobbiesOther);
		metodo.preencherCampoMassaRando(el.website, siteAleatorio.get(0));
		metodo.clicar(el.nextBtn1);

	}

	public void preencherFormProductData(List<String> dataAleatoria) {
		metodo.clicar(el.startDateButton);
		metodo.preencherCampoMassaRando(el.startDateInput, dataAleatoria.get(0));
		metodo.clicar(el.insuranceSum);
		metodo.clicar(el.insuranceSumOption);
		metodo.clicar(el.meritRating);
		metodo.clicar(el.meritRatingOption);
		metodo.clicar(el.damageInsurance);
		metodo.clicar(el.damageInsuranceOption);
		metodo.clicar(el.optionalProductsEuroProtection);
		metodo.clicar(el.optionalProductsLegalDefenseInsurance);
		metodo.clicar(el.courtesyCar);
		metodo.clicar(el.courtesyCarOption);
		metodo.clicar(el.nextBtn2);
	}

	public void selecionarPlano() throws InterruptedException {
		metodo.clicar(el.silver);
		metodo.clicar(el.gold);
		metodo.clicar(el.platinum);
		metodo.clicar(el.utimate);
		Thread.sleep(1000);
		metodo.clicar(el.nextBtn3);
	}

	public void preencherSendQuote(List<String> emailAleatorio, List<String> phoneAleatorio, List<String> nomeAleatorio,
			String senha, String comentario) throws InterruptedException {
		metodo.preencherCampoMassaRando(el.email, emailAleatorio.get(0));
		metodo.preencherCampoMassaRando(el.phone, phoneAleatorio.get(0));
		metodo.preencherCampoMassaRando(el.username, nomeAleatorio.get(0));
		metodo.preencherCampoMassaRando(el.password, senha);
		metodo.preencherCampoMassaRando(el.confirmPassword, senha);
		metodo.escrever(el.comments, comentario);
		metodo.clicar(el.sendBtn);
		Thread.sleep(10000);
	}

	public void validarEnvioCotacao(String mensagem) {
		metodo.validarTexto(el.mensagemSuccess, mensagem);
		metodo.clicar(el.confirmFinal);
	}

}
