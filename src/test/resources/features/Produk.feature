@produk

  Feature: Produk page test
    Scenario Outline: Add new product
      Given User input "indoapril@gmail.com" as email and "indoapril123" as password and click login
      And User should be directed to the dashboard page
      And User click product button
      And User should be directed to the product page
      And User click tambah produk button
      And User input "<kode>" as code and "<Nama>" as name and "<Deskripsi>" as description and "<Harga Beli>" as price and "<Harga Jual>" as purchase price and "<Stok>" as stock and "<Kategori>" as category
      And User click simpan button
      Then verify the product is already on list
      Examples:
      |kode|Nama|Deskripsi|Harga Beli|Harga Jual|Stok|Kategori|
      |A001|Teh Murni|100% daun teh asli| 2500 | 5000|10|Teh  |