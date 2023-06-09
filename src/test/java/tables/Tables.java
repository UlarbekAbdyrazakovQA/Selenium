package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tables {




    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com/reserve.php");
        driver.manage().window().maximize();

        List<WebElement> prices = driver.findElements(By.xpath("//td[contains(text(),'$')]"));


        for (WebElement pr:prices){

            String str = pr.getText();
            System.out.println(str.substring(1));

        }



    }




}
