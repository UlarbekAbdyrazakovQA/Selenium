package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloader {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");

        WebElement image = driver.findElement(By.linkText("foto2.png"));
        image.click();


    }



}
