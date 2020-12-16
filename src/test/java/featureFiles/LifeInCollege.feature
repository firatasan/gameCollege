Feature: Life in College part from Game College Webpage testing

  Background: Precondition HomePage
    Given Navigate to gameCollege
    Then User should see "Game College Home" Page successfully

  Scenario: TC_01 Online Education
    When User move mouse cursor to element
      | lifeInCollege |
    Then User click on element
      | onlineEd |
    Then User should see "Online Education" Page successfully

  Scenario: TC_02 Social Activities
    When User move mouse cursor to element
      | lifeInCollege |
    Then User click on element
      | socialActivities |
    Then User should see "Social Activities" Page successfully

  Scenario: TC_03 Game Jam
    When User move mouse cursor to element
      | lifeInCollege |
    Then User click on element
      | gameJam |
    Then User should see "Game Jam" Page successfully

  Scenario: TC_04 Excursions
    When User move mouse cursor to element
      | lifeInCollege |
    Then User click on element
      | excursions |
    Then User should see "Excursions" Page successfully

  Scenario: TC_05 Clubs Main Test
    When User move mouse cursor to element
      | lifeInCollege |
    Then User click on element
      | clubs |
    Then User should see "Clubs" Page successfully

    Then User click on element
      | socialMediaClubs |
    Then User should see "Social Media Clubs" Page successfully

    When User move mouse cursor to element
      | lifeInCollege |
    Then User click on element
      | clubs |
    Then User should see "Clubs" Page successfully
    Then User click on element
      | gameArtClub |
    Then User should see "Game Art Club" Page successfully

    When User move mouse cursor to element
      | lifeInCollege |
    Then User click on element
      | clubs |
    Then User should see "Clubs" Page successfully
    Then User click on element
      | gameMarketingClub |
    Then User should see "Game Marketing Club" Page successfully

    When User move mouse cursor to element
      | lifeInCollege |
    Then User click on element
      | clubs |
    Then User should see "Clubs" Page successfully
    Then User click on element
      | gameCollegeMagazineClub |
    Then User should see "Game College Magazine Club" Page successfully

    When User move mouse cursor to element
      | lifeInCollege |
    Then User click on element
      | clubs |
    Then User should see "Clubs" Page successfully
    Then User click on element
      | gameNetworkingClub |
    Then User should see "Game Networking Club" Page successfully

  Scenario: TC_06 Clubs Alternative Test
    When User move mouse cursor to element
      | lifeInCollege |
    Then User click on element
      | clubs |
    Then User should see "Clubs" Page successfully

    Then User click on element
      | socialMediaClubs |
    Then User should see "Social Media Clubs" Page successfully

    Then User click on elementx
      | gameArtClub2 |
    Then User should see "Game Art Club" Page successfully

    Then User click on elementx
      | gameMarketingClub2 |
    Then User should see "Game Marketing Club" Page successfully

    Then User click on elementx
      | gameCollegeMagazineClub2 |
    Then User should see "Game College Magazine Club" Page successfully

    Then User click on elementx
      | gameNetworkingClub2 |
    Then User should see "Game Networking Club" Page successfully

  Scenario: TC_06 Library
    When User move mouse cursor to element
      | lifeInCollege |
    Then User click on element
      | library |
    Then User should see "Library" Page successfully