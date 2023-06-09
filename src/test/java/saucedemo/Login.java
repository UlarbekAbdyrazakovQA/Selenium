package saucedemo;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("user-name") );
        userName.sendKeys("helloCodewise");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("myPassword");

        Thread.sleep(2000);

        WebElement signInButton = driver.findElement(By.id("login-button"));
        signInButton.click();
        WebElement errorMessage = driver.findElement(By.tagName("h3"));
        String message = errorMessage.getText();
        String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";

        if(expectedErrorMessage.equals(message)){

        }




    }

}
