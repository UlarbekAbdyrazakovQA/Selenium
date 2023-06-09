package tests;

//15 May
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ArtDropdownSelenium {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/sampleSiteForSelenium");
        driver.manage().window().maximize();

        WebElement testingTypeDropdown = driver.findElement(By.id("testingDropdown"));

        Select testingTypes = new Select(testingTypeDropdown);

        String defaultoption = testingTypes.getFirstSelectedOption().getText();
        String expctedDefaultOption = "Automation Testing";

        if (expctedDefaultOption.equals(defaultoption)){
            System.out.println("Default option test passed");
        }
        else{
            System.out.println("Default option test failed");
        }

        //print out the all options in the dropdown
        List<WebElement> listOfTestingTypes = testingTypes.getOptions();

        for (WebElement list: listOfTestingTypes) {
            System.out.println(list.getText());
        }

        testingTypes.selectByVisibleText("Manual Testing");



    }



}
