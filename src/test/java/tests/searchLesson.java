package tests;

import org.testng.annotations.Test;

import pages.homePage;
import pages.landingPage;
import pages.lessonDetailsPage;
import pages.workSheetPage;
import testBase.Base;

public class searchLesson extends Base{
	
	@Test(priority = 1)
	public void chooseLanguage () {
		
		landingPageObject = new landingPage(Base.driver);
		landingPageObject.chooseLanguage();	
	}
	
	@Test(priority = 2)
	public void leasonSearch () {
		
		homePageObject = new homePage(Base.driver);
		homePageObject.validateHomeScreenDisplay();;
		homePageObject.validateAndClickSearchIcon();
		homePageObject.writeThenSearchLesson();
	}
	
	@Test(priority = 3)
	public void selectSpecificLesson() {
		homePageObject.validateSearchScreen();
		homePageObject.selectSecondLesson();
	}
	
	@Test(priority = 4)
	public void clickLessonWorkSheet() {
		
		lessonDetailsPageObject = new lessonDetailsPage(Base.driver);
		lessonDetailsPageObject.validateLessonDetailsTitle();
		lessonDetailsPageObject.navigateToWorkSheetScreen();
	}
	
	@Test(priority = 5)
	public void countWorkSheetQuestions() {
		
		workSheetPageObject = new workSheetPage(Base.driver);
		workSheetPageObject.checkTimeSheetPageDisplay();
		workSheetPageObject.countQuestionsNo();;
	}

}
