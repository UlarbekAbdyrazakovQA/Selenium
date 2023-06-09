package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmBox {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/sampleSiteForSelenium");
        driver.manage().window().maximize();

        WebElement buttonForAlert = driver.findElement(By.xpath("//div[@id='ConfirmBox']/button"));
        buttonForAlert.click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();

        WebElement checkPressedButton = driver.findElement(By.xpath("//p[@id='demo']"));
        String str = checkPressedButton.getText();
        String expectedString = "You pressed Cancel!";

        if (expectedString.equals(str)){
            System.out.println("passed");
        }
        else{
            System.out.println("failed");
        }



    }


}
