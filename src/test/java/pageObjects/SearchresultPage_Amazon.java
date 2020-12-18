package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchresultPage_Amazon {
	
WebDriver driver;
	
	public SearchresultPage_Amazon(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//span[@id='productTitle']")
	WebElement itemName;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addToCartBtn;

	public String getItemName()
	{
		return itemName.getText();
	}
	public void clickonAddToCart()
	{
		addToCartBtn.click();
	}
	
	

}
