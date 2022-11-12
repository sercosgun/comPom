package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortPage;
import utilities.TestBase;

public class ConcortNegative extends TestBase {

    @Test
    public void negativeTest(){

        driver.get("https://www.concorthotel.com/Account/Logon");
        driver.findElement(By.xpath("//button[@id='details-button']")).click();
        driver.findElement(By.linkText("www.concorthotel.com sitesine ilerle (güvenli değil)")).click();

        ConcortPage concort = new ConcortPage(driver);

        concort.kullaniciAdi.sendKeys("bilos");
        concort.sifre.sendKeys("dsfsfs");
        concort.loginTusu.click();

        Assert.assertFalse(concort.listuserYazisi.isDisplayed(),"girildi");

    }
}
