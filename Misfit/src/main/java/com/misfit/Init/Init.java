package com.misfit.Init;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.misfit.WebConstants.*;

import junit.framework.Assert;

public class Init {

	private FirefoxDriver driver;
	Constants con = new Constants();

	public FirefoxDriver driver() {
		return driver;
	}

	// Setup everything to start testing
	@BeforeMethod
	public void setUp() {
		Reporter.log("=============Start Test===========", true);

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//openBrowser("http://misfit.com");
		openBrowser("http://store-web.int.misfit.com");
		WaitForLoading();
		loginGG(); // Staging only
		// Click close popup
		// clickByXpath(con.XPATH_POPUP_NOTHANK);

		// Hover on flag to change country
		HoverByXpath(con.XPATH_COUNTRY);
	}

	// Close browser after testing
	@AfterMethod
	public void EndTest() {
		Reporter.log("=============End Test===========", true);
		driver.quit();
	}

	// Access Staging with GG login authentication public
	void loginGG() {

		// Get element by ID
		WebElement ggID = driver.findElement(By.id("Email"));
		// input ID
		ggID.sendKeys(new Constants().ggID);
		ggID.sendKeys(Keys.RETURN);

		// Get element by PWD
		WaitForLoading();

		WebElement FossilID = driver.findElement(By.id("ContentPlaceHolder1_MFALoginControl1_UserIDView_txtUserid"));
		FossilID.sendKeys(new Constants().FSID);
		WebElement FossilPwd = driver.findElement(By.id("ContentPlaceHolder1_MFALoginControl1_UserIDView_tbxPassword"));
		FossilPwd.sendKeys(new Constants().FSPW);
		driver().findElement(By.id("ContentPlaceHolder1_MFALoginControl1_UserIDView_btnSubmit")).click();
	}

	
	//Assert constructors
	public void checkPageLoad(String element, String textNeedToCompare )
	{
		String strng = driver.findElement(By.xpath(element)).getText();
		System.out.println(strng);
		Assert.assertEquals(textNeedToCompare, strng );
	}
	
	
	
	
	// ==================================CONSTRUCTORS======================================
	// SWITCH TO SPECIFIC FRAME
	// By ID
	public void switchFramebyID(String element) {
		driver().switchTo().frame(driver().findElement(By.id(element)));
	}

	// By Classname
	public void switchFramebyClassName(String element) {
		driver().switchTo().frame(driver().findElement(By.className(element)));
	}

	// By XPATH
	public void switchFramebyXpath(String element) {
		driver().switchTo().frame(driver().findElement(By.xpath(element)));
	}

	// Switch to default content
	public void switchToDefaultFrame() {
		driver().switchTo().defaultContent();
	}

	// OPEN Browser
	public void openBrowser(String element) {
		driver().navigate().to(element);
	}

	// Wait for specific time
	public void WaitForLoading() {
		driver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	// --------------HOVER-------------------------
	// Hover by ClassName
	public void HoverByClassName(String element) {
		Actions action = new Actions(driver());
		action.moveToElement(driver().findElement(By.className(element))).perform();
	}

	// Hover by ID
	public void HoverByID(String element) {
		Actions action = new Actions(driver());
		action.moveToElement(driver().findElement(By.id(element))).perform();
	}

	// Hover by Xpath
	public void HoverByXpath(String xpath) {
		Actions action = new Actions(driver());
		action.moveToElement(driver().findElement(By.xpath(xpath))).perform();
	}

	// --------------HOVER-------------------------

	// --------------CLICK-------------------------
	// Find ID element and click on it
	public void clickByID(String ID) {
		driver().findElement(By.id(ID)).click();
	}

	// Find className element and click on it
	public void clickByclassName(String className) {
		driver().findElement(By.className(className)).click();
	}

	// Find by Xpath
	public void clickByXpath(String xpath) {
		driver().findElement(By.xpath(xpath)).click();
	}

	// --------------FILL-------------------------
	// Fill By Xpath
	public void fillByXpath(String xpath, String elementToSendkey) {
		driver().findElement(By.xpath(xpath)).sendKeys(elementToSendkey);
	}

	// Fill By tag ID
	public void fillByID(String element, String elementToSendKey) {
		driver().findElement(By.id(element)).sendKeys(elementToSendKey);
	}

	// Fill By tag class Name
	public void fillByClassName(FirefoxDriver getDriver, String element, String elementToSendKey) {
		driver().findElement(By.className(element)).sendKeys(elementToSendKey);
	}
	// --------------FILL-------------------------

	// --------------GETTEXT-------------------------
	// Get text by ID
	public String getTextByID(String id) {
		return driver().findElement(By.id(id)).getText();
	}

	// Get text by Classname
	public String getTextByClassName(String id) {
		return driver().findElement(By.className(id)).getText();
	}

	// Get text by Xpath
	public String getTextByXpath(String xpath) {
		return driver().findElement(By.xpath((xpath))).getText();
	}

	// --------------LOGIN-------------------------
	// Login by ID
	public void LoginById(String userName, String userNameToSendKey, String password, String passwordToSendKey,
			String button) {
		driver().findElement(By.id(userName)).sendKeys(userNameToSendKey);
		driver().findElement(By.id(password)).sendKeys(passwordToSendKey);
		driver().findElement(By.id(button)).click();
	}

	// Login by Class Name
	public void LoginByClassName(String userName, String userNameToSendKey, String password, String passwordToSendKey,
			String button) {
		driver().findElement(By.className(userName)).sendKeys(userNameToSendKey);
		driver().findElement(By.className(password)).sendKeys(passwordToSendKey);
		driver().findElement(By.className(button)).click();
	}

	// Login by Xpath
	public void LoginByXpath(String userName, String userNameToSendKey, String password, String passwordToSendKey,
			String button) {
		driver().findElement(By.xpath(userName)).sendKeys(userNameToSendKey);
		driver().findElement(By.xpath(password)).sendKeys(passwordToSendKey);
		driver().findElement(By.xpath(button)).click();
	}
	// --------------LOGIN-------------------------

	// --------------SELECT DROPBOX-------------------------
	// Select dropdown box by ID
	public void selectDropDownBoxById(String element, String selectNeedTexts) {
		Select select = new Select(driver().findElement(By.id(element)));
		select.selectByVisibleText(selectNeedTexts);
	}

	// Select dropdown box by classname
	public void selectDropDownBoxByClassName(String element, String selectNeedTexts) {
		Select select = new Select(driver().findElement(By.className(element)));
		select.selectByVisibleText(selectNeedTexts);
	}

	// Select dropdown box by Xpath
	public void selectDropDownBoxByXpath(String element, String selectNeedTexts) {
		Select select = new Select(driver().findElement(By.xpath(element)));
		select.selectByVisibleText(selectNeedTexts);
	}
	// --------------SELECT DROPBOX-------------------------

	// --------------CAPTURE SCREENSHOT-------------------------
	// Get screenshot if error happens
	public void getscreenshot(String Screenshot) throws Exception {
		File scrFile = ((TakesScreenshot) driver()).getScreenshotAs(OutputType.FILE);
		// The below method will save the screenshot in indicated drive with
		// name "screenshot.png"
		FileUtils.copyFile(scrFile, new File(Screenshot));
	}
	// --------------CAPTURE SCREENSHOT-------------------------

	// Check Element isDisplay
	public boolean checkDisplayed(String element) {
		if (driver().findElement(By.xpath(element)).isDisplayed())
			return true;

		else
			return false;
	}

}
