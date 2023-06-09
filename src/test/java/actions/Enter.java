package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Enter {

    public static void main(String[] args) {

        WebDriver driver =  new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        driver.findElement(By.name("g")).sendKeys("Selenium" + Keys.ENTER);

        Actions action = new Actions(driver);
        action.sendKeys("sl"+Keys.ENTER);



    }



}
