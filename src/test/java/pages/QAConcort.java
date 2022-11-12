package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

import java.util.List;

public class QAConcort {
//1.driver
   public WebDriver driver;

//2.constructor

   public QAConcort (){
        PageFactory.initElements(Driver.getDriver(),this);
    }


//3.locatorlar

    @FindBy(id = "UserName")
    public WebElement kullaniciAdi;

    @FindBy (id = "Password")
    public WebElement sifre;

    @FindBy (id = "btnSubmit")
    public WebElement loginTusu;

    @FindBy (className = "caption")
    public WebElement listuserYazisi;

    @FindBy (xpath = "//button[@id='details-button']")
    public WebElement gir1;

    @FindBy (id = "proceed-link")
    public WebElement gir2;

    @FindBy (id = "divMessageResult")
    public WebElement yanlisifre;

    @FindBy (xpath = "(//span[@class='title'])[3]")
    public WebElement hotelmanagemenet;

    @FindBy (partialLinkText = "Hotel List")
    public  WebElement hotellist;

    @FindBy (xpath = "//span[@class='hidden-480']")
     public  WebElement hotelekle;

    @FindBy (id = "Code")
    public WebElement kod;

   @FindBy (id="IDGroup")
   public  WebElement dropmenu;

   @FindBy (id="btnSubmit")
   public WebElement kaydet;

   @FindBy (partialLinkText = "Hotel Rooms")
    public WebElement hotelrooms;

   @FindBy (xpath = "//span[@class='hidden-480']")
    public WebElement hotelroomekle;

   @FindBy (id="IDHotel")
    public WebElement sechotel;

   @FindBy (id="IDGroupRoomType")
    public WebElement odatipi;

   @FindBy (id="uniform-IsAvailable")
    public WebElement onayKutusu;

   @FindBy (id="btnSubmit")
    public WebElement sonsave;

   @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement sonok;

   @FindBy (xpath = "//div[@class='bootbox-body']")
    public WebElement sonmesaj;

   @FindBy (linkText ="Hotelrooms" )
    public WebElement hotelroomsssbutonu;

   @FindBy (xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
    public WebElement hotelromslistesi;

   @FindBy (xpath = "//thead//tr[1]/th")
    public List<WebElement> basliklarlist;

   @FindBy (xpath = "//tbody")
    public WebElement tablotumu;

   @FindBy (xpath = "//tbody//tr")
    public List<WebElement> satirlar;

    @FindBy (xpath = "//tbody//tr[3]")
    public WebElement satiruc;

    @FindBy (xpath = "//tbody//tr//td[4]")
    public List<WebElement> dorduncusutun;


    public String printData(int satir, int sutun) {
        String xpathim = "//tbody//tr["+ satir+"]//td[" +sutun+"]";
        System.out.println(xpathim);

        String istenenData= Driver.getDriver().findElement(By.xpath(xpathim)).getText();
        System.out.println("istenendata budur: "+istenenData);

        return istenenData;
    }


}
