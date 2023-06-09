package windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Windoww {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.letskodeit.com/practice");
        String mainWindowId = driver.getWindowHandle();
        WebElement openWindowButton = driver.findElement(By.id("opentab"));
        openWindowButton.click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles.size());
        System.out.println(windowHandles);

        for(String id: windowHandles){
            if (!id.equals(mainWindowId)){
                driver.switchTo().window(id);
                break;
            }
        }

        System.out.println();
        System.out.println(driver.getCurrentUrl());









    }


}
