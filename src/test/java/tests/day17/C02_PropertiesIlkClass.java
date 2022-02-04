package tests.day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PropertiesIlkClass {

    @Test
    public void positiveLoginTesti(){
        // Hotel My Camp sitesine pozitif login testini POM'a tam uygun olarak yapiniz
        //https://www. hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        //        login butonuna bas
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.firstLogInElement.click();
        //    test data username: manager ,
        hotelMyCampPage.userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        //    test data password : Manager1!
        hotelMyCampPage.passwordBoxElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.secondLogInElement.click();
        //    Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCampPage.enterTrueTest.isDisplayed());
        Driver.closeDriver();
    }
}
