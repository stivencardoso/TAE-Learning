Feature: Register new user

  Scenario Outline: Register user
    Given I am on the new registration form
    When I fill the text box email whit the value <"Email">
    And I fill the text box password whit the value <"Password">
    And I touch the buttoon Register the information in the system
    Then I was successfully registered

  Examples:
    |Email             |Password|
    |Juanito@gmail.com |bonito1234|
    |Stiven@hotmail.com|Lindote2355|
    |manu@outlook.com  |Miau2354   |