package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public abstract class TestBaseCross {
    //protected e dikkat
    protected WebDriver driver;
//buraya dikat!!!


    @Parameters ("browser")

    @BeforeClass
    public void baslangic(@Optional String browser) {
        WebDriverManager.chromedriver().setup();
        driver = DriverCross.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }



    @AfterClass
    public void son(){
        //   driver.close();
    }

}
