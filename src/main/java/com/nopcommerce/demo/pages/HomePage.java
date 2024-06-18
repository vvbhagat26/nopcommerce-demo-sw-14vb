package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class HomePage extends Utility {

    //Login link
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    //Register Link
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;

    //computer menu link
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersMenu;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        Reporter.log("Clicking on login link " + loginLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on login link");
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
        Reporter.log("Clicking on register link " + registerLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on register link");
    }

    public void clickOnComputersMenuLink(){
        clickOnElement(computersMenu);
        Reporter.log("Click on computers menu link " + computersMenu.toString());
        CustomListeners.test.log(Status.PASS, "Click on computers");

    }
}
