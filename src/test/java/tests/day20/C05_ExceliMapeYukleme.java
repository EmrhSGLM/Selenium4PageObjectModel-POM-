package tests.day20;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class C05_ExceliMapeYukleme {

    @Test
    public void test01(){
        // dosya yolu ve sayfa ismi verilen bir excel sheet'i map olarak kaydeten
        // reasuble bir method olusturalim

        String path = "src/test/java/resources/ulkeler.xlsx";
        String sayfaAdi = "Sayfa1";

        Map<String, String> ulkelerMap = ResuableMethodsExcel.mapOlustur(path, sayfaAdi);


        // olusturdugunmuz map'i kullanarak Turkey'in bilgilerini yazdirin

        System.out.println(ulkelerMap.get("Turkey"));

        //


    }

}
