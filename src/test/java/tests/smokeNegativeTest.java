package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcort;
import utilities.ConfigReader;
import utilities.Driver;

public class smokeNegativeTest {

    @Test (priority = -3)
    public  void negativeSmoke(){
        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));

        QAConcort qaConcortneg= new QAConcort();

        qaConcortneg.gir1.click();
        qaConcortneg.gir2.click();
        qaConcortneg.kullaniciAdi.sendKeys(ConfigReader.getProperty("CHqavalidusername"));
        qaConcortneg.sifre.sendKeys(ConfigReader.getProperty("CHqaInvalidpassword"));
        qaConcortneg.loginTusu.click();

        Assert.assertTrue(qaConcortneg.yanlisifre.isDisplayed());
    }

   @Test (dependsOnMethods = "negativeSmoke")
   public void negativeYanlisSifre (){

        QAConcort qaConcor1 =new QAConcort();
        qaConcor1.kullaniciAdi.clear();
        qaConcor1.kullaniciAdi.sendKeys(ConfigReader.getProperty("CHqaInvalidusername"));
        qaConcor1.sifre.clear();
        qaConcor1.sifre.sendKeys(ConfigReader.getProperty("CHqavalidpassword"));
        qaConcor1.loginTusu.click();
   }


    @Test (dependsOnMethods = "negativeSmoke")
    public void negativeYanlisKullaniciveSifre (){

        QAConcort qaConcor2 =new QAConcort();
        qaConcor2.kullaniciAdi.clear();
        qaConcor2.kullaniciAdi.sendKeys(ConfigReader.getProperty("CHqaInvalidusername"));
        qaConcor2.sifre.clear();
        qaConcor2.sifre.sendKeys(ConfigReader.getProperty("CHqavalidpassword"));
        qaConcor2.loginTusu.click();
        Driver.closedriver();
    }






}
