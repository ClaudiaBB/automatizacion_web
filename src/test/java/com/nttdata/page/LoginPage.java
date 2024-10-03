package com.nttdata.page;

import org.openqa.selenium.By;

public class LoginPage {

    //Localizadores de elementos
    public static By userInput = By.id("field-email");
    public static By passInput = By.id("field-password");
    public static By loginButton = By.id("submit-login");
    public static By errorMessage = By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/section[1]/div[1]/ul[1]/li[1]");

}
