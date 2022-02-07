package tests.day20;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ResuableMethods {

    // bir metot olusturalim
    // dosya yolu ve satir, hucre index'ini verince hucre bilgisini yazdirsin

    public static Cell hucreGetir(String path, String sayfaIsmi, int satirIndex, int sutunIndex) {

         Cell cell=null;
        try {
            FileInputStream fis = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(fis);
            cell=workbook.getSheet(sayfaIsmi).getRow(satirIndex).getCell(sutunIndex);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

        return cell;
    }


}
