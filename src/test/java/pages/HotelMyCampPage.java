package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {

    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement firstLogInElement ;

    @FindBy (xpath = "//input[@id='UserName']")
    public WebElement userNameBoxElement;

    @FindBy (xpath = "//input[@id='Password']")
    public WebElement passwordBoxElement;

    @FindBy(xpath = "(//input[@id='btnSubmit'])[1]")
    public WebElement logInElement;

    @FindBy (xpath ="(//a[@class='dropdown-toggle'])[1]")
    public WebElement enterTrueTest;
}
