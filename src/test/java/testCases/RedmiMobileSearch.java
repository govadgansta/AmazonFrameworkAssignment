package testCases;

import java.text.ParseException;

import org.testng.annotations.Test;

import pageObjects.HomePage_Amazon;
import pageObjects.Loginpage_Amazon;
import pageObjects.SearchresultPage_Amazon;

public class RedmiMobileSearch extends BaseClass {
	

	@Test
	public void RedmiMobileSearchTestCase() throws ParseException
	{
		HomePage_Amazon  amazon_home=new HomePage_Amazon(driver);
		SearchresultPage_Amazon amazon_search=new SearchresultPage_Amazon(driver);
		Loginpage_Amazon amazon_login=new Loginpage_Amazon(driver);
	
		driver.get(amazonURL);
		logger.info("URL Entered");
		amazon_home.hoverToSignInSection();
		waitForUI();
		amazon_home.clickSignInBtn();
		amazon_login.enterEmail(username);
		amazon_login.clickContinueBtn();
		amazon_login.enterPassword(password);
		amazon_login.clickLoginButton();
		waitForUI();
		amazon_home.enterSearchBox(itemName);
		amazon_home.clickSearchButton();
		amazon_home.clickOnItem();
		waitForUI();
		String itemName=amazon_search.getItemName();
		if(itemName.equalsIgnoreCase("Redmi Y2 (Rose Gold, 3GB RAM, 32GB Storage)"))
		{
			amazon_search.clickonAddToCart();
		}
		

	}


	

}
