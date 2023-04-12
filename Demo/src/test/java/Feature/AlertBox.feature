Feature:Alert Box

  @alertbox
  Scenario: User goes to site and tests alert boxes
    Given user goes to alert box url
    Then he clicks first alert button
    Then he clicks second alert button
    Then he clicks third alert button
    And he clicks fourth alert button