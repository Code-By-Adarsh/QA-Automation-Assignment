package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By usernameTextBox = By.id("username");
    private By passwordTextBox = By.id("password");
    private By submitButton = By.id("submit");
    private By errorMessage = By.id("error");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String Username){
        driver.findElement(usernameTextBox).clear();
        driver.findElement(usernameTextBox).sendKeys(Username);
    }

    public void enterPassword(String Password){
        driver.findElement(passwordTextBox).clear();
        driver.findElement(passwordTextBox).sendKeys(Password);
    }

    public void clickSubmit(){
        driver.findElement(submitButton).click();
    }

    public String errorMessageBox(){
        return driver.findElement(errorMessage).getText();
    }
}
