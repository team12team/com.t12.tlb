package stepdefinitions.hakanStepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.hakanPage.US_024;
import utilities.Driver;

public class US_024_TC_003 {

    US_024 us_024= new US_024();

    @Then("Title ve Date yazisinin bilgilerinin listelendigi dogrulanmalidir")
    public void title_ve_date_yazisinin_bilgilerinin_listelendigi_dogrulanmalidir() {
        Assert.assertTrue(us_024.title.isDisplayed());
        Assert.assertTrue(us_024.date.isDisplayed());
    }
}
