package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampPage {

    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void girisYap(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        firstLogInElement.click();
        userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordBoxElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        secondLogInElement.click();
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
    public WebElement basariliGirisYapildi;

    @FindBy (xpath = "//div[@class='validation-summary-errors']")
    public WebElement girisYapilamadiYaziTesti;

    @FindBy (xpath = "//span[.='Hotel Management']")
    public WebElement hotelManagementLink;

    @FindBy (xpath ="//a[@href='/admin/HotelAdmin']")
    public WebElement hotelListLinki;

    @FindBy (xpath="//span[.='Add Hotel ']")
    public WebElement addHotelLinki;

    @FindBy (xpath = "//input[@id='Code']")
    public WebElement addHotelCodeBox;

    @FindBy ( xpath="//select[@id='IDGroup']")
    public WebElement addHotelTypeDropdownBox;

    @FindBy (xpath ="//button[@id='btnSubmit']")
    public WebElement saveButton;

    @FindBy (xpath = "//div[@class='bootbox-body']")
    public WebElement saveUyariBoxYazisi;

    @FindBy (xpath = "//button[@data-bb-handler='ok']")
    public WebElement saveUyariBoxOk;

    @FindBy (xpath = "//a[@href='/admin/HotelRoomAdmin']")
    public WebElement hotelRoomsLink;

    @FindBy (xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
    public WebElement listOfHotelRoomsText;

    public void bekle(int saniye) {
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
