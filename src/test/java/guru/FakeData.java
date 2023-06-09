package guru;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FakeData {

    public static void main(String[] args) {


        Faker faker = new Faker();
        String str = faker.internet().emailAddress();

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com");
        driver.manage().window().maximize();

        WebElement randomEmail = driver.findElement(By.xpath("//input[1]"));
        randomEmail.sendKeys(str);
        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

        WebElement login = driver.findElement(By.xpath("(//tr)[5]/td[2]"));
        WebElement password = driver.findElement(By.xpath("(//tr)[6]/td[2]"));

        System.out.println(login.getText());
        System.out.println(password.getText());



    }


}
