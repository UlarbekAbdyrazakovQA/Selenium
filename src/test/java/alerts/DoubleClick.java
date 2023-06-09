package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/sampleSiteForSelenium");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement doubleClick = driver.findElement(By.id("dblClkBtn"));
        actions.doubleClick(doubleClick).perform();

        Alert alert = driver.switchTo().alert();

        String strAlert = alert.getText();
        String expected = "Welcome to art of testing";

        if (expected.equals(strAlert)){
            System.out.println("passed");
        }
        else {
            System.out.println("failed");
        }

        alert.dismiss();

    }


}
