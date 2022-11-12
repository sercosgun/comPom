package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Raporlama {


    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("CHamazon"));
        WebElement aramaKutusu = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys(ConfigReader.getProperty("CHaranan")+Keys.ENTER);
        WebElement sonuc= Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String sonucyazisi= sonuc.getText();
        String sonucArray[]= sonucyazisi.split(" ");
        int sonusayisi= Integer.parseInt(sonucArray[2]);

        System.out.println(sonusayisi);

        Assert.assertTrue(sonusayisi<1000);

    }

    @Test
    public void testdrop(){
        Driver.getDriver().get(ConfigReader.getProperty("CHamazon"));

        WebElement drop= Driver.getDriver().findElement(By.id("searchDropdownBox"));

        Select select=new Select(drop);
        select.selectByVisibleText("Electronics");





    }
}
