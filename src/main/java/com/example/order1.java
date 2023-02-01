package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class order1 {
    public static void main(String[] args) {
        
        WebDriver Driver =new ChromeDriver();
        Driver.get("https://f2d3-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();

        Driver.navigate().to("http://f2d3-122-163-122-32.ngrok.io/orders");
        
        Select drp = new Select(Driver.findElement(By.xpath("(//*[@class='dropdown icon'])")));
		drp.selectByVisibleText("Point of Sale");
        Driver.findElement(By.xpath("(//*[@class='btn btn-outline-light border text-dark'])")).click();
		//drp.selectByIndex(1);
    }
}
