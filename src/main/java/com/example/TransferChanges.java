package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TransferChanges {
    public static void main(String[] args) {

        WebDriver Driver =new ChromeDriver();
        Driver.get("http://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();

        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-coin'])")).click();
        Driver.findElement(By.id("q")).sendKeys("AUD");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.findElement(By.xpath("(//*[@class='mdc-list-item__text'])")).click();
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-primary'])")).click();        
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/charges");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-success'])")).click();
        Driver.findElement(By.xpath("(//*[@id='refreshMaterializedViewModal']/div/form/div[2]/div[2]/div/button[2])")).click();
        Driver.navigate().refresh();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/charges?status=active");
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/charges?status=disabled");
        

    
}
}