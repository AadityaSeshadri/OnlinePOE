package pageobjects;
//import helpers.Log;

import helpers.Log;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_definitions.Hooks;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
//import org.apache.pdfbox.util.PDFTextStripper;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

//public class LifeAssured extends BaseClass{

public class ProductSelector {
    public WebDriver driver;
    public WebDriverWait wait;


    public ProductSelector()
    {
        driver = Hooks.driver;
        wait = Hooks.wait;
        PageFactory.initElements(driver,this);

    }

    @FindBy(how=How.ID, using="ProductSelector_PruShield")
    public  WebElement Lnk_ProductSelector_PruShield;

    @FindBy(how=How.ID, using="ProductSelector_PruShield Extra")
    public  WebElement Lnk_ProductSelector_PruShield_Extra;

    @FindBy(how=How.ID, using="ProductSelector_PruShield Extra Lite")
    public  WebElement Lnk_ProductSelector_PruShield_Extra_Lite;


    @FindBy(how=How.ID, using="ProductSelector_PruPersonalAccident")
    public  WebElement Lnk_ProductSelector_PruPersonalAccident;

    @FindBy(how=How.XPATH, using="//div[@id='ProductSelector_PruFlexiCash']")
    public  WebElement Lnk_ProductSelector_PruFlexiCash;

    @FindBy(how=How.ID, using="ProductSelector_PruWealthSGD5Yr")
    public  WebElement Lnk_ProductSelector_PruWealthSGD5Yr;

    @FindBy(how=How.ID, using="ProductSelector_PruWealthSGD10Yr")
    public  WebElement ProductSelector_PruWealthSGD10Yr;

    @FindBy(how=How.ID, using="ProductSelector_PruWealthSGD20Yr")
    public  WebElement Lnk_ProductSelector_PruWealthSGD20Yr;

    @FindBy(how=How.ID, using="ProductSelector_PruWealthUSD5Yr")
    public  WebElement Lnk_ProductSelector_PruWealthUSD5Yr;

    @FindBy(how=How.ID, using="ProductSelector_PruWealthUSD10Yr")
    public  WebElement ProductSelector_PruWealthUSD10Yr;

    @FindBy(how=How.ID, using="ProductSelector_PruLifeVantageAcheiver2_SGD")
    public  WebElement Lnk_ProductSelector_PruLifeVantageAcheiver2_SGD;

    @FindBy(how=How.ID, using="ProductSelector_PruLifeVantageAcheiver2_USD")
    public  WebElement Lnk_ProductSelector_PruLifeVantageAcheiver2_USD;

    @FindBy(how=How.ID, using="ProductSelector_PruLifeTimeIncomePremier_USD")
    public  WebElement Lnk_ProductSelector_PruLifeTimeIncomePremier_USD;

    @FindBy(how=How.ID, using="ProductSelector_PruLifeTimeIncomePremier")
    public  WebElement Lnk_ProductSelector_PruLifeTimeIncomePremier;

    @FindBy(how=How.ID, using="ProductSelector_PruAdvanceSaver")
    public  WebElement Lnk_ProductSelector_PruAdvanceSaver;

    @FindBy(how=How.ID, using="ProductSelector_PruSavemax10")
    public  WebElement Lnk_ProductSelector_PruSavemax10;

    @FindBy(how=How.ID, using="ProductSelector_PruCashSecure")
    public  WebElement Lnk_ProductSelector_PruCashSecure;

    @FindBy(how=How.ID, using="ProductSelector_PruLinkSuperGrowthAccount_Cash")
    public  WebElement Lnk_ProductSelector_PruLinkSuperGrowthAccount_Cash;

    @FindBy(how=How.ID, using="ProductSelector_SearchProduct")
    public  WebElement Txt_ProductSelector_ProductSelector_SearchProduct;

    @FindBy(how=How.ID, using="ProductSelector_PruFlexiCash_SelectPlan")
    public  WebElement Btn_ProductSelector_PruFlexiCash_SelectPlan;

    @FindBy(how=How.XPATH, using="//p[contains(text(),'PLANS')]")
    public  WebElement Lbl_Plans;


    public void ValidateProduct_Names() throws InterruptedException {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(),'PLANS')]")));
        Thread.sleep(5000);
        //System.out.println("Yes");
       // Thread.sleep(10000);
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,1900)");
       // Actions performAct = new Actions(driver);
       // performAct.moveToElement(Lnk_ProductSelector_PruFlexiCash);
       /* Assert.assertTrue(Lnk_ProductSelector_PruShield.isDisplayed());
        Assert.assertTrue(Lnk_ProductSelector_PruPersonalAccident.isDisplayed());*/

        Assert.assertTrue(Lnk_ProductSelector_PruFlexiCash.isDisplayed());
       /* Assert.assertTrue(Lnk_ProductSelector_PruWealthSGD5Yr.isDisplayed());
        Assert.assertTrue(ProductSelector_PruWealthSGD10Yr.isDisplayed());
        Assert.assertTrue(Lnk_ProductSelector_PruWealthSGD20Yr.isDisplayed());
        Assert.assertTrue(Lnk_ProductSelector_PruWealthUSD5Yr.isDisplayed());
        Assert.assertTrue(ProductSelector_PruWealthUSD10Yr.isDisplayed());
        Assert.assertTrue(Lnk_ProductSelector_PruLifeVantageAcheiver2_SGD.isDisplayed());
        Assert.assertTrue(Lnk_ProductSelector_PruLifeVantageAcheiver2_USD.isDisplayed());
        Assert.assertTrue(Lnk_ProductSelector_PruLifeTimeIncomePremier_USD.isDisplayed());
        Assert.assertTrue(Lnk_ProductSelector_PruLifeTimeIncomePremier.isDisplayed());
        Assert.assertTrue(Lnk_ProductSelector_PruAdvanceSaver.isDisplayed());
        Assert.assertTrue(Lnk_ProductSelector_PruSavemax10.isDisplayed());
        Assert.assertTrue(Lnk_ProductSelector_PruCashSecure.isDisplayed());
        Assert.assertTrue(Lnk_ProductSelector_PruLinkSuperGrowthAccount_Cash.isDisplayed());*/


    }

    public void SelectPruFlexiCash() {
        System.out.println("SelectPruFlexiCash");
       /* Txt_ProductSelector_ProductSelector_SearchProduct.click();
        Txt_ProductSelector_ProductSelector_SearchProduct.sendKeys("PruFlexiCash");
        Btn_ProductSelector_PruFlexiCash_SelectPlan.click();*/
        Lnk_ProductSelector_PruFlexiCash.click();

    }

    public void Navigate_BenefitDetails() throws InterruptedException {
        Thread.sleep(4000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='Recovery Aid Benefit']")));
    }


    public void ValidateBI() throws IOException, InterruptedException, AWTException {

        ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(0));
        driver.switchTo().window(windowHandles.get(1));

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Thread.sleep(20000);
        java.awt.Robot robot = new java.awt.Robot();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);   // file replace move to yes button
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER); // hit enter

        /*PDDocument pdDoc = PDDocument.load(new File("C:\\Users\\Aaditya Seshadri\\Downloads\\receipt-akn4l7pk.pdf"));
        PDFTextStripper pdfStripper = new PDFTextStripper();
       // pdDoc.getNumberOfPages();
        //pdfStripper.setStartPage(1);
       // pdfStripper.setEndPage(10);
        pdfStripper.setEndPage(pdDoc.getNumberOfPages());
        String Text = pdfStripper.getText(pdDoc);
        System.out.println("Text"+ Text);*/


    }
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
