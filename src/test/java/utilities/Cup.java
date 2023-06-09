package utilities;

import org.openqa.selenium.By;

public class Cup {

    public static void main(String[] args) {

        Driver.getDriver().get("https://www.letskodeit.com/");
        Driver.getDriver().findElement(By.linkText("PRACTICE")).click();
        ApplicationFlow.switchToSecondWindow();
        System.out.println(Driver.getDriver().getTitle());

    }


}
