@ebebek
Feature: Ebebek odevi

  Scenario: Ebebek senaryosu
    Given Ebebek baslat
    And Kategoriler tıklanır
    And Giyim Tekstil kategorisi tıklanır
    And Bebek Giyim kategorisi tıklanır
    And Filtreler tıklanır
    And Fiyat Aralığı tıklanır
    And 50 - 100 aralığı seçilir
    And Uygula tıklanır
    And Ürünleri Gör tıklanır
    And Sıralama tıklanır
    And Çok Değerlendirilenler tıklanır
    And Sıralama tıklanır
    And Çok Değerlendirilenler tıklanır
    And İlk ürün için sepete ekle tıklanır
    And Ürün detayında Sepete Ekle tıklanır
    And Sepetim tıklanır
    And Miktar artırılır
    And Alışverişi Tamamla tıklanır
    Then Ebebek kapat