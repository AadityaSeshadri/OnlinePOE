Feature: 2PruFlexiCash_E2E_TestCases

  @PruFlexiClientCreation
  Scenario Outline: Create and Update Clients Information for Pru Flexi Cash
    When Agent Navigate to POE Url
    When clicks on New Proposal
    When Clicks on New Client in Landing Page
    When Enters Basics Info"<Title>""<ChristianName>""<GivenName>""<Surname>""<MaritalStatus>""<DOB>""<Nationality>""<NRICPassport>""<Gender>""<Smoker_Value>"
    When Enters Contact Info"<HomePhoneCountryCode>""<HomePhone>""<OfficePhoneCountryCode>""<OfficePhone>""<MobilePhoneCountryCode>""<MobilePhone>""<Email>""<PostalCode>""<Block>""<Street>""<Building>""<FloorUnit>""<City>""<State>""<Country>"
    When Enters EducationOccupation Info"<EnglishProficiency>""<Education>""<Occupation>""<Others>"
    When Enters Others Info"<NeedAnalysisRecommendation>"
    When Clicks on Save Button on Create New Client Form Page and Click on Next
    Then Added Client info "<Surname>" shown in Life Assured Profile Page
    When Edit Client info to add"<PremiumBackDateValue>""<Residency>""<ImpairedLifeValue>"
      Examples:
      |Title|ChristianName|GivenName               |Surname     |MaritalStatus|DOB       |Nationality|NRICPassport|Gender|Smoker_Value|HomePhoneCountryCode|HomePhone|OfficePhoneCountryCode|OfficePhone|MobilePhoneCountryCode|MobilePhone|Email    |PostalCode|Block|Street|Building|FloorUnit|City     |State    |Country  |EnglishProficiency|Education       |Occupation                            |Others|NeedAnalysisRecommendation|PremiumBackDateValue|Residency|ImpairedLifeValue|
      |Mr   |Chris        |MaleNSSingaporean       |AgeEleven   |Single       |31/08/2007|Singaporean|G3256995T   |M     |No          |Singapore (65)      |12345678 |Singapore (65)        |12345678   |Singapore (65)        |12345678   |AE@g.com |123456    |111  |Str   |Buil    |111      |Singapore|Singapore|Singapore|Yes               |Tertiary & above|Pastor                                |      |Yes                       |No                  |Singapore|Yes              |
      |Mrs  |Chris        |FemaleNSSingaporean     |AgeTwenty   |Single       |31/08/1998|Singaporean|G3256995T   |F     |No          |Singapore (65)      |12345678 |Singapore (65)        |12345678   |Singapore (65)        |12345678   |AT@g.com |123456    |111  |Str   |Buil    |111      |Singapore|Singapore|Singapore|Yes               |Tertiary & above|Group Merchandise                     |      |Yes                       |No                  |Singapore|Yes              |
      |Mr   |Chris        |MaleSSingaporean        |AgeFiftyOne |Single       |31/08/1967|Singaporean|G3256995T   |M     |Yes         |Singapore (65)      |12345678 |Singapore (65)        |12345678   |Singapore (65)        |12345678   |AFO@g.com|123456    |111  |Str   |Buil    |111      |Singapore|Singapore|Singapore|Yes               |Tertiary & above|Court Assistant                       |      |Yes                       |No                  |Singapore|Yes              |
      |Mrs  |Chris        |FemaleSSingaporean      |AgeFifySix  |Single       |31/08/1962|Singaporean|G3256995T   |F     |Yes         |Singapore (65)      |12345678 |Singapore (65)        |12345678   |Singapore (65)        |12345678   |AFS@g.com|123456    |111  |Str   |Buil    |111      |Singapore|Singapore|Singapore|Yes               |Tertiary & above|Bus Driver                            |      |Yes                       |No                  |Singapore|Yes              |
      |Mr   |Chris        |MaleNSSingaporean       |AgeSixtyOne |Single       |31/08/1957|Singaporean|G3256995T   |M     |No          |Singapore (65)      |12345678 |Singapore (65)        |12345678   |Singapore (65)        |12345678   |ASO@g.com|123456    |111  |Str   |Buil    |111      |Singapore|Singapore|Singapore|Yes               |Tertiary & above|Tour Coordinator/Consul(admin)        |      |Yes                       |No                  |Singapore|Yes              |

  @PruFlexiGenerateBI
   Scenario Outline: Search for Created Clients and Generate BI with Main Plan ,Default Auto Attached Riders
    When Agent Navigate to POE Url
    When clicks on New Proposal
    When Search Client Name"<Surname>"
    When Click on Next Button in Life Assured Page
    When Validate Product Selection Page
    When Select PruFlexi Cash Product
    When Navigated to Benefit Details Page
    Then Validate Plan Name and Details
    Then Validate Min Max Value of Sum Assured Model Premium for Yearly Half Yeraly Quarterly Monthly
    Then Validate Change of Premium in Main Plan affects Supplementary Plans
    Then Validate Change of Sum Assured affect  Model Premium"<SumAssuredValue>""<ExpectedModelPremium>"
    Then Validate Change of Model Premium  affect Sum Assured"<ModelPremiumValue>""<ExpectedSumAssuredValue>"
    Then Validate Deletion of Accident Assist will Delete Recovery Aid Benefit
    Then Delete Criss Cover Extra
    Then Click on Next Button in Benefit Details Page
    Then Validate Plan Details of Benefit Summary"<TotalPremium>"
    Then Premium Details of Benefit Summary"<YearlyPremium>""<HalfYearlyPremium>""<QuartYearlyPremium>""<MonthlyPremium>""<SinglePremium>"
    Then Click on Generate Quotation
    Then Validate BI Generated

    Examples:
    |Surname     |SumAssuredValue|ExpectedModelPremium|ModelPremiumValue|ExpectedSumAssuredValue|TotalPremium|YearlyPremium|HalfYearlyPremium|QuartYearlyPremium|MonthlyPremium|SinglePremium|
    |AgeTwenty   |20000          |1082.72             |5000             |95500                  |5156.2      | 10210.29    |5156.2           |2603.62           |867.87        |N/A          |



         # Then Add Supplementary Plan Crisis Cover Three
   # Then Validate Min Max Value of Sum Assured in Crisis Cover Three
   # Then Set Sum Assured Value of Crisis Cover Three"<CrisisCoverThreeSumAssured>"
   # Then Validate Model Premium Value of Crisis Cover Three"<CrisisCoverThreeExpectedModelPremium>"
