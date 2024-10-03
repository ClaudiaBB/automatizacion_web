package com.nttdata.steps;

import com.nttdata.page.CarPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CarSteps {

    private WebDriver driver;

    //constructor
    public CarSteps(WebDriver driver) {
        this.driver = driver;
    }


    public String title() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(CarPage.pageCar));

        return driver.getTitle();
    }

    public String price() {
        return this.driver.findElement(CarPage.price).getText();
    }

    public String discount() {
        return this.driver.findElement(CarPage.discount).getText();
    }

    public String priceTotal() {
        return this.driver.findElement(CarPage.priceTotal).getText();
    }


}
