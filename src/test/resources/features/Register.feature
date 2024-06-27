@register
Feature: Register Test
  Scenario: Register with valid credential
    Given User open the web kasir demo
    When user click a teks "ingin mencoba, daftar ?"
    And User should be directed to the register page
    And User input "IndoApril" as shop name and user input "indoapril@gmail.com" as email and user input "indoapril123" as password and click register
    Then User should be directed to login page


