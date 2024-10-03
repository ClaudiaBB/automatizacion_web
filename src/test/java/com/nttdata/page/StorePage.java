package com.nttdata.page;

import org.openqa.selenium.By;

public class StorePage {

    //Localizadores de elementos
    public static By productItem = By.xpath("//body/main[1]/section[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[3]/div[1]/div[1]/article[1]/div[1]");
    public static By unitButton = By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/span[3]/button[1]");
    public static By addButton = By.xpath("//body/main[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/button[1]");
    public static By popup = By.id("myModalLabel");
    public static By price = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/p[1]");
    public static By quantity = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[3]/strong[1]");
    public static By total = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/p[4]/span[2]");
    public static By finalizePurchase = By.xpath("//body/div[@id='blockcart-modal']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]");

}
