package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortPage;
import utilities.ConfigReader;
import utilities.TestBase;

public class ConfigileTest extends TestBase {

    @Test
    public void positive (){

        driver.get(ConfigReader.getProperty("CHurl"));
        driver.findElement(By.xpath("//button[@id='details-button']")).click();
        driver.findElement(By.linkText("www.concorthotel.com sitesine ilerle (güvenli değil)")).click();
        ConcortPage concortPage=new ConcortPage(driver);
        concortPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("CHvalidusername"));
        concortPage.sifre.sendKeys(ConfigReader.getProperty("CHvalidpassword"));
        concortPage.loginTusu.click();

        Assert.assertTrue(concortPage.listuserYazisi.isDisplayed(),"yazı görünmüyor");

    }
}
