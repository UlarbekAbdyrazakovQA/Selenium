package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

    public static void main(String[] args) {
        System.out.println("Hello World!1..1");
        //System.setProperty("webdriver.chrome.driver", "/Users/ularbekabdyrazakov/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");  //this is opens google.com page

        String expectedGoogleTitle = "Hi, Google";

        if (expectedGoogleTitle.equals(driver.getTitle())){
            System.out.println("Google title  pass test");        }
        else {
            System.out.println("Google title didn't pass test");
        }


        driver.navigate().to("https://amazon.com");

        String expectedAmazonTitle = "Hi, Amazon";
        if (expectedAmazonTitle.equals(driver.getTitle())){
            System.out.println("Amazon title  pass test");        }
        else {
            System.out.println("Amazon title didn't pass test");
        }
        driver.navigate().back();
        //driver.navigate().forward();
        driver.navigate().refresh();
        //driver.close();
        driver.quit();


    }


}
