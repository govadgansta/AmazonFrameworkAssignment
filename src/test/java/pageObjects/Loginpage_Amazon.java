package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Loginpage_Amazon {


    WebDriver driver;

    public Loginpage_Amazon(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[@id='ap_email']")
    WebElement unameTxtBox;

    @FindBy(xpath="//input[@id='ap_password']")
    WebElement pswrdTxtBox;

    @FindBy(xpath="//input[@id='continue']")
    WebElement continueBtn;

    @FindBy(xpath="//input[@id='signInSubmit']")
    WebElement loginBtn;

    public void enterEmail(String emailID)
    {
        unameTxtBox.sendKeys(emailID);
    }
    public void clickContinueBtn()
    {
        continueBtn.click();

    }
    public void enterPassword(String password)
    {
        pswrdTxtBox.sendKeys(password);

    }

    public void clickLoginButton()
    {
        loginBtn.click();

    }



}
