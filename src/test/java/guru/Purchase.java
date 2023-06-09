package guru;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;

public class Purchase {


  @Test
  public void itemPurchase(){

      String creditCard = "4334240089817416";
      String cvv = "722";
      String expiration = "2028";
      String month = "01";

      Driver.getDriver().get(Config.getValue("url"));
      Driver.getDriver().findElement(By.xpath("//input")).click();
      Driver.getDriver().findElement(By.xpath("//input[@name='card_nmuber']")).
              sendKeys("4334240089817416");

      WebElement testingTypeDropdown = Driver.getDriver().findElement(By.id("month"));
      Select cardExpireMonth = new Select(testingTypeDropdown);
      cardExpireMonth.selectByVisibleText("01");

      WebElement dropdown = Driver.getDriver().findElement(By.id("year"));
      Select cardExpireYear = new Select(dropdown);
      cardExpireYear.selectByVisibleText(expiration);

      Driver.getDriver().findElement(By.name("cvv_code")).sendKeys("722");
      Driver.getDriver().findElement(By.name("submit")).click();

      String paymentResult = Driver.getDriver().findElement(By.xpath("//h2")).getText();
      String url = Driver.getDriver().getCurrentUrl();

      Assert.assertTrue(url.contains("genearte_orderid"));




    }

  @Test
  public void creditLimitTest(){

    String creditCard = "4334240089817416";
    String cvv = "722";
    String expiration = "2028";
    String month = "01";

    Driver.getDriver().get(Config.getValue("creditURL"));
    Driver.getDriver().findElement(By.xpath("//a[contains(text(),'Check Credit Card Limit')]")).click();
    Driver.getDriver().findElement(By.xpath("//input[1]")).
            sendKeys("4334240089817416");
    Driver.getDriver().findElement(By.xpath("(//input)[2]")).click();

    String balance = Driver.getDriver().findElement(By.xpath("//h4/span")).getText().trim();
    int balanceD = Integer.valueOf(balance);
    Driver.getDriver().findElement(By.linkText("Cart")).click();
    ApplicationFlow.pause(2000);
    //------
    Driver.getDriver().get(Config.getValue("url"));
    Driver.getDriver().findElement(By.xpath("//input")).click();
    Driver.getDriver().findElement(By.xpath("//input[@name='card_nmuber']")).
            sendKeys("4334240089817416");

    WebElement testingTypeDropdown = Driver.getDriver().findElement(By.id("month"));
    Select cardExpireMonth = new Select(testingTypeDropdown);
    cardExpireMonth.selectByVisibleText("01");

    WebElement dropdown = Driver.getDriver().findElement(By.id("year"));
    Select cardExpireYear = new Select(dropdown);
    cardExpireYear.selectByVisibleText(expiration);

    Driver.getDriver().findElement(By.name("cvv_code")).sendKeys("722");
    Driver.getDriver().findElement(By.name("submit")).click();

    String url = Driver.getDriver().getCurrentUrl();
    Assert.assertTrue(url.contains("genearte_orderid"));


    Driver.getDriver().get(Config.getValue("creditURL"));
    Driver.getDriver().findElement(By.xpath("//a[contains(text(),'Check Credit Card Limit')]")).click();
    Driver.getDriver().findElement(By.xpath("//input[1]")).
            sendKeys("4334240089817416");
    Driver.getDriver().findElement(By.xpath("(//input)[2]")).click();

    String afterBalance = Driver.getDriver().findElement(By.xpath("//h4/span")).getText().trim();
    int afterBalanceInteger = Integer.valueOf(afterBalance);
    ApplicationFlow.pause(2000);


    Assert.assertEquals(afterBalanceInteger,(balanceD)-20);




  }

  @After
  public void cleanUp(){
    Driver.quit();
  }







}
