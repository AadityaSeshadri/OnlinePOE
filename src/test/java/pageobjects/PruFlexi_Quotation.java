package pageobjects;
//import helpers.Log;

import helpers.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import step_definitions.Hooks;

import java.io.IOException;

//public class LifeAssured extends BaseClass{

public class PruFlexi_Quotation {
WebDriver driver = Hooks.driver;

@FindBy(how=How.XPATH, using="//input[@id='email']")
public static WebElement Txt_User_Name;

@FindBy(how=How.XPATH, using="//input[@id='pass']")
//@FindBy(how=How.ID, using="pass")
public static WebElement Txt_password;

@FindBy(how=How.XPATH, using="//input[@value='Log In']")
//@FindBy(how=How.ID, using="loginbutton")
public static WebElement signin_button;
//****************Place required to change when xpath or property changes



public static void Enter_Username(String UName) throws IOException {
    //Scenario scenario;
    System.out.println("Inside Enter Username"+ UName);
    Log.info("Logged Entered Usernamer in Login Page");
    Txt_User_Name.clear();
    Txt_User_Name.sendKeys(UName);

}

public static void Enter_Password(String Password)
{
    System.out.println("Inside Enter Password"+ Password);
    Txt_password.clear();
    Txt_password.sendKeys(Password);

    Log.info("Password Entered" + Password);
}

public static void Click_Signin()
{
    signin_button.click();
}
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
