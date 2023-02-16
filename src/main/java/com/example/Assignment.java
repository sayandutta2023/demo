package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

    public static void main(String[] args) {
        //WebDriver.chromedriver().setup();
        WebDriver Driver= new ChromeDriver();
        
        Driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("input-email")).sendKeys("sayan@gmail.com");
        Driver.findElement(By.id("input-password")).sendKeys("sayan@123");

        Driver.findElement(By.xpath("//input[@value='Login']")).click();

        if(Driver.findElement(By.xpath("(//a[text()='logout'])[1]")).isEnabled())
        {
            System.out.println("presnt");
        }
        else
        {
            System.out.println("not");
        }
        
    }
    
}
