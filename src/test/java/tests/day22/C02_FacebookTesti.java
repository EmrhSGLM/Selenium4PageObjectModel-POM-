package tests.day22;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C02_FacebookTesti extends TestBaseRapor {

    @Test
    public void test01()  {

        extentTest=extentReports.createTest("facebook","fake isimle girilemedigi test edildi");
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com");
        extentTest.info("facebook sayfaasina gidildi");
        //2- POM'a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        FacebookPage facebookPage = new FacebookPage();
        //3- Faker class'ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker = new Faker();
        facebookPage.emailBox.sendKeys(faker.internet().emailAddress());
        facebookPage.passwordBox.sendKeys(faker.internet().password());
        facebookPage.loginBox.click();
        extentTest.info("facebook giris bilgileri faker ile dolduruldu");

        //4- Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girilemediYazisiElementi.isDisplayed());
        extentTest.pass("girilemedigi test edildi");

    }
}
