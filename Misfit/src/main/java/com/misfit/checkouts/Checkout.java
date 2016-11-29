package com.misfit.checkouts;

import com.misfit.Init.*;

import org.testng.annotations.Test;
import com.misfit.WebConstants.*;

public class Checkout extends Init {
	// Create new Object constants
	Constants cons = new Constants();

	@Test(description = "Checkout with US Customer")
	public void CheckoutUS() throws Exception {

		try {

			Thread.sleep(3000);
			// Select US country
			clickByXpath(cons.XPATH_COUNTRY_US);
			Thread.sleep(5000);
			clickByXpath(cons.XPATH_CATEGORY_FITNESSTRACKERS);
			clickByXpath(cons.XPATH_CATEGORY_FITNESSTRACKERS_RAY);
			clickByXpath(cons.XPATH_PRODUCTDETAILS_RAY);

			// Click add to Cart button
			clickByXpath(cons.XPATH_ADDTOCART);
			HoverByXpath(cons.XPATH_CARTSLIDER);
			clickByXpath(cons.XPATH_VIEWCART);

			Thread.sleep(6000);
			// Click button checkout at Cart
			clickByXpath(cons.XPATH_CART_CHECKOUT);
			clickByXpath(cons.XPATH_CHECKOUT_GUEST);

			// Fill shipping infor
			Thread.sleep(3000);
			fillByID(cons.ID_Ship_Firstname, cons.firstName);
			fillByID(cons.ID_Ship_Lastname, cons.lastName);
			fillByID(cons.ID_Ship_company, cons.company);
			fillByID(cons.ID_Ship_street1, cons.add1);
			fillByID(cons.ID_Ship_street2, cons.add2);
			fillByID(cons.ID_Ship_City, cons.city);
			selectDropDownBoxById(cons.ID_Ship_State, cons.US_state);
			fillByID(cons.ID_Ship_postcode, cons.zipcode);
			fillByID(cons.ID_Ship_telephone, cons.phoneNumber);

			// Click continue to Billing
			Thread.sleep(3000);
			clickByXpath(cons.XPATH_CONTINUE_SHIP);

			// Fill CC info
			Thread.sleep(3000);
			fillByID(cons.ID_CC_Name, cons.firstName);
			fillByID(cons.ID_CC_Number, cons.CC_Number);
			selectDropDownBoxById(cons.ID_CC_Month, cons.CC_Month);
			selectDropDownBoxById(cons.ID_CC_Year, cons.CC_Year);
			fillByID(cons.ID_CC_CVV, cons.CVV);

			// Fill billing
			Thread.sleep(3000);
			fillByID(cons.ID_Bill_Firstname, cons.firstName);
			fillByID(cons.ID_Bill_Lastname, cons.lastName);
			fillByID(cons.ID_Bill_company, cons.company);
			fillByID(cons.ID_Bill_street1, cons.add1);
			fillByID(cons.ID_Bill_street2, cons.add2);
			fillByID(cons.ID_Bill_City, cons.city);
			selectDropDownBoxById(cons.ID_Bill_State, cons.US_state);
			fillByID(cons.ID_Bill_postcode, cons.zipcode);
			fillByID(cons.ID_Bill_telephone, cons.phoneNumber);

			// Fill email
			fillByID(cons.ID_Email, cons.email);

			// Click continue
			Thread.sleep(3000);
			clickByXpath(cons.XPATH_CONTINUE_BILL);

			// Submit order
			Thread.sleep(3000);
			clickByXpath(cons.XPATH_SUBMIT_ORDER);

			// Get order number
			System.out.print(getTextByID("order_number"));

		} catch (Exception ex) {
			ex.printStackTrace();
			getscreenshot("/Users/LOCTRAN/Desktop/Checkout.png");
		}
	}

}
