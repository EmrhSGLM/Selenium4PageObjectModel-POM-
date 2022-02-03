package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C04_HotelMyCampPositiveLogin {

    @Test
    public void pozitifLoginTesti(){
        //1 ) Bir Class olustur : PositiveTest
        //2) Bir test method olustur positiveLoginTest()
        //        https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com");
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        //        login butonuna bas
        hotelMyCampPage.firstLogInElement.click();
        //    test data username: manager ,
        //    test data password : Manager1!
        hotelMyCampPage.userNameBoxElement.sendKeys("manager");
        hotelMyCampPage.passwordBoxElement.sendKeys("Manager1!");
        hotelMyCampPage.logInElement.click();
        //    Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCampPage.enterTrueTest.isDisplayed());
        Driver.closeDriver();

    }
}
