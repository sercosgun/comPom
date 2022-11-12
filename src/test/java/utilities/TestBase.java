package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;



// abstract a dikkat
public abstract class TestBase {
//abstact yaparak bu calss tan obje yapılmasının önüne geçeriz


    //protected e dikkat
    protected WebDriver driver;
//buraya dikat!!!



    @BeforeClass
    public void baslangic() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }



    @AfterClass
    public void son(){
      //   driver.close();
    }


}