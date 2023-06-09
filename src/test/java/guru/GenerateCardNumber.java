package guru;

import org.openqa.selenium.By;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;

public class GenerateCardNumber {


    public static void main(String[] args) {


        Driver.getDriver().get(Config.getValue("url"));
        Driver.getDriver().findElement(By.linkText("Generate Card Number")).click();

        ApplicationFlow.switchToSecondWindow();

        String cardNum =
                Driver.getDriver().findElement(By.xpath("//h4[1]")).getText().substring(14);
        String CVV =
                Driver.getDriver().findElement(By.xpath("//h4[2]")).getText().substring(6);
        String Exp =
                Driver.getDriver().findElement(By.xpath("//h4[3]")).getText();
        String creditLimit =
                Driver.getDriver().findElement(By.xpath("//h4[4]/span")).getText().substring(1);

       // System.out.println(cardNum);
        //System.out.println(cardNum.length());


        if (cardNum.length()==16){
            System.out.println("Card num test is correct");
        }
        else{
            System.out.println("card num test is FAILED");
        }
        if (creditLimit.equals("100.00")){
            System.out.println("credit limit is PASSED");
        }
        else {
            System.out.println("Credit limit crashed");
        }


        System.out.println(CVV);





    }




}
