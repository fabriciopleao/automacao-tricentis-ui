package tricentis.ui.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import tricentis.ui.drivers.DriversFactory;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src/test/resources/features",
		glue = "tricentis.ui.steps",
		tags = "@regressivos",
		dryRun = false,
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty","html:target/report-cucumber.html"}
		
		)

public class Executa extends DriversFactory{

	public static void inicializarTeste(String ambiente) {
		driver = new ChromeDriver();
		driver.get(ambiente);
		driver.manage().window().maximize();
	}
	
	public static void encerrarTeste() {
		driver.quit();
	}
	
}
