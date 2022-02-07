package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;


public class C03_ResuableRunner {

    // ulkeler excelindeki , Sayfa1'de
    // 11.index'deki satirin, 2.indexdeki hucresinin Azerbaycan oldugunu test edin

    @Test
    public void test() {
        String path = "src/test/java/resources/ulkeler.xlsx";
        String expectedData = "Azerbaycan";
        String actualData = ResuableMethods.hucreGetir(path, "Sayfa1", 11, 2).toString();

        Assert.assertEquals(expectedData, actualData);

    }
}
