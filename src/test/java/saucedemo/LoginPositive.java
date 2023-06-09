package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPositive {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement signInButton = driver.findElement(By.id("login-button"));
        signInButton.click();
        String expectedURL = "https://www.saucedemo.com/inventory.html";

        if (expectedURL.equals(driver.getCurrentUrl())){
            System.out.println("success");
        }

        driver.findElement(By.linkText("Sauce Labs Backpack")).click();
        Thread.sleep(500);
        driver.navigate().back();
        driver.findElement(By.linkText("Sauce Labs Bike Light")).click();
        Thread.sleep(500);
        driver.navigate().back();
        driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
        Thread.sleep(500);
        driver.navigate().back();
        driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).click();
        Thread.sleep(500);
        driver.navigate().back();
        driver.findElement(By.linkText("Sauce Labs Onesie")).click();
        Thread.sleep(500);
        driver.navigate().back();
        driver.findElement(By.linkText("Test.allTheThings() T-Shirt (Red)")).click();
        Thread.sleep(500);
        driver.navigate().back();





    }


}
