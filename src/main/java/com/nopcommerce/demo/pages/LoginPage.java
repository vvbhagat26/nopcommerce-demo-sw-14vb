package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class LoginPage extends Utility {

    //welcome text
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    //email field
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    //password field
    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    //login button
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    //login button
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    //logout link
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logoutLink;

    //logout link
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;


    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        Reporter.log("Get text from welcome text " + welcomeText.toString());
        CustomListeners.test.log(Status.PASS, "Get welcome text");
        return message;
    }
    public void sendTextToEmailField(String emailId){
        sendTextToElement(emailField, emailId);
        Reporter.log("Enter email "+ emailId + "to email field " + emailField.toString());
        CustomListeners.test.log(Status.PASS, "Enter Email Id");
    }
    public void sendTextToPasswordField(String password){
        sendTextToElement(passwordField, password);
        Reporter.log("Enter password "+ password + "to password field " + passwordField.toString());
        CustomListeners.test.log(Status.PASS, "Enter Password");
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
        Reporter.log("Click on login button " + loginButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on login button");
    }
    public String getErrorMessage(){
        String message = getTextFromElement(errorMessage);
        Reporter.log("Get text from error message " + errorMessage.toString());
        CustomListeners.test.log(Status.PASS, "Get error message");
        return message;
    }
    public String getTextFromLogoutLink(){
        String logoutText = getTextFromElement(logoutLink);
        Reporter.log("Get text from logout link " + logoutLink.toString());
        CustomListeners.test.log(Status.PASS, "Get logout text");
        return logoutText;
    }
    public void clickOnLogoutLink(){
        clickOnElement(logoutLink);
        Reporter.log("Click on logout button " + logoutLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on logout link");
    }
    public String getTextFromLoginLink(){
        String loginText = getTextFromElement(loginLink);
        Reporter.log("Get text from login link " + loginLink.toString());
        CustomListeners.test.log(Status.PASS, "Get login text");
        return loginText;
    }

}
