package pageobjects;
//import helpers.Log;

import helpers.Log;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import step_definitions.Hooks;

import java.io.IOException;

//public class LifeAssured extends BaseClass{

public class ProductSelector {
WebDriver driver = Hooks.driver;

    @FindBy(how=How.ID, using="ProductSelector_PruShield")
    public static WebElement Lbl_ProductSelector_PruShield;

    @FindBy(how=How.ID, using="ProductSelector_PruPersonalAccident")
    public static WebElement Lbl_ProductSelector_PruPersonalAccident;

    @FindBy(how=How.ID, using="ProductSelector_PruFlexiCash")
    public static WebElement Lbl_ProductSelector_PruFlexiCash;

    @FindBy(how=How.ID, using="ProductSelector_PruWealthSGD5Yr")
    public static WebElement Lbl_ProductSelector_PruWealthSGD5Yr;

    @FindBy(how=How.ID, using="ProductSelector_PruWealthSGD10Yr")
    public static WebElement ProductSelector_PruWealthSGD10Yr;

    @FindBy(how=How.ID, using="ProductSelector_PruWealthSGD20Yr")
    public static WebElement Lbl_ProductSelector_PruWealthSGD20Yr;

    @FindBy(how=How.ID, using="ProductSelector_PruWealthUSD5Yr")
    public static WebElement Lbl_ProductSelector_PruWealthUSD5Yr;

    @FindBy(how=How.ID, using="ProductSelector_PruWealthUSD10Yr")
    public static WebElement ProductSelector_PruWealthUSD10Yr;

    @FindBy(how=How.ID, using="ProductSelector_PruLifeVantageAcheiver2_SGD")
    public static WebElement Lbl_ProductSelector_PruLifeVantageAcheiver2_SGD;

    @FindBy(how=How.ID, using="ProductSelector_PruLifeVantageAcheiver2_USD")
    public static WebElement Lbl_ProductSelector_PruLifeVantageAcheiver2_USD;

    @FindBy(how=How.ID, using="ProductSelector_PruLifeTimeIncomePremier_USD")
    public static WebElement Lbl_ProductSelector_PruLifeTimeIncomePremier_USD;

    @FindBy(how=How.ID, using="ProductSelector_PruLifeTimeIncomePremier")
    public static WebElement Lbl_ProductSelector_PruLifeTimeIncomePremier;

    @FindBy(how=How.ID, using="ProductSelector_PruAdvanceSaver")
    public static WebElement Lbl_ProductSelector_PruAdvanceSaver;

    @FindBy(how=How.ID, using="ProductSelector_PruSavemax10")
    public static WebElement Lbl_ProductSelector_PruSavemax10;

    @FindBy(how=How.ID, using="ProductSelector_PruCashSecure")
    public static WebElement Lbl_ProductSelector_PruCashSecure;

    @FindBy(how=How.ID, using="ProductSelector_PruLinkSuperGrowthAccount_Cash")
    public static WebElement Lbl_ProductSelector_PruLinkSuperGrowthAccount_Cash;

    @FindBy(how=How.ID, using="ProductSelector_SearchProduct")
    public static WebElement Txt_ProductSelector_ProductSelector_SearchProduct;

    @FindBy(how=How.ID, using="ProductSelector_PruFlexiCash_SelectPlan")
    public static WebElement Btn_ProductSelector_PruFlexiCash_SelectPlan;


    public static void ValidateProduct_Names()
    {
        Assert.assertTrue(Lbl_ProductSelector_PruShield.isDisplayed());
        Assert.assertTrue(Lbl_ProductSelector_PruPersonalAccident.isDisplayed());
        Assert.assertTrue(Lbl_ProductSelector_PruFlexiCash.isDisplayed());
        Assert.assertTrue(Lbl_ProductSelector_PruWealthSGD5Yr.isDisplayed());
        Assert.assertTrue(ProductSelector_PruWealthSGD10Yr.isDisplayed());
        Assert.assertTrue(Lbl_ProductSelector_PruWealthSGD20Yr.isDisplayed());
        Assert.assertTrue(Lbl_ProductSelector_PruWealthUSD5Yr.isDisplayed());
        Assert.assertTrue(ProductSelector_PruWealthUSD10Yr.isDisplayed());
        Assert.assertTrue(Lbl_ProductSelector_PruLifeVantageAcheiver2_SGD.isDisplayed());
        Assert.assertTrue(Lbl_ProductSelector_PruLifeVantageAcheiver2_USD.isDisplayed());
        Assert.assertTrue(Lbl_ProductSelector_PruLifeTimeIncomePremier_USD.isDisplayed());
        Assert.assertTrue(Lbl_ProductSelector_PruLifeTimeIncomePremier.isDisplayed());
        Assert.assertTrue(Lbl_ProductSelector_PruAdvanceSaver.isDisplayed());
        Assert.assertTrue(Lbl_ProductSelector_PruSavemax10.isDisplayed());
        Assert.assertTrue(Lbl_ProductSelector_PruCashSecure.isDisplayed());
        Assert.assertTrue(Lbl_ProductSelector_PruLinkSuperGrowthAccount_Cash.isDisplayed());


    }

    public static void SelectPruFlexiCash() {
        Txt_ProductSelector_ProductSelector_SearchProduct.click();
        Txt_ProductSelector_ProductSelector_SearchProduct.sendKeys("PruFlexiCash");
        Btn_ProductSelector_PruFlexiCash_SelectPlan.click();


    }
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
