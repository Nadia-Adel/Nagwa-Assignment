package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Base;

public class homePage {

	public static String secondLessonText ;

	@FindBy(xpath = "//*[text()='Sign In']")
	public WebElement signInButton ;

	@FindBy(className = "search")
	public WebElement searchIcon ;

	@FindBy(id = "txt_search_query")
	public WebElement searchTextField ;

	@FindBy(id = "btn_global_search")
	public WebElement textFieldSearchIcon ;
	
	@FindBy(className = "page-title")
	public WebElement searchPageTitle ;
	
	@FindBy(className = "results")
	public WebElement resultTable ;
	
	@FindBy(xpath = "//*/main/div[3]/ul/li[2]/div/a")
	public WebElement secondLesson ;


	public homePage(WebDriver driver) {

		driver = Base.driver;
		PageFactory.initElements(driver, this);
	}

	public void validateHomeScreenDisplay() {

		assertTrue(signInButton.isDisplayed());

	}

	public void validateAndClickSearchIcon() {

		assertTrue(searchIcon.isDisplayed());
		searchIcon.click();

	}

	public void writeThenSearchLesson() {

		assertTrue(searchTextField.isDisplayed());
		searchTextField.sendKeys("addition");
		textFieldSearchIcon.click();
	}
	
	public void validateSearchScreen() {

		assertTrue(searchPageTitle.isDisplayed());
		String seachtitleText = searchPageTitle.getText();
		assertTrue(seachtitleText.contains("Search results"));
		assertTrue(resultTable.isDisplayed());
	}
	
	public String selectSecondLesson() {
		
		secondLessonText = secondLesson.getText();
		System.out.println(secondLessonText);
		secondLesson.click();
		return secondLessonText;
	}
	
	
}
