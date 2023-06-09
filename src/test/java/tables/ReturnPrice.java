package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class ReturnPrice {
    public static WebDriver driver;
////td[contains(text(),'200')]/../td[2]
    public static List<WebElement> returnFlight(double min,double max){

        List<WebElement> prices = driver.findElements(By.xpath("//td[contains(text(),'$')]"));
        List<WebElement> returnValue = new ArrayList<>();
        for (WebElement pr:prices){

            String str = pr.getText().substring(1);
            double str1 =  Double.parseDouble(str);

            if (str1<=max && str1>=min){
                String xpath = "//td[contains(text(),'$"+ str1 +"')]/../td[2]";
                WebElement flight = driver.findElement(By.xpath(xpath));
                returnValue.add(pr);
            }


        }

        return returnValue;
    }

    public static void flightInformation(String flightNum){

        String xpathAirline = "//tbody/tr/td[.='"+flightNum+"']/../td[3]";
        String xpathDeparture = "//tbody/tr/td[.='"+flightNum+"']/../td[4]";
        String xpathArrival = "//tbody/tr/td[.='"+flightNum+"']/../td[5]";
        String xpathPrice = "//tbody/tr/td[.='"+flightNum+"']/../td[6]";


        System.out.println("Flight info for:" + flightNum);

        String airline = driver.findElement(By.xpath(xpathAirline)).getText();
        String departure = driver.findElement(By.xpath(xpathDeparture)).getText();
        String arrival = driver.findElement(By.xpath(xpathArrival)).getText();
        String price = driver.findElement(By.xpath(xpathPrice)).getText();

        System.out.println("Airline:" +airline);
        System.out.println("departure:" +departure);
        System.out.println("arrival:" +arrival);
        System.out.println("price:" +price);




    }


    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://blazedemo.com/reserve.php");
        List<WebElement> list = returnFlight(200,500);


        for (WebElement pr:list){

            String str = pr.getText();
            flightInformation(str);
            System.out.println("\n\n");
        }




    }
}
