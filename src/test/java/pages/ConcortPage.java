package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConcortPage {

WebDriver driver;

//constructor
    public ConcortPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy (id = "UserName")
    public WebElement kullaniciAdi;

    @FindBy (id = "Password")
    public WebElement sifre;

    @FindBy (id = "btnSubmit")
    public WebElement loginTusu;

    @FindBy (className = "caption")
    public WebElement listuserYazisi;





}
