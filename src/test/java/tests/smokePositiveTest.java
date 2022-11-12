package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcort;
import utilities.ConfigReader;
import utilities.Driver;

public class smokePositiveTest {


    @Test
    public void testsmoke(){

        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));


        //obje oluşturduk
        QAConcort qaConcortt=new QAConcort();

       qaConcortt.gir1.click();
       qaConcortt.gir2.click();
       qaConcortt.kullaniciAdi.sendKeys(ConfigReader.getProperty("CHqavalidusername"));
       qaConcortt.sifre.sendKeys(ConfigReader.getProperty("CHqavalidpassword"));
       qaConcortt.loginTusu.click();

        Assert.assertTrue(qaConcortt.listuserYazisi.isDisplayed());
        Driver.closedriver();


        }





}
