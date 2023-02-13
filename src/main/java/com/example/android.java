package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class android {

    public static void main(String[] args) {

        WebDriver Driver =new ChromeDriver();
        Driver.get("http://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();
        
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-android'])")).click();
        WebElement element = Driver.findElement(By.id("q"));
        Actions actions = new Actions(Driver);
        actions.moveToElement(element).click(element).sendKeys("1.0.2").doubleClick(element).contextClick(element).build().perform();
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/a[2]/span[2]")).click();
        Driver.findElement(By.id("version-name")).sendKeys("1.5.0");
        Driver.findElement(By.id("message")).sendKeys("For Test");
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div/button/span[2]")).click();
        Driver.navigate().refresh();
        //Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div/a/span[2]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/a[1]/span[2]")).click();
        Driver.navigate().refresh();




    }
    
}
