package pages.hakanPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_024 {

    public US_024() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//a[@href='https://qa.trendlifebuy.com/login'])[1]")
    public WebElement login;

    @FindBy (xpath = "//input[@name='login']")
    public WebElement emailAdress;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy (xpath = "//button[@class='amaz_primary_btn style2 radius_5px  w-100 text-uppercase  text-center mb_25']")
    public WebElement signIn;

    @FindBy (xpath = "//a[@href='https://qa.trendlifebuy.com/profile/dashboard']")
    public WebElement dashboard;

    @FindBy (xpath = "(//a[@class='position-relative d-flex align-items-center'])[10]")
    public WebElement notification;



}
