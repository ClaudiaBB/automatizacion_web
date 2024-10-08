package com.nttdata.steps;

import com.nttdata.page.StorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class StoreSteps {

    private WebDriver driver;

    //constructor
    public StoreSteps(WebDriver driver) {
        this.driver = driver;
    }


    public void store() {
        WebElement storeItem = driver.findElement(StorePage.productItem);
        storeItem.click();
    }


    public void unit(String unit) {
        for (int i = 1; i < Integer.parseInt(unit); i++) {
            this.driver.findElement(StorePage.unitButton).click();
        }
    }

    public void addCar() {
        this.driver.findElement(StorePage.addButton).click();
    }

    public String validatePopup() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        wait.until(ExpectedConditions.visibilityOfElementLocated(StorePage.popup));

        return this.driver.findElement(StorePage.popup).getText();
    }

    public String price() {
        return this.driver.findElement(StorePage.price).getText();
    }

    public String quantity() {
        return this.driver.findElement(StorePage.quantity).getText();
    }

    public String subTotal() {
        return this.driver.findElement(StorePage.total).getText();
    }

    public void finalizeS() {
        this.driver.findElement(StorePage.finalizePurchase).click();
    }
}
