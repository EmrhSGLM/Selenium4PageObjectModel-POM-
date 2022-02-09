package tests.day19;

import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_WebTableDemoqa {

    //  1. “https://demoqa.com/webtables” sayfasina gidin
    //  2. Headers da bulunan department isimlerini yazdirin
    //  3. sutunun basligini yazdirin
    //  4. Tablodaki tum datalari yazdirin
    //  5. Tabloda kac cell (data) oldugunu yazdirin
    //  6. Tablodaki satir sayisini yazdirin
    //  7. Tablodaki sutun sayisini yazdirin
    //  8. Tablodaki 3.kolonu yazdirin
    //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
    //  10. Page sayfasinda bir method olusturun,
    //  Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin

    @Test (groups = {"smoke", "regression"})
    public void test(){
        //  1. “https://demoqa.com/webtables” sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("DemoqaUrl"));
        //  2. Headers da bulunan department isimlerini yazdirin
        //  normalde -> //thead//th olurdu ancak bu tablo klas isimleri ile organize edilmis
        DemoqaPage demoqaPage = new DemoqaPage();
        System.out.println("1===================================================================================");
        System.out.println("Baslik satiri elementi : \n" + demoqaPage.baslikSatiriElementi.getText());

        // 2.Way olarak basliklari bir listeye koyabilirim
        // basliklarWebElementiListesi


        //  3. sutunun basligini yazdirin
        System.out.println("2===================================================================================");
        System.out.println("3. sutun baslisi : " + demoqaPage.basliklarWebElementiListesi.get(2).getText());

        //  4. Tablodaki tum datalari yazdirin
        System.out.println("3===================================================================================");
        System.out.println("===================== Tum Body ==============================");
        System.out.println(demoqaPage.bodyWebElement.getText());

        //  5. Tabloda kac cell (data) oldugunu yazdirin
        System.out.println("4===================================================================================");
        System.out.println("Tabloda ki data sayisi : " + demoqaPage.tumDataWebElementList.size());

        //  6. Tablodaki satir sayisini yazdirin
        System.out.println("5===================================================================================");
        System.out.println("Tabloda ki satir sayisi : " + demoqaPage.tumSatirlarWebElementList.size());

        //  7. Tablodaki sutun sayisini yazdirin
        // farkli yollardan hesaplanabilir ama biz hucresayisi/ satirsayisi yapalim
        System.out.println("6===================================================================================");
        System.out.println("Tablodaki sutun sayisi : " + (demoqaPage.tumDataWebElementList.size()
                / demoqaPage.tumSatirlarWebElementList.size()));

        //  8. Tablodaki 3.kolonu yazdirin
        System.out.println("7===================================================================================");
        demoqaPage.sutunYazdir(3);
        //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        System.out.println("8===================================================================================");
        demoqaPage.ismeGoreMaasYazdir("Kierra");
        //  10. Page sayfasinda bir method olusturun,
        //  Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin
        System.out.println("9===================================================================================");
        demoqaPage.hucreYazdir(2,3);
        Driver.closeDriver();
    }
}
