package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ArenaPage {


    WebDriver driver;

    public ArenaPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy (id="emailAddress")
    public WebElement ePostaKutusu;

    @FindBy(id = "password")
    public WebElement sifreKutusu;







}



