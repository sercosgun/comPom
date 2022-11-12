package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.ArenaPage;
import utilities.TestBase;

public class pages2 extends TestBase {

    @Test
    public void testareana(){
    driver.get("https://www.arena.com.tr/giris-yap");

       ArenaPage arena= new ArenaPage(driver);

       arena.ePostaKutusu.sendKeys("bilo@gmail.com");
       arena.sifreKutusu.sendKeys("132456544", Keys.ENTER);






    }

}
