import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

///**
// * Created by Volodymyr_Zaverukha on 11/14/2016.
//// */
//public class Main {
//    public static void main(String[] args) throws InterruptedException {
//        FirefoxProfile firefoxProfile = new FirefoxProfile(new File
//                ("C:\\Users\\Volodymyr_Zaverukha\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\f9zr5z1j.default"));
//        WebDriver driver = new FirefoxDriver(firefoxProfile);
//        driver.get("https://epuakyiw0699.kyiv.epam.com/CWPTEST");
//        Thread.sleep(2000);
//        WebElement b = driver.findElement(By.xpath(".//button[@ng-click='login()']"));
//        b.click();
//
//    }
//}



//    public final String MAIN_PAGE = "http://www.screwfix.com";
//    public final String ID_BUILDING = "firstLevelCat_7";
//    public final String ID_ROOFING = "sub_category_image_3";
//    public final String ID_ROOF_WINDOWS = "sub_category_image_0";
//    public final String ID_DELIVER = "product_add_button_7498P";
//    public final String LINKTEXT_CHECKOUT = "Checkout Now";
//    public final String XPATH_WINDOW_INROOF = "//*[@id='product_quoteNo_1']";
//    public final String ID_WINDOW_INBASKET = "trolley_page_product_quote_number_1";
//    private static WebDriver driver;
//    @Test
//    public void test() throws IOException, InterruptedException {
//        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get(MAIN_PAGE);
//
//        Thread.sleep(5000);
//        WebElement elementBuilding = driver.findElement(By.xpath("html/body/div[1]/div[3]/div[3]/div/div[2]/div[2]"));
//
//        elementBuilding.click();
//        WebElement elementRoofing = driver.findElement(By.id(ID_ROOFING));
//        elementRoofing.click();
//        WebElement elementRoof = driver.findElement(By.id(ID_ROOF_WINDOWS));
//        elementRoof.click();
//        String elementBuy = driver.findElement(By.xpath(XPATH_WINDOW_INROOF)).getText();
//        WebElement elementDeliver = driver.findElement(By.id(ID_DELIVER));
//        elementDeliver.click();
//        WebElement elementCheckout = driver.findElement(By.linkText(LINKTEXT_CHECKOUT));
//        elementCheckout.click();
//        WebElement elementBuyInBasket = driver.findElement(By.id(ID_WINDOW_INBASKET));
//        Assert.assertTrue(elementBuy.contains(elementBuyInBasket.getText()));
//        driver.quit();
//    }
//}
