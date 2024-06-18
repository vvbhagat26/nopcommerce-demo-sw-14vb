package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(LoginPageTest.class);
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"regression","sanity", "smoke"})
    public void userShouldNavigateToLoginPageSuccessFully(){
        //Click on login link
        homePage.clickOnLoginLink();
        //verify that "Welcome, Please Sign In!" message display
        Assert.assertEquals(loginPage.getWelcomeText(),"Welcome, Please Sign In!","Page is not redirected properly");
    }

    @Test(groups = {"regression", "smoke"})
    public void verifyTheErrorMessageWithInValidCredentials(){
        //Click on login link
        homePage.clickOnLoginLink();
        //Enter EmailId
        loginPage.sendTextToEmailField("axc@gmail.com");
        //Enter Password
        loginPage.sendTextToPasswordField("abc12345");
        //Click on Login Button
        loginPage.clickOnLoginButton();
        //Verify that the Error message
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        Assert.assertEquals(loginPage.getErrorMessage(), expectedMessage,"Error message is not matching");
    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        //Click on login link
        homePage.clickOnLoginLink();
        //Enter EmailId
        loginPage.sendTextToEmailField("abc@gmail.com");
        //Enter Password
        loginPage.sendTextToPasswordField("abc12345");
        //Click on Login Button
        loginPage.clickOnLoginButton();
        //Verify that LogOut link is display
        Assert.assertEquals(loginPage.getTextFromLogoutLink(), "Log out", "Page is not redirected properly");
    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogOutSuccessFully(){
        //Click on login link
        homePage.clickOnLoginLink();
        //Enter EmailId
        loginPage.sendTextToEmailField("abc@gmail.com");
        //Enter Password
        loginPage.sendTextToPasswordField("abc12345");
        //Click on Login Button
        loginPage.clickOnLoginButton();
        //Click on LogOut Link
        loginPage.clickOnLogoutLink();
        //Verify that LogIn Link Display
        Assert.assertEquals(loginPage.getTextFromLoginLink(), "Log in", "Logout not working");
    }
}
