package actions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Local {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///Users/ularbekabdyrazakov/Desktop/Iframe.html");


        List<WebElement> texts = driver.findElements(By.xpath("//h1"));
        System.out.println(texts.size());

        WebElement secondFrame = driver.findElement(By.xpath("//iframe[2]"));
        driver.switchTo().frame(secondFrame);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce" + Keys.ENTER);
        //driver.findElement(By.id("login-button")).click();

        driver.switchTo().parentFrame();

        WebElement thirdFrame = driver.findElement(By.xpath("(//iframe)[3]"));
        driver.switchTo().frame(thirdFrame);
        driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println( alert.getText());
        alert.accept();



        Actions actions = new Actions(driver);
        //WebElement
        actions.scrollByAmount(0,700).perform();

        driver.switchTo().frame("courses-iframe");
        List<WebElement> menuList = driver.
                findElements(By.xpath("//div[@id='navbar-inverse-collapse']/ul//a"));
        Actions actionL = new Actions(driver);
        for (WebElement menu: menuList){
            actionL.moveToElement(menu).perform();
            Thread.sleep(800);
        }





    }



}
