package com.nttdata.steps;

import com.nttdata.page.LoginPage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginSteps {

    private WebDriver driver;

    //constructor
    public LoginSteps(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Escribir el usuario
     *
     * @param user el usuario
     */
    public void typeUser(String user) {
        WebElement userInputElement = driver.findElement(LoginPage.userInput);
        userInputElement.sendKeys(user);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.loginButton));
    }

    /**
     * Escribir el password
     *
     * @param password el password del usuario
     */
    public void typePassword(String password) {
        this.driver.findElement(LoginPage.passInput).sendKeys(password);
    }

    /**
     * Hacer click en el botón login
     */
    public void login() {
        this.driver.findElement(LoginPage.loginButton).click();
    }

    public String error() {
        try {
            WebElement errorElement = this.driver.findElement(LoginPage.errorMessage);
            if (errorElement.isDisplayed()) {
                return errorElement.getText();
            } else {
                return "";
            }
        } catch (NoSuchElementException e) {
            return "";
        }
    }
}
