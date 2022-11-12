package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcort;
import utilities.ConfigReader;
import utilities.Driver;

public class WebTables {

    @Test

    public void testtable() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
        QAConcort qatable= new QAConcort();
        qatable.gir1.click();
        qatable.gir2.click();
        qatable.kullaniciAdi.sendKeys(ConfigReader.getProperty("CHqavalidusername"));
        qatable.sifre.sendKeys(ConfigReader.getProperty("CHqavalidpassword"));
        qatable.loginTusu.click();

        qatable.hotelmanagemenet.click();
        qatable.hotelrooms.click();

        for (WebElement each :qatable.basliklarlist
             ) {
            System.out.println(each.getText());
        }

        System.out.println(qatable.basliklarlist.size());


        System.out.println(qatable.tablotumu.getText());

        Thread.sleep(2000);
        Assert.assertTrue(qatable.tablotumu.getText().contains("Star Hotel"));


        for (WebElement each:qatable.satirlar
             ) {
            System.out.println(each.getText());
        }

        System.out.println(qatable.satirlar.size());

        System.out.println(qatable.satiruc.getText());

        for (int i=0; i<qatable.satirlar.size();i++){
            System.out.println((i+1)+ ".nci satir    "+ qatable.satirlar.get(i).getText());

        }

        for (WebElement each: qatable.dorduncusutun
             ) {
            System.out.println(each.getText());
        }



        Driver.closedriver();
    }



}
