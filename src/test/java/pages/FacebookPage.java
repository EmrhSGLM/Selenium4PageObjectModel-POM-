package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
    public WebElement createAccount;

    public void bekle(int saniye) throws InterruptedException {
        Thread.sleep(saniye*1000);
    }

    @FindBy(name="email")
    public WebElement emailBox;

    @FindBy(id="pass")
    public WebElement passwordBox;

    @FindBy(name="login")
    public WebElement loginBox;

    @FindBy (xpath = "//div[@class='_9ay7']")
    public WebElement girilemediYazisiElementi;
}
