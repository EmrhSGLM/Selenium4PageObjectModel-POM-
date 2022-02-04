package tests.day18;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;

import java.util.List;

public class C02_Webtables {

    //● Bir class oluşturun : C02_WebTables
    //● login( ) metodun oluşturun ve oturum açın.
    //● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
    //            ○ Username : manager
    //            ○ Password : Manager1!
    //● table( ) metodu oluşturun
    //            ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
    //            ○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
    //● printRows( ) metodu oluşturun //tr
    //            ○ table body’sinde bulunan toplam satir(row) sayısını bulun.
    //            ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
    //            ○ 4.satirdaki(row) elementleri konsolda yazdırın.

    HotelMyCampPage hotelMyCampPage;
    HMCWebTablePage hmcWebTable;
    @Test
    public void login(){
        hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.girisYap();

    }
    @Test
    public void table(){
        //● table( ) metodu oluşturun
        //            ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
        // header kisminda birinci satir ve altindaki datalari locate edelim
        // (//thead//tr)[1]//th
        hmcWebTable = new HMCWebTablePage();
        List<WebElement> headerDataList = hmcWebTable.headerBirinciSatirDatalar;
        System.out.println("Tablodaki sutun sayisi : " + headerDataList.size());

        //            ○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
        //           //tbody => tablo da ki tum body'nin locate
        System.out.println("Tum Body : \n" + hmcWebTable.tumBodyWebElement.getText());
        // Eger body tek bir webelement olarak locate edersek
        // icindeki tum datalari getText() ile yazdirabiliriz
        // ancak bu durumda bu elementler ayri ayri degil
        // body'nin icindeki tek bir String'in parcalari olurlar
        // dolayisiyla bu elementlere tek tek ulasmamaiz mumkun olmaz
        // sadece contains methodu ile body'de olup olmadiklarini test edebiliriz

        // Eger her bir data'yi ayri ayri almak istersek
        // //tbody//td seklinde locate edip bir list'e atabiliriz

        List<WebElement> bodyTumDataList = hmcWebTable.tumBodyDatalariLis;
        System.out.println("Tum Body Data List : " + bodyTumDataList.size());




    }

    @Test
    public void printRows(){
        //● printRows( ) metodu oluşturun //tr
        //            ○ table body’sinde bulunan toplam satir(row) sayısını bulun.
        //            ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        //            ○ 4.satirdaki(row) elementleri konsolda yazdırın.

    }
}
