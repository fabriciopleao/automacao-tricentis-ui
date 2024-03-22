package tricentis.ui.elements;

import org.openqa.selenium.By;

public class Elementos {

	
//Formulário Enter Vehicle Data
	 
	// Inputs, Selects, Buttons
	public By make = By.id("make");
	public By model = By.id("model");
	public By ccm = By.id("cylindercapacity");
	public By kw = By.id("engineperformance");
	public By calendarioBtn = By.xpath("//button[@title='Open Date of Manufacture Calender']");
	public By numberSeats = By.id("numberofseats");
	public By rightHandDriveYes = By.xpath("//*[@id='insurance-form']/div/section[1]/div[7]/p/label[1]");
	public By rightHandDriveNo = By.xpath("//*[@id='insurance-form']/div/section[1]/div[7]/p/label[2]");
	public By numberSeatsMotorcycle = By.id("numberofseatsmotorcycle");
	public By fuelType = By.id("fuel");
	public By payloadKg = By.id("payload");
	public By totalWeightKg = By.id("totalweight");
	public By listPrice = By.id("listprice");
	public By licensePlateNumber = By.id("licenseplatenumber");
	public By annualMileage = By.id("annualmileage");
	public By nextBtn = By.id("nextenterinsurantdata");
	
	// Options
	public By makeBMW = By.xpath("//option[text()='BMW']");
	public By modelScooter = By.xpath("//option[text()='Scooter']");
	public By dataAleatoria = By.xpath("//a[text()='1']");
	public By numberSeats4 = By.xpath("//option[text()='4']");
	public By fuelTypePetrol = By.xpath("//option[text()='Petrol']");
	public By numberSeatsMotorcycle2 = By.xpath("//select[@id='numberofseatsmotorcycle']/option[3]");
	
	
//Formulário Enter Insurant Data
	
	// Inputs, Selects, Buttons
	public By firstName = By.id("firstname");
	public By lastName = By.id("lastname");
	public By calendarioButton = By.id("opendateofbirthcalender");
	public By calendarioInput = By.id("birthdate");
	public By genderMale = By.xpath("//*[@id='insurance-form']/div/section[2]/div[4]/p/label[1]");
	public By genderFemale = By.xpath("//*[@id='insurance-form']/div/section[2]/div[4]/p/label[2]");
	public By streetAddress = By.id("streetaddress");
	public By country = By.id("country");
	public By zipCode = By.id("zipcode");
	public By city = By.id("city");
	public By occupation = By.id("occupation");
	public By hobbiesSpeeding = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]");
	public By hobbiesBungeeJumping = By.xpath("//div[@class='field idealforms-field idealforms-field-checkbox valid']/p/label[2]");
	public By hobbiesCliffDiving = By.xpath("//div[@class='field idealforms-field idealforms-field-checkbox valid']/p/label[3]");
	public By hobbiesSkydiving = By.xpath("//div[@class='field idealforms-field idealforms-field-checkbox valid']/p/label[4]");
	public By hobbiesOther = By.xpath("//div[@class='field idealforms-field idealforms-field-checkbox valid']/p/label[5]");
	public By website = By.id("website");
	public By open = By.id("open");
	public By picture = By.id("picture");
	public By nextBtn1 = By.id("nextenterproductdata");
	
	// Options
	public By occupationPublicOfficial = By.xpath("//option[text()='Public Official']");
	public By countryGeorgia = By.xpath("//option[text()='Georgia']");
	
	
//Formulário Enter Product Data
	
	// Inputs, Selects, Buttons
	public By startDateButton = By.id("openstartdatecalender");
	public By startDateInput = By.id("startdate");
	public By insuranceSum = By.id("insurancesum");
	public By meritRating = By.id("meritrating");
	public By damageInsurance = By.id("damageinsurance");
	public By optionalProductsEuroProtection = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]");
	public By optionalProductsLegalDefenseInsurance = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]");
	public By courtesyCar = By.id("courtesycar");
	
	// Options
	public By insuranceSumOption = By.xpath("//option[text()=' 20.000.000,00']");
	public By meritRatingOption = By.xpath("//option[text()='Bonus 5']");
	public By damageInsuranceOption = By.xpath("//option[text()='Full Coverage']");
	public By courtesyCarOption = By.xpath("//select[@id='courtesycar']/option[3]");
	public By nextBtn2 = By.id("nextselectpriceoption");
	
	
//Select Price Option
	
	// Inputs, Selects, Buttons
	public By silver = By.xpath("//*[@id='priceTable']/tfoot/tr/th[2]/label[1]");
	public By gold = By.xpath("//*[@id='priceTable']/tfoot/tr/th[2]/label[2]");
	public By platinum = By.xpath("//*[@id='priceTable']/tfoot/tr/th[2]/label[3]");
	public By utimate = By.xpath("//*[@id='priceTable']/tfoot/tr/th[2]/label[4]");
	public By nextBtn3 = By.id("nextsendquote");
	
//Formulario Send Quote
	
	// Inputs, Selects, Buttons
	public By email = By.id("email");
	public By phone = By.id("phone");
	public By username = By.id("username");
	public By password = By.id("password");
	public By confirmPassword = By.id("confirmpassword");
	public By comments = By.id("Comments");
	public By sendBtn = By.id("sendemail");
	
	public By mensagemSuccess = By.xpath("//h2[text()='Sending e-mail success!']");
	public By confirmFinal = By.xpath("//button[@class='confirm']");
	
}
