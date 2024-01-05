package steps;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class Ebebek {


    public static AndroidDriver driver;
    public static WebDriverWait wait;

    public void setup() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 4");
        caps.setCapability("udid", "emulator-5554"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11.0");
        caps.setCapability("appPackage", "com.solidict.ebebek");
        caps.setCapability("appActivity", "com.ebebek.android.view.MainActivity");

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(30L));
    }

    public static void clickElementById(By id) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(id));
        wait.until(ExpectedConditions.visibilityOfElementLocated(id));
        WebElement element = driver.findElement(id);
        element.click();
        Thread.sleep(1000);
    }
    public static void clickElementByXpath(By xpath) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(xpath));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element = driver.findElement(xpath);
        element.click();
        Thread.sleep(1000);
    }



    public static String getTextElement(By xpath){
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element = driver.findElement(xpath);
        return element.getText();
    }


    By kategoriler = By.id("com.solidict.ebebek:id/navCategories");
    By giyimTekstilKategorisi = By.xpath("(//*[@resource-id='com.solidict.ebebek:id/iv_icon'])[1]");

    By bebekGiyimKategorisi = By.xpath("(//*[@resource-id='com.solidict.ebebek:id/iv_arrow'])[1]");

    By filtreler = By.id("com.solidict.ebebek:id/linearLayout_ProductFilter");

    By fiyatAraligi = By.xpath("(//*[@resource-id='com.solidict.ebebek:id/tvFilterName'])[3]");

    By istenenAralik = By.xpath("(//*[@resource-id='com.solidict.ebebek:id/cbFilter'])[2]");

    By filtrele = By.xpath("(//*[@resource-id='com.solidict.ebebek:id/tvFilterName'])[5]");

    By stoktakiler = By.xpath("(//*[@resource-id='com.solidict.ebebek:id/cbFilter'])[1]");

    By filtreUygula = By.id("com.solidict.ebebek:id/btApplyFilter");

    By siralama = By.id("com.solidict.ebebek:id/linearLayout_ProductSorting");

    By enYuksekFiyat = By.xpath("(//*[@resource-id='com.solidict.ebebek:id/tvFilterName'])[4]");

    By cokDegerlendirilenler = By.xpath("(//*[@resource-id='com.solidict.ebebek:id/tvFilterName'])[5]");

    By urunSepeteEkle = By.xpath("(//*[@resource-id='com.solidict.ebebek:id/lytAddtoCartButton_'])[2]");

    By sepeteEkle = By.id("com.solidict.ebebek:id/textView_ButtonAddToCart");

    By sepetim = By.id("com.solidict.ebebek:id/navMyCarts");

    By miktarArtir = By.id("com.solidict.ebebek:id/lytPlusQuantity");

    By tutar = By.id("com.solidict.ebebek:id/textView_CartProduct_Price");


    By alisverisTamamla = By.id("com.solidict.ebebek:id/tvCompleteOrder");



    @Given("Ebebek baslat")
    public void testiBaslat() {  setup(); }

    @And("Kategoriler tıklanır")
    public void kategorilerTıklanır() throws InterruptedException { clickElementById(kategoriler);   }

    @And("Giyim Tekstil kategorisi tıklanır")
    public void giyimTekstilKategorisiTıklanır() throws InterruptedException { clickElementByXpath(giyimTekstilKategorisi); }

    @And("Bebek Giyim kategorisi tıklanır")
    public void bebekgiyimkategorisitıklanır() throws InterruptedException {   clickElementByXpath(bebekGiyimKategorisi); }

    @And("Filtreler tıklanır")
    public void filtrelerTıklanır() throws InterruptedException {  clickElementById(filtreler);   }

    @And("Fiyat Aralığı tıklanır")
    public void fiyatAralığıTıklanır() throws InterruptedException {   clickElementByXpath(fiyatAraligi);  }

    @And("50 - 100 aralığı seçilir")
    public void araligisecilir() throws InterruptedException {  clickElementByXpath(istenenAralik); }

    @And("Uygula tıklanır")
    public void uygulaTıklanır() throws InterruptedException {  clickElementById(filtreUygula);  }

    @And("Filtrele tıklanır")
    public void filtreleTıklanır() throws InterruptedException { clickElementById(filtrele);}

    @And("Stoktakiler tıklanır")
    public void stoktakilerTıklanır() throws InterruptedException { clickElementById(stoktakiler);   }

    @And("Ürünleri Gör tıklanır")
    public void ürünleriGörTıklanır() throws InterruptedException {  Thread.sleep(2000); clickElementById(filtreUygula);   }

    @And("Sıralama tıklanır")
    public void sıralamaTıklanır() throws InterruptedException {  clickElementById(siralama);    }

    @And("Çok Değerlendirilenler tıklanır")
    public void çokDeğerlendirilenlerTıklanır() throws InterruptedException {  clickElementByXpath(cokDegerlendirilenler);   }

    @And("En yüksek fiyata göre tıklanır")
    public void enYüksekFiyataGöreTıklanır() throws InterruptedException { clickElementById(enYuksekFiyat);   }

    @And("Ürün için sepete ekle tıklanır")
    public void ürünIçinSepeteEkleTıklanır() throws InterruptedException {  clickElementByXpath(urunSepeteEkle);  }

    @And("Ürün detayında Sepete Ekle tıklanır")
    public void ürünDetayındaSepeteEkleTıklanır() throws InterruptedException {  ;  clickElementById(sepeteEkle);  }

    @And("Sepetim tıklanır")
    public void sepetimTıklanır() throws InterruptedException {  clickElementById(sepetim);   }

    @And("Miktar artırılır")
    public void miktarartirilir() throws InterruptedException {
        double price =  Double.parseDouble(getTextElement(tutar).replace(" TL","").replace(".","").replace(",","."));
        clickElementById(miktarArtir);
        Thread.sleep(1000);
        double newprice =  Double.parseDouble(getTextElement(tutar).replace(" TL","").replace(".","").replace(",","."));
        if (newprice==(price*2)){
            System.out.println("Doğru Tutar: " + price + " x 2 = " + newprice);
        }
        else {
            System.out.println("Hatalı Tutar: " + price + " x 2 != " + newprice);
        }
        Thread.sleep(5000);
    }

    @And("Alışverişi Tamamla tıklanır")
    public void alışverişiTamamlaTıklanır() throws InterruptedException {  clickElementById(alisverisTamamla);   }

    @Then("Ebebek kapat")
    public void ebebekKapat() throws InterruptedException {  Thread.sleep(3000); driver.quit(); }

    @And("Bekle")
    public void Bekle() {
        try { Thread.sleep(5000);}
        catch (InterruptedException e) { throw new RuntimeException(e); }
    }



}