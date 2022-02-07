package tests.day20;

import org.apache.poi.ss.usermodel.*; // Butun kutuphaneyi getirdik
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {

    @Test
    public void test01() throws IOException {

        String path = "src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(path);

        // Biz FileInputStream ile okudugumuz excel dosyamizi projemiz icerisinde kullanabilmek icin
        // apachi POI depenceny yardimi ile bir Workbook olusturduk

        // Bu worjbook bizim projemiz icerisinde ulkeler excelinin bir kopyasini kullanmamizi sagliyor

        // Excel'in yapisi geregi bir hucreye(cell) ulasabilmek icin workbook dan baslayarak
        // sirasiyla sheet, row ve cell objeleri olusturmamiz gerekiyor


        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet("Sayfa1");
        Row row = sheet.getRow(4);
        Cell cell = row.getCell(2);
        // sell ve row index seklinde 0'dan basliyor

        System.out.println(cell); // Andorra

        // index'i 4 olan satirdaki, index'i 2 olan hucredeki Andorra oldugunu test edin
        String expectedData = "Andorra";
        Assert.assertEquals(cell.getStringCellValue(),expectedData);

        // 5. indexdeki satirin, 3. indexdeki hucre bilgisini yazdiralim
        row = sheet.getRow(5);
        cell=row.getCell(3);

        System.out.println(cell); // Luanda


    }
}
