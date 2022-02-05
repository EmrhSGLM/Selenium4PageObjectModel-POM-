package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoqaPage {

    public DemoqaPage(){ PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//div[@class='rt-tr']")
    public WebElement baslikSatiriElementi;

    @FindBy (xpath = "//div[@class='rt-th rt-resizable-header -cursor-pointer']")
    public List<WebElement> basliklarWebElementiListesi;

    @FindBy (xpath = "//div[@class='rt-tbody']")
    public WebElement bodyWebElement;

    @FindBy (xpath = "//div[@class='rt-td']")
    public List<WebElement> tumDataWebElementList;

    @FindBy (xpath = "//div[@class='rt-tr-group']")
    public List<WebElement> tumSatirlarWebElementList;


    public void sutunYazdir(int sutun){
        //((//div[@class='rt-tr-group'])[3]//div[@class='rt-td'])[2] => Hoca locate
        int satirSayisi = tumSatirlarWebElementList.size();
        String dinamikXpath;
        WebElement geciciElement;
        // ((//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])["+sutun+"]
        // //div[@class='rt-tbody']//div["+i+"]//div//div[3]
        for(int i=1; i<=satirSayisi;i++){
            System.out.println(i+" : "+Driver.getDriver().
                    findElement(By.xpath("//div[@class='rt-tbody']//div["+i+"]//div//div["+sutun+"]")).getText());
                    //findElement(By.xpath("((//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])["+sutun+"]")).getText());

        }
    }


    public void ismeGoreMaasYazdir(String isim) {
        int satirSayisi = tumSatirlarWebElementList.size();
        String dinamikXpath;
        String satirdakiIsim;
        String salary;

        for(int i=1; i<satirSayisi;i++){
            //dinamikXpath="((//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])["+1+"]"; => Ders
            dinamikXpath="//div[@class='rt-tbody']//div["+i+"]//div//div["+1+"]";
            satirdakiIsim = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
            //dinamikXpath="((//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])["+5+"]"; => Ders
            dinamikXpath="//div[@class='rt-tbody']//div["+i+"]//div//div["+5+"]";
            salary = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();

            if(satirdakiIsim.equals(isim)){
                System.out.println(isim + "in salary = " + salary);
            }


        }


    }

    public void hucreYazdir(int satir, int sutun) {

        WebElement dataElement = Driver.getDriver().
                findElement(By.xpath("//div[@class='rt-tbody']//div["+satir+"]//div//div["+sutun+"]"));
        System.out.println(satir + " satir " + sutun + " sutundaki data : " + dataElement.getText());
    }
}
