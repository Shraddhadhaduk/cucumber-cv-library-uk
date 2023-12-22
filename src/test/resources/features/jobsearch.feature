@regression
Feature: CV library homepage
  As a user, i would like to add job details

  @author_shraddha @sanity @smoke @regression
  Scenario Outline: Verify JobSearch Result Using Different Data Set
    Given   I am on HomePage
    When enter job title "<jobTitle>"
    Then enter Location "<location>"
    And select distance "<distance>"
    And click on moreSearchOptionsLink
    And enter salaryMin "<salaryMin>"
    And enter salaryMax "<salaryMax>"
    And select salaryType "<salaryType>"
    And select jobType "<jobType>"
    And click on Find Jobs button
    #And verify the result "<result>"

    Examples:
      | jobTitle          | location                     | distance      | salaryMin | salaryMax | salaryType | jobType        | result                                          |
      | Tester            | Harrow                       | up to 5 miles | 30000     | 500000    | Per annum  | Permanent      | Permanent Tester jobs in Harrow on the Hill     |
      | Developer         | Basildon                     | 25 miles      | 40000     | 60000     | Per annum  | Contract       | Contract Developer jobs in Basildon             |
      | Quality Engineer  | Edinburgh, City of Edinburgh | 10 miles      | 40000     | 70000     | Per annum  | Temporary     | Temporary Quality Engineer jobs in Edinburgh    |
      | Quality Assurance | London                       | 35 miles      | 45000     | 75000     | Per annum  | Apprenticeship | Apprenticeship Quality Assurance jobs in London |
      | Test Engineer     | Derby                        | 10 miles      | 25000     | 45000     | Per annum  | Part Time      | Part Time Test Engineer jobs in Derby           |
      | Test Analyst      | Edenbridge, Kent             | 25 miles      | 25000     | 45000     | Per annum  | Permanent      | Permanent Test Analyst jobs in Edenbridge       |
      | Test Manager      | Hampshire                    | 35 miles      | 35000     | 65000     | Per annum  | Permanent      | Permanent Test Manager jobs in Hampshire        |