package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.Base;

public class lessonDetailsPage {
	
	
	@FindBy(css = "div[class='page-title with-badge flex']")
	public WebElement lessonDetailsTitle ;
	
	@FindBy(xpath = "//*[@id='WorksheetSection']/div/div[2]/div/a")
	public WebElement workSheetSection ;
	
	@FindBy(id = "WorksheetTitle")
	public WebElement workSheetSectionTitle ;
	
	@FindBy(id = "btn_cookie_accept")
	public WebElement acceptCookie ;
	
	public lessonDetailsPage(WebDriver driver) {

		driver = Base.driver;
		PageFactory.initElements(driver, this);
	}
	
	public void validateLessonDetailsTitle() {
		lessonDetailsTitle.isDisplayed();
		
		String expectedDetailsTitle = "Lesson: " + homePage.secondLessonText;
		String actualDetailsTitle = lessonDetailsTitle.getText();
		System.out.println("expected" + expectedDetailsTitle);
		System.out.println("actual" + actualDetailsTitle);
		assertTrue(actualDetailsTitle.contains(expectedDetailsTitle));
	}
	
	public void navigateToWorkSheetScreen() {
		
		workSheetSectionTitle.isDisplayed();
		acceptCookie.click();
		WebDriverWait wait = new WebDriverWait(Base.driver, 10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='WorksheetSection']/div/div[2]/div/a")));
		wait.until(ExpectedConditions.elementToBeClickable(workSheetSection));
		workSheetSection.click();
	}

}
