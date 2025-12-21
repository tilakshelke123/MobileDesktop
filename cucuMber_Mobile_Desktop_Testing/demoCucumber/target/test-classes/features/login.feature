Feature: login

  @login
  Scenario:
    Given I am on the login page
    When I enter username "testUser"
    And I enter password "testPass"
    And I click the login button
    Then I should see the home page

  Scenario: Outline
    Given I am on the login page
    When I Login with "<username>" and "<password>"
    And I click on "<button>" button

    Examples:
      | username  | password  | button |
      | testUser1 | Pass123   | Login  |
      | testUser2 | Pass12345 | Submit |

  Scenario: Integer Outline
    When I calculate  with 50 and 20

  @login
  Scenario: tag outline
    Given I am on the login page
