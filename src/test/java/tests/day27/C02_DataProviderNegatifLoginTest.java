package tests.day27;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProviderNegatifLoginTest {

    HotelMyCampPage hotelMyCamp = new HotelMyCampPage();

    @DataProvider
    public static Object[][] wrongUserList() {

        String list[][] = {{"manager11", "manager11"},{"manager12","manager12"},{"manager13", "manager13"}};

        return list;
    }

    @Test(dataProvider = "wrongUserList")
    public void yanlisSifreKullaniciTesting(String wrongUsername, String wrongPassword){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCamp= new HotelMyCampPage();
        hotelMyCamp.firstLogInElement.click();
        hotelMyCamp.userNameBoxElement.sendKeys(ConfigReader.getProperty(wrongUsername));
        hotelMyCamp.passwordBoxElement.sendKeys(ConfigReader.getProperty(wrongPassword));
        hotelMyCamp.secondLogInElement.click();
        Assert.assertTrue(hotelMyCamp.girisYapilamadiYaziTesti.isDisplayed());
        //Assert.assertFalse(hotelMyCamp.basariliGirisYapildi.isDisplayed());
        Driver.closeDriver();
    }
}
