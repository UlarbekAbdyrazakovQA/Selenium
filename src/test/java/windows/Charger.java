package windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Charger {


    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.letskodeit.com/practice");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com/");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com/");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.instagram.com/");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.etsy.com/");



        Set<String> windowHandles = driver.getWindowHandles();

        for (String id: windowHandles){

            driver.switchTo().window(id);
            String title = driver.getTitle();
            if (title.contains("Etsy"))
                break;

        }

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());



    }
}
