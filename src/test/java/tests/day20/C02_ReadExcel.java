package tests.day20;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_ReadExcel {
    @Test
    public void test01() throws IOException {

        // ulkeler excel'in 3.satirini yazdirin
        String path = "src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet("Sayfa1");

        for(int i=0; i<4 ; i++){
            System.out.println(workbook.getSheet("Sayfa1").getRow(3).getCell(i).toString());
        }

        // ilk 20 ulkenin baskentlerinin Turkce isimlerini yazdirin
        for (int i=1; i<21; i++){
            System.out.println(workbook.getSheet("Sayfa1").getRow(i).getCell(3).toString());
        }


    }


}
