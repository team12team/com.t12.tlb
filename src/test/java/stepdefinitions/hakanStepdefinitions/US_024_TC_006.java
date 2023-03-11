package stepdefinitions.hakanStepdefinitions;

import io.cucumber.java.en.Then;
import pages.hakanPage.US_024;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_024_TC_006 {

    US_024 us_024 = new US_024();

    @Then("Setting butonu tiklanir")
    public void setting_butonu_tiklanir() {
        us_024.setting.click();
    }
    @Then("Type kısmındaki butonlar kaldirilir")
    public void type_kismindaki_butonlar_kaldirilir() {
        us_024.offlineRecharge.click();
        ReusableMethods.bekle(2);
        us_024.orderConfirmation.click();
        ReusableMethods.bekle(2);
        us_024.ordered.click();
        ReusableMethods.bekle(2);
        us_024.ordered1.click();
        ReusableMethods.bekle(2);
        us_024.processing.click();
        ReusableMethods.bekle(2);
        us_024.processing1.click();
        ReusableMethods.bekle(2);
        us_024.shipped.click();
        ReusableMethods.bekle(2);
        us_024.shipped1.click();
        ReusableMethods.bekle(2);
        us_024.recieved.click();
        ReusableMethods.bekle(2);
        us_024.recieved1.click();
        ReusableMethods.bekle(2);
        us_024.delivered.click();
        ReusableMethods.bekle(2);
        us_024.delivered1.click();
        ReusableMethods.bekle(2);
        us_024.newOrder.click();
    }
    @Then("Success yazisinin ciktigi dogrulanir")
    public void success_yazisinin_ciktigi_dogrulanir() {

    }


}
