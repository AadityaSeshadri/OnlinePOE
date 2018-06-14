package step_definitions;

import static org.testng.AssertJUnit.assertEquals;

import cucumber.api.Scenario;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Assert;
import org.openqa.selenium.*;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
//import helpers.Log;


public class StepDefinitions {
    public WebDriver driver;
    public Scenario scenario;
    POELandingPage poeLandingPage = new POELandingPage();
    NewClientFormPage newClientFormPage = new NewClientFormPage();
    ExistingClientFormPage existingClientFormPage = new ExistingClientFormPage();
    ProductSelector productSelector = new ProductSelector();
    LifeAssured lifeAssured= new LifeAssured();
    BenefitDetails benefitDetails = new BenefitDetails();
    BenefitSummary benefitSummary  = new BenefitSummary();

    //WebDriverWait wait =null;
    //org.apache.log4j.Logger Log = org.apache.log4j.Logger.getLogger("StepDefinitions.java");

    public StepDefinitions()
    {
    	driver = Hooks.driver;
    	 scenario = Hooks.scenario;


 }

 //*********************Client_Creation*****************************
 @When("^Agent Navigate to POE Url$")
 public void Agent_Navigate_to_POE_Url() throws Throwable {
     WebDriverWait wait = new WebDriverWait(driver,25);
     driver.get(Hooks.Base_URL);
     driver.manage().window().maximize();
     wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'New Proposal')]")));



 }
    @When("^Validate Elements in POE Landing Page$")
    public void Validate_Element_Existence_in_POE_Landing_Page() throws Throwable {
        poeLandingPage.ValidateELements_LandingPage();
 }


    @When("^clicks on New Proposal$")
    public void clicks_on_New_Proposal() throws Throwable {
        poeLandingPage.clickNewProposal();

    }

    @When("^Validate Elements in New_Existing Client Page$")
    public void Validate_Elements_in_New_Existing_Client_Page() throws Throwable {
        poeLandingPage.ValidateELements_New_ExistingClient();

    }

    @When("^Clicks on New Client in Landing Page$")
    public void Clicks_on_New_Client_in_Landing_Page() throws Throwable {
        poeLandingPage.SelectNewClient();

    }

    @When("^Enters Basics Info\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"")
    public void Enter_Client_Basic_Info(String Title,String ChristianName,String GivenName,String Surname,String MaritalStatus,String DOB,String Nationality,String NRICPassport,String Gender,String Smoker_Value) throws Throwable {
        newClientFormPage.Enter_Client_Basic_Info(Title,ChristianName,GivenName,Surname,MaritalStatus,DOB,Nationality,NRICPassport,Gender,Smoker_Value);

    }

    @When("^Enters Contact Info\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"")
    public void Enter_Contact_Info(String HomePhoneCountryCode,String HomePhone,String OfficePhoneCountryCode,String OfficePhone,String MobilePhoneCountryCode,String MobilePhone,String Email,String PostalCode,String Block,String Street,String Building,String FloorUnit,String City,String State,String Country) throws Throwable {
        newClientFormPage.Enter_Client_Contact_Info(HomePhoneCountryCode,HomePhone,OfficePhoneCountryCode,OfficePhone,MobilePhoneCountryCode,MobilePhone,Email,PostalCode,Block,Street,Building,FloorUnit,City,State,Country);

    }


    @When("^Enters EducationOccupation Info\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"")
    public void Enter_EducationOccupation_Info(String EnglishProficiency,String Education,String Occupation,String Others) throws Throwable {
        newClientFormPage.Enter_Client_EducationOccupation_Info(EnglishProficiency,Education,Occupation,Others);

    }

    @When("^Enters Others Info\"([^\"]*)\"")
    public void Enter_Others_Info(String NeedAnalysisRecommendation) throws Throwable {
        newClientFormPage.Enter_Client_Others_Info(NeedAnalysisRecommendation);

    }

    @When("^Clicks on Save Button on Create New Client Form Page and Click on Next$")
    public void Clicks_on_Save_Button_on_Create_New_Client_Form_Page_and_Click_on_Next() throws Throwable {
        newClientFormPage.SaveClientInfo_ClickNext();

    }


    @When("^Clicks on Next Button on Create New Client Form Page$")
    public void Clicks_on_Next_Button_on_Create_New_Client_Form_Page() throws Throwable {
        newClientFormPage.SaveClientInfo();

    }
    @Then("^Added Client info \"([^\"]*)\" shown in Life Assured Profile Page$")
    public void Added_Client_info_shown_in_Life_Assured_Profile_Page(String Surname) throws Throwable {
        newClientFormPage.ValidateLifeAssuredProfileSQS(Surname);

    }

    @When("^Edit Client info to add\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void Edit_Client_Info(String PremiumBackDate,String Residency,String ImpairedLife) throws Throwable {
        newClientFormPage.Edit_Client_Info(PremiumBackDate,Residency,ImpairedLife);
       // Reusable_Functions.Take_Screenshot(driver,scenario);

    }

    @When("^Validate Product Selection Page$")
    public void Validate_Product_Selection_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        productSelector.ValidateProduct_Names();

    }

    @When("^Select PruFlexi Cash Product$")
    public void Select_PruFlexi_Cash_Product() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        productSelector.SelectPruFlexiCash();

    }

    @Then("^Mandatory Fields should be shown$")
    public void Mandatory_Fields_should_be_shown() throws Throwable {
        newClientFormPage.MandartoryFieldCheck();
        Reusable_Functions.Take_Screenshot(driver,scenario);

    }
    @When("^Search Client Name\"([^\"]*)\"$")
    public void Search_From_ExistingClient(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        newClientFormPage.ClickExistingClient(arg1);
        existingClientFormPage.SearchClientbyName(arg1);

    }
    //
    @When("^Click on Next Button in Life Assured Page$")
    public void LifeAssuredPage_ClickNext() throws Throwable {
        lifeAssured.LifeAssuredClickNext();

    }

    @When("^Navigated to Benefit Details Page$")
    public void Navigate_BenefitDetails() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
       productSelector.Navigate_BenefitDetails();

    }

    @Then("^Validate Plan Name and Details$")
    public void Validate_PlanDetails() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        benefitDetails.Validate_PlanDetails();

    }

    @Then("^Validate Min Max Value of Sum Assured Model Premium for Yearly Half Yeraly Quarterly Monthly$")
    public void ValidateMinMaxforTerm() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        benefitDetails.ValidateMinMaxforTerm();

    }

    @Then("^Validate Change of Premium in Main Plan affects Supplementary Plans$")
    public void ValidatePremiumChangeinMainPlabAffectSupp() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        benefitDetails.ValidatePremiumChangeinMainPlabAffectSupp();

    }

    @Then("^Validate Change of Sum Assured affect  Model Premium\"([^\"]*)\"\"([^\"]*)\"$")
    public void SummAssuredAffectingModelPremium(String SA,String MP) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        benefitDetails.SummAssuredAffectingModelPremium(SA,MP);

    }

    @Then("^Validate Change of Model Premium  affect Sum Assured\"([^\"]*)\"\"([^\"]*)\"$")
    public void MPAffectsSA(String SA,String MP) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        benefitDetails.MPAffectsSA(SA,MP);

    }

    @Then("^Validate Deletion of Accident Assist will Delete Recovery Aid Benefit$")
    public void DeleteAccidentAssist_RecoveryAidBenefit() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        benefitDetails.DeleteAccAssist_RecoveryAidBenefit();

    }

    @Then("^Delete Criss Cover Extra")
    public void DeleteCrissCoverExtra() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        benefitDetails.DeleteCrissCoverExtra();

    }
    /*  @Then("^Add Supplementary Plan Crisis Cover Three$")
    public void AddCrisisCoverThree() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        benefitDetails.AddCrisisCoverThree();

    }

  @Then("^Validate Min Max Value of Sum Assured in Crisis Cover Three$")
    public void ValidateMinMaxSACrisisCoverThree() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        benefitSummary.ValidateMinMaxSACrisisCoverThree();

    }

    @Then("^Set Sum Assured Value of Crisis Cover Three\"([^\"]*)\"$")
    public void SetSA_CrisisCoverThree(String SA) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        benefitSummary.SetSA_CrisisCoverThree(SA);

    }

    @Then("^Validate Model Premium Value of Crisis Cover Three\"([^\"]*)\"$")
    public void Validate_CrisisCoverThreeMP(String ExpectedMP) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        benefitSummary.Validate_CrisisCoverThreeMP(ExpectedMP);

    }*/

    @Then("^Click on Next Button in Benefit Details Page$")
    public void BenefitDetailsNext() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        benefitDetails.BenefitDetailsNext();

    }

    @Then("^Validate Plan Details of Benefit Summary\"([^\"]*)\"$")
    public void ValidatePlanDetails(String TotalPremium) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        benefitSummary.ValidatePlanDetails(TotalPremium);

    }

    @Then("^Premium Details of Benefit Summary\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void ValidatePremiumDetails(String YearlyPremium,String HalfYearlyPremium,String QuartYearlyPremium,String MonthlyPremium,String SinglePremium) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        benefitSummary.ValidatePremiumDetails(YearlyPremium,HalfYearlyPremium,QuartYearlyPremium,MonthlyPremium,SinglePremium);

    }

    @Then("^Click on Generate Quotation$")
    public void GenerateQuotation() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        benefitSummary.GenerateQuotation();

    }

    @Then("^Validate BI Generated$")
    public void ValidateBI() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        productSelector.ValidateBI();
        //Reusable_Functions.Take_Screenshot(driver,scenario);

    }

    @Then("^Sample$")
    public void Sample() throws Throwable {

        System.out.println("Sample");

    }
//******************************
@When("^Execute Integration Test cases in New Client Info$")
public void Execute_ClientIntegrationCases() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
    newClientFormPage.IntegrationCases();


}


    ////
    //Enters Surname "<Surname>" DOB "<DOB>" in New Client Form Page
    //"(.*?)"
    /*@When("^Enters Surname \"([^\"]*)\" DOB \"([^\"]*)\" in New Client Form Page")
    public void Enters_all_Mandatory_Fields_in_New_Client_Form_Page(String Surname,String DOB) throws Throwable {
        newClientFormPage.EnterMandatoryFieldsfromClientToSQS(Title, ChristianName, GivenName, Surname, MaritalStatus, DOB, Nationality, NRICPassport, Surname,DOB);

    }

    @Then("^Added Client info \"([^\"]*)\" shown in Life Assured Profile Page$")
    public void Added_Client_info_shown_in_Life_Assured_Profile_Page(String Surname) throws Throwable {
        newClientFormPage.ValidateLifeAssuredProfileSQS(Surname);

    }

    @When("^Search Existing Client to Update Mandatory Details\"(.*?)\"$")
    public void Search_From_ExistingClient(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        newClientFormPage.ClickExistingClient(arg1);
        existingClientFormPage.SearchClientbyName(arg1);

    }
    @When("^Enter PremiumBackDate \"(.*?)\"$")
    public void enter_PremiumBackDate(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        newClientFormPage.enter_PremiumBackDate(arg1);

    }


    @When("^Select Gender\"(.*?)\"$")
    public void Select_Gender(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        newClientFormPage.Select_Gender(arg1);

    }

    @When("^Enter ChristianName \"(.*?)\"$")
    public void enter_ChristianName(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        newClientFormPage.enter_ChristianName(arg1);
    }

    @When("^Enter GivenName \"(.*?)\"$")
    public void enter_GivenName(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        newClientFormPage.enter_GivenName(arg1);
    }

    @Then("^Validate ANB \"(.*?)\"$")
    public void validate_ANB(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        newClientFormPage.validate_ANB(arg1);
    }

    @When("^Enter Nationality \"(.*?)\"$")
    public void enter_Nationality(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        newClientFormPage.enter_Nationality(arg1);
    }

    @When("^Enter Residency \"(.*?)\"$")
    public void enter_Residency(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        newClientFormPage.enter_Residency(arg1);
    }

    @When("^Enter Occupation \"(.*?)\"$")
    public void enter_Occupation(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        newClientFormPage.enter_Occupation(arg1);
    }

    @When("^Enter SmokeOrNot \"(.*?)\"$")
    public void enter_SmokeOrNot(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        newClientFormPage.enter_SmokeOrNot(arg1);
    }

    @When("^Enter ImpairedLifeorNot \"(.*?)\"$")
    public void enter_ImpairedLifeorNot(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        newClientFormPage.enter_ImpairedLifeorNot(arg1);
    }





    @When("^Run Integration Checks for Fields in New Client Form Page$")
    public void Run_Integration_Checks_for_Fields_in_New_Client_Form_Page() throws Throwable {

    }

    @Then("^Mandatory Fields should be shown$")
    public void Mandatory_Fields_should_be_shown() throws Throwable {
        newClientFormPage.MandartoryFieldCheck();

    }

    @When("^Search Existing Client\"(.*?)\"$")
    public void Search_Existing_Client(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        newClientFormPage.ClickExistingClient(arg1);
        existingClientFormPage.SearchClientbyName(arg1);
    }

    @When("^Open Client Information and Click Next$")
    public void Open_Client_Information_and_Click_Next(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        newClientFormPage.Open_Client_Information_and_Click_Next();

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

  *//*  @Then("^Validates Life Assured Details in Life Assured Section$")
    public void validates_Life_Assured_Details_in_Life_Assured_Section() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("26validates_Life_Assured_Details_in_Life_Assured_Section");
    }*//*

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
        driver.get(Hooks.Base_URL);
        //**************Working Model
        driver.manage().window().maximize();
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'New Proposal')]")));
      //  wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a#new-proposal")));
        System.out.println("****************111111111111111111111************************");
        WebElement ele1 = driver.findElement(By.xpath("//div[contains(text(),'New Proposal')]"));
       // WebElement ele1 = driver.findElement(By.cssSelector("a#new-proposal"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ele1).click().build().perform();
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'New Client')]")));
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a#create-new-client")));
        driver.findElement(By.xpath("//span[contains(text(),'New Client')]")).click();
        //driver.findElement(By.cssSelector("a#create-new-client")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'New Client Form Page')]")));
        WebElement Basic = driver.findElement(By.xpath("//span[contains(text(),'BASICS')]"));
        Basic.click();
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'SURNAME')]")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[name='basicDetailsAccordion'] > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > label:nth-child(2) > input")));
        WebElement Surname = driver.findElement(By.cssSelector("div[name='basicDetailsAccordion'] > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > label:nth-child(2) > input"));
        WebElement GIVEN_NAME = driver.findElement(By.xpath("//div[contains(text(),'GIVEN NAME')]"));
        WebElement SAVE = driver.findElement(By.xpath("//input[@type='submit' and @value='SAVE']"));
        WebElement Date = driver.findElement(By.xpath("//input[@type='date']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions performAct = new Actions(driver);
        performAct.sendKeys(Surname, "Aaditya").build().perform();
        performAct.sendKeys(GIVEN_NAME, "Seshadri").build().perform();
        performAct.sendKeys(Date, "05/04/1990").build().perform();
        driver.findElement(By.xpath("//input[@value='SAVE']")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='LifeAssured_MainLifeName']")));
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='LifeAssured_MainLifeName']")).getText().contains("Aaditya"));

        driver.findElement(By.xpath("//div[@name='mainLifeAccordion']/div[2]/div[2]")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='LifeAssured_MainLifeName']")));
        //Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Surname *')]")).getText().contains("Aaditya"));
        //Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Given Name *')]")).getText().contains("Seshadri"));
        //Thread.sleep(2000);
        WebElement Chrisname = driver.findElement(By.xpath("//div[contains(text(),'Christian Name *')]"));
        performAct.sendKeys(Chrisname, "Sample").build().perform();
      //  Thread.sleep(2000);
         WebElement Nationality = driver.findElement(By.xpath("//div[contains(text(),'Nationality')]"));
         performAct.sendKeys(Nationality, "Singaporean").build().perform();
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Nationality')]//following-sibling::div[3]")));
         Thread.sleep(500);
        driver.findElement(By.xpath("//div[contains(text(),'Singaporean')]")).click();
       // Thread.sleep(2000);

        WebElement Residency = driver.findElement(By.xpath("//div[contains(text(),'Residency')]"));
        performAct.sendKeys(Residency, "Singapore").build().perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Residency')]//following-sibling::div[3]")));
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[contains(text(),'Singapore')]")).click();
       // Thread.sleep(2000);

        WebElement Occ = driver.findElement(By.xpath("//div[contains(text(),'Occupation')]"));
        performAct.sendKeys(Occ, "Surveyor").build().perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Occupation')]//following-sibling::div[3]")));
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[contains(text(),'Surveyor')]")).click();

       // Thread.sleep(2000);

        driver.findElement(By.xpath("//div[contains(text(),'SMOKER')]//following-sibling::div[2]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'IMPAIRED LIFE')]//following-sibling::div[2]")).click();
        driver.findElement(By.xpath("//input[@value='SAVE']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='LifeAssured_Next']")).click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='ProductSelector_PruFlexiCash']")));






        //Surname.click();
        //performAct.sendKeys(Surname,"Aaditya");

        //Keys.F2

       // Surname.sendKeys(Keys.chord("Aaditya"));
        //Surname.sendKeys(Keys.TAB);

       // driver.ExecuteScript(string.Format("document.getElementById('cred-password-inputtext').value='{0}';",password));
        //performAct.sendKeys(Surname, "Aaditya").build().perform();
        //performAct.keyDown(Surname,"Aadi");
        //Surname.sendKeys("Aadi");
        //System.out.println("After Set " + Surname.getText());
        //Thread.sleep(3000);
        //Surname.sendKeys("Aaditya");
      //  js.executeScript("arguments[0].value='Aaditya';", Surname);
       // js.executeScript("document.getElement(By.xpath(\"//div[contains(text(),'SURNAME')]\").value='Aaditya'");
    *//*    for (char c : "Aaditya".toCharArray()) {
            Surname.sendKeys(Character.toString(c));
        }*//*

       // GIVEN_NAME.click();
        //performAct.sendKeys(GIVEN_NAME, "SESHADRI").build().perform();
        //System.out.println("Sur name after moving to next field" + Surname.getText());
       // GIVEN_NAME.sendKeys("Seshadri");
        //js.executeScript("arguments[0].value='Sesh';", GIVEN_NAME);


        //div[@id='LifeAssured_MainLifeName']

        //Thread.sleep(5000);
        //div[@id='LifeAssured_MainLifeName']
       // Date.sendKeys("1990/04/05");
       // js.executeScript("arguments[0].value='1990/04/05';", Date);





       // WebElement Sal = driver.findElement(By.xpath("//div[contains(text(),'MARITAL STATUS')]"));
       // performAct.sendKeys(Sal, "Single").build().perform();
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'MARITAL STATUS')]//following-sibling::div[3]")));
       // Thread.sleep(500);
        //driver.findElement(By.xpath("//div[contains(text(),'Single')]")).click();
        //performAct.sendKeys(Sal, "Professor").build().perform();
       // Thread.sleep(2000);
        //driver.findElement(By.xpath("//div[contains(text(),'TITLE')]")).sendKeys("Professor");
        //SAVE.click();
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='LifeAssured_MainLifeName']")));
        //Assert.assertTrue(driver.findElement(By.xpath("//div[@id='LifeAssured_MainLifeName']")).getText().contains("Aaditya SESHADRI"));
      //  driver.findElement(By.xpath("//div[contains(text(),'BASICS')]")).click();
*//*




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
        WebElement elePri = driver.findElement(By.xpath("//div[@id='ProductSelector_PruFlexiCash']"));
        //WebElement ele1 = driver.findElement(By.xpath("//div[@class='ProductSelection__ItemList-jEejJD cDJMlL'][20]"));
        System.out.println("Get Text Product" + ele1.getText());
        //WebElement ele1 = driver.findElement(By.xpath("//div[@class='ProductSelection__Content-iDtgHd hiNQZv']/div[20]"));
        //executor.executeScript("arguments[0].click();", ele1);

       Actions actions1 = new Actions(driver);
        actions.moveToElement(ele1).click().build().perform();
        //ele1.click();
        System.out.println("Clicked");
       // driver.findElement(By.xpath("//div[@id='ProductSelector_PruFlexiCash']")).click();
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='Flex-kFpfAw eLybyX'][1]")));
      // driver.findElement(By.xpath("//div[@class='Flex-kFpfAw eLybyX'][1]//following::input[2]")).sendKeys("10");
       Thread.sleep(20000);*//*
       // System.out.println("Benefit Details Page Enabled or not 2 " + driver.findElement(By.xpath("//div[@name='benefitDetails']")).isEnabled());

        //Thread.sleep(10000);
        //**************Working Model


        //******************Not Required
     *//*

                WebElement option = driver.findElement(By.xpath("//div[@id='react-select-" + id + "--list']/div[@class='Select-option' and text()='" + value + "']"));
                option.click();
     if (!ele.isDisplayed())
        {
            driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS);
        }
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'New Client')]")));

               JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='Aaditya';", Surname);

        //************Sample FB Application**********************
        /*driver.findElement(By.cssSelector("input#email")).sendKeys("aadityaapr5@gmail.com");
        driver.findElement(By.cssSelector("input#pass")).sendKeys("velayaparu");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        Thread.sleep(5000);*//*
        //************Sample FB Application**********************


    }

    @When("^Execute$")
    public void Execute() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        System.out.println("35quotation_Details_are_Validated");
    }
*/





}