package tests.day21;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.Set;

public class C01_WindowHandleReusableMethods {


    @Test
    public void test01(){
        // https://the-internet.herokuapp.com/windows adresine gidelim
        // Click Here butonuna basalim
        // new taba gecip title'inin "New Window" oldugunu test edin

        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaWindowHandle = Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.linkText("Click Here")).click();

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        String ikinciSayfaWindowHandle="";
        for(String w:allWindowHandles){
            if(!w.equals(ilkSayfaWindowHandle)){
                ikinciSayfaWindowHandle = w;
            }
        }

        Driver.getDriver().switchTo().window(ikinciSayfaWindowHandle);
        String expectedTitle = "New Window";
        System.out.println("ikinciSayfaWindowHandle = " + ikinciSayfaWindowHandle);
        System.out.println("ilkSayfaWindowHandle = " + ilkSayfaWindowHandle);
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);

        Driver.closeDriver();
    }

    @Test
    public void windowHandleReusableTest() throws IOException {
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        ReusableMethods.switchToWindow("New Window");

        String expectedTitle = "New Window";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        ReusableMethods.getScreenshot("WindowSwitch");

    }
}
