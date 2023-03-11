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

    @FindBy (xpath = "(//span[@class='font_14 f_w_500 mute_text'])[2]")
    public WebElement title;

    @FindBy (xpath = "(//span[@class='font_14 f_w_500 mute_text'])[3]")
    public WebElement date;

    @FindBy (xpath = "//a[@class='amaz_badge_btn4 text-nowrap text-capitalize text-center']")
    public WebElement view;

    @FindBy (xpath = "//a[@class='amaz_primary_btn style7 text-nowrap radius_3px']")
    public WebElement setting;

    @FindBy (xpath = "(//span[@class='checkmark mr_15'])[1]")
    public WebElement offlineRecharge;

    @FindBy (xpath = "(//span[@class='checkmark mr_15'])[2]")
    public WebElement orderConfirmation;

    @FindBy (xpath = "(//span[@class='checkmark mr_15'])[3]")
    public WebElement ordered;

    @FindBy (xpath = "(//span[@class='checkmark mr_15'])[4]")
    public WebElement ordered1;

    @FindBy (xpath = "(//span[@class='checkmark mr_15'])[5]")
    public WebElement processing;

    @FindBy (xpath = "(//span[@class='checkmark mr_15'])[6]")
    public WebElement processing1;

    @FindBy (xpath = "(//span[@class='checkmark mr_15'])[7]")
    public WebElement shipped;

    @FindBy (xpath = "(//span[@class='checkmark mr_15'])[8]")
    public WebElement shipped1;

    @FindBy (xpath = "(//span[@class='checkmark mr_15'])[9]")
    public WebElement recieved;

    @FindBy (xpath = "(//span[@class='checkmark mr_15'])[10]")
    public WebElement recieved1;

    @FindBy (xpath = "(//span[@class='checkmark mr_15'])[11]")
    public WebElement delivered;

    @FindBy (xpath = "(//span[@class='checkmark mr_15'])[12]")
    public WebElement delivered1;

    @FindBy (xpath = "(//span[@class='checkmark mr_15'])[13]")
    public WebElement newOrder;




}
