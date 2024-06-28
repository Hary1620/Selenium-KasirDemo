@kategori
Feature: Kategori Page test
 Scenario Outline: Add new kategori
    Given User input "indoapril@gmail.com" as email and "indoapril123" as password and click login
    And User should be directed to the dashboard page
    And User click kategori button
    And user should be dirrected to kategori page
    And User click tambah button
    And User input "<Name>" as name and "<Description>" as description and user click simpan
    Then verify the product is already on list
  Examples:
   |Name | Description|
   | Teh | Dari daun teh pilihan|
   | Susu| 100% susu sapi murni |