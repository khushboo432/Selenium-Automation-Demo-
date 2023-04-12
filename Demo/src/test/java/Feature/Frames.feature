Feature:Frames

  @frames
  Scenario: User goes to different page and gives input text
    Given user navigates to demoqa site
    Then he inputs text in single frame
    Then he inputs text in multiple frame