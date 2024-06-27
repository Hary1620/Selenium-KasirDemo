@login
Feature: Login Test
  Scenario: Login with valid credentials
    Given User open the web kasir demo
    When User input "indoapril@gmail.com" as email and "indoapril123" as password and click login
    Then User should be directed to the dashboard page

  Scenario: Login with unregistered user
    Given User open the web kasir demo
    When User input "betamart@yahoo.com" as email and "halo123" as password and click login
    Then system gives pop up message "Kredensial yang Anda berikan salah"

  Scenario: Login with empty password field
    Given User open the web kasir demo
    When User input "indoapril@gmail.com" as email and click login
    Then system gives pop up message "\"password\" is not allowed to be empty"

  Scenario: Login with empty email field
    Given User open the web kasir demo
    When User input "indoapril123" as password and click login
    Then system gives pop up message "\"email\" is not allowed to be empty"




