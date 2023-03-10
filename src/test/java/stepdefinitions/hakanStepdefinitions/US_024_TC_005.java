package stepdefinitions.hakanStepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.hakanPage.US_024;
import utilities.Driver;

public class US_024_TC_005 {

    US_024 us_024 = new US_024();

    @Then("Settings sekmesinin bulundugu dogrulanir")
    public void settings_sekmesinin_bulundugu_dogrulanir() {
        Assert.assertTrue(us_024.setting.isDisplayed());
    }
}
