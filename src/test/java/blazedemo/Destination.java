package blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Destination {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();


        WebElement destinationCity = driver.findElement(By.name("toPort"));

        Select destinationCities = new Select(destinationCity);

        destinationCities.selectByVisibleText("Berlin");

        WebElement selected = destinationCities.getFirstSelectedOption();

       if (selected.getText().equals("Berlin")){
           System.out.println("passed test");
       }
       else {
           System.out.println("failed test");
       }




    }


}
