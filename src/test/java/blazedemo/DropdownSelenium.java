package blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownSelenium {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();


        WebElement departureDropdown = driver.findElement(By.name("fromPort"));
        WebElement destinationDropdown = driver.findElement(By.name("toPort"));


        Select departureCities = new Select(departureDropdown);
        Select destinationCities = new Select(destinationDropdown);

        String departureDefaultValue = departureCities.getFirstSelectedOption().getText();
        String destinationDefaultValue = destinationCities.getFirstSelectedOption().getText();

        System.out.println(departureDefaultValue);
        System.out.println(destinationDefaultValue);

        List<WebElement> departureOptions = departureCities.getOptions();


        List<String> expectedCities = new ArrayList<>();
        expectedCities.add("Paris");
        expectedCities.add("Philadelphia");
        expectedCities.add("Boston");
        expectedCities.add("Portland");
        expectedCities.add("San Diego");
        expectedCities.add("Mexico City");
        expectedCities.add("São Paolo");



        if (departureOptions.size() == expectedCities.size()){
            System.out.println("Departure city size passed");
        }
        else {
            System.out.println("Departure city size failed");
        }



        for (WebElement option : departureOptions){
            if (expectedCities.contains(option.getText())){
                System.out.println("City passed");
            }
            else{
                System.out.println("City failed");
            }
        }







        departureCities.selectByVisibleText("Boston");










    }


}
