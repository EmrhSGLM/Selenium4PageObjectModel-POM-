package tests.practice;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P3_TutorialPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P3_TutorialTest {

    //~ url'ye gidin: "http://tutorialsninja.com/demo/index.php?route=common/home"
    //~ Phones & PDAs e tıklayın
    //~ telefonların marka adını al
    //~ tüm elemanlar için ekle düğmesine tıklayın
    //~ siyah toplam eklenen sepet düğmesine tıklayın
    //~ listenin isimlerini sepetten al
    //~ görüntülenen listeden ve sepet listesinden isimleri karşılaştırın
    //~ goruntulenen listede toplam fiyatin $583.19 oldugunu test edin
    @Test
    public void test(){
        Driver.getDriver().navigate().to(ConfigReader.getProperty("tutorialUrl"));

        P3_TutorialPage p3TutorialPage = new P3_TutorialPage();

        //~ Phones & PDAs e tıklayın
        p3TutorialPage.phonesPDAs.click();

        //~ telefonların marka adını al
        p3TutorialPage.products.stream().forEach(t-> System.out.println(t));

        //~ tüm elemanlar için ekle düğmesine tıklayın
        p3TutorialPage.addAllCart.stream().forEach(t->t.click());

        //~ siyah toplam eklenen sepet düğmesine tıklayın
        p3TutorialPage.clickBlackButton.click();

        //~ listenin isimlerini sepetten al
        for(WebElement w: p3TutorialPage.sepetList){
            System.out.println(w.getText());

        }

        //~ görüntülenen listeden ve sepet listesinden isimleri karşılaştırın
        Assert.assertEquals(p3TutorialPage.products,p3TutorialPage.sepetList);

        //~ goruntulenen listede toplam fiyatin $583.19 oldugunu test edin

    }
}
