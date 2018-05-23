package pageobjects;
//import helpers.Log;

import helpers.Log;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import step_definitions.Hooks;
import step_definitions.Reusable_Functions;

import java.io.IOException;

//public class LifeAssured extends BaseClass{

public class BenefitSummary {
WebDriver driver = Hooks.driver;

@FindBy(how=How.ID, using="BenefitSummary_LifeAssured_MainLifeName")
public static WebElement Lbl_BenefitSummary_LifeAssured_MainLifeName;

    @FindBy(how=How.ID, using="BenefitSummary_LifeAssured_MainLifeAge")
    public static WebElement Lbl_BenefitSummary_LifeAssured_MainLifeAge;

    @FindBy(how=How.ID, using="BenefitSummary_PlanDetails_TotalPremium")
    public static WebElement Lbl_BenefitSummary_PlanDetails_TotalPremium;

    @FindBy(how=How.ID, using="BenefitSummary_PlanDetails_EditPlan")
    public static WebElement Lbl_BenefitSummary_PlanDetails_EditPlan;

    //**********Details Object added here because we need to check edit plans ,if clicked it goes to the Benefit Details Page ************
    @FindBy(how=How.ID, using="BenefitDetails_PolicyOptions")
    public static WebElement Btn_BenefitDetails_PolicyOptions;

    @FindBy(how=How.ID, using="BenefitDetails_Next")
    public static WebElement Btn_BenefitDetails_Next;
    //**********Details Object added here because we need to check edit plans ,if clicked it goes to the Benefit Details Page ************

    @FindBy(how=How.ID, using="BenefitSummary_PlanDetails_Currency")
    public static WebElement Lbl_BenefitSummary_PlanDetails_Currency;

    @FindBy(how=How.ID, using="BenefitSummary_PlanDetails_PayMode")
    public static WebElement Lbl_BenefitSummary_PlanDetails_PayMode;

    @FindBy(how=How.ID, using="BenefitSummary_PremiumDetails_Toggle")
    public static WebElement Btn_BenefitSummary_PremiumDetails_Toggle;

    @FindBy(how=How.ID, using="BenefitSummary_PremiumDetails_YearlyPremium")
    public static WebElement Lbl_BenefitSummary_PremiumDetails_YearlyPremium;

    @FindBy(how=How.ID, using="BenefitSummary_PremiumDetails_HalfYearPremium")
    public static WebElement Lbl_BenefitSummary_PremiumDetails_HalfYearPremium;

    @FindBy(how=How.ID, using="BenefitSummary_PremiumDetails_QuartPremium")
    public static WebElement Lbl_BenefitSummary_PremiumDetails_QuartPremium;

    @FindBy(how=How.ID, using="BenefitSummary_PremiumDetails_MonthlyPremium")
    public static WebElement Lbl_BenefitSummary_PremiumDetails_MonthlyPremium;

    @FindBy(how=How.ID, using="BenefitSummary_PremiumDetails_SinglePremium")
    public static WebElement Lbl_BenefitSummary_PremiumDetails_SinglePremium;

    @FindBy(how=How.ID, using="BenefitSummary_CrisisWaiver")
    public static WebElement Btn_BenefitSummary_CrisisWaiver;

    @FindBy(how=How.ID, using="CrisisWaiver_NoCrisisWaiver")
    public static WebElement Rbtn_CrisisWaiver_NoCrisisWaiver;

    @FindBy(how=How.ID, using="CrisisWaiver_BasicPlan")
    public static WebElement Rbtn_CrisisWaiver_BasicPlan;

    @FindBy(how=How.ID, using="CrisisWaiver_NoEarlyStage")
    public static WebElement Rbtn_CrisisWaiver_NoEarlyStage;

    @FindBy(how=How.ID, using="CrisisWaiver_IncludeEarlyStage")
    public static WebElement Rbtn_CrisisWaiver_IncludeEarlyStage;

    @FindBy(how=How.ID, using="CrisisWaiver_Save")
    public static WebElement Btn_CrisisWaiver_Save;

    @FindBy(how=How.ID, using="BenefitSummary_GenerateQuotation")
    public static WebElement Btn_BenefitSummary_GenerateQuotation;



//****************Place required to change when xpath or property changes



    public static void PruFlexiCash_ValidateLifeAssuredDetails() {
        Assert.assertEquals(Reusable_Functions.Get_LabelValue(Lbl_BenefitSummary_LifeAssured_MainLifeName),"Name");
        Assert.assertEquals(Reusable_Functions.Get_LabelValue(Lbl_BenefitSummary_LifeAssured_MainLifeAge),"Age");
  }

    public static void PruFlexiCash_ValidatePlanDetails() {
        Assert.assertEquals(Reusable_Functions.Get_LabelValue(Lbl_BenefitSummary_PlanDetails_Currency),"SGD");
        Assert.assertEquals(Reusable_Functions.Get_LabelValue(Lbl_BenefitSummary_PlanDetails_PayMode),"Yearly");
        Assert.assertEquals(Reusable_Functions.Get_LabelValue(Lbl_BenefitSummary_PlanDetails_TotalPremium),"5273.00");
        //Check if clicked on Edit plan it goes to Benefit Details page , Once it goes to Benefot Details Page ,click Next on Benefit Details to Navigate back to Benefit Summary .Again Validate the Name once Navigated to Benefit Summary
        Lbl_BenefitSummary_PlanDetails_EditPlan.click();
        Assert.assertTrue(Btn_BenefitDetails_PolicyOptions.isDisplayed());
        Btn_BenefitDetails_Next.click();
        Assert.assertEquals(Reusable_Functions.Get_LabelValue(Lbl_BenefitSummary_LifeAssured_MainLifeName),"Name");
        //Need to add for Plan Details Table Check for the Riders added

    }

    public static void PruFlexiCash_ValidatePremiumDetails() {
        Btn_BenefitSummary_PremiumDetails_Toggle.click();
        Assert.assertEquals(Reusable_Functions.Get_LabelValue(Lbl_BenefitSummary_PremiumDetails_YearlyPremium),"5,273.00");
        Assert.assertEquals(Reusable_Functions.Get_LabelValue(Lbl_BenefitSummary_PremiumDetails_HalfYearPremium),"2,662.87");
        Assert.assertEquals(Reusable_Functions.Get_LabelValue(Lbl_BenefitSummary_PremiumDetails_QuartPremium),"1,344.61");
        Assert.assertEquals(Reusable_Functions.Get_LabelValue(Lbl_BenefitSummary_PremiumDetails_MonthlyPremium),"448.21");
        Assert.assertEquals(Reusable_Functions.Get_LabelValue(Lbl_BenefitSummary_PremiumDetails_SinglePremium),"NA");


    }

    public static void PruFlexiCash_ClickCrisisWaiver() {
        Btn_BenefitSummary_CrisisWaiver.click();

    }

    public static void PruFlexiCash_CrisisWaiverSelect() {
        Assert.assertTrue(Rbtn_CrisisWaiver_BasicPlan.isEnabled());
        Assert.assertTrue(Rbtn_CrisisWaiver_IncludeEarlyStage.isEnabled());




    }

    public static void PruFlexiCash_CrisisWaiverSave() {
        Btn_CrisisWaiver_Save.click();
    }

    public static void PruFlexiCash_RevalidatePlanDetails() {
        //Check in Table for Crisis Option Entry

    }

    public static void PruFlexiCash_GenerateQuotation() {
        Btn_BenefitSummary_GenerateQuotation.click();

    }
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
