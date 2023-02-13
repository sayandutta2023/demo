package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomerLoginlog {
    public static void main(String[] args) {
        WebDriver Driver =new ChromeDriver();
        Driver.get("http://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-fingerprint'])")).click();
        WebElement element = Driver.findElement(By.id("date-range"));
        Actions actions = new Actions(Driver);
        actions.moveToElement(element).click(element).sendKeys("01/02/2023 - 03/02/2023").contextClick(element).build().perform();
        //Driver.findElement(By.id("date-range")).sendKeys("27/01/2023 - 02/02/2023");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.findElement(By.xpath("(//*[@class='mdc-list-item__text'])")).click();
        Driver.findElement(By.xpath("(//*[@class='leaflet-container leaflet-fade-anim leaflet-grab leaflet-touch-drag'])")).click();
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        Driver.quit();
    
    }
    
}
