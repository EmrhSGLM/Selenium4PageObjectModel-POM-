package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {

    @Test
    public void test01(){
        // amazon'a gidelim
        Driver.getDriver().get("https://www.amazon.com");
        // amazon'a gittigimizi test edelim
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon"));

        // Driver.getDriver() method'u her calistiginda
        // driver = new ChromeDriver(); komutundan oturu yeni bir driver olusturuyor
        // Biz Driver class'dan getDriver()'i ilk calistirdigimizda new atamasi olsun
        // sonraki calismalarda atama olmasin istiyoruz
        // bunun icin driver = new ChromeDriver(); satirni bir if blogu icine aliriz
        Driver.closeDriver();
    }

    @Test
    public void test02(){
        // bestbuy anasayfaya gidelim
        Driver.getDriver().get("https://www.bestbuy.com");
        // bestbuy'a gittigimizi test edelim
        String url = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("best"));
        Driver.closeDriver();
    }
}
