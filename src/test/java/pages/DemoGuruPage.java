package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoGuruPage {

    public DemoGuruPage(){  PageFactory.initElements(Driver.getDriver(),this);   }

    //@FindBy(xpath = "//li[@data-id='5']")
    @FindBy(xpath = "//a[contains(text(),'BANK')]")
    public WebElement bankButon;

    @FindBy (xpath = "//a[contains(text(),' SALES ')]")
    public WebElement salesButon;

    @FindBy(xpath ="(//a[contains(text(), ' 5000')])[1]")
    public WebElement firstnum5000Butonu;

    @FindBy(xpath ="(//a[contains(text(), ' 5000')])[2]")
    public WebElement secondnum5000Butonu;

    @FindBy (xpath="(//li[@class='placeholder'])[1]")
    public WebElement accountBox;

    @FindBy (xpath="(//li[@class='placeholder'])[2]")
    public WebElement amountBox;

    @FindBy (xpath="(//li[@class='placeholder'])[3]")
    public WebElement account2Box;

    @FindBy (xpath="(//li[@class='placeholder'])[4]")
    public WebElement amount2Box;



}
