package blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomepageCheck {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();

        WebElement destination = driver.findElement(By.linkText("destination of the week! The Beach!"));
        destination.click();
        WebElement textOfPicture = driver.findElement(By.xpath("/html/body/div[2]/text()"));
        String expectedDestination = "Destination of the week: Hawaii!";



        if (expectedDestination.equals(driver.findElement(By.xpath("/html/body/div[2]/text()")))){
            System.out.println("success");
        }


    }

}
