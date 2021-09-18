package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import testBase.Base;


public class landingPage {
	
	@FindBy(xpath = "//*/main/div[2]/ul/li[1]/a")
	public WebElement englishLanguage;
	

	public landingPage(WebDriver driver) {

		driver = Base.driver;
		PageFactory.initElements(driver, this);
	}
	
	public void chooseLanguage() {
		
		System.out.println("Before click");
		englishLanguage.click();
	}
	
}
