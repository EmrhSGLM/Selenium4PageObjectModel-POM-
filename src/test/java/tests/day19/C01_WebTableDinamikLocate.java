package tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_WebTableDinamikLocate {

    // 3 test method'u olusturalim
    // 1.method satir numarasi verdigimde bana o satirdaki datalari yazdirsin
    // 2.method satir no ve data numarasi gitdigimde verdigim data yi yazdirsin
    // 3.sutun numarasi verdigimde bana tum sutunu yazdirsin
    HMCWebTablePage hmcWebElement;
    HotelMyCampPage hotelMyCamp;

    @Test
    public void satirYazdirTesti(){
        // 1.method satir numarasi verdigimde bana o satirdaki datalari yazdirsin
        hmcWebElement = new HMCWebTablePage();
        hotelMyCamp = new HotelMyCampPage();
        hotelMyCamp.girisYap();
        WebElement ucuncuSatirElementi = hmcWebElement.satirGetir(4);
        System.out.println(ucuncuSatirElementi.getText());

        // 2.satir ===< ((//tbody//tr[2])//td)[4]
        // 7.satir ===< //tbody//tr[7]

        Driver.closeDriver();
    }

    @Test
    public void hucreGetir(){
        // 2.method satir no ve data numarasi gitdigimde verdigim data yi yazdirsin
        hmcWebElement = new HMCWebTablePage();
        hotelMyCamp = new HotelMyCampPage();
        hotelMyCamp.girisYap();

        // 2.satirin 4.datasi => ((//tbody//tr[2])//td)[4]
        // 4.satirin 5.datasi => ((//tbody//tr[4])//td)[5]


        String istenilenHucreText = hmcWebElement.hucreWebElementGetir(3,5);
        System.out.println("istenilenHucreText = " + istenilenHucreText);
        Driver.closeDriver();
    }

    @Test
    public void sutunYazdirTesti(){
        hmcWebElement = new HMCWebTablePage();
        hotelMyCamp = new HotelMyCampPage();
        hotelMyCamp.girisYap();
        // 3.sutun numarasi verdigimde bana tum sutunu yazdirsin
        hmcWebElement.sutunYazdir(4);
        Driver.closeDriver();

    }
}
