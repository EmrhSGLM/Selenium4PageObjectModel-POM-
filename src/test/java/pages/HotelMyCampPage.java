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
    public WebElement secondLogInElement;

    @FindBy (xpath ="(//a[@class='dropdown-toggle'])[1]")
    public WebElement enterTrueTest;

    @FindBy (xpath = "//div[@class='validation-summary-errors']")
    public WebElement girisYapilamadiYaziTesti;

    public void bekle(int saniye) {
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
