package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Cashwise {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://cashwise.us");
        driver.manage().window().maximize();


        String expctdCashwiseTitle = "Cashwise is the best";

        if (expctdCashwiseTitle.equals(driver.getTitle())){
            System.out.println("Cashwise title  pass test");
        }
        else{

            System.out.println("Cashwise title failed test");
        }

        if (driver.getCurrentUrl().equals("https://cashwise.us/home")){
            System.out.println("Cashwise url  pass test");
        }
        else{
            System.out.println("Cashwise url failed test");
        }

        System.out.println(driver.getPageSource());

        driver.quit();

    }



}
