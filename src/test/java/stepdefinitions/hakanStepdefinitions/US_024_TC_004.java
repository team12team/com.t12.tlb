package stepdefinitions.hakanStepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.hakanPage.US_024;
import utilities.Driver;

public class US_024_TC_004 {

    US_024 us_024 = new US_024();

    @Then("View sekmesi tiklanir")
    public void view_sekmesi_tiklanir() {
        us_024.view.click();
    }
    @Then("İlgili sayfaya gittigi dogrulanir")
    public void ilgili_sayfaya_gittigi_dogrulanir() {
        String expectedKelime = "+ DOWNLOAD INVOICE";
        String actualKelime = Driver.getDriver().findElement(By.xpath("//a[@class='amaz_primary_btn gray_bg_btn min_200 radius_3px mb_5']")).getText();
        Assert.assertEquals(actualKelime, expectedKelime);
    }
}
