Feature: 1PruFlexiCash_Integration_Testcases
  Background: Create Clients for POE products
  @IntegrationCase1
    Scenario: Mandatory Field Check in Create New Client
      When Agent Navigate to POE Url
      Then Validate Elements in POE Landing Page
      When clicks on New Proposal
      When Validate Elements in New_Existing Client Page
      When Clicks on New Client in Landing Page
      When Clicks on Next Button on Create New Client Form Page
      Then Mandatory Fields should be shown

  @Login
  Scenario: Integration Test case in Create New Client
    When Agent Navigate to POE Url
    Then Validate Elements in POE Landing Page
    When clicks on New Proposal
    When Validate Elements in New_Existing Client Page
    When Clicks on New Client in Landing Page
    Then Execute Integration Test cases in New Client Info

     @test
    Scenario Outline: Scenario to Validate Creation of Client with Only Surname and Date of Birth
      When Agent Navigate to POE Url
      When clicks on New Proposal
      When Clicks on New Client in Landing Page
      When Enters Surname "<Surname>" DOB "<DOB>" in New Client Form Page
      When Clicks on Next Button on Create New Client Form Page
      Then Added Client info "<Surname>" shown in Life Assured Profile Page
      Examples:
        |Surname         |DOB          |
        |  AgeE          | 31/08/2007  |
        |  AgeT          | 31/08/1998  |
        |  AgeFO         | 31/08/1967  |
        |  AgeFS         | 31/08/1962  |
        |  AgeSO         | 31/08/1957  |








