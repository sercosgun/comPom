package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class DriverKullanarak {
    @Test

    public void testdriverile(){
        Driver.getDriver().get(ConfigReader.getProperty("VatanUrl"));

    Driver.closedriver();
    }


}
