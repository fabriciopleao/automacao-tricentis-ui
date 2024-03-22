package tricentis.ui.methods;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import tricentis.ui.drivers.DriversFactory;

public class Methods extends DriversFactory {

	// Metodo para escrever
	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Metodo para clicar
	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Metodo para realizar submit
	public void submit(By elemento) {
		try {
			driver.findElement(elemento).submit();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	// Metodo para validar texto
	public void validarTexto(By element, String textoEsperado) {
		try {
			assertTrue(driver.findElement(element).getText().contains(textoEsperado));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Metodo para pressionar a tecla Enter
	public void pressionarEnter(By elemento) {
		try {
			driver.findElement(elemento).sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Metodo para preencher campo com dado de massa randômica
	public void preencherCampoMassaRando(By elemento, String valor) {
		try {
			driver.findElement(elemento).clear();
			driver.findElement(elemento).sendKeys(valor);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Metodo para inserir imagem ou arquivo
	/*public void carregarImagens(String[] caminhosDasImagens, By campoDeArquivo) {
		try {
			for (String caminho : caminhosDasImagens) {
				WebElement inputElement = driver.findElement(campoDeArquivo);
				inputElement.sendKeys(caminho);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

}
