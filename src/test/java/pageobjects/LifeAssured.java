package pageobjects;
//import helpers.Log;

import cucumber.api.Scenario;
import helpers.Log;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import step_definitions.Hooks;
import step_definitions.Reusable_Functions;

import java.io.File;
import java.io.IOException;

//public class LifeAssured extends BaseClass{

	public class LifeAssured {
	WebDriver driver = Hooks.driver;

	@FindBy(how=How.ID, using="LifeAssured_MainLifeName")
	public static WebElement Lbl_LifeAssuredProfile_MainLifeAssured_Name;

	@FindBy(how=How.ID, using="LifeAssured_MainLifeAge")
	public static WebElement Lbl_LifeAssuredProfile_MainLifeAssured_Age;

	@FindBy(how=How.ID, using="LifeAssured_Next")
	public static WebElement Btn_LifeAssuredProfile_Next;
	
	@FindBy(how=How.XPATH, using="//input[@id='pass']")
	//@FindBy(how=How.ID, using="pass")
	public static WebElement Txt_password;
	
	@FindBy(how=How.XPATH, using="//input[@value='Log In']")
	//@FindBy(how=How.ID, using="loginbutton")
	public static WebElement signin_button;
	//****************Place required to change when xpath or property changes


/*
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
	}*/

		public static void ValidateLifeAssured_Name_Age(String arg1, String arg2)
		{
			Assert.assertEquals(Lbl_LifeAssuredProfile_MainLifeAssured_Name.getText(),arg1); //Validating Name
			Assert.assertEquals(Lbl_LifeAssuredProfile_MainLifeAssured_Age.getText(),arg2); //Validating Age
		}

		public static void LifeAssuredClickNext()
		{
			Btn_LifeAssuredProfile_Next.click();
		}
	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
