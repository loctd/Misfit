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
import org.testng.annotations.BeforeTest;

import com.misfit.WebConstants.*;
import com.webdriver.init.MyConstants;
import com.webdriver.init.MyFFDriver;

public class Init {
	
	private FirefoxDriver driver;
	public FirefoxDriver driver() {
		return driver;
	}

	// Setup everything to start testing

	@BeforeTest
	public void setUp() {
		driver = new MyFFDriver();
		// System.setProperty("webdriver.chrome.driver", "lib/chromedriver");
		// driver = new MyChromeDriver();
		driver.manage().window().maximize();
	}

	/*// Access Staging with GG login authentication
	public void loginGG() {

		// Get element by ID
		WebElement ggID = driver.findElement(By.id("Email"));
		// input ID
		ggID.sendKeys(new MyConstants().ggID);
		ggID.sendKeys(Keys.RETURN);

		// Get element by PWD
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement FossilID = driver.findElement(By.id("ContentPlaceHolder1_MFALoginControl1_UserIDView_txtUserid"));
		FossilID.sendKeys(new MyConstants().FossilID);
		WebElement FossilPwd = driver.findElement(By.id("ContentPlaceHolder1_MFALoginControl1_UserIDView_tbxPassword"));
		FossilPwd.sendKeys(new MyConstants().FossilPwd);
		getDriver().findElement(By.id("ContentPlaceHolder1_MFALoginControl1_UserIDView_btnSubmit")).click();
	}
*/
	
//--------------HOVER-------------------------	
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
	
	//--------------HOVER-------------------------	
		
		
		
	//--------------CLICK-------------------------
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
	
	
	//--------------FILL-------------------------
	// Fill By Xpath
	public void fillByXpath(String xpath, String elementToSendkey) {
		driver().findElement(By.xpath(xpath)).sendKeys(elementToSendkey);
	}

	// Fill By tag ID
	public void fillByID(String element, String elementToSendKey) {
		driver().findElement(By.id(element)).sendKeys(elementToSendKey);
	}

	// Fill By tag class Name
	public void fillByClassName(MyFFDriver getDriver, String element, String elementToSendKey) {
		driver().findElement(By.className(element)).sendKeys(elementToSendKey);
	}
	//--------------FILL-------------------------
	
	
	
	//--------------GETTEXT-------------------------
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
	
	
	
	
	//--------------LOGIN-------------------------
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
	//--------------LOGIN-------------------------
	
	
	//--------------SELECT DROPBOX-------------------------
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
	//--------------SELECT DROPBOX-------------------------	
	
	

	
	//--------------CAPTURE SCREENSHOT-------------------------
	// Get screenshot if error happens
	public void getscreenshot(String Screenshot) throws Exception {
		File scrFile = ((TakesScreenshot) driver()).getScreenshotAs(OutputType.FILE);
		// The below method will save the screenshot in indicated drive with name "screenshot.png"
		FileUtils.copyFile(scrFile, new File(Screenshot));
	}
	//--------------CAPTURE SCREENSHOT-------------------------
	
	
	
	
	// Check Element isDisplay
	public boolean checkDisplayed(String element) {
		if(driver().findElement(By.xpath(element)).isDisplayed())
		return true;
		
		else
		return false;
	}

	// Finish test then close browser
	/*
	 * @AfterTest public void tearDown() { driver.quit(); }
	 */
}
