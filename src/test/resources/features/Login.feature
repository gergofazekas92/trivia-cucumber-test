Feature: User Login
  As a registered user
  I want to be able to log in to my account
  So that I can access my personalized content

  Scenario Outline: Successful Login
    Given I am on the login page
    When I enter username "<username>", password "<password>" and I click the login button
    Then I should be redirected to the home page

    Examples:
      | username | password      |
      | TestUser | validPassword |

  Scenario Outline: Login with invalid credentials
    Given I am on the login page
    When I enter username "<username>", password "<password>" and I click the login button
    Then I should see an error message "<error>"

    Examples:
      | username        | password    | error                             |
      | TestUser        | invalidpass | Username or password is incorrect |
      | TestUser        |             | Username or password is incorrect |
      | NonExistingUser | invalidpass | Username is not registered        |


