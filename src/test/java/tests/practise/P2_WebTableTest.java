package tests.practise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.P2_WebTablePage;
import utilities.Driver;

import java.util.List;

public class P2_WebTableTest {

    /*
   go to url : https://en.wikipedia.org/wiki/Dell
   go to table which name is 'List of companies acquired by Dell Inc.'
   print row 4 of the table on console
   also print on console the 2nd and 3rd elements (middle 2 elements) in line 5
   ( 2nd and 3rd elements : November 2, Cloud integration leader)

    url'ye gidin: https://en.wikipedia.org/wiki/Dell
 'List of companies acquired by Dell Inc.' isimli tabloya gidin,
 tablonun 4. satırını konsolda yazdırın
 ayrıca 5. satırdaki 2. ve 3. öğeleri (ortadaki 2 öğe) konsola yazdırın
 ( 2nd and 3rd ogeler : November 2, Cloud integration leader)
    */

    @Test
    public void test01(){
        Driver.getDriver().get("https://en.wikipedia.org/wiki/Dell");
        P2_WebTablePage p2WebTable = new P2_WebTablePage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",p2WebTable.nameOfList );
        System.out.println("4. Satir : " + p2WebTable.fourtRow.getText() );
        System.out.println("2. Oge : " + p2WebTable.fourtRowSecondElement.getText());
        System.out.println("3. Oge : " + p2WebTable.fourtRowThirdElement.getText());
    }



}
