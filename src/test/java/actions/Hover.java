package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class Hover {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/sampleSiteForSelenium");

        driver.manage().window().maximize();



        List<WebElement> menu = driver.findElements(By.xpath("//ul[@id='menu-artoftestingmenu']/li/a"));

        Actions actions = new Actions(driver);

        for (int i = 0;i< menu.size()-1;i++){
            actions.moveToElement(menu.get(i)).perform();
            Thread.sleep(1000);
        }






        /* WebElement menuHome = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
        WebElement menuManual = driver.findElement(By.xpath("//a[contains(text(),'Manual')]"));
        WebElement menuAutomation = driver.findElement(By.xpath("//a[contains(text(),'Automation')]"));
        WebElement menuPerformance = driver.findElement(By.xpath("//a[contains(text(),'Performance')]"));
        WebElement menuJava = driver.findElement(By.xpath("//a[contains(text(),'Java')]"));
        WebElement menuInterview = driver.findElement(By.xpath("//a[contains(text(),'Interview')]"));
        WebElement menuBlog = driver.findElement(By.xpath("//a[contains(text(),'Blog')]"));*/


         /*Actions actions = new Actions(driver);
        actions.moveToElement(menuHome).perform();
        Thread.sleep(1000);
        actions.moveToElement(menuManual).perform();
        Thread.sleep(1000);
        actions.moveToElement(menuAutomation).perform();
        Thread.sleep(1000);
        actions.moveToElement(menuPerformance).perform();
        Thread.sleep(1000);
        actions.moveToElement(menuJava).perform();
        Thread.sleep(1000);
        actions.moveToElement(menuInterview).perform();
        Thread.sleep(1000);
        actions.moveToElement(menuBlog).perform();*/
    }





}
