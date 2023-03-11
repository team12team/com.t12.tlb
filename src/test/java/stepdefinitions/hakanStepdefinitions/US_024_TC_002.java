package stepdefinitions.hakanStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.hakanPage.US_024;
import utilities.ConfigReader;
import utilities.Driver;

public class US_024_TC_002 {

    US_024 us_024=new US_024();

    @Then("Siteden gonderilen bildirimlerin goruntulendigi dogrulanır")
    public void siteden_gonderilen_bildirimlerin_goruntulendigi_dogrulanır() {
        String expectedKelime = "View";
        String actualKelime = Driver.getDriver().findElement(By.xpath("//a[@class='amaz_badge_btn4 text-nowrap text-capitalize text-center']")).getText();
        Assert.assertEquals(actualKelime, expectedKelime);
    }


}
