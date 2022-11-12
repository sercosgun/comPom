package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcort;
import utilities.ConfigReader;
import utilities.Driver;

public class Endtoend2 {

    @Test
    public void test2() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
        QAConcort qa2= new QAConcort();
        qa2.gir1.click();
        qa2.gir2.click();
        qa2.kullaniciAdi.sendKeys(ConfigReader.getProperty("CHqavalidusername"));
        qa2.sifre.sendKeys(ConfigReader.getProperty("CHqavalidpassword"));
        qa2.loginTusu.click();
        qa2.hotelmanagemenet.click();
        qa2.hotelrooms.click();
        qa2.hotelroomekle.click();
        Select sec2 = new Select(qa2.sechotel);
        sec2.selectByValue("1017");

        Actions actions = new Actions(Driver.getDriver());
        Faker faker=new Faker();

        actions
                .sendKeys(Keys.TAB)
                .sendKeys(faker.code().ean13())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.lorem().paragraph())
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("CHqafiyat"))
                .perform();

        sec2= new Select(qa2.odatipi);
        sec2.selectByVisibleText("Double");

        actions
                .sendKeys(Keys.TAB)
                .sendKeys(String.valueOf(faker.number().numberBetween(1,3)))
                .sendKeys(Keys.TAB)
                .sendKeys(String.valueOf(faker.number().numberBetween(2,5)))
                .perform();


        qa2.sonsave.click();

        System.out.println("son mesaj ..........................................");
        System.out.println(qa2.sonmesaj.getText());
      // Assert.assertTrue(qa2.sonmesaj.isDisplayed());

        Thread.sleep(2000);
        qa2.sonok.click();

        actions.sendKeys(Keys.HOME).perform();
        qa2.hotelroomsssbutonu.click();

        Assert.assertTrue(qa2.hotelromslistesi.isDisplayed());

        Driver.closedriver();















    }
}
