package com.misfit.WebConstants;

public class Constants {

	//Google Authentication
	public static String ggID = "loctran@fossil.com";
	public static String FSID = "tduc1";
	public static String FSPW = "Fos!2016";
	
	//Paypal staging
	public static String ppID	 = "minhbui-buyer@misfit.com";
	public static String ppPW = "P@ssw0rd";
	public static String ppElementEmail = "email";
	public static String ppElementPw = "password";
	public static String ppElementButtonlogin ="btnLogin";
	public static String ppConfirmButton_ID = "confirmButtonTop";
	
	// Popup Subscribe
	public static String XPATH_POPUP_NOTHANK = ".//*[@id='new-customer-modal']/div/div[1]/div[2]/input";
	public static String XPATH_POPUP_SUBMIT = ".//*[@id='newcustomer-subscribe']/button";
	public static String XPATH_POPUP_EMAIL = ".//*[@id='email']";

	// Country
	public static String XPATH_COUNTRY = ".//*[@id='shipping-country']/img";
	public static String XPATH_COUNTRY_US = ".//*[@id='countries-dropdown']/div/div[1]/div/div[1]/div/div[2]/span[2]";
	public static String XPATH_COUNTRY_GERMANY = ".//*[@id='countries-dropdown']/div/div[1]/div/div[2]/div/div[3]/span[2]";
	public static String XPATH_COUNTRY_CHINA = ".//*[@id='countries-dropdown']/div/div[1]/div/div[3]/div/div[3]/span[2]";
	public static String XPATH_COUNTRY_UK = ".//*[@id='countries-dropdown']/div/div[1]/div/div[2]/div/div[2]/span[2]";
	
	//Categories
	public static String XPATH_CATEGORY_FITNESSTRACKERS = "html/body/div[3]/div/header/div[6]/div/div[2]/a[1]";
	public static String XPATH_CATEGORY_FITNESSTRACKERS_RAY =".//*[@id='product-196']/a/div[1]/div/img";
	public static String XPATH_CATEGORY_FITNESSTRACKERS_SHINE2 = "html/body/div[3]/div/header/div[6]/div/div[2]/ul/li[2]/a";
	public static String XPATH_CATEGORY_FITNESSTRACKERS_SHINE ="html/body/div[3]/div/header/div[6]/div/div[2]/ul/li[3]/a";
	public static String XPATH_CATEGORY_FITNESSTRACKERS_SPEEDO ="html/body/div[3]/div/header/div[6]/div/div[2]/ul/li[4]/a";
	public static String XPATH_CATEGORY_FITNESSTRACKERS_SWAROVSKI ="html/body/div[3]/div/header/div[6]/div/div[2]/ul/li[5]/a";
	public static String XPATH_CATEGORY_FITNESSTRACKERS_FLASH ="html/body/div[3]/div/header/div[6]/div/div[2]/ul/li[6]/a";
	public static String XPATH_CATEGORY_FITNESSTRACKERS_LINK ="html/body/div[3]/div/header/div[6]/div/div[2]/ul/li[7]/a";
	public static String XPATH_CATEGORY_HOLIDAY ="html/body/div[3]/div/header/div[6]/div/div[5]/a";
	
	//Category compare texts
	//public static String XPATH_
	
	
	//Product details
	public static String XPATH_PRODUCTDETAILS_RAY = ".//*[@id='color-button-stainless-steel-gold']";
	
	
	
	//ADD TO CART BUTTON
	public static String XPATH_ADDTOCART = ".//*[@id='add-to-cart']";
	
	//CART SLIDER 
	public static String XPATH_CARTSLIDER =  "html/body/div[3]/div/header/div[3]/div/div/div[1]/a/span[2]/img";
	public static String XPATH_VIEWCART =  ".//*[@id='ajax-cart-wrapper']/div/div[3]/div[2]/a";
	public static String XPATH_VIEWCART_BORDERFREE  =  ".//*[@id='ajax-cart-wrapper']/div/div[3]/div/a";
	
	
	//CART CHECKOUT
	public static String XPATH_CART_CHECKOUT = ".//*[@id='checkout-button-cart']";
	public static String XPATH_CART_PAYPAL = ".//*[@id='ec_shortcut_52f07c275e71b8fe856452d5106e8c02']/img";
	public static String XPATH_CART_PAYPAL_STAGING = ".//*[@id='ec_shortcut_a48ba74ddf52bc4d8b729b2d2f15d5d2']/img";
	
	
	//Checkout BorderFree
	public static String ID_BORDERFREE_MAIN_FRAME = "envoyId";
	public static String ID_BORDERFREE_CC_FRAME =  "cc-frame";
	
	//CHECKOUT ONE PAGE
	public static String XPATH_CHECKOUT_GUEST =".//*[@id='onepage-guest-register-button']";
	
	
	//Checkout information
	//***SHIPPING BORDERFREE
	public static String ID_BORDERFREE_Ship_Firstname = "shipping-first-name";
	public static String ID_BORDERFREE_Ship_Lastname = "shipping-last-name";
	public static String ID_BORDERFREE_Ship_Line1 = "shipping-address-line1";
	public static String ID_BORDERFREE_Ship_Line2 = "shipping-address-line2";
	public static String ID_BORDERFREE_Ship_Line3 = "shipping-address-line3";
	public static String ID_BORDERFREE_Ship_City = "shipping-city";
	public static String ID_BORDERFREE_Ship_State = "shipping-region";
	public static String ID_BORDERFREE_Ship_postcode = "shipping-postal-code";
	public static String ID_BORDERFREE_Ship_telephone = "shipping-tel";
	public static String ID_BORDERFREE_Ship_email = "shipping-email";
	
	//Shipping US
	public static String ID_Ship_Firstname = "shipping:firstname";
	public static String ID_Ship_Lastname = "shipping:lastname";
	public static String ID_Ship_company = "shipping:company";
	public static String ID_Ship_street1 = "shipping:street1";
	public static String ID_Ship_street2 = "shipping:street2";
	public static String ID_Ship_City = "shipping:city";
	public static String ID_Ship_State = "shipping:region_id";
	public static String ID_Ship_postcode = "shipping:postcode";
	public static String ID_Ship_telephone = "shipping_telephone";
	
	
	//Continue shipping 
	public static String XPATH_CONTINUE_SHIP = ".//*[@id='shipping-buttons-container']/button";
	

	//Credit card 
	public static String ID_CC_Name = "braintree_cc_owner";
	public static String ID_CC_Number = "braintree_cc_number";
	public static String ID_CC_Month = "braintree_expiration";
	public static String ID_CC_Year = "braintree_expiration_yr";
	public static String ID_CC_CVV = "braintree_cc_cid";
	
	//Credit card BORDERFREE
	public static String ID_BORDERFREE_CC_Number = "cc-num";
	public static String ID_BORDERFREE_CC_MONTH = "cc-exp-month";
	public static String ID_BORDERFREE_CC_YEAR = "cc-exp-year";
	public static String ID_BORDERFREE_CC_CVV = "cc-sec-num";
	
	
	//***BILLING
	public static String ID_Bill_Firstname = "billing:firstname";
	public static String ID_Bill_Lastname = "billing:lastname";
	public static String ID_Bill_company = "billing:company";
	public static String ID_Bill_street1 = "billing:street1";
	public static String ID_Bill_street2 = "billing:street2";
	public static String ID_Bill_City = "billing:city";
	public static String ID_Bill_State = "billing:region_id";
	public static String ID_Bill_postcode = "billing:postcode";
	public static String ID_Bill_telephone = "billing_telephone";
	public static String ID_Email = "billing:email";
	
	//Continue Billing
	public static String XPATH_CONTINUE_BILL = ".//*[@id='billing-buttons-container']/button";
	
	//Submit order
	public static String XPATH_SUBMIT_ORDER = ".//*[@id='review-buttons-container']/button";
	
	
   //**PERSONAL INFORMATION
	public String firstName = "TEST ORDER";
    public String lastName = "DO NOT SHIP";

    public String company = "MISFIT";
    public String add1 = "839 Mitten Road";

    public String add2 = "Suit 100";

    public String city = "SAN JOSE";
    public String US_state = "California";
    public String zipcode = "94010";

    public String phoneNumber = "1234567890";
    
    
    //CANADA INFORMATION 
    public String CANADA_address="577 Sunset Dr";
    public String CANADA_City = "Alexandra";
    public String CANADA_state = "Prince Edward Island";
    public String CANADA_Zip = "C1B 0P2";
    
    //CHINA INFORMATION
    public String CHINA_address="No. 2163, 1062, Jian She Bei Lu Yu Feng Jie, Lubei District";
    public String CHINA_CITY="Tangshan";
    public String CHINA_STATE="Hebei";
    public String CHINA_ZIP="063000";
    public String CHINA_TEL= "8618734271307";
    
    //US Credit card information 
    public String CC_Name = "TEST ORDER";
    public String CC_Number = "4111111111111111";
    public String CVV = "123";
    public String CC_Month = "12 - December";
    public String CC_Year = "2026";
    public String email = "loctran@fossil.com";
    
    //CARD BORDERFREE CARD
    public String CC_BORDERFREE_Name ="TEST ORDER";
    public String CC_BORDERFREE_Number = "4111111111111111";
    public String CC_BORDERFREE_Month = "12";
    public String CC_BORDERFREE_Year = "2026";
    public String CC_BORDERFREE_CVV = "123";
    	
    
    //BORDERFREE email
    public String email_BORDERFREE =  "loctran@fossil.com";
	
	
	
	
	// Footer products
	public static String XPATH_RAY = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[1]/div/div/ul/li[1]/a";
	public static String XPATH_SHINE2 = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[1]/div/div/ul/li[2]/a";
	public static String XPATH_SPEEDO_SHINE2 = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[1]/div/div/ul/li[3]/a";
	public static String XPATH_SHINE = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[1]/div/div/ul/li[4]/a";
	public static String XPATH_SPEEDO_SHINE = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[1]/div/div/ul/li[5]/a";
	public static String XPATH_SWAROVSKI = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[1]/div/div/ul/li[6]/a";
	public static String XPATH_FLASH = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[1]/div/div/ul/li[7]/a";
	public static String XPATH_LINK = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[1]/div/div/ul/li[8]/a";
	public static String XPATH_GEAR = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[1]/div/div/ul/li[9]/a";
	public static String XPATH_WHERETOBUY = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[1]/div/div/ul/li[10]/a";

	// Footer Misfit app
	public static String XPATH_MISFIT_APP = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[2]/div[1]/div/ul/li[1]/a";
	public static String XPATH_HOME_APP = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[2]/div[1]/div/ul/li[2]/a";
	public static String XPATH_LINK_APP = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[2]/div[1]/div/ul/li[3]/a";
	public static String XPATH_CYCLING_APP = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[2]/div[1]/div/ul/li[4]/a";

	// Footer Work With Misfit
	public static String XPATH_HEALTH = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[2]/div[2]/div/ul/li[1]/a";
	public static String XPATH_AFFILIATE = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[2]/div[2]/div/ul/li[2]/a";
	public static String XPATH_DEVELOPER = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[2]/div[2]/div/ul/li[3]/a";

	// Footer About
	public static String XPATH_ABOUT_MISFIT = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[3]/div[1]/div/ul/li[1]/a";
	public static String XPATH_ABOUT_JOBS = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[3]/div[1]/div/ul/li[2]/a";

	// Footer Support
	public static String XPATH_SUPPORT_PAGE = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[3]/div[2]/div/ul/li[1]/a";
	public static String XPATH_SUPPORT_GETTINGSTATED = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[3]/div[2]/div/ul/li[2]/a";
	public static String XPATH_SUPPORT_CONTACT = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[3]/div[2]/div/ul/li[3]/a";

	// Footer Media
	public static String XPATH_MEDIA_ANNOUNCEMENTS = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[3]/div[3]/div/ul/li[1]/a";
	public static String XPATH_MEDIA_BLOGS = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[3]/div[3]/div/ul/li[2]/a";
	public static String XPATH_MEDIA_MARKETING = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[3]/div[3]/div/ul/li[3]/a";

	// Footer Legal
	public static String XPATH_LEGAL_TERM = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[4]/div[1]/div/ul/li[1]/a";
	public static String XPATH_LEGAL_PRIVACY = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[4]/div[1]/div/ul/li[2]/a";
	public static String XPATH_LEGAL_WARRANTY = ".//*[@id='footer']/div/nav/section/div[2]/div[1]/div/div[4]/div[1]/div/ul/li[3]/a";

	// Footer Social
	public static String XPATH_SOCIAL_FACEBOOK = ".//*[@id='footer']/div/nav/section/div[2]/div[2]/div/ul/li[2]/a/i";
	public static String XPATH_SOCIAL_TWITTER = ".//*[@id='footer']/div/nav/section/div[2]/div[2]/div/ul/li[3]/a/i";
	public static String XPATH_SOCIAL_INSTAGRAM = ".//*[@id='footer']/div/nav/section/div[2]/div[2]/div/ul/li[4]/a/i";
	public static String XPATH_SOCIAL_YOUTUBE = ".//*[@id='footer']/div/nav/section/div[2]/div[2]/div/ul/li[5]/a/i";
	public static String XPATH_SOCIAL_GOOGLE = ".//*[@id='footer']/div/nav/section/div[2]/div[2]/div/ul/li[6]/a/i";
	public static String XPATH_SOCIAL_PINTEREST = ".//*[@id='footer']/div/nav/section/div[2]/div[2]/div/ul/li[7]/a/i";

	// Body banners
	public static String XPATH_BANNER_RAY = "html/body/div[3]/div/div[2]/div[1]/div/div[3]/div[1]/div/div[1]/a/img";
	public static String XPATH_BANNER_SHINE2 = "html/body/div[3]/div/div[2]/div[1]/div/div[3]/div[1]/div/div[2]/a/img";
	public static String XPATH_BANNER_SWAROVSKI = "html/body/div[3]/div/div[2]/div[1]/div/div[3]/div[1]/div/div[3]/a/img";
	public static String XPATH_BANNER_SPEEDOSHINE2 = "html/body/div[3]/div/div[2]/div[1]/div/div[3]/div[1]/div/div[4]/a/img";

	// Body Blog
	public static String XPATH_BLOG = ".//*[@id='footer']/div/nav/section/div[1]/div[2]/div[2]/div/div[1]/div[2]/a";
	public static String XPATH_GETSTARTED = ".//*[@id='footer']/div/nav/section/div[1]/div[2]/div[2]/div/div[2]/div[2]/a";

	// Misfit Logo
	public static String XPATH_MISFIT_LOGO = "html/body/div[3]/div/header/div[6]/div/a/img";

	// Menu dropdown
	public static String XPATH_MENUDROPDOWN_FITNESSANDSLEEP = "html/body/div[3]/div/header/div[6]/div/div[2]/ul/li[1]/a";
	public static String XPATH_MENUDROPDOWN_RAY = "html/body/div[3]/div/header/div[6]/div/div[1]/ul/li[1]/a";
	public static String XPATH_MENUDROPDOWN_RAYSS = "html/body/div[3]/div/header/div[6]/div/div[1]/ul/li[2]/a";
	public static String XPATH_MENUDROPDOWN_SHINE2 = "html/body/div[3]/div/header/div[6]/div/div[1]/ul/li[3]/a";
	public static String XPATH_MENUDROPDOWN_SPEEDOSHINE2 = "html/body/div[3]/div/header/div[6]/div/div[1]/ul/li[4]/a";
	public static String XPATH_MENUDROPDOWN_SHINE = "html/body/div[3]/div/header/div[6]/div/div[1]/ul/li[5]/a";
	public static String XPATH_MENUDROPDOWN_SPEEDOSHINE = "html/body/div[3]/div/header/div[6]/div/div[1]/ul/li[6]/a";
	public static String XPATH_MENUDROPDOWN_SWAROVSKI = "html/body/div[3]/div/header/div[6]/div/div[1]/ul/li[7]/a";
	public static String XPATH_MENUDROPDOWN_FLASH = "html/body/div[3]/div/header/div[6]/div/div[1]/ul/li[8]/a";
	public static String XPATH_MENUDROPDOWN_FLASH_CYCLIST = "html/body/div[3]/div/header/div[6]/div/div[1]/ul/li[9]/a";
	public static String XPATH_MENUDROPDOWN_LINK = "html/body/div[3]/div/header/div[6]/div/div[1]/ul/li[10]/a";

	// Menu Accessories
	public static String XPATH_MENUDROPDOWN_ACCESSORIES = "html/body/div[3]/div/header/div[6]/div/div[2]/a";
	public static String XPATH_MENUDROPDOWN_ACCESSORIES_SHINE = "html/body/div[3]/div/header/div[6]/div/div[2]/ul/li[1]/a";
	public static String XPATH_MENUDROPDOWN_ACCESSORIES_SWAROVSKI = "html/body/div[3]/div/header/div[6]/div/div[2]/ul/li2]/a";
	public static String XPATH_MENUDROPDOWN_ACCESSORIESONNECTED_HOME_ = "html/body/div[3]/div/header/div[6]/div/div[4]/ul/li2]/a";
	public static String XPATH_MENUDROPDOWN_ACCESSORIES_BOLT = "html/body/div[3]/div/header/div[6]/div/div[2]/ul/li[5]/a";
	public static String XPATH_MENUDROPDOWN_ACCESSORIES_BEDDIT = "html/body/div[3]/div/header/div[6]/div/div[2]/ul/li[6]/a";

}
