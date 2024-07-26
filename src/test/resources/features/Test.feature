Feature: Delete unwanted emails

  Scenario: Login as a personal user and delete the unwanted emails
    Given Log in to the page and access the personal account
    And Search the unwanted emails
    And Delete all the unwanted emails
    When Check that there are no more unwanted emails
    Then Log out of the personal account