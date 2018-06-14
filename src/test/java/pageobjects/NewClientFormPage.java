package pageobjects;
//import helpers.Log;

import cucumber.api.java.en.Then;
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

public class NewClientFormPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public NewClientFormPage()
    {
        driver = Hooks.driver;
        wait = Hooks.wait;
        PageFactory.initElements(driver,this);

    }


    @FindBy(how=How.XPATH, using="//Span[contains(text(), 'New Client Form Page')]")
    public  WebElement Lbl_NewClientFormPageHeader;

    @FindBy(how=How.XPATH, using="//input[@value='Next']")
    public  WebElement Btn_NewClient_Next;

    @FindBy(how=How.XPATH, using="//input[@value='Save']")
    public  WebElement Btn_NewClient_Save;



    @FindBy(how=How.XPATH, using="//div[contains(text(),'Surname')]/following-sibling::span")
    public  WebElement Lbl_Surname_MandatoryText;

    @FindBy(how=How.XPATH, using="//input[@type='date']/following-sibling::span")
    public  WebElement Lbl_Date_MandatoryText;
//****Basics Info

    @FindBy(how=How.XPATH, using="//div[contains(text(),'BASICS')]")
    public  WebElement Acc_Basics;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Title')]")
    public  WebElement Drp_Title;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Christian Name')]")
    public  WebElement Txt_ChristianName;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Given Name')]")
    public  WebElement Txt_GivenName;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Surname')]")
    public  WebElement Txt_Surname;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Marital Status')]")
    public  WebElement Drp_MaritalStatus;

    @FindBy(how=How.XPATH, using="//input[@type='date']")
    public  WebElement Date_DOB;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Nationality')]")
    public  WebElement Drp_Nationality;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'NRIC')]")
    public  WebElement Txt_NRICPassport;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Male')]")
    public  WebElement Rbtn_Gender_Male;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Female')]")
    public  WebElement Rbtn_Gender_FeMale;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Smoker')]//following-sibling::div[1]/div[@value='smokerYesRadio']")
    public  WebElement Rbtn_Smoker_yes;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Smoker')]//following-sibling::div[1]/div[@value='smokerNoRadio']")
    public  WebElement Rbtn_Smoker_No;

    //*****Basics Info


    //*****Contact Info
    @FindBy(how=How.XPATH, using="//div[contains(text(),'CONTACT')]")
    public  WebElement Acc_Contact;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Home Phone')]//parent::div//parent::div//parent::div/div/div")
    public  WebElement Drp_HomePhoneCountryCode;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Home Phone')]")
    public  WebElement Txt_HomePhone;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Office Phone')]//parent::div//parent::div//parent::div/div/div")
    public  WebElement Drp_OfficePhoneCountryCode;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Office Phone')]")
    public  WebElement Txt_OfficePhone;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Mobile Phone')]//parent::div//parent::div//parent::div/div/div")
    public  WebElement Drp_MobilePhoneCountryCode;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Mobile Phone')]")
    public  WebElement Txt_MobilePhone;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Email')]")
    public  WebElement Txt_Email;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Postal Code')]")
    public  WebElement Txt_PostalCode;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Block')]")
    public  WebElement Txt_Block;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Street')]")
    public  WebElement Txt_Street;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Building')]")
    public  WebElement Txt_Building;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Floor or Unit')]")
    public  WebElement Txt_FloorUnit;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'City')]")
    public  WebElement Txt_City;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'State')]")
    public  WebElement Txt_State;

    @FindBy(how=How.XPATH, using="//div[text()='Country']")
    public  WebElement Drp_Country;

    //*****Contact Info

    //*****Education Occupation Info
    @FindBy(how=How.XPATH, using="//div[contains(text(),'EDUCATION & OCCUPATION')]")
    public  WebElement Acc_EducationOccupation;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Profiency in written and spoken English')]//following-sibling::div/div[@value='englishYesRadio']")
    public  WebElement Rbtn_EnglishProficiency_Yes;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Profiency in written and spoken English')]//following-sibling::div/div[@value='englishNoRadio']")
    public  WebElement Rbtn_EnglishProficiency_No;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Education')]")
    public  WebElement Drp_Education;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Occupation')]")
    public  WebElement Drp_Occupation;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Others')]")
    public  WebElement Txt_Others;



    //*****Education Occupation Info

    //***** Others Info

    @FindBy(how=How.XPATH, using="//div[contains(text(),'OTHERS')]")
    public  WebElement Acc_Others;


    @FindBy(how=How.XPATH, using="//div[contains(text(),'Did you fully disclose')]//following-sibling::div/div[@value='discloseInfoYes']")
    public  WebElement Rbtn_Disclose_Yes;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Did you fully disclose')]//following-sibling::div/div[@value='discloseInfoNo']")
    public  WebElement Rbtn_Disclose_No;



    //***** Others Info

    //***********Extra Info in editing CLient Premium BackDate,Residency,Impaired Life

    //@FindBy(how=How.XPATH, using="//div[@name='mainLifeAccordion']")
    @FindBy(how=How.XPATH, using="//div[@id='LifeAssured_MainLifeName']")
    //id=LifeAssured_MainLifeName
    public  WebElement Acc_MainLifeAssured;


    @FindBy(how=How.XPATH, using="//div[contains(text(),'Premium Backdate')]//following-sibling::div[1]/div[@value='true']")
    public  WebElement Rbtn_PremiumBackDate_Yes;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Premium Backdate')]//following-sibling::div[1]/div[@value='false']")
    public  WebElement Rbtn_PremiumBackDate_NO;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Residency *')]")
    public  WebElement Drp_Residency;
////div[contains(text(),'IMPAIRED LIFE')]//following-sibling::div[1]/div[@value='true']
    @FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div/div[6]/div[2]/div/div[2]/div[1]")
    public  WebElement Rbtn_ImpairedLife_yes;

    @FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div/div[6]/div[2]/div/div[2]/div[2]")
    public  WebElement Rbtn_ImpairedLife_No;

    @FindBy(how=How.XPATH, using="//input[@value='Save']")
    public  WebElement Btn_Save;


    @FindBy(how=How.XPATH, using="//input[@value='NEXT']")
    public  WebElement Btn_Next;

    @FindBy(how=How.XPATH, using="//input[@value='Next']")
    public  WebElement Btn_Next_BeforeSaveCLient;

    //***********Extra Info in editing CLient Premium BackDate,Residency,Impaired Life





    @FindBy(how=How.XPATH, using="//span[contains(text(),'Main Life Assured')]")
    public  WebElement Lbl_MainLifeAssured;





    @FindBy(how=How.XPATH, using="//div[contains(text(),'AGE NEXT BIRTHDAY')]")
    public  WebElement Lbl_ANB;

    @FindBy(how=How.XPATH, using="//div[contains(text(),'AGE NEXT BIRTHDAY')]//parent::div//descendant::div[1]")
    public  WebElement Lbl_ANB_Value;












    @FindBy(how=How.XPATH, using="//span[contains(text(),'Existing Client')]")
    public  WebElement Lnk_ExistingClient;





    public  void SaveClientInfo() throws InterruptedException {
        Acc_Basics.click();
        Btn_NewClient_Next.click();
        Thread.sleep(3000);
       //Has to be commented when Defect 42 is fixed
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Surname')]/following-sibling::span")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='date']/following-sibling::span")));

    }

    public  void MandartoryFieldCheck() throws InterruptedException {
       // WebDriverWait wait = new WebDriverWait(driver,25);
       Assert.assertTrue(Lbl_Surname_MandatoryText.isDisplayed());
        Assert.assertTrue(Lbl_Surname_MandatoryText.getText().contains("This field is mandatory"));
        Assert.assertTrue(Lbl_Date_MandatoryText.isDisplayed());
        Assert.assertTrue(Lbl_Date_MandatoryText.getText().contains("This field is mandatory"));





    }

    public void     Enter_Client_Basic_Info(String title, String christianName, String givenName, String surname, String maritalStatus, String dob, String nationality, String NRICPassport, String Gender, String Smoker_value) throws InterruptedException {
        //Actions performAct = new Actions(driver);
        Acc_Basics.click();

        Reusable_Functions.EnterDropDown(driver,Drp_Title,"Title",title,wait);
        //System.out.println("After DropDown Select");
        Reusable_Functions.EnterTextBox(driver,Txt_ChristianName,christianName);
        Reusable_Functions.EnterTextBox(driver,Txt_GivenName,givenName);
        Reusable_Functions.EnterTextBox(driver,Txt_Surname,surname);
        Reusable_Functions.EnterDropDown(driver,Drp_MaritalStatus,"Marital Status",maritalStatus,wait);
        Reusable_Functions.EnterTextBox(driver,Date_DOB,dob);
        Reusable_Functions.EnterDropDown(driver,Drp_Nationality,"Nationality",nationality,wait);
        Reusable_Functions.EnterTextBox(driver,Txt_NRICPassport,NRICPassport);
        if (Gender.equals("M"))
        {
            Reusable_Functions.ClickRadioButton(driver,Rbtn_Gender_Male);
        }
        else
        {
            Reusable_Functions.ClickRadioButton(driver,Rbtn_Gender_FeMale);
        }
        if (Smoker_value.equals("Yes"))
        {
            Reusable_Functions.ClickRadioButton(driver,Rbtn_Smoker_yes);

        }
        else
        {
            Reusable_Functions.ClickRadioButton(driver,Rbtn_Smoker_No);
        }
    }

    public void Enter_Client_Contact_Info(String homePhoneCountryCode, String homePhone, String officePhoneCountryCode, String officePhone, String mobilePhoneCountryCode, String mobilePhone, String email, String postalCode, String block, String street, String building, String floorUnit, String city, String state, String country) throws InterruptedException {
        Acc_Contact.click();

        Actions performAct = new Actions(driver);
        performAct.sendKeys(Drp_HomePhoneCountryCode, homePhoneCountryCode).build().perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Home Phone')]//parent::div//parent::div//parent::div/div/div/div[4]")));
        //Thread.sleep(500);
        driver.findElement(By.xpath("//div[contains(text(),'Singapore (65)')]")).click();


        //Reusable_Functions.EnterDropDown(driver,Drp_HomePhoneCountryCode,"Home Phone",homePhoneCountryCode,wait);
        Reusable_Functions.EnterTextBox(driver,Txt_HomePhone,homePhone.trim());



        performAct.sendKeys(Drp_OfficePhoneCountryCode, officePhoneCountryCode).build().perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Office Phone')]//parent::div//parent::div//parent::div/div/div/div[4]")));
        //Thread.sleep(500);
        driver.findElement(By.xpath("//div[contains(text(),'Singapore (65)')]")).click();
        //Reusable_Functions.EnterDropDown(driver,Drp_OfficePhoneCountryCode,"Office Phone",officePhoneCountryCode,wait);
        Reusable_Functions.EnterTextBox(driver,Txt_OfficePhone,officePhone);


        performAct.sendKeys(Drp_MobilePhoneCountryCode, mobilePhoneCountryCode).build().perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Mobile Phone')]//parent::div//parent::div//parent::div/div/div/div[4]")));
        //Thread.sleep(500);
        driver.findElement(By.xpath("//div[contains(text(),'Singapore (65)')]")).click();

        //Reusable_Functions.EnterDropDown(driver,Drp_MobilePhoneCountryCode,"Mobile Phone",mobilePhoneCountryCode,wait);
        Reusable_Functions.EnterTextBox(driver,Txt_MobilePhone,mobilePhone);


        Reusable_Functions.EnterTextBox(driver,Txt_Email,email.trim());

        Reusable_Functions.EnterTextBox(driver,Txt_PostalCode,postalCode.trim());

        Reusable_Functions.EnterTextBox(driver,Txt_Block,block.trim());

        Reusable_Functions.EnterTextBox(driver,Txt_Street,street.trim());

        Reusable_Functions.EnterTextBox(driver,Txt_Building,building.trim());

        Reusable_Functions.EnterTextBox(driver,Txt_FloorUnit,floorUnit.trim());

        Reusable_Functions.EnterTextBox(driver,Txt_City,city.trim());

        Reusable_Functions.EnterTextBox(driver,Txt_State,state.trim());

        Reusable_Functions.EnterDropDown(driver,Drp_Country,"Country",country,wait);



    }

    public void Enter_Client_EducationOccupation_Info(String englishProficiency, String education, String occupation, String others) throws InterruptedException {
        Acc_EducationOccupation.click();
        if (englishProficiency.equals("Yes"))
        {
            Reusable_Functions.ClickRadioButton(driver,Rbtn_EnglishProficiency_Yes);
        }
        else
        {
            Reusable_Functions.ClickRadioButton(driver,Rbtn_EnglishProficiency_No);
        }
        Reusable_Functions.EnterDropDown(driver,Drp_Education,"Education",education,wait);

        Reusable_Functions.EnterDropDown(driver,Drp_Occupation,"Occupation",occupation,wait);

        Reusable_Functions.EnterTextBox(driver,Txt_Others,others.trim());


    }

    public void Enter_Client_Others_Info(String needAnalysisRecommendation) {
        Acc_Others.click();
        if (needAnalysisRecommendation.equals("Yes"))
        {
            Rbtn_Disclose_Yes.click();
        }
        else
        {
            Rbtn_Disclose_No.click();
        }
        Acc_Others.click();
    }

    public void ValidateLifeAssuredProfileSQS(String Surname) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='LifeAssured_MainLifeName']")));
        Assert.assertTrue(Lbl_MainLifeAssured.getText().contains("Main Life Assured"));
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='LifeAssured_MainLifeName']")).getText().contains(Surname));
    }


   /* public void enter_PremiumBackDate(String arg1) {

        if (arg1.equals("Yes"))
        {
            Rbtn_PremiumBackDate_Yes.click();
        }
        else
        {
            Rbtn_PremiumBackDate_NO.click();
        }


    }

    public void enter_ChristianName(String arg1) {
        Actions performAct = new Actions(driver);
        Assert.assertTrue(Txt_ChristianName.isDisplayed());
        performAct.sendKeys(Txt_ChristianName, arg1).build().perform();
        //Assert.assertTrue(Txt_ChristianName.getText().contains(arg1));



    }

    public void enter_GivenName(String arg1) {
        Actions performAct = new Actions(driver);
        Assert.assertTrue(Txt_GivenName.isDisplayed());
        performAct.sendKeys(Txt_GivenName, arg1).build().perform();
        //Assert.assertTrue(Txt_GivenName.getText().contains(arg1));
    }

    public void validate_ANB(String arg1) {
        Assert.assertTrue(Lbl_ANB.isDisplayed());
        Assert.assertTrue(Lbl_ANB.getText().contains("AGE NEXT BIRTHDAY"));
        Assert.assertTrue(Lbl_ANB_Value.isDisplayed());
        //Assert.assertTrue(Lbl_ANB_Value.getText().contains(arg1));




    }

    public void enter_Nationality(String arg1) throws InterruptedException {
        Actions performAct = new Actions(driver);
        performAct.sendKeys(Drp_Nationality, arg1).build().perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Nationality')]//following-sibling::div[3]")));
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[contains(text(),'Singaporean')]")).click();

    }

    public void enter_Residency(String arg1) throws InterruptedException {

        Actions performAct = new Actions(driver);
        performAct.sendKeys(Drp_Residency, arg1).build().perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Residency')]//following-sibling::div[3]")));
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[contains(text(),'Singapore')]")).click();
    }

    public void enter_Occupation(String arg1) throws InterruptedException {
        Actions performAct = new Actions(driver);
        performAct.sendKeys(Drp_Occupation, arg1).build().perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Occupation')]//following-sibling::div[3]")));
        Thread.sleep(500);
        String Dynamic_Xpath = "//div[contains(text(), '"+arg1+"')]";
        driver.findElement(By.xpath(Dynamic_Xpath)).click();
    }

    public void enter_SmokeOrNot(String arg1) {
        if (arg1.equals("Yes"))
        {
            Rbtn_Smoker_yes.click();
        }
        else
        {
            Rbtn_Smoker_No.click();
        }
    }

    public void enter_ImpairedLifeorNot(String arg1) {
        if (arg1.equals("Yes"))
        {
            Rbtn_ImpairedLife_yes.click();
        }
        else
        {
            Rbtn_ImpairedLife_No.click();
        }
    }
*/
    public void SaveClientInfo_ClickNext() {
       // Btn_NewClient_Save.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='Next']")));
        Btn_Next_BeforeSaveCLient.click();
    }

    public void ClickExistingClient(String arg1) {
      //  driver.get(Hooks.Base_URL);

        Lnk_ExistingClient.click();




    }

  /*  public void Select_Gender(String arg1) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@name='mainLifeAccordion']")));
        Acc_MainLifeAssured.click();
        if (arg1.equals("M"))
        {
            Rbtn_Gender_Male.click();
        }
        else
        {
            Rbtn_Gender_FeMale.click();
        }

    }

    public void Open_Client_Information_and_Click_Next() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='NEXT']")));
        Btn_Next.click();
    }*/


    public void Edit_Client_Info(String premiumBackDate, String residency, String impairedLife) throws InterruptedException {
        Acc_MainLifeAssured.click();

        System.out.println("impairedLife Value" + impairedLife);
        if (impairedLife.trim().equals("Yes"))
        {
            //  System.out.println("Enters to click true");

            Rbtn_ImpairedLife_yes.click();
        }
        else
        {
            //Thread.sleep(1000);
            Rbtn_ImpairedLife_No.click();
        }

       // System.out.println("BackDate Set");
        Thread.sleep(500);
        //Reusable_Functions.EnterDropDown(driver,Drp_Residency,"Residency",residency,wait);

        String DrpDown_Xpath = "//div[contains(text(),'Residency *')]//following-sibling::div[3]";
        String Element_Xpath = "//div[contains(text(),'Singapore')]";
        Actions performAct = new Actions(driver);
        performAct.sendKeys(Drp_Residency, "Singapore").build().perform();
        //Thread.sleep(20000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(DrpDown_Xpath)));
        System.out.println("After wait");
        //Thread.sleep(2000);
        System.out.println("Size" + driver.findElements(By.xpath("//div[contains(text(),'Singapore')]")).size());
        driver.findElements(By.xpath("//div[contains(text(),'Singapore')]")).get(1).click();
        Thread.sleep(2000);
        System.out.println("after Residency Select");

        if (premiumBackDate.equals("Yes"))
        {
            Rbtn_PremiumBackDate_Yes.click();
        }else
        {
            Rbtn_PremiumBackDate_NO.click();
        }
        System.out.println("Outside Drp");

        //System.out.println("Residency Set");


        Btn_Save.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='NEXT']")));
        Btn_Next.click();

    }

    public void IntegrationCases() {

    }
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
