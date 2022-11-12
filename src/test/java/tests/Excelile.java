package tests;

import org.apache.poi.ss.usermodel.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excelile {
    @Test
    public void testexcel() throws IOException {
        String dosyaYolu= "src/test/java/resources/ulkeler.xlsx";

        //excel dosya okumak için
        FileInputStream fileInputStream =new FileInputStream(dosyaYolu);

        Workbook workbook= WorkbookFactory.create(fileInputStream);

        Sheet sheet = workbook.getSheet("Sayfa1");

        Row row =sheet.getRow(5);

        Cell cell= row.getCell(3);

        System.out.println(cell);
    }


    @Test
    public void testdahakolayi() throws IOException {
        String dosyaYolu= "src/test/java/resources/ulkeler.xlsx";

        FileInputStream fileInputStream =new FileInputStream(dosyaYolu);

        Workbook workbook= WorkbookFactory.create(fileInputStream);

        Cell cell= workbook.getSheet("Sayfa1").getRow(5).getCell(3);

        System.out.println(cell);

        Assert.assertEquals(cell.toString(),"Luanda");

        Cell cell1= workbook.getSheet("Sayfa1").getRow(3).getCell(2);
        System.out.println(cell1.toString().toUpperCase());


        System.out.println(workbook.getSheet("Sayfa1").getLastRowNum());











    }
}
