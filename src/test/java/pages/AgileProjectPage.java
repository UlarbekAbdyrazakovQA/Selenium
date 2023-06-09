package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AgileProjectPage {

    public AgileProjectPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//input[@name='uid']")
    public WebElement userIDInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name='btnLogin']")
    public WebElement loginBtn;

    @FindBy(xpath = "//input[@name='btnReset']")
    public WebElement resetBtn;

    @FindBy(xpath = "//li[.='UserID : 1303']")
    public WebElement userInfo;

    @FindBy(xpath = "//li[.='Password : Guru99']")
    public WebElement passwordInfo;

    @FindBy(linkText = "Log out")
    public WebElement logOutBtn;



    public void login(String userID,String password){
        userIDInput.sendKeys(userID);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }



}

