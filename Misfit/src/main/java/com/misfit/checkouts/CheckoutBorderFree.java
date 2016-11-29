package com.misfit.checkouts;

import com.misfit.Init.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.misfit.WebConstants.*;

public class CheckoutBorderFree extends Init {
	// Create new Object constants
	Constants cons = new Constants();

	@Test
	public void CheckoutBorderFree() throws Exception {
		try {
			Thread.sleep(3000);
			// Select CHINA country
			clickByXpath(cons.XPATH_COUNTRY_CHINA);
			Thread.sleep(10000);
			clickByXpath(cons.XPATH_CATEGORY_FITNESSTRACKERS);
			clickByXpath(cons.XPATH_CATEGORY_FITNESSTRACKERS_RAY);
			clickByXpath(cons.XPATH_PRODUCTDETAILS_RAY);

			// Click add to Cart button
			clickByXpath(cons.XPATH_ADDTOCART);
			HoverByXpath(cons.XPATH_CARTSLIDER);
			clickByXpath(cons.XPATH_VIEWCART_BORDERFREE);

			Thread.sleep(3000);
			// Click button checkout at Cart
			clickByXpath(cons.XPATH_CART_CHECKOUT);

			Thread.sleep(6000);

			// Input information
			Thread.sleep(5000);
			// Switch to Info frame
			switchFramebyID(cons.ID_BORDERFREE_MAIN_FRAME);
			// Fill information
			fillByID(cons.ID_BORDERFREE_Ship_Firstname, cons.firstName);
			fillByID(cons.ID_BORDERFREE_Ship_Lastname, cons.lastName);
			fillByID(cons.ID_BORDERFREE_Ship_Line1, cons.CHINA_address);
			fillByID(cons.ID_BORDERFREE_Ship_City, cons.CHINA_CITY);
			fillByID(cons.ID_BORDERFREE_Ship_postcode, cons.CHINA_ZIP);
			fillByID(cons.ID_BORDERFREE_Ship_telephone, cons.CHINA_TEL);
			fillByID(cons.ID_BORDERFREE_Ship_email, cons.email_BORDERFREE);

			// Switch to CC frame
			Thread.sleep(3000);
			switchFramebyID(cons.ID_BORDERFREE_CC_FRAME);
			fillByID(cons.ID_BORDERFREE_CC_Number, cons.CC_BORDERFREE_Number);
			selectDropDownBoxById(cons.ID_BORDERFREE_CC_MONTH, cons.CC_BORDERFREE_Month);
			selectDropDownBoxById(cons.ID_BORDERFREE_CC_YEAR, cons.CC_BORDERFREE_Year);
			fillByID(cons.ID_BORDERFREE_CC_CVV, cons.CC_BORDERFREE_CVV);

			// Submit order
			switchToDefaultFrame();
			Thread.sleep(3000);
			switchFramebyID("envoyId");
			Thread.sleep(5000);
			clickByID("submit-order-right-btn");

			// Get temporarily order number
			System.out.print(getTextByID("order-num-temp"));

		} catch (RuntimeException ex) {
			ex.printStackTrace();
			getscreenshot("/Users/LOCTRAN/Desktop/Checkout.png");
		}
	}

}
