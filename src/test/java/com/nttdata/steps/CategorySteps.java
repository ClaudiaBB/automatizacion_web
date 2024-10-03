package com.nttdata.steps;

import com.nttdata.page.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CategorySteps {

    private WebDriver driver;

    //constructor
    public CategorySteps(WebDriver driver) {
        this.driver = driver;
    }


    public void category() {
        WebElement categoryButton = driver.findElement(HomePage.categoryButton);
        categoryButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.subCategoryButton));
    }


    public void subcategory() {
        this.driver.findElement(HomePage.subCategoryButton).click();
    }

}
