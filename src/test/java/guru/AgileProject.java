package guru;

import org.junit.After;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import pages.AgileProjectPage;
import pages.GuruHomePage;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;

public class AgileProject {

//    GuruHomePage guruHomePage = new GuruHomePage();
//    AgileProjectPage agileProjectPage = new AgileProjectPage();
    @Test
    public void agileProLogin(){
        Driver.getDriver().get(Config.getValue("agileProjectURL"));
        String login =
                Driver.getDriver().
                        findElement(By.xpath("//li[.='UserID : 1303']")).getText().substring(9);

        String password =
                Driver.getDriver().
                        findElement(By.xpath("//li[.='Password : Guru99']")).getText().substring(11);


        Driver.getDriver().findElement(By.xpath("//input[@name='uid']")).sendKeys(login);
        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        Driver.getDriver().findElement(By.xpath("//input[@name='btnLogin']")).click();

        System.out.println(login +"   "+password);

        String expectedURL = "https://demo.guru99.com/Agile_Project/Agi_V1/customer/Customerhomepage.php";

        ApplicationFlow.pause(500);

        Assert.assertEquals("Login functionality failed",expectedURL,Driver.getDriver().getCurrentUrl());

    }

    @Test
    public void agileProLogOut(){

        Driver.getDriver().get(Config.getValue("agileProjectURL"));
        String login =
                Driver.getDriver().
                        findElement(By.xpath("//li[.='UserID : 1303']")).getText().substring(9);

        String password =
                Driver.getDriver().
                        findElement(By.xpath("//li[.='Password : Guru99']")).getText().substring(11);


        Driver.getDriver().findElement(By.xpath("//input[@name='uid']")).sendKeys(login);
        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        Driver.getDriver().findElement(By.xpath("//input[@name='btnLogin']")).click();


        ApplicationFlow.pause(500);


        Driver.getDriver().findElement(By.xpath("//a[.='Log out']")).click();

        Alert alert = Driver.getDriver().switchTo().alert();
        String textOfAlert = "You Have Succesfully Logged Out!!";
        Assert.assertEquals("Alert message check for Log out",textOfAlert,alert.getText());
        alert.accept();

        String expectedURL = "https://demo.guru99.com/Agile_Project/Agi_V1/index.php";
        Assert.assertEquals("Url check for Log out",expectedURL,Driver.getDriver().getCurrentUrl());


    }

    @Test
    public void pomTest(){

        Driver.getDriver().get(Config.getValue("guruURL"));
        GuruHomePage guruHomePage = new GuruHomePage();               //we can put it in class level too
        AgileProjectPage agileProjectPage = new AgileProjectPage();  //we can put it in class level too
        guruHomePage.agileProjectLink.click();
        String userID = agileProjectPage.userInfo.getText().substring(9);
        String password = agileProjectPage.passwordInfo.getText().substring(11);
        agileProjectPage.userIDInput.sendKeys(userID);
        agileProjectPage.passwordInput.sendKeys(password);
        agileProjectPage.loginBtn.click();
        ApplicationFlow.pause(500);
        String expectedURL = "https://demo.guru99.com/Agile_Project/Agi_V1/customer/Customerhomepage.php";
        Assert.assertEquals("URL failed",expectedURL,Driver.getDriver().getCurrentUrl());


    }

    @Test
    public void logOutPom(){
        Driver.getDriver().get(Config.getValue("guruURL"));
        GuruHomePage guruHomePage = new GuruHomePage();               //we can put it in class level too
        AgileProjectPage agileProjectPage = new AgileProjectPage();  //we can put it in class level too
        guruHomePage.agileProjectLink.click();
        String userID = agileProjectPage.userInfo.getText().substring(9);
        String password = agileProjectPage.passwordInfo.getText().substring(11);
        agileProjectPage.login(userID,password);
        agileProjectPage.logOutBtn.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        String textOfAlert = "You Have Succesfully Logged Out!!";
        Assert.assertEquals("Alert message check for Log out",textOfAlert,alert.getText());
        alert.accept();


    }



    @After
    public void cleanUp(){
        Driver.quit();
    }











}
