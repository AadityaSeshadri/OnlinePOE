package pageobjects;
//import helpers.Log;

import gherkin.lexer.Th;
import helpers.Log;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_definitions.Hooks;
import step_definitions.Reusable_Functions;

import java.io.IOException;

//public class LifeAssured extends BaseClass{

public class BenefitDetails {
    public WebDriver driver;
    public WebDriverWait wait;


    public BenefitDetails()
    {
        driver = Hooks.driver;
        wait = Hooks.wait;
        PageFactory.initElements(driver,this);

    }

    @FindBy(how=How.ID, using="BenefitDetails_PaymentMode")
    public static WebElement Drp_BenefitDetails_PaymentMode;

    @FindBy(how=How.ID, using="BenefitDetails_Currency")
    public static WebElement Lbl_BenefitDetails_Currency;

    //***************Objects Basic Plan
    @FindBy(how=How.ID, using="BenefitDetails_BasicPlanName")
    public static WebElement Drp_BenefitDetails_BasicPlanName;

    @FindBy(how=How.ID, using="BenefitDetails_BasicPlanTerm")
    public static WebElement Drp_BenefitDetails_BasicPlanTerm;

    @FindBy(how=How.ID, using="BenefitDetails_BasicPlanType")
    public static WebElement Drp_BenefitDetails_BasicPlanType;

    @FindBy(how=How.ID, using="BenefitDetails_BasicPlanSumAssured")
    public static WebElement Txt_BenefitDetails_BasicPlanSumAssured;

    @FindBy(how=How.ID, using="BenefitDetails_BasicPlanModelPremium")
    public static WebElement Txt_BenefitDetails_BasicPlanModelPremium;

    //***************Objects Supplementary Plan 1
    @FindBy(how=How.ID, using="BenefitDetails_SupPlan1_PlanName")
    public static WebElement Drp_BenefitDetails_SupPlan1_PlanName;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan1_PremiumTerm")
    public static WebElement Txt_BenefitDetails_SupPlan1_PremiumTerm;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan1_PolicyTerm")
    public static WebElement Txt_BenefitDetails_SupPlan1_PolicyTerm;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan1_PlanType")
    public static WebElement BenefitDetails_SupPlan1_PlanType;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan1_PlanSumAssured")
    public static WebElement Txt_BenefitDetails_SupPlan1_PlanSumAssured;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan1_PlanModelPremium")
    public static WebElement Txt_BenefitDetails_SupPlan1_PlanModelPremium;

    //***************Objects Supplementary Plan 2
    @FindBy(how=How.ID, using="BenefitDetails_SupPlan2_PlanName")
    public static WebElement Drp_BenefitDetails_SupPlan2_PlanName;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan2_PremiumTerm")
    public static WebElement Txt_BenefitDetails_SupPlan2_PremiumTerm;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan2_PolicyTerm")
    public static WebElement Txt_BenefitDetails_SupPlan2_PolicyTerm;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan2_PlanType")
    public static WebElement BenefitDetails_SupPlan2_PlanType;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan2_PlanSumAssured")
    public static WebElement Txt_BenefitDetails_SupPlan2_PlanSumAssured;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan2_PlanModelPremium")
    public static WebElement Txt_BenefitDetails_SupPlan2_PlanModelPremium;


    //***************Objects Supplementary Plan 3
    @FindBy(how=How.ID, using="BenefitDetails_SupPlan3_PlanName")
    public static WebElement Drp_BenefitDetails_SupPlan3_PlanName;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan3_PremiumTerm")
    public static WebElement Txt_BenefitDetails_SupPlan3_PremiumTerm;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan3_PolicyTerm")
    public static WebElement Txt_BenefitDetails_SupPlan3_PolicyTerm;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan3_PlanType")
    public static WebElement BenefitDetails_SupPlan3_PlanType;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan3_PlanSumAssured")
    public static WebElement Txt_BenefitDetails_SupPlan3_PlanSumAssured;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan3_PlanModelPremium")
    public static WebElement Txt_BenefitDetails_SupPlan3_PlanModelPremium;

    //***************Objects Supplementary Plan 4
    @FindBy(how=How.ID, using="BenefitDetails_SupPlan4_PlanName")
    public static WebElement Drp_BenefitDetails_SupPlan4_PlanName;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan4_PremiumTerm")
    public static WebElement Txt_BenefitDetails_SupPlan4_PremiumTerm;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan4_PolicyTerm")
    public static WebElement Txt_BenefitDetails_SupPlan4_PolicyTerm;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan4_PlanType")
    public static WebElement BenefitDetails_SupPlan4_PlanType;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan4_PlanSumAssured")
    public static WebElement Txt_BenefitDetails_SupPlan4_PlanSumAssured;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan4_PlanModelPremium")
    public static WebElement Txt_BenefitDetails_SupPlan4_PlanModelPremium;

    @FindBy(how=How.ID, using="BenefitDetails_BasicPlanSumAssured_MinMax")
    public static WebElement Txt_BenefitDetails_BasicPlanSumAssured_MinMax;

    @FindBy(how=How.ID, using="BenefitDetails_BasicPlanModelPremium_MinMax")
    public static WebElement Txt_BenefitDetails_BasicPlanModelPremium_MinMax;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan2_Delete")
    public static WebElement Btn_BenefitDetails_SupPlan2_Delete;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan3_Delete")
    public static WebElement Btn_BenefitDetails_SupPlan3_Delete;

    @FindBy(how=How.ID, using="BenefitDetails_BasicPlanAddSupplementaryPlan")
    public static WebElement Btn_BenefitDetails_BasicPlanAddSupplementaryPlan;

    @FindBy(how=How.ID, using="BenefitDetails_SupPlan2_MinMaxSA")
    public static WebElement Lbl_BenefitDetails_SupPlan2_MinMaxSA;

    @FindBy(how=How.ID, using="BenefitDetails_PolicyOptions")
    public static WebElement Btn_BenefitDetails_PolicyOptions;

    @FindBy(how=How.ID, using="BenefitDetails_PolicyOption_CashBenefit")
    public static WebElement Drp_BenefitDetails_PolicyOption_CashBenefit;

    @FindBy(how=How.ID, using="BenefitDetails_PolicyOption_CashBenefit")
    public static WebElement Txt_BenefitDetails_PolicyOption_FromYear;

    @FindBy(how=How.ID, using="BenefitDetails_PolicyOption_Cancel")
    public static WebElement Btn_BenefitDetails_PolicyOption_Cancel;

    @FindBy(how=How.ID, using="BenefitDetails_PolicyOption_Done")
    public static WebElement Btn_BenefitDetails_PolicyOption_Done;

    @FindBy(how=How.ID, using="BenefitDetails_Next")
    public static WebElement Btn_BenefitDetails_Next;

    //***********Temp

    @FindBy(how=How.XPATH, using="//div[contains(text(),'Payment Mode')]")
    public static WebElement Drp_PaymentMode;



    public static void PruFlexiCash_ValidateOnPageLoad()
    {
        Assert.assertTrue( Reusable_Functions.Check_DropDownDefaultValue(Drp_BenefitDetails_PaymentMode,"Yearly"));

       /* Drp_BenefitDetails_PaymentMode.isDisplayed();
        //Checking Default Value of Dropdown is Yearly
        Select PaymentModeSel = new Select(Drp_BenefitDetails_PaymentMode);
        WebElement Drp_BenefitDetails_PaymentMode_First_option = PaymentModeSel.getFirstSelectedOption();
        Assert.assertEquals(Drp_BenefitDetails_PaymentMode_First_option.getText(),"Yearly");*/

        //Check Currency as SGD
        Assert.assertEquals(Reusable_Functions.Get_LabelValue(Lbl_BenefitDetails_Currency),"SGD");
        //Set Initial Sum Assured
        Txt_BenefitDetails_BasicPlanSumAssured.sendKeys("50000");
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_BasicPlanModelPremium),"5263.50");

        //Check Basic Plan Details
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(Drp_BenefitDetails_BasicPlanName,"PruFlexiCash"));
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(Drp_BenefitDetails_BasicPlanTerm,"15/15"));
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(Drp_BenefitDetails_BasicPlanType,"-"));
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_BasicPlanSumAssured),"50000");
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_BasicPlanModelPremium),"5263.50");

        //Check Supplementary Plan 1  Details//Drp_BenefitDetails_SupPlan4_PolicyTerm
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(Drp_BenefitDetails_SupPlan1_PlanName,"Accelerated Disability"));
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan1_PremiumTerm),"15");
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan1_PolicyTerm),"15");
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(BenefitDetails_SupPlan1_PlanType,"-"));
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan1_PlanSumAssured),"50000");
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan1_PlanModelPremium),"9.50");

        //Check Supplementary Plan 2  Details
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(Drp_BenefitDetails_SupPlan2_PlanName,"Accident Assist"));
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PremiumTerm),"15");
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PolicyTerm),"15");
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(BenefitDetails_SupPlan2_PlanType,"Plan A"));
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PlanSumAssured),"");
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PlanModelPremium),"158.00");
        String[] exp = {"Plan A", "Plan B", "Plan C", "Plan D"};
        Assert.assertTrue(Reusable_Functions.Chk_DropDownOptions(BenefitDetails_SupPlan2_PlanType,exp));



        //Check Supplementary Plan 3  Details
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(Drp_BenefitDetails_SupPlan3_PlanName,"Recovery Aid Benefit"));
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan3_PremiumTerm),"15");
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan3_PolicyTerm),"15");
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(BenefitDetails_SupPlan3_PlanType,"Plan A"));
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan3_PlanSumAssured),"");
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan3_PlanModelPremium),"84.00");









    }

    public static void PruFlexiCashValidateMinMacSA_Premium()
    {
        Assert.assertEquals(Txt_BenefitDetails_BasicPlanSumAssured_MinMax.getText(),"Min/Max SA: 10,000/1,000,000");
        Assert.assertEquals(Txt_BenefitDetails_BasicPlanModelPremium_MinMax.getText(),"Min MP: 1,112.70");

    }

    public static void PruFlexiCashEnterSA_Premium_PaymentMode(String SA,String Paymode) {
        Txt_BenefitDetails_BasicPlanSumAssured.sendKeys(SA);
        //to enter for Payment Mode

    }

    public static void PruFlexiCash_validate_on_changing_Sum_Assured_Premium_Value_changes() {
        //check when value of SA changed in function PruFlexiCashEnterSA_Premium_PaymentMode as 40000 (initial value 50000),MP updated here
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_BasicPlanModelPremium),"4210.30");


    }

    public static void PruFlexiCash_validate_on_Changing_Premium_Sum_Assured_value_changes() {
        Txt_BenefitDetails_BasicPlanModelPremium.sendKeys("5000");
        //when given 5000 value changes to 5000.33
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_BasicPlanModelPremium),"5000.33");
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_BasicPlanSumAssured),"47,500");

    }

    public static void PruFlexiCash_Delete_Supplementary_Riders_Criss_Cover_Accident_Assist_Recovery_Aid() {
        Btn_BenefitDetails_SupPlan2_Delete.click();
        Btn_BenefitDetails_SupPlan3_Delete.click();

    }

    public static void PruFlexiCash_AddSupPlan_CrissCoverThree_Validate_Delete(String MinMax_SA) {
        Btn_BenefitDetails_BasicPlanAddSupplementaryPlan.click();
        //Select Option Criss Cross III
        //Check Supplementary Plan 2  Details
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(Drp_BenefitDetails_SupPlan2_PlanName,"Criss Cover |||"));
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PremiumTerm),"15");
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PolicyTerm),"15");
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(BenefitDetails_SupPlan2_PlanType,"-"));
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PlanSumAssured),"0");
        //While adding the Rider it Defaults to 0 , when SA made 20000 MP set to 17.80
        Txt_BenefitDetails_SupPlan2_PlanSumAssured.sendKeys("20000");
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PlanModelPremium),"17.80");
        //No Plans Visible
/*        String[] exp = {"Plan A", "Plan B", "Plan C", "Plan D"};
        Assert.assertTrue(Reusable_Functions.Chk_DropDownOptions(BenefitDetails_SupPlan2_PlanType,exp));*/
        //Validating Minimum Maximum SA value
        Assert.assertEquals(Lbl_BenefitDetails_SupPlan2_MinMaxSA,MinMax_SA);
        Btn_BenefitDetails_SupPlan2_Delete.click();


    }

    public static void PruFlexiCash_AddSupPlan_CrissCoverKids_Validate_Delete(String MinMaxSA) {
        Btn_BenefitDetails_BasicPlanAddSupplementaryPlan.click();
        //Select Option Criss Cross III
        //Check Supplementary Plan 2  Details
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(Drp_BenefitDetails_SupPlan2_PlanName,"Criss Cover Kids"));
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PremiumTerm),"14");
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PolicyTerm),"14");
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(BenefitDetails_SupPlan2_PlanType,"-"));
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PlanSumAssured),"0");
        //While adding the Rider it Defaults to 0 , when SA made 20000 MP set to 17.80
        Txt_BenefitDetails_SupPlan2_PlanSumAssured.sendKeys("20000");
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PlanModelPremium),"80.00");
        //No Plans
       /* String[] exp = {"Plan A", "Plan B", "Plan C", "Plan D"};
        Assert.assertTrue(Reusable_Functions.Chk_DropDownOptions(BenefitDetails_SupPlan2_PlanType,exp));*/
        //Validating Minimum Maximum SA value
        Assert.assertEquals(Lbl_BenefitDetails_SupPlan2_MinMaxSA,MinMaxSA);
        Btn_BenefitDetails_SupPlan2_Delete.click();

    }

  /*  public static void PruFlexiCash_AddSupPlan_DisabilityProviderThree_Validate_Delete() {
        Btn_BenefitDetails_BasicPlanAddSupplementaryPlan.click();
        //Select Option Criss Cross III
        //Check Supplementary Plan 2  Details
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(Drp_BenefitDetails_SupPlan2_BasicPlanName,"Criss Cover |||"));
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(Drp_BenefitDetails_SupPlan2_BasicPlanTerm,"15/15"));
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(BenefitDetails_SupPlan2_BasicPlanType,"-"));
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_BasicPlanSumAssured),"0");
        //While adding the Rider it Defaults to 0 , when SA made 20000 MP set to 17.80
        Txt_BenefitDetails_SupPlan2_BasicPlanSumAssured.sendKeys("20000");
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_BasicPlanModelPremium),"17.80");
        String[] exp = {"Plan A", "Plan B", "Plan C", "Plan D"};
        Assert.assertTrue(Reusable_Functions.Chk_DropDownOptions(BenefitDetails_SupPlan2_BasicPlanType,exp));
        Btn_BenefitDetails_SupPlan3_Delete.click();
    }*/

    public static void PruFlexiCash_AddSupPlan_EarlyStageCrisisCover_Validate_Delete() {
        Btn_BenefitDetails_BasicPlanAddSupplementaryPlan.click();
        //Select Option Criss Cross III
        //Check Supplementary Plan 2  Details
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(Drp_BenefitDetails_SupPlan2_PlanName,"Early Stage Criss Cover"));
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PremiumTerm),"10");
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PolicyTerm),"10");
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(BenefitDetails_SupPlan2_PlanType,"-"));
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PlanSumAssured),"0");
        //While adding the Rider it Defaults to 0 , when SA made 20000 MP set to 17.80
        Txt_BenefitDetails_SupPlan2_PlanSumAssured.sendKeys("20000");
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PlanModelPremium),"74.20");
        //String[] exp = {"Plan A", "Plan B", "Plan C", "Plan D"};
        //Assert.assertTrue(Reusable_Functions.Chk_DropDownOptions(BenefitDetails_SupPlan2_BasicPlanType,exp));
        Btn_BenefitDetails_SupPlan2_Delete.click();
    }

    public static void PruFlexiCash_AddSupPlan_FractureCarePA_Validate_Delete() {
        Btn_BenefitDetails_BasicPlanAddSupplementaryPlan.click();
        //Select Option Criss Cross III
        //Check Supplementary Plan 2  Details
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(Drp_BenefitDetails_SupPlan2_PlanName,"Fracture Care PA"));
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PremiumTerm),"15");
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PolicyTerm),"15");
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(BenefitDetails_SupPlan2_PlanType,"Plan 1"));
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PlanSumAssured),"");
        //While adding the Rider it Defaults to 0 , when SA made 20000 MP set to 120
        //Not setting because SA is not editable
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PlanModelPremium),"120.00");
        String[] exp = {"Plan 1", "Plan 2"};
        Assert.assertTrue(Reusable_Functions.Chk_DropDownOptions(BenefitDetails_SupPlan2_PlanType,exp));
        Btn_BenefitDetails_SupPlan2_Delete.click();
    }

    public static void PruFlexiCash_AddSupPlan_Medicash_Validate_Delete() {
        Btn_BenefitDetails_BasicPlanAddSupplementaryPlan.click();
        //Select Option Criss Cross III
        //Check Supplementary Plan 2  Details
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(Drp_BenefitDetails_SupPlan2_PlanName,"Medical Cash"));
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PremiumTerm),"15");
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PolicyTerm),"15");
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(BenefitDetails_SupPlan2_PlanType,"-"));
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PlanSumAssured),"0");
        //While adding the Rider it Defaults to 0 , when SA made 20000 MP set to 17.80
        Txt_BenefitDetails_SupPlan2_PlanSumAssured.sendKeys("150");
       Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_PlanModelPremium),"120.00");
       /*  String[] exp = {"Plan 1", "Plan 2", "Plan 3", "Plan 4"};
        Assert.assertTrue(Reusable_Functions.Chk_DropDownOptions(BenefitDetails_SupPlan2_BasicPlanType,exp));*/
        Btn_BenefitDetails_SupPlan2_Delete.click();
    }

    public static void PruFlexiCash_ClickPolicyOptions() {
        Btn_BenefitDetails_PolicyOptions.click();

    }

    public static void PruFlexiCash_ValidatePolicyAlterationModelDialog() {
        Assert.assertTrue(Drp_BenefitDetails_PolicyOption_CashBenefit.isDisplayed());

    }

    public static void PruFlexiCash_ValidatePolicyAlterationOptions() {
        //
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_PolicyOption_FromYear),"2");
        String[] exp = {"5% YEARLY CASH BENEFIT","DEFERMENT OF CASH BENEFIT","ACCUMULATE CASH BENEFIT"};
        Assert.assertTrue(Reusable_Functions.Chk_DropDownOptions(Drp_BenefitDetails_PolicyOption_CashBenefit,exp));
        //Select DEFERMENT OF CASH BENEFIT
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_PolicyOption_FromYear),"");
        //Select ACCUMULATE CASH BENEFIT
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_PolicyOption_FromYear),"");
        Btn_BenefitDetails_PolicyOption_Cancel.click();

    }

    public static void PruFlexiCash_NexClick() {
        Btn_BenefitDetails_Next.click();
    }

  /*  public static void PruFlexiCash_AddSupPlan_TermVantage_Validate_Delete() {
        Btn_BenefitDetails_BasicPlanAddSupplementaryPlan.click();
        //Select Option Criss Cross III
        //Check Supplementary Plan 2  Details
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(Drp_BenefitDetails_SupPlan2_BasicPlanName,"Medical Cash"));
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(Drp_BenefitDetails_SupPlan2_BasicPlanTerm,"15/15"));
        Assert.assertTrue(Reusable_Functions.Check_DropDownDefaultValue(BenefitDetails_SupPlan2_BasicPlanType,"-"));
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_BasicPlanSumAssured),"0");
        //While adding the Rider it Defaults to 0 , when SA made 20000 MP set to 17.80
        Txt_BenefitDetails_SupPlan2_BasicPlanSumAssured.sendKeys("150");
        Assert.assertEquals(Reusable_Functions.Get_TextBoxValue(Txt_BenefitDetails_SupPlan2_BasicPlanModelPremium),"120.00");
       *//*  String[] exp = {"Plan 1", "Plan 2", "Plan 3", "Plan 4"};
        Assert.assertTrue(Reusable_Functions.Chk_DropDownOptions(BenefitDetails_SupPlan2_BasicPlanType,exp));*//*
        Btn_BenefitDetails_SupPlan3_Delete.click();
    }*/


//****************Place required to change when xpath or property changes


    public void Validate_PlanDetails() {

         Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Crisis Cover Extra']")).getAttribute("value").contains("Crisis Cover Extra"));
        Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Accident Assist']")).getAttribute("value").contains("Accident Assist"));
        Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Recovery Aid Benefit']")).getAttribute("value").contains("Recovery Aid Benefit"));
         Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/div[2]/span")).getText().trim().contains("Min: 10000 Max: 99999500"));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/div[3]/span")).getText().trim().contains("Min: 1112"));


    }

    public void ValidateMinMaxforTerm() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Payment Mode')]//parent::div/input")).sendKeys("Half-Yearly");
        String DrpDown_Xpath = "//div[contains(text(),'Payment Mode')]//following-sibling::div[3]";
        String Element_Xpath = "//div[contains(text(),'Half-Yearly')]";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(DrpDown_Xpath)));
        driver.findElement(By.xpath(Element_Xpath)).click();
        Thread.sleep(2000);
        //System.out.println("Contains Text" + driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/div[3]/span")).getText().trim());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/div[3]/span")).getText().trim().contains("561.56"));


        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Payment Mode')]//parent::div/input")).sendKeys("Quarterly");
        String DrpDown_Xpath1 = "//div[contains(text(),'Payment Mode')]//following-sibling::div[3]";
        String Element_Xpath1 = "//div[contains(text(),'Quarterly')]";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(DrpDown_Xpath1)));
        driver.findElement(By.xpath(Element_Xpath1)).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/div[3]/span")).getText().trim().contains("283.56"));


        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Payment Mode')]//parent::div/input")).sendKeys("Monthly");
        String DrpDown_Xpath2 = "//div[contains(text(),'Payment Mode')]//following-sibling::div[3]";
        String Element_Xpath2 = "//div[contains(text(),'Monthly')]";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(DrpDown_Xpath2)));
        driver.findElement(By.xpath(Element_Xpath2)).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/div[3]/span")).getText().trim().contains("94.52"));


        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Payment Mode')]//parent::div/input")).sendKeys("Half-Yearly");
        String DrpDown_Xpath3 = "//div[contains(text(),'Payment Mode')]//following-sibling::div[3]";
        String Element_Xpath3 = "//div[contains(text(),'Half-Yearly')]";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(DrpDown_Xpath3)));
        driver.findElement(By.xpath(Element_Xpath3)).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/div[3]/span")).getText().trim().contains("561.56"));


    }


    public void ValidatePremiumChangeinMainPlabAffectSupp() throws InterruptedException {

        WebElement Txt_MainPlanSummassured = driver.findElements(By.xpath("//div[contains(text(),'SUM ASSURED *')]")).get(0);
        Reusable_Functions.EnterTextBox(driver,Txt_MainPlanSummassured,"10000");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[3]/div[3]/div[2]/input")).click();

        Thread.sleep(2000);
        System.out.println("Value" + driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[3]/div[3]/div[2]/input")).getAttribute("value").trim());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[3]/div[3]/div[2]/input")).getAttribute("value").trim().contains("10000"));
        //System.out.println("Finished");
    }

    public void SummAssuredAffectingModelPremium(String sa, String mp) throws InterruptedException {
        WebElement Txt_MainPlanSummassured = driver.findElements(By.xpath("//div[contains(text(),'SUM ASSURED *')]//parent::div/child::input")).get(0);
        Txt_MainPlanSummassured.clear();
        Reusable_Functions.EnterTextBox(driver,Txt_MainPlanSummassured,sa);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/div[3]/input")).click();
        Thread.sleep(2000);
        System.out.println("Value MP"+ driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/div[3]/input")).getAttribute("value"));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/div[3]/input")).getAttribute("value").contains(mp));


    }

    public void MPAffectsSA(String sa, String mp) throws InterruptedException {
        WebElement Txt_MainPlanMP = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/div[3]/input"));
        Txt_MainPlanMP.clear();
        Reusable_Functions.EnterTextBox(driver,Txt_MainPlanMP,sa);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/div[2]/input")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/div[2]/input")).getAttribute("value").trim().contains(mp));


    }

    public void DeleteAccAssist_RecoveryAidBenefit() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[5]/div[1]/button")).click();
        Thread.sleep(2000);
       // Assert.assertTrue(!is);
        //Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Recovery Aid Benefit']")).getSize().equals(0));
        System.out.println("Finished");
    }

/*
    public void AddCrisisCoverThree() {
        WebElement Plan_Name = driver.findElements(By.xpath("//div[contains(text(),'PLAN NAME *')]")).get(3);

    }
*/


    public void DeleteCrissCoverExtra() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[4]/div[1]/button")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[4]/div[1]/button")));

    }

    public void BenefitDetailsNext() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[1]/input")).click();
    }

    public void AddCrisisCoverThree() {
    }
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
