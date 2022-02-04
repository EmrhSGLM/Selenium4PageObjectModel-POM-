package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveLoginTesting {

    //1) com.techproed altinda bir package olustur : smoketest
    //2) Bir Class olustur : PositiveTest
    //3) Bir test method olustur positiveLoginTest()
    //         https://www.hotelmycamp.com adresine git
    //        login butonuna bas
    //test data username: manager ,
    //test data password : Manager1!
    //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

    @Test
    public void positiveLoginTest(){
        //         https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        //        login butonuna bas
        HotelMyCampPage hotelMyCamp = new HotelMyCampPage();
        hotelMyCamp.firstLogInElement.click();
        //test data username: manager ,
        hotelMyCamp.userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        //test data password : Manager1!
        hotelMyCamp.passwordBoxElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCamp.secondLogInElement.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCamp.basariliGirisYapildi.isDisplayed());
        Driver.closeDriver();

    }

}
