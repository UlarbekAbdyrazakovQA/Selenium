package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathLogin {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.xpath("//div[@class='form_group']/input"));
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//div[@class='form_group'][2]/input"));
        password.sendKeys("secret_sauce");
        WebElement signInButton = driver.findElement(By.xpath("//*[@name='login-button']"));
        signInButton.click();


        /*List<WebElement> addToCardButtons = driver.findElements(By.xpath("//button[.='Add to cart']"));

        for(WebElement button: addToCardButtons){
            button.click();
            Thread.sleep(300);
        }*/




        WebElement addToCardButton = driver.findElement(By.xpath("(//div[@class='pricebar'])[1]/button"));
        addToCardButton.click();
        WebElement button = driver.findElement(By.xpath("(//div[@class='pricebar'])[1]/button"));

        String text = button.getText();

        if (text.equals("Remove")){
            System.out.println("Passed");
        }
        else {
            System.out.println("failed");
        }




    }



}
