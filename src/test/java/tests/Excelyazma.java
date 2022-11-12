package tests;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Excelyazma {
    @Test

    public void tesetexcelyazma() throws IOException {

        String dosyayol="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis= new FileInputStream(dosyayol);
        Workbook workbook= WorkbookFactory.create(fis);
        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("nüfus");
        workbook.getSheet("Sayfa1").getRow(1).createCell(4).setCellValue(1500000);
        workbook.getSheet("Sayfa1").getRow(3).createCell(4).setCellValue(12313213);

        FileOutputStream fos= new FileOutputStream(dosyayol);
        workbook.write(fos);

        fis.close();
        fos.close();
        workbook.close();







    }
}
