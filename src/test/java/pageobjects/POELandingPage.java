package pageobjects;
//import helpers.Log;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_definitions.Hooks;
import step_definitions.Reusable_Functions;

//public class LifeAssured extends BaseClass{

public class POELandingPage {
    public WebDriver driver;
    public WebDriverWait wait;


public POELandingPage()
{
    driver = Hooks.driver;
    wait = Hooks.wait;
    PageFactory.initElements(driver,this);

}

    @FindBy(how=How.XPATH, using="//span[contains(text(), 'Prudential')]")
    public  WebElement Lbl_POELandingPage_Header;

    @FindBy(how=How.XPATH, using="//div[contains(text(), 'New Proposal')]")
    public  WebElement Lnk_NewProposal;

    @FindBy(how=How.XPATH, using="//div[contains(text(), 'Transactions')]")
    public  WebElement Lnk_Transactions;

    @FindBy(how=How.XPATH, using="//div[contains(text(), 'Opportunity')]")
    public  WebElement Lnk_Oppurtunity;

    @FindBy(how=How.XPATH, using="//div[contains(text(), 'Settings')]")
    public  WebElement Lnk_Settings;

    @FindBy(how=How.XPATH, using="//span[contains(text(),'Let')]")
    public  WebElement Lbl_SubHeading;

    @FindBy(how=How.XPATH, using="//Span[contains(text(), 'New Client')]")
    public  WebElement Lnk_NewClient;


    @FindBy(how=How.XPATH, using="//Span[contains(text(), 'Existing Client')]")
    public  WebElement Lnk_ExistringClient;



    @FindBy(how=How.ID, using="BenefitDetails_Currency")
    public  WebElement Lbl_BenefitDetails_Currency;


    public  void ValidateELements_LandingPage() {
        System.out.println("ValidateELements");

        //System.out.println("HeaderText" + Lbl_POELandingPage_Header.getText());
        //Assert.assertTrue(Lbl_POELandingPage_Header.getText().contains("Prudential"));
       // System.out.println("Header Color" + Lbl_POELandingPage_Header.getCssValue("color"));
        //System.out.println("Header Font" + Lbl_POELandingPage_Header.getCssValue("font-family"));
        Lnk_NewProposal.isDisplayed();
        Lnk_Transactions.isDisplayed();
        Lnk_Oppurtunity.isDisplayed();
        Lnk_Settings.isDisplayed();

    }

    public  void clickNewProposal() {
        Lnk_NewProposal.click();

 }

    public  void SelectNewClient() {
        Lnk_NewClient.click();
    }

    public void ValidateELements_New_ExistingClient() {
        Assert.assertTrue(Lbl_SubHeading.getText().contains("Let's get started! What kind of client is this?"));
        Assert.assertTrue(Lnk_NewClient.isDisplayed());
        Assert.assertTrue(Lnk_ExistringClient.isDisplayed());
        Assert.assertTrue(Lnk_NewClient.getText().contains("New Client"));
        Assert.assertTrue(Lnk_ExistringClient.getText().contains("Existing Client"));
    }
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
