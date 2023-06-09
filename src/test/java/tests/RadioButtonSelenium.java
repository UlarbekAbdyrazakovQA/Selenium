package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonSelenium {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/sampleSiteForSelenium");
        driver.manage().window().maximize();


        WebElement radioButtonMale = driver.findElement(By.id("male"));
        WebElement checkBox = driver.findElement(By.className("Automation"));



        System.out.println("Before:" + radioButtonMale.isSelected());
        radioButtonMale.click();
        System.out.println("After:" + radioButtonMale.isSelected());


        System.out.println("Before:" + checkBox.isSelected());
        checkBox.click();
        System.out.println("After:" + checkBox.isSelected());


        WebElement radioButtonFemale = driver.findElement(By.id("female"));
        radioButtonFemale.click();

        if (radioButtonMale.isSelected()){
            System.out.println("test failed");
        }
        else {
            System.out.println("passed");
        }


         System.out.println(radioButtonMale.getAttribute("type"));

    }


}
