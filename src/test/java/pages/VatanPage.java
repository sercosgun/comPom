package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VatanPage {

    WebDriver driver;

    //constructor oluşturduk
    public VatanPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy (id="navbar-search-input")
    public WebElement aramaKutusu;

    @FindBy (tagName = "h1")
    public WebElement sonucYazisi;






}
