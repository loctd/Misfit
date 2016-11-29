package com.misfit.checkCatetory;

import com.misfit.WebConstants.*;

import org.testng.annotations.Test;

import com.misfit.Init.Init;

public class CheckCategories extends Init {

	Constants cons = new Constants();

	@Test
	public void checkCatePage() throws Exception {

		try {
			clickByXpath(cons.XPATH_COUNTRY_US);
			Thread.sleep(5000);
			clickByXpath(cons.XPATH_CATEGORY_FITNESSTRACKERS);
			checkPageLoad(".//*[@id='section-comparison']/h2", "Product Comparion");
		} catch (Exception ex) {
			ex.printStackTrace();
			getscreenshot("/Users/LOCTRAN/Desktop/ErrorPage.png");

		}
	}

}
