package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageIlkClass {


    // POM'de farkli class'lara farkli sekilde ulasilmasi benimsenmistir
    // Driver class'i icin static yontemi kullaniyoruz
    // Page class'lari icin ise obje uzerinden kullanilmasi tercih edilmistir
    @Test
    public void test01(){
        // Amazon'a gidelim
        Driver.getDriver().get("https://www.amazon.com");
        // arama kutusuna Nutella yazip aratalim
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys("Nutella" , Keys.ENTER);
        // Arama sonuclarinin Nutella icerdigini test edelim
        String actualText = amazonPage.resultWriting.getText();
        Assert.assertTrue(actualText.contains("Nutella"));
        Driver.closeDriver();
    }

    @Test (groups = {"miniRegression","smoke"})
    public void test02(){
        // amazon'a gidelim
        Driver.getDriver().get("https://www.amazon.com");
        // java icin arama yapalim
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys("Java" + Keys.ENTER);
        // sonucun java icerdigini test edelim
        String actualText = amazonPage.resultWriting.getText();
        Assert.assertTrue(actualText.contains("Java"));
    }
}
