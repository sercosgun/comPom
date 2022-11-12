package tests;

import com.github.javafaker.Faker;
import javafx.scene.control.Tab;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcort;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class EndtoEndTesti {
    @Test

    public void endtoend(){
        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));

        QAConcort qaConcort=new QAConcort();
        qaConcort.gir1.click();
        qaConcort.gir2.click();
        qaConcort.kullaniciAdi.sendKeys(ConfigReader.getProperty("CHqavalidusername"));
        qaConcort.sifre.sendKeys(ConfigReader.getProperty("CHqavalidpassword"));
        qaConcort.loginTusu.click();

        qaConcort.hotelmanagemenet.click();
        qaConcort.hotellist.click();
        qaConcort.hotelekle.click();

        Faker faker =new Faker();

        Actions act= new Actions(Driver.getDriver());
            act
                .click(qaConcort.kod).sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).perform();

            Select sec= new Select(qaConcort.dropmenu);
            sec.selectByVisibleText("Hotel Type2");

          qaConcort.kaydet.click();










    }
}
