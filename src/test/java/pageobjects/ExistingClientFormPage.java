package pageobjects;
//import helpers.Log;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_definitions.Hooks;
import step_definitions.Reusable_Functions;

//public class LifeAssured extends BaseClass{

public class ExistingClientFormPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public ExistingClientFormPage()
    {
        driver = Hooks.driver;
        wait = Hooks.wait;
        PageFactory.initElements(driver,this);

    }




    @FindBy(how=How.XPATH, using="//input[@placeholder='Search for a client...']")
    public  WebElement Txt_SearchClient;





    public void SearchClientbyName(String arg1) {
       // Actions performAct = new Actions(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Search for a client...']")));
        Reusable_Functions.EnterTextBox(driver,Txt_SearchClient,arg1.trim());
        String Dynamic_Xpath = "//div[contains(text(), '"+arg1+"')]";
        driver.findElement(By.xpath(Dynamic_Xpath)).click();





        



    }
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
