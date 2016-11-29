package com.misfit.checkouts;

import org.testng.annotations.Test;

import com.misfit.Init.Init;
import com.misfit.WebConstants.*;

public class CheckoutPaypal extends Init {
	Constants cons = new Constants();

	@Test
	public void CheckoutPP() throws Exception {

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

		// Click Paypal button
		clickByXpath(cons.XPATH_CART_PAYPAL);

		LoginById(cons.ppID, cons.ppElementEmail, cons.ppPW, cons.ppElementPw, cons.ppElementButtonlogin);

		// Click continue
		clickByID(cons.ppConfirmButton_ID);
	}

}
