package com.misfit.checkCatetory;

import java.awt.List.*;
import java.io.PrintStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import junit.framework.Assert;

public class TestAssert {

	FirefoxDriver driver = new FirefoxDriver();
	
	@Test
	public void testAssert() throws Exception
	{
		driver.get("http://misfit.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[3]/div/header/div[6]/div/div[2]/a")).click();
		/*String a = driver.findElement(By.xpath(".//*[@id='section-comparison']/h2")).getText();
		Assert.assertEquals(a,"Product Comparison");*/
		java.util.List<WebElement> allImages = driver.findElements(By.tagName("img"));
		for (WebElement image : allImages) {
			boolean loaded = (Boolean) driver.executeScript(
					"return arguments[0].complete && typeof arguments[0].naturalWidth != "
					+ "\"undefined\" && arguments[0].naturalWidth > 0", image); 
		  if (!loaded) {
		    // Your error handling here.
			  System.out.println("One of these images is broken");
		  }
		}
		
		
		
		
	}
	
	
}
