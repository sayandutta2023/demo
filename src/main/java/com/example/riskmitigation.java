package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class riskmitigation {

    public static void main(String[] args) {

        WebDriver Driver =new ChromeDriver();
        Driver.get("http://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();

        Driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[30]/a/i")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/div[2]/ul/li[2]/a")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/div[2]/ul/li[3]/a")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a/span[2]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div/a/span[2]/i")).click();
        

    }
    
}
