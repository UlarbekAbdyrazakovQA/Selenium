package guru;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.ApplicationFlow;

import java.time.Duration;

public class BankLogin {


    public static void main(String[] args) throws InterruptedException {



        Faker faker = new Faker();
        String str = faker.internet().emailAddress();

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(12));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

        WebElement randomEmail = driver.findElement(By.xpath("//input[1]"));
        randomEmail.sendKeys(str);
        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

        WebElement login = driver.findElement(By.xpath("(//tr)[5]/td[2]"));
        WebElement password = driver.findElement(By.xpath("(//tr)[6]/td[2]"));


        String userIDString = login.getText();
        String passwordString = password.getText();

        driver.findElement(By.linkText("Bank Project")).click();
        driver.findElement(By.name("uid")).sendKeys(userIDString);
        driver.findElement(By.name("password")).sendKeys(passwordString);
        driver.findElement(By.name("btnLogin")).click();


        String expectedURL = "https://demo.guru99.com/V1/html/Managerhomepage.php";

        ApplicationFlow.pause(800);

        if (expectedURL.equals(driver.getCurrentUrl())){
            System.out.println("Bank login test is PASSED");
        }
        else {
            System.out.println("Bank login test is FAILED");
        }


        driver.quit();
    }



}
