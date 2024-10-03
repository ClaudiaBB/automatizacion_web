package com.nttdata.page;

import org.openqa.selenium.By;

public class CarPage {

    //Localizadores de elementos
    public static By pageCar = By.xpath("//body/main[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]");
    public static By price = By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/div[1]/span[1]");
    public static By discount = By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/div[1]/span[2]");
    public static By priceTotal = By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/div[2]/span[1]");


}
