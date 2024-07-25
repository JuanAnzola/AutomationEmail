Feature: Delete unwanted emails

  Scenario: Login as personal user and delete the unwanted emails
    Given Login the page and enter in the personal account
    And Search the unwanted emails
    And Delete all the unwanted emails
    When Check that there aren't more unwanted emails
    Then Log out of the personal account