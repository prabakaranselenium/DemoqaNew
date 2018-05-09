Feature: Test the Demoqa site and enter the values in text box
 
   Scenario Outline: Verify the given inputs are enter in the text box
    Given The user is in Demoqa site
    When The user given the values "<fieldname1>","<fieldname2>","<fieldname3>""<fieldname4>","<fieldname5>","<fieldname6>","<fieldname7>","<fieldname8>"
    Then The user verifies items are sucessfully added
    Examples: 
      | fieldname1 |fieldname2|fieldname3 |fieldname4 |fieldname5 |fieldname6 |fieldname7 |fieldname8 |
      | Prabakaran | Ramamoorthy|8608707070|prabakaran|prabakaran@gmail.com|sdhjfdhjfdhd|pragate123|pragate123|
      
   Scenario Outline: Verify the user select radio button or not
    Given The user is in Demoqa site
    When The user select the radio button "<radiobutton1>","<radiobutton2>","<radiobutton3>"
    Then The user verifies radio button is selected or not
    Examples: 
      | radiobutton1 |radiobutton2|radiobutton3|
      | Single | Married|divorced|
      
    Scenario Outline: Verify the user select checkbox or not
    Given The user is in Demoqa site
    When The user select the radio button "<Checkbox1>","<Checkbox1>","<Checkbox1>"
    Then The user verifies Check boxes are selected or not
    Examples: 
      | Checkbox1|Checkbox2|Checkbox3 |
      | dance    |reading  |cricket |
      
      
    Scenario Outline: Verify the user select dropdown list or not
    Given The user is in Demoqa site
    When The user select the dropdown list "<Dropdown1>","<Dropdown2>","<Dropdown3>","<Dropdown4>"
    Then The user verifies Check boxes are selected or not
    Examples: 
      | Dropdown1|Dropdown2|Dropdown3|Dropdown4|
      | Colombia |5        |4        |2012|
      
   