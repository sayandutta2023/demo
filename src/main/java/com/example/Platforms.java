package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Platforms {
    
    public static void main(String[] args) {

        WebDriver Driver =new ChromeDriver();
        Driver.get("http://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();

        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-console-line'])")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/ul/li[1]/a/span[1]")).click();
        Driver.findElement(By.xpath("(//*[@class='mdc-list-item__primary-text'])")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[2]/span[2]")).click();
        Driver.findElement(By.id("domain")).sendKeys("www.remitall.co.uk");
        Driver.findElement(By.id("title")).sendKeys("Mobile App");
        Driver.findElement(By.id("description")).sendKeys("Mobile App is an interesting part of the development");
        //Driver.findElement(By.id("whitelisted-ips")).sendKeys("10.10.12.165");
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div/button/span[2]")).click();
        Driver.navigate().refresh();
        Driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/a[1]/span[2]")).click();
        Driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/a[1]/span[2]")).click();
        Driver.navigate().refresh();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/ul/li[3]/a/span[1]")).click();
        //Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[3]/ul/li/a/span[1]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[2]/span[2]")).click();
        Driver.findElement(By.id("domain")).sendKeys("www.remitall.co.uk");
        Driver.findElement(By.id("title")).sendKeys("Mobile App");
        Driver.findElement(By.id("description")).sendKeys("Mobile App is an interesting part of the development");
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div/button/span[2]")).click();
        Driver.navigate().refresh();
        //Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/ul/li[3]/a/span[1]")).click();
        //Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[3]/ul/li/a/span[1]")).click();
        


}
}