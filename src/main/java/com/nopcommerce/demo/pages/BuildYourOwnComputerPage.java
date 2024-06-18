package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    //processor
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processor;

    //RAM
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ram;

    //HDD
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hdd;

    //OS
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement os;

    //software 1
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement softwareCheckboxOne;

    //software 1
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement softwareCheckboxThree;

    //Add to cart
    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;

    //Add to cart
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement productAddSuccessMessage;


    public void selectProcessorFromDropdown(String valueOfProcessor){
        selectByVisibleTextFromDropDown(processor, valueOfProcessor);
        Reporter.log("Get value of processor: " + valueOfProcessor +"from dropdown " + processor.toString());
        CustomListeners.test.log(Status.PASS, "Get title text for computers page");

    }
    public void selectRamFromDropdown(String valueOfRam){
        selectByVisibleTextFromDropDown(ram, valueOfRam);
        Reporter.log("Get value of ram: " + valueOfRam +"from dropdown " + ram.toString());
        CustomListeners.test.log(Status.PASS, "Get title text for computers page");
    }
    public void clickOnHdd(){
        clickOnElement(hdd);
        Reporter.log("Click on HDD " + hdd.toString());
        CustomListeners.test.log(Status.PASS, "Click on HDD");

    }
    public void clickOnOs(){
        clickOnElement(os);
        Reporter.log("Click on OS " + os.toString());
        CustomListeners.test.log(Status.PASS, "Click on OS");

    }
    public void clickOnSoftwareCheckboxOne(){
        clickOnElement(softwareCheckboxOne);
        Reporter.log("Click on software checkbox number one " + softwareCheckboxOne.toString());
        CustomListeners.test.log(Status.PASS, "Click on software checkbox");

    }
    public void clickOnSoftwareCheckboxThree(){
        clickOnElement(softwareCheckboxThree);
        Reporter.log("Click on software checkbox number three " + softwareCheckboxThree.toString());
        CustomListeners.test.log(Status.PASS, "Click on software checkbox");

    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
        Reporter.log("Click on add to cart button " + addToCart.toString());
        CustomListeners.test.log(Status.PASS, "Click on add to cart");

    }

    public String getTextFromProductAddSuccessMessage(){
        String name = getTextFromElement(productAddSuccessMessage);
        Reporter.log("Get text from product added success message " + productAddSuccessMessage.toString());
        CustomListeners.test.log(Status.PASS, "Get text from product added success message");
        return name;
    }
}
