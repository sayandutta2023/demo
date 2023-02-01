package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Loginconsole {
    public static void main(String[] args) {
       //WebDriver.chromedriver();
        WebDriver Driver =new ChromeDriver();
        Driver.get("https://f2d3-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");

        //for wrong ID and password Invalid page will open and warm you for the attempts left
        //Driver.findElement(By.id("password")).sendKeys("Secret1");

        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();
        if(Driver.findElement(By.xpath("(//*[@class='container-scroller'])")).isDisplayed());
        {
            System.out.println("Successfully Installed");
        }
    }
    
}
