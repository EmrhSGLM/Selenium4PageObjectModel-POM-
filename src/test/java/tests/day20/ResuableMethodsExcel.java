package tests.day20;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ResuableMethodsExcel {


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


    public static Map<String,String> mapOlustur(String path, String sayfaAdi) {
        Map<String,String> excelMap = new TreeMap();

        // 1.Step => Excel'de istenen sayfaya ulasmak
        Workbook workbook=null;
        try {
            FileInputStream fis = new FileInputStream(path);
            workbook = WorkbookFactory.create(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int satirSayisi = workbook.getSheet(sayfaAdi).getLastRowNum();
        int sutunSayisi = workbook.getSheet(sayfaAdi).getRow(0).getLastCellNum();

        String key="";
        String value = "";
        for (int i=0; i<satirSayisi; i++){

            //2.Step Tablo daki hucreleri map'e uygun hale donusturmek
            key=workbook.getSheet(sayfaAdi).getRow(i).getCell(0).toString();
            for(int j=0; i<sutunSayisi;i++) {
                value += workbook.getSheet(sayfaAdi).getRow(i).getCell(j).toString() + ", " ;
            }
            // 3.Step key-value haline getirdigimiz satirlari map'e eklemek
            value = value.substring(0,value.length()-3);
            excelMap.put(key,value);

        }




        return excelMap;
    }
}
