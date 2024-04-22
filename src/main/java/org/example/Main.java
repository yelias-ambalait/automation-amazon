package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {

    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        String url = "https://www.amazon.com/";
        driver.get(url);
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);

        By searchBox = By.xpath("//input[@id='twotabsearchtextbox']");
        By searchButton = By.xpath("//input[@id='nav-search-submit-button']");
        By firstItem = By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]");
        By quantityDropdown = By.xpath("//span[@class='a-dropdown-label']");
        By quantity = By.xpath("//a[@id='quantity_1']");
        By addCart = By.xpath("//input[@id='add-to-cart-button']");
        By gotoCart = By.xpath("//a[@href='/cart?ref_=sw_gtc']");
        By totalDetails = By.xpath("//div[@class='a-row a-spacing-mini sc-subtotal sc-subtotal-activecart sc-java-remote-feature']");
        By firstWomenItem = By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]");
        By quantityRemoveDropdown = By.xpath("(//span[@class='a-button-text a-declarative'])[2]");
        By againGotoCart = By.xpath("(//a[normalize-space()='Go to Cart'])[2]");
        By finalTotal = By.xpath("//div[@class='a-row a-spacing-mini sc-subtotal sc-subtotal-activecart sc-java-remote-feature']");


        driver.findElement(searchBox).sendKeys("hats for men");
        driver.findElement(searchButton).click();
        driver.findElement(firstItem).click();
        driver.findElement(quantityDropdown).click();
        driver.findElement(quantity).click();
        driver.findElement(addCart).click();
        driver.findElement(gotoCart).click();
        driver.findElement(totalDetails).getText();
        System.out.println(driver.findElement(totalDetails).getText());
        driver.findElement(searchBox).sendKeys("hats for women");
        driver.findElement(searchButton).click();
        Thread.sleep(2000);
        System.out.println("Displayed"+""+driver.findElement(firstWomenItem).isDisplayed());
        driver.findElement(firstWomenItem).getText();
        System.out.println(driver.findElement(firstWomenItem).getText());
        driver.findElement(firstWomenItem).click();
        Thread.sleep(3000);
        System.out.println("after clicked");
        driver.findElement(addCart).click();
//        driver.findElement(totalDetails).getText();
//        System.out.println(driver.findElement(totalDetails).getText());
        driver.findElement(gotoCart).click();
        driver.findElement(quantityRemoveDropdown).click();
        driver.findElement(quantity).click();
        driver.findElement(finalTotal).getText();
        System.out.println(driver.findElement(finalTotal).getText());
//        driver.quit();



    }
}