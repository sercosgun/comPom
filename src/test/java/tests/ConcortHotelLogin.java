package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortPage;
import utilities.TestBase;

public class ConcortHotelLogin extends TestBase {

    @Test
    public void logintest(){

        driver.get("https://www.concorthotel.com/Account/Logon");
        driver.findElement(By.xpath("//button[@id='details-button']")).click();
        driver.findElement(By.linkText("www.concorthotel.com sitesine ilerle (güvenli değil)")).click();

        ConcortPage concort =new ConcortPage(driver);
        concort.kullaniciAdi.sendKeys("manager");
        concort.sifre.sendKeys("Manager1!");
        concort.loginTusu.click();

        Assert.assertTrue(concort.listuserYazisi.isDisplayed(),"girememiş.............");



    }
}
