package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.TestBase;

public class pages3 extends TestBase {

    @Test
    public void testAmazon(){
    driver.get("https://www.amazon.com/");


    //obje oluşturduk
    AmazonPage amazon= new AmazonPage(driver);

        Select select=new Select(amazon.dropMenusu);
        select.selectByVisibleText("Books");

        amazon.aramaKutusu.sendKeys("Java", Keys.ENTER);

        System.out.println(amazon.sonucYazisi.getText());


    }

}
