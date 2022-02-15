package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {

    //1) smokeTest  paketi altinda yeni bir Class olustur: NegativeTest
    //3 Farkli test Methodunda 3 senaryoyu test et
    //                - yanlisSifre
    //                - yanlisKulllanici
    //                - yanlisSifreKullanici
    //test data yanlis username: manager1 , yanlis password : manager1
    //2) https://www.hotelmycamp.com adresine git
    //3) Login butonuna bas
    //4) Verilen senaryolar ile giris yapilamadigini test et

    HotelMyCampPage hotelMyCamp;
    @Test
    public void yanlisSifreTesting(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCamp= new HotelMyCampPage();
        hotelMyCamp.firstLogInElement.click();
        hotelMyCamp.userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelMyCamp.passwordBoxElement.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hotelMyCamp.secondLogInElement.click();
        Assert.assertTrue(hotelMyCamp.girisYapilamadiYaziTesti.isDisplayed());
        //Assert.assertFalse(hotelMyCamp.basariliGirisYapildi.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void yanlisKulllaniciTesting(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCamp= new HotelMyCampPage();
        hotelMyCamp.firstLogInElement.click();
        hotelMyCamp.userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hotelMyCamp.passwordBoxElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCamp.secondLogInElement.click();
        Assert.assertTrue(hotelMyCamp.girisYapilamadiYaziTesti.isDisplayed());
        //Assert.assertFalse(hotelMyCamp.basariliGirisYapildi.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void yanlisSifreKullaniciTesting(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCamp= new HotelMyCampPage();
        hotelMyCamp.firstLogInElement.click();
        hotelMyCamp.userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hotelMyCamp.passwordBoxElement.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hotelMyCamp.secondLogInElement.click();
        Assert.assertTrue(hotelMyCamp.girisYapilamadiYaziTesti.isDisplayed());
        //Assert.assertFalse(hotelMyCamp.basariliGirisYapildi.isDisplayed());
        Driver.closeDriver();
    }
}
