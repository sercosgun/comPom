package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcort;
import utilities.ConfigReader;
import utilities.Driver;

public class Webtable2 {
    @Test
    public void testtable2(){
        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
        QAConcort qatable= new QAConcort();
        qatable.gir1.click();
        qatable.gir2.click();
        qatable.kullaniciAdi.sendKeys(ConfigReader.getProperty("CHqavalidusername"));
        qatable.sifre.sendKeys(ConfigReader.getProperty("CHqavalidpassword"));
        qatable.loginTusu.click();

        qatable.hotelmanagemenet.click();
        qatable.hotelrooms.click();

        String istenen= qatable.printData(3,7);
        String beklenen="Queen";

        Assert.assertEquals(istenen,beklenen);

        Driver.closedriver();
    }

}
