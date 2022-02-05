package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HMCWebTablePage {

    public HMCWebTablePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//thead//tr)[1]//th")
    public List<WebElement> headerBirinciSatirDatalar;

    @FindBy (xpath = "//tbody")
    public WebElement tumBodyWebElement;

    @FindBy (xpath = "//tbody//td")
    public List<WebElement> tumBodyDatalariLis;

    @FindBy (xpath = "//tbody//tr")
    public List<WebElement> satirlarListesi;

    public WebElement satirGetir(int satirNo){
        String satirDinamikXpath =  "//tbody//tr["+satirNo+"]";
        WebElement satirElement = Driver.getDriver().findElement(By.xpath(satirDinamikXpath));

        return satirElement;
    }


    public String hucreWebElementGetir(int satir, int hucre) {
        String hucreDinamikXpath = "//tbody//tr["+satir+"]//td["+hucre+"]";
        WebElement hucreElement = Driver.getDriver().findElement((By.xpath(hucreDinamikXpath)));
        String hucreDatasi = hucreElement.getText();
        return hucreDatasi;
    }

    public void sutunYazdir(int sutun) {
        // her bir satirdaki istenen sutun elementini yazdirabilmek icin
        // once satir sayisini bilmeye ihtiyacim var

        int satirSayisi = satirlarListesi.size();
        for(int i=1;i<=satirSayisi;i++){
            System.out.println(hucreWebElementGetir(i, sutun));
        }
    }
}
