package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Amazon {

	WebDriver driver;

	public HomePage_Amazon(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	Actions a=new Actions(driver);

	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement signInSection;

	@FindBy(xpath="//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[@id='nav-flyout-accountList']/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]")
	WebElement signInBtn;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchBox;
	
	@FindBy(xpath="//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")
	WebElement searchbtn;
	@FindBy(xpath="//span[contains(text(),'Redmi Y2 (Rose Gold, 3GB RAM, 32GB Storage)')]")
	WebElement itemName;

	public void hoverToSignInSection()
	{
		a.moveToElement(signInSection).build().perform();
	}

	public void clickSignInBtn()
	{
		signInBtn.click();
	}
	public void enterSearchBox(String itemName)
	{
		System.out.println(itemName);
		searchBox.sendKeys(itemName);
	}
	
	public void clickSearchButton()
	{
		searchbtn.click();
	}

	public void clickOnItem()
	{
		itemName.click();
	}
	

}
