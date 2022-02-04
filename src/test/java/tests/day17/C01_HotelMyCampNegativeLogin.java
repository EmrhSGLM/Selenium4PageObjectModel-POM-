package tests.day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_HotelMyCampNegativeLogin {

    //1 ) Bir Class olustur : NegativeTest
    //2) Bir test method olustur NegativeLoginTest()
    //         https://www. hotelmycamp.com/ adresine git
    //        login butonuna bas
    //    test data username: manager1 ,
    //    test data password : manager1!
    //    Degerleri girildiginde sayfaya girilemedigini test et
    @Test
    public void test01(){
        //         https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        //        login butonuna bas
        HotelMyCampPage hotelMyPage = new HotelMyCampPage();
        hotelMyPage.firstLogInElement.click();

        //    test data username: manager1 ,
        hotelMyPage.userNameBoxElement.sendKeys("manager1");
        //    test data password : manager1!
        hotelMyPage.passwordBoxElement.sendKeys("manager1!");
        hotelMyPage.secondLogInElement.click();
        //    Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hotelMyPage.girisYapilamadiYaziTesti.isDisplayed());
        Driver.closeDriver();

    }
}
