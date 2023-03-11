package stepdefinitions.hakanStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.hakanPage.US_024;
import utilities.ConfigReader;
import utilities.Driver;

public class US_024_TC_001 {

    US_024 us_024=new US_024();
    @Given("Kullanici trendlifebuy sayfasina gider")
    public void kullanici_trendlifebuy_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
    }
    @Then("Login butonunu tiklar")
    public void login_butonunu_tiklar() {
        us_024.login.click();
    }
    @Then("Email adresini yazar")
    public void email_adresini_yazar() {
        us_024.emailAdress.sendKeys("user026@trendlifebuy.com");
    }
    @Then("Password yazar")
    public void password_yazar() {
        us_024.password.sendKeys("Trendlife123");
    }
    @Then("Sign in butonunu tiklar")
    public void sign_in_butonunu_tiklar() {
        us_024.signIn.click();
    }

    @Then("Dashboard butonu tiklanir")
    public void dashboard_butonu_tiklanir() {
        us_024.dashboard.click();
    }
    @Then("Notification butonu tiklanir")
    public void notification_butonu_tiklanir() {
        us_024.notification.click();
    }
    @Then("Notifications yazisinin gorundugu dogrulanir")
    public void notifications_yazisinin_gorundugu_dogrulanir() {
        String expectedKelime = "Notifications";
        String actualKelime = Driver.getDriver().findElement(By.xpath("//h4[@class='font_24 f_w_700 flex-fill m-0']")).getText();
        Assert.assertEquals(actualKelime, expectedKelime);
    }
    @And("Sayfayi kapatir")
    public void sayfayi_Kapatir() {
        Driver.closeDriver();
    }
}
