Feature: 2PruFlexiCash
  Background: SQS,Proposal,Signature for Pru Flexi Cash

  Scenario:PruFlexiCash-SQS
    #When User Navigates to SQS Tab
   # Then User Validates Elements in the SQS Page
    #Then User able to see name of Main Life Assured created in Client Profile




    @PruFlexiCash1
    Scenario Outline:PruFlexiCash-Singaporean Male Non Smoker Age 11
      When Male Non Smoker User of Age eleven Navigated to SQS Tab for Pru Flexi Cash with URL "<URL>"
      Then Should able to see name "<Name>" and Age "<Age>" of Main Life Assured created in Client Profile
      #Life Assured Edit Profile Page-Editing Client Profile in Life Assured Page not in Scope
        #Joint Proposer,Joint Life,Payer Security Plus in Life Assured Profile not in scope
      When clicks on the Next Button on Life Assured Page
      Then Navigated to Product Selector Page and Should be able to view the List of Products
       #Products Arranged with Classification not in scope
      When Selects Pru Flexi Cash Product
      Then Navigated to Benifit Details Page and Validate Basic Plan and Supplementary plan Details of Pru Flexi Cash on Page Load
      Then Validate MinMax of Sum Assured and Premium of Pru Flexi Cash
      Then Enters SumAssured "<SA>" PaymentMode "<PayMode>"
      Then Validate on changing Sum Assured  Premium Value changes
      Then Validate on Changing  Premium Sum Assured value changes
      #Need to check if below validatoion is reqiired to be included as when policy term changes both SA and MP set to 0
      Then Validate on changing Policy Term Sum Assured and Premium changes
      Then Able to Delete Supplementary Riders Criss Cover Accident Assist Recovery Aid
      Then Able to add new Supplementary plan Criss CoverThree Validate PremiumPolicy Term Premium and MinMax "<MinMaxCrissCoverThree>" Enter Sum Assured and Able to Delete Plan after Addition
      Then Able to add new Supplementary plan CrissCoverKids Validate PremiumPolicy Term Premium and MinMax "<MinMaxCrisisCoverKids>" Enter Sum Assured  and Able to Delete Plan after Addition
      Then Able to add new Supplementary plan EarlyStageCrisisCover Validate PremiumPolicy Term Premium and MinMax "<MinMaxEarlyStageCrisisCover>" Enter Sum Assured  and Able to Delete Plan after Addition
      Then Able to add new Supplementary plan FractureCarePA Validate Plan types Term Premium and Able to Delete Plan after Addition
      Then Able to add new Supplementary plan Medicash Validate PremiumPolicy Term Premium and MinMax "<MinMaxMediCash>" Enter Sum Assured  and Able to Delete Plan after Addition
      #Then Able to add new Supplementary plan TermVantage Validate PremiumPolicy Term Premium and Able to Delete Plan after Addition
      When Click on Policy Options Button
      Then Policy Alteration Model Dialog Opens
      Then Validate Default value of Cash Benefit and From Year and Options for Cash Benifit
      When Click on Next Button on Benefit Details Page
      Then Navigate to Benefit Summary Page and Validates Life Assured Details in Life Assured Section
      Then Validates Total Premium PaymentMode "<PayMode>" and other Details in Plan Details Section
      Then Expand Premium Details to Validate Premium Values
      When Click on CrisisWaiver Button Crisis Waiver Model Dialog Opened
      Then Select Basic Plan and Include Early Stage Crisis Waiver Radio Buttons
      When Click on Save Button
      Then Crisis Waiver Updated in Plan Details Section
      When Click on Generate Quotation Button
      Then Quotation Generated
      Then Quotation Details are Validated
      Examples:
      |URL                                                                              |Name|Age|SA           |PayMode|MinMaxCrissCoverThree          |MinMaxCrisisCoverKids         |MinMaxEarlyStageCrisisCover|MinMaxMediCash    |
      | "http://192.168.90.238:5002/new-proposal/2b04469f-31c4-45ca-82c3-54322845b52b"  |    |   |40000        |       |Min/Max SA:10,000/50,000       |Min/Max SA: 10,000/50,000     |Min/Max SA: 10,000/250,000 |Min/Max SA:150/500|
  @PruFlexiCash2
  Scenario Outline:PruFlexiCash-Singaporean Male Non Smoker Age 20
    When Male Non Smoker User of Age Twenty Navigated to SQS Tab for Pru Flexi Cash with URL "<URL>"
    Then Should able to see name "<Name>" and Age "<Age>" of Main Life Assured created in Client Profile
      #Life Assured Edit Profile Page-Editing Client Profile in Life Assured Page not in Scope
        #Joint Proposer,Joint Life,Payer Security Plus in Life Assured Profile not in scope
    When clicks on the Next Button on Life Assured Page
    Then Navigated to Product Selector Page and Should be able to view the List of Products
       #Products Arranged with Classification not in scope
    When Selects Pru Flexi Cash Product
    Then Navigated to Benifit Details Page and Validate Basic Plan and Supplementary plan Details of Pru Flexi Cash on Page Load
    Then Validate MinMax of Sum Assured and Premium of Pru Flexi Cash
    Then Enters SumAssured "<SA>" PaymentMode "<PayMode>"
    Then Validate on changing Sum Assured  Premium Value changes
    Then Validate on Changing  Premium Sum Assured value changes
      #Need to check if below validatoion is reqiired to be included as when policy term changes both SA and MP set to 0
    Then Validate on changing Policy Term Sum Assured and Premium changes
    Then Able to Delete Supplementary Riders Criss Cover Accident Assist Recovery Aid
    Then Able to add new Supplementary plan Criss CoverThree Validate PremiumPolicy Term Premium and MinMax "<MinMaxCrissCoverThree>" Enter Sum Assured and Able to Delete Plan after Addition
    Then Able to add new Supplementary plan CrissCoverKids Validate PremiumPolicy Term Premium and MinMax "<MinMaxCrisisCoverKids>" Enter Sum Assured  and Able to Delete Plan after Addition
    Then Able to add new Supplementary plan EarlyStageCrisisCover Validate PremiumPolicy Term Premium and MinMax "<MinMaxEarlyStageCrisisCover>" Enter Sum Assured  and Able to Delete Plan after Addition
    Then Able to add new Supplementary plan FractureCarePA Validate Plan types Term Premium and Able to Delete Plan after Addition
    Then Able to add new Supplementary plan Medicash Validate PremiumPolicy Term Premium and MinMax "<MinMaxMediCash>" Enter Sum Assured  and Able to Delete Plan after Addition
      #Then Able to add new Supplementary plan TermVantage Validate PremiumPolicy Term Premium and Able to Delete Plan after Addition
    When Click on Policy Options Button
    Then Policy Alteration Model Dialog Opens
    Then Validate Default value of Cash Benefit and From Year and Options for Cash Benifit
    When Click on Next Button on Benefit Details Page
    Then Navigate to Benefit Summary Page and Validates Life Assured Details in Life Assured Section
    Then Validates Total Premium PaymentMode "<PayMode>" and other Details in Plan Details Section
    Then Expand Premium Details to Validate Premium Values
    When Click on CrisisWaiver Button Crisis Waiver Model Dialog Opened
    Then Select Basic Plan and Include Early Stage Crisis Waiver Radio Buttons
    When Click on Save Button
    Then Crisis Waiver Updated in Plan Details Section
    When Click on Generate Quotation Button
    Then Quotation Generated
    Then Quotation Details are Validated
    Examples:
      |URL                                                                              |Name|Age|SA           |PayMode|MinMaxCrissCoverThree          |MinMaxCrisisCoverKids         |MinMaxEarlyStageCrisisCover|MinMaxMediCash    |
      | "http://192.168.90.238:5002/new-proposal/2b04469f-31c4-45ca-82c3-54322845b52b"  |    |   |40000        |       |Min/Max SA:10,000/50,000       |Min/Max SA: 10,000/50,000     |Min/Max SA: 10,000/250,000 |Min/Max SA:150/500|

  @PruFlexiCash3
  Scenario:PruFlexiCash-Singaporean Male  Smoker Age 51
    When Male  Smoker User of Age 51 Navigated to SQS Tab for Pru Flexi Cash
    Then User able to see name of Main Life Assured created in Client Profile
    When User clicks on the Next Button on Life Assured Page
    Then User Navigated to Product Selector Page
    Then User Should be able to view the List of Products
    When User Selects Pru Flexi Cash Product
    Then User Navigated to Benifit Details Page
  @PruFlexiCash4
  Scenario:PruFlexiCash-Singaporean Female  Smoker Age 56
    When Female  Smoker User of Age 56 Navigated to SQS Tab for Pru Flexi  Cash
    Then User able to see name of Main Life Assured created in Client Profile
    When User clicks on the Next Button on Life Assured Page
    Then User Navigated to Product Selector Page
    Then User Should be able to view the List of Products
    When User Selects Pru Flexi Cash Product
    Then User Navigated to Benifit Details Page
  @PruFlexiCash5
  Scenario Outline:PruFlexiCash-Singaporean Male Non Smoker Age 61
    When Male Non Smoker User of Age Sixty one Navigated to SQS Tab for Pru Flexi Cash with URL "<URL>"
    Then Should able to see name "<Name>" and Age "<Age>" of Main Life Assured created in Client Profile
      #Life Assured Edit Profile Page-Editing Client Profile in Life Assured Page not in Scope
        #Joint Proposer,Joint Life,Payer Security Plus in Life Assured Profile not in scope
    When clicks on the Next Button on Life Assured Page
    Then Navigated to Product Selector Page and Should be able to view the List of Products
    Then In Product Selector Page Pru Flexi Cash not appear

    Examples:
    |URL|Name|Age|
    |   |    |   |
  @PruFlexiCash6
  Scenario: PruFlexiCash-Proposal

  @PruFlexiCash7
  Scenario: PruFlexiCash-Signature

    @dummy
    Scenario: Dummy
      When Aceess App URL
      Then Execute



