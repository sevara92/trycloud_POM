package com.trycloud.pages;

import com.trycloud.tests.TestBase;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="user")
    public WebElement userInput;

    @FindBy(id="password")
    public WebElement passwordInput;

    @FindBy(id="submit-form")
    public WebElement submitButton;

public void loginMethod(String userName, String password){

    userInput.sendKeys(userName);
    passwordInput.sendKeys(password);
    submitButton.click();
}

}
