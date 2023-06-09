package windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchWindow {

    public static void main(String[] args) {



        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.letskodeit.com/");
        String mainID = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[@class='dynamic-link']")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        for (String id: windowHandles){
            if (!id.equals(mainID)){
                driver.switchTo().window(id);
                break;
            }
        }



        driver.findElement(By.id("opentab")).click();

        String openTabId = driver.getWindowHandle();
        Set<String> windowHandles1 = driver.getWindowHandles();
        for (String id: windowHandles1){
            if (!id.equals(openTabId) && !id.equals(mainID)){
                driver.switchTo().window(id);
                break;
            }
        }

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());



    }


}
