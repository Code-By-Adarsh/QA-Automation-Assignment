package tests;

import base.BaseTest;
import io.qameta.allure.*;
import listener.BaseListener;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

@Listeners(BaseListener.class)
@Epic("QA Automation Assignment")
@Feature("Login Page Functionalities")
public class LoginTest extends BaseTest {

    @Test(description = "Verify that valid user can successfully log in.")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test verifies that a valid user with correct credentials can log in successfully.")
    @Story("Valid Login")
    public void validLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");;
        loginPage.clickSubmit();
        String realText = driver.findElement(By.className("post-title")).getText();
        String expectedText = "Logged In Successfully";
        Assert.assertEquals(realText,expectedText,"User did not redirect to login successfully page.");
        Allure.addAttachment("Page Title", driver.getTitle());
        System.out.println("Login successful");
    }

    @Test(description = "Verify error message when invalid username is entered.")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test verifies that an appropriate error message appears when invalid username is used.")
    @Story("Invalid Username Login")
    public void invalidUsernameLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("Adarsh");
        loginPage.enterPassword("Password123");
        loginPage.clickSubmit();
        String errorMessage = loginPage.errorMessageBox();
        String expectedErrorMessage = "Your username is invalid!";
        Assert.assertEquals(errorMessage,expectedErrorMessage,"Invalid username error message did not appear.");
        Allure.addAttachment("Error Message", errorMessage);
        System.out.println("Login unsuccessful");
    }

    @Test(description = "Verify error message when invalid password is entered.")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test verifies that an appropriate error message appears when invalid password is used.")
    @Story("Invalid Password Login")
    public void invalidPasswordLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("student");
        loginPage.enterPassword("Adarsh123");
        loginPage.clickSubmit();
        String errorMessage = loginPage.errorMessageBox();
        String expectedErrorMessage = "Your password is invalid!";
        Assert.assertEquals(errorMessage,expectedErrorMessage,"Invalid password error message did not appear.");
        Allure.addAttachment("Error Message", errorMessage);
        System.out.println("Login unsuccessful");
    }

    @Test(description = "Verify validation when both username and password fields are blank.")
    @Severity(SeverityLevel.MINOR)
    @Description("This test verifies that validation messages appear when fields are left blank.")
    @Story("Blank Fields Login")
    public void blankFieldsLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(" ");
        loginPage.enterPassword(" ");
        loginPage.clickSubmit();
        String errorMessage = loginPage.errorMessageBox();
        String expectedErrorMessage = "Your username is invalid!";
        Assert.assertEquals(errorMessage,expectedErrorMessage,"Validation message did not appear.");
        Allure.addAttachment("Error Message", errorMessage);
        System.out.println("Login unsuccessful");
    }

    @Test(description = "Verify logout functionality after successful login.")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test verifies that user can successfully log out after logging in.")
    @Story("Logout Functionality")
    public void logoutFunctionalityTest(){
        LoginPage loginPage = new LoginPage(driver);
        String currentPage = driver.getTitle();
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");
        Allure.addAttachment("Before Login Page", currentPage);
        loginPage.clickSubmit();
        String currentPage1 = driver.getTitle();
        Allure.addAttachment("After Login Page", currentPage1);
        driver.findElement(By.linkText("Log out")).click();
        String currentPage2 = driver.getTitle();
        Allure.addAttachment("After Logout Page", currentPage2);
        Assert.assertEquals(driver.getTitle(),"Test Login | Practice Test Automation","User did not redirect to login page from logout page.");
    }
}
