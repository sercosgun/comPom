package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VatanPage;
import utilities.TestBase;

public class pages1 extends TestBase {

    @Test
    public void test(){
        driver.get("https://www.vatanbilgisayar.com/");
        WebElement aramaKutusu=driver.findElement(By.id("navbar-search-input"));
        aramaKutusu.sendKeys("kablo", Keys.ENTER);

        WebElement sonucYazisi=driver.findElement(By.tagName("h1"));
        System.out.println(sonucYazisi.getText());
        Assert.assertTrue(sonucYazisi.getText().contains("kablo"));

    }


    @Test
    public void testPom(){
        driver.get("https://www.vatanbilgisayar.com/");
        VatanPage vatanPage= new VatanPage(driver);
        vatanPage.aramaKutusu.sendKeys("klavye",Keys.ENTER);
        System.out.println(vatanPage.sonucYazisi.getText());
        Assert.assertTrue(vatanPage.sonucYazisi.getText().contains("klavye"));


    }

}
