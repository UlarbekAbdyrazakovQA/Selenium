package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/sampleSiteForSelenium");
        driver.manage().window().maximize();


        Actions actions = new Actions(driver);
        WebElement dropBox = driver.findElement(By.id("fname"));
        WebElement link = driver.findElement(By.xpath("//a[.= 'Selenium Sample Script']"));
        actions.dragAndDrop(link,dropBox).perform();

    }



}
