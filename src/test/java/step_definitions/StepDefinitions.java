package step_definitions;

import static org.testng.AssertJUnit.assertEquals;

import cucumber.api.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.*;

import java.util.concurrent.TimeUnit;
//import helpers.Log;


public class StepDefinitions {
    public WebDriver driver;
    public Scenario scenario;
    //org.apache.log4j.Logger Log = org.apache.log4j.Logger.getLogger("StepDefinitions.java");

    public StepDefinitions()
    {
    	driver = Hooks.driver;
    	 scenario = Hooks.scenario;
        PageFactory.initElements(driver, LifeAssured.class);
        PageFactory.initElements(driver, ProductSelector.class);
        PageFactory.initElements(driver, BenefitDetails.class);
        PageFactory.initElements(driver, BenefitSummary.class);
        PageFactory.initElements(driver, PruFlexi_Quotation.class);
 }

    //******************From Here POE*****************************
    @When("^Male Non Smoker User of Age eleven Navigated to SQS Tab for Pru Flexi Cash with URL \"(.*?)\"$")
    public void male_Non_Smoker_User_of_Age_eleven_Navigated_to_SQS_Tab_for_Pru_Flexi_Cash(String URL) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("1male_Non_Smoker_User_of_Age_eleven_Navigated_to_SQS_Tab_for_Pru_Flexi_Cash");
        driver.get(URL);

    }

    @Then("^Should able to see name \"(.*?)\" and Age \"(.*?)\" of Main Life Assured created in Client Profile$")
    public void should_able_to_see_name_and_Age_of_Main_Life_Assured_created_in_Client_Profile(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("2should_able_to_see_name_and_Age_of_Main_Life_Assured_created_in_Client_Profile");
        LifeAssured.ValidateLifeAssured_Name_Age(arg1,arg2);
    }

    @When("^clicks on the Next Button on Life Assured Page$")
    public void clicks_on_the_Next_Button_on_Life_Assured_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("3clicks_on_the_Next_Button_on_Life_Assured_Page");
       LifeAssured.LifeAssuredClickNext();
    }

    @Then("^Navigated to Product Selector Page and Should be able to view the List of Products$")
    public void navigated_to_Product_Selector_Page_and_should_be_able_to_view_the_List_of_Products() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("4navigated_to_Product_Selector_Page");
        ProductSelector.ValidateProduct_Names();
    }



    @When("^Selects Pru Flexi Cash Product$")
    public void selects_Pru_Flexi_Cash_Product() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("6selects_Pru_Flexi_Cash_Product");
       ProductSelector.SelectPruFlexiCash();
    }

    @Then("^Navigated to Benifit Details Page and Validate Basic Plan and Supplementary plan Details of Pru Flexi Cash on Page Load$")
    public void navigated_to_Benifit_Details_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("7navigated_to_Benifit_Details_Page");
        BenefitDetails.PruFlexiCash_ValidateOnPageLoad();
    }


    @Then("^Validate MinMax of Sum Assured and Premium of Pru Flexi Cash$")
    public void validate_MinMax_of_Sum_Assured_and_Premium_of_Pru_Flexi_Cash() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("9validate_MinMax_of_Sum_Assured_and_Premium_of_Pru_Flexi_Cash");
       BenefitDetails.PruFlexiCashValidateMinMacSA_Premium();
    }

    @Then("^Enters SumAssured \"(.*?)\" PaymentMode \"(.*?)\"$")
    public void enters_SumAssured_Premium_PaymentMode(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("10enters_SumAssured_Premium_PaymentMode");
        BenefitDetails.PruFlexiCashEnterSA_Premium_PaymentMode(arg1,arg2);
    }

    @Then("^Validate on changing Sum Assured  Premium Value changes$")
    public void validate_on_changing_Sum_Assured_Premium_Value_changes() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("11validate_on_changing_Sum_Assured_Premium_Value_changes");
        BenefitDetails.PruFlexiCash_validate_on_changing_Sum_Assured_Premium_Value_changes();
    }

    @Then("^Validate on Changing  Premium Sum Assured value changes$")
    public void validate_on_Changing_Premium_Sum_Assured_value_changes() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("12validate_on_Changing_Premium_Sum_Assured_value_changes");
       BenefitDetails.PruFlexiCash_validate_on_Changing_Premium_Sum_Assured_value_changes();
    }

    @Then("^Validate on changing Policy Term Sum Assured and Premium changes$")
    public void validate_on_changing_Policy_Term_Sum_Assured_and_Premium_changes() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("13validate_on_changing_Policy_Term_Sum_Assured_and_Premium_changes");
    }

    @Then("^Able to Delete Supplementary Riders Criss Cover Accident Assist Recovery Aid$")
    public void able_to_Delete_Supplementary_Riders_Criss_Cover_Accident_Assist_Recovery_Aid() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("14able_to_Delete_Supplementary_Riders_Criss_Cover_Accident_Assist_Recovery_Aid");
       BenefitDetails.PruFlexiCash_Delete_Supplementary_Riders_Criss_Cover_Accident_Assist_Recovery_Aid();
    }

    @Then("^Able to add new Supplementary plan Criss CoverThree Validate PremiumPolicy Term Premium and MinMax \"(.*?)\" Enter Sum Assured and Able to Delete Plan after Addition$")
    public void able_to_add_new_Supplementary_plan_Criss_CoverThree_Validate_PremiumPolicy_Term_Premium_and_MinMax_Enter_Sum_Assured_and_Able_to_Delete_Plan_after_Addition(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("15able_to_add_new_Supplementary_plan_Criss_CoverThree_Validate_PremiumPolicy_Term_Premium_and_MinMax_Enter_Sum_Assured_and_Able_to_Delete_Plan_after_Addition");
        BenefitDetails.PruFlexiCash_AddSupPlan_CrissCoverThree_Validate_Delete(arg1);
    }

    @Then("^Able to add new Supplementary plan CrissCoverKids Validate PremiumPolicy Term Premium and MinMax \"(.*?)\" Enter Sum Assured  and Able to Delete Plan after Addition$")
    public void able_to_add_new_Supplementary_plan_CrissCoverKids_Validate_PremiumPolicy_Term_Premium_and_MinMax_Enter_Sum_Assured_and_Able_to_Delete_Plan_after_Addition(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("15able_to_add_new_Supplementary_plan_Criss_CoverThree_Validate_PremiumPolicy_Term_Premium_and_MinMax_Enter_Sum_Assured_and_Able_to_Delete_Plan_after_Addition");
       BenefitDetails.PruFlexiCash_AddSupPlan_CrissCoverKids_Validate_Delete(arg1);
    }

    @Then("^Able to add new Supplementary plan DisabilityProviderThree Validate PremiumPolicy Term Premium and MinMax \"(.*?)\" Enter Sum Assured  and Able to Delete Plan after Addition$")
    public void able_to_add_new_Supplementary_plan_DisabilityProviderThree_Validate_PremiumPolicy_Term_Premium_and_MinMax_Enter_Sum_Assured_and_Able_to_Delete_Plan_after_Addition(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("16able_to_add_new_Supplementary_plan_DisabilityProviderThree_Validate_PremiumPolicy_Term_Premium_and_MinMax_Enter_Sum_Assured_and_Able_to_Delete_Plan_after_Addition");
       //BenefitDetails.PruFlexiCash_AddSupPlan_DisabilityProviderThree_Validate_Delete();
    }

    @Then("^Able to add new Supplementary plan EarlyStageCrisisCover Validate PremiumPolicy Term Premium and MinMax \"(.*?)\" Enter Sum Assured  and Able to Delete Plan after Addition$")
    public void able_to_add_new_Supplementary_plan_EarlyStageCrisisCover_Validate_PremiumPolicy_Term_Premium_and_MinMax_Enter_Sum_Assured_and_Able_to_Delete_Plan_after_Addition(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("17able_to_add_new_Supplementary_plan_EarlyStageCrisisCover_Validate_PremiumPolicy_Term_Premium_and_MinMax_Enter_Sum_Assured_and_Able_to_Delete_Plan_after_Addition");
        BenefitDetails.PruFlexiCash_AddSupPlan_EarlyStageCrisisCover_Validate_Delete();
    }

    @Then("^Able to add new Supplementary plan FractureCarePA Validate Plan types Term Premium and Able to Delete Plan after Addition$")
    public void able_to_add_new_Supplementary_plan_FractureCarePA_Validate_Plan_types_Term_Premium_and_Able_to_Delete_Plan_after_Addition() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
               System.out.println("18able_to_add_new_Supplementary_plan_FractureCarePA_Validate_Plan_types_Term_Premium_and_Able_to_Delete_Plan_after_Addition");
        BenefitDetails.PruFlexiCash_AddSupPlan_FractureCarePA_Validate_Delete();
    }

    @Then("^Able to add new Supplementary plan Medicash Validate PremiumPolicy Term Premium and MinMax \"(.*?)\" Enter Sum Assured  and Able to Delete Plan after Addition$")
    public void able_to_add_new_Supplementary_plan_Medicash_Validate_PremiumPolicy_Term_Premium_and_MinMax_Enter_Sum_Assured_and_Able_to_Delete_Plan_after_Addition(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("19able_to_add_new_Supplementary_plan_Medicash_Validate_PremiumPolicy_Term_Premium_and_MinMax_Enter_Sum_Assured_and_Able_to_Delete_Plan_after_Addition");
       BenefitDetails.PruFlexiCash_AddSupPlan_Medicash_Validate_Delete();
    }

    @Then("^Able to add new Supplementary plan TermVantage Validate PremiumPolicy Term Premium and Able to Delete Plan after Addition$")
    public void able_to_add_new_Supplementary_plan_TermVantage_Validate_PremiumPolicy_Term_Premium_and_Able_to_Delete_Plan_after_Addition() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("20able_to_add_new_Supplementary_plan_TermVantage_Validate_PremiumPolicy_Term_Premium_and_Able_to_Delete_Plan_after_Addition");
        //BenefitDetails.PruFlexiCash_AddSupPlan_TermVantage_Validate_Delete();
    }

    @When("^Click on Policy Options Button$")
    public void click_on_Policy_Options_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("21click_on_Policy_Options_Button");
        BenefitDetails.PruFlexiCash_ClickPolicyOptions();
    }

    @Then("^Policy Alteration Model Dialog Opens$")
    public void policy_Alteration_Model_Dialog_Opens() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("22policy_Alteration_Model_Dialog_Opens");
        //this checks only if the Model Dialog opens
        BenefitDetails.PruFlexiCash_ValidatePolicyAlterationModelDialog();
    }

    @Then("^Validate Default value of Cash Benefit and From Year and Options for Cash Benifit$")
    public void validate_Default_value_of_Cash_Benefit_and_From_Year_and_Options_for_Cash_Benifit() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        //this checks Cash Benefit Option and From year
        System.out.println("23validate_Default_value_of_Cash_Benefit_and_From_Year_and_Options_for_Cash_Benifit");
        BenefitDetails.PruFlexiCash_ValidatePolicyAlterationOptions();
    }

    @When("^Click on Next Button on Benefit Details Page$")
    public void click_on_Next_Button_on_Benefit_Details_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("24click_on_Next_Button_on_Benefit_Details_Page");
        BenefitDetails.PruFlexiCash_NexClick();

    }

    @Then("^Navigate to Benefit Summary Page and Validates Life Assured Details in Life Assured Section$")
    public void navigate_to_Benefit_Summary_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("25navigate_to_Benefit_Summary_Page");
        BenefitSummary.PruFlexiCash_ValidateLifeAssuredDetails();
    }

  /*  @Then("^Validates Life Assured Details in Life Assured Section$")
    public void validates_Life_Assured_Details_in_Life_Assured_Section() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("26validates_Life_Assured_Details_in_Life_Assured_Section");
    }*/

    @Then("^Validates Total Premium PaymentMode \"(.*?)\" and other Details in Plan Details Section$")
    public void validates_Total_Premium_PaymentMode_and_other_Details_in_Plan_Details_Section(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("27validates_Total_Premium_PaymentMode_and_other_Details_in_Plan_Details_Section");
        BenefitSummary.PruFlexiCash_ValidatePlanDetails();
    }

    @Then("^Expand Premium Details to Validate Premium Values$")
    public void expand_Premium_Details_to_Validate_Premium_Values() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("28expand_Premium_Details_to_Validate_Premium_Values");
        BenefitSummary.PruFlexiCash_ValidatePremiumDetails();
    }

    @When("^Click on CrisisWaiver Button Crisis Waiver Model Dialog Opened$")
    public void click_on_CrisisWaiver_Button_Crisis_Waiver_Model_Dialog_Opened() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("29click_on_CrisisWaiver_Button_Crisis_Waiver_Model_Dialog_Opened");
        BenefitSummary.PruFlexiCash_ClickCrisisWaiver();

    }

    @Then("^Select Basic Plan and Include Early Stage Crisis Waiver Radio Buttons$")
    public void select_Basic_Plan_and_Include_Early_Stage_Crisis_Waiver_Radio_Buttons() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("30select_Basic_Plan_and_Include_Early_Stage_Crisis_Waiver_Radio_Buttons");
        BenefitSummary.PruFlexiCash_CrisisWaiverSelect();
    }

    @When("^Click on Save Button$")
    public void click_on_Save_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("31click_on_Save_Button");
       BenefitSummary.PruFlexiCash_CrisisWaiverSave();

    }

    @Then("^Crisis Waiver Updated in Plan Details Section$")
    public void crisis_Waiver_Updated_in_Plan_Details_Section() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("32crisis_Waiver_Updated_in_Plan_Details_Section");
        BenefitSummary.PruFlexiCash_RevalidatePlanDetails();

    }

    @When("^Click on Generate Quotation Button$")
    public void click_on_Generate_Quotation_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("33click_on_Generate_Quotation_Button");
       BenefitSummary.PruFlexiCash_GenerateQuotation();
    }

    @Then("^Quotation Generated$")
    public void quotation_Generated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("34quotation_Generated");
    }

    @Then("^Quotation Details are Validated$")
    public void quotation_Details_are_Validated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("35quotation_Details_are_Validated");
    }

    @When("^Aceess App URL$")
    public void Access_URL() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver,25);


        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        System.out.println("35quotation_Details_are_Validated");
        //"http://192.168.91.50:5006/new-proposal/2b04469f-31c4-45ca-82c3-54322845b52b"
        driver.get(Hooks.Base_URL);
        driver.findElement(By.xpath("//img[@class='_NavBarMenu__MenuIcon-gZnMef ilawwb']")).click();
     /*   if (!ele.isDisplayed())
        {
            driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS);
        }*/
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='LifeAssured_Next']")));
        //Thread.sleep(2000);
       // System.out.println("Button Enabled " + driver.findElement(By.xpath("//input[@id='LifeAssured_Next']")).isEnabled());
        //System.out.println("Text" + driver.findElement(By.xpath("//input[@id='LifeAssured_Next']")).getText());
        WebElement ele = driver.findElement(By.xpath("//input[@id='LifeAssured_Next']"));
        //System.out.println("Benefit Details Page Enabled or not 1" + driver.findElement(By.xpath("//div[@name='benefitDetails']")).isEnabled());
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='ProductSelector_PruFlexiCash']")));
       // Thread.sleep(6000);
       // WebElement ele1 = driver.findElement(By.xpath("//input[@id='LifeAssured_Next']"));
        WebElement ele1 = driver.findElement(By.xpath("//div[@id='ProductSelector_PruFlexiCash']"));
        //WebElement ele1 = driver.findElement(By.xpath("//div[@class='ProductSelection__ItemList-jEejJD cDJMlL'][20]"));
        System.out.println("Get Text Product" + ele1.getText());
        //WebElement ele1 = driver.findElement(By.xpath("//div[@class='ProductSelection__Content-iDtgHd hiNQZv']/div[20]"));
        //executor.executeScript("arguments[0].click();", ele1);

       Actions actions = new Actions(driver);
        actions.moveToElement(ele1).click().build().perform();
        //ele1.click();
        System.out.println("Clicked");
       // driver.findElement(By.xpath("//div[@id='ProductSelector_PruFlexiCash']")).click();
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='Flex-kFpfAw eLybyX'][1]")));
      // driver.findElement(By.xpath("//div[@class='Flex-kFpfAw eLybyX'][1]//following::input[2]")).sendKeys("10");
       Thread.sleep(20000);
       // System.out.println("Benefit Details Page Enabled or not 2 " + driver.findElement(By.xpath("//div[@name='benefitDetails']")).isEnabled());

        //Thread.sleep(10000);




    }

    @When("^Execute$")
    public void Execute() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        System.out.println("35quotation_Details_are_Validated");
    }






}