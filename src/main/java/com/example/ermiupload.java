package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ermiupload {
    public static void main(String[] args) {
        
         WebDriver Driver =new ChromeDriver();
         Driver.get("http://ccec-122-163-122-32.ngrok.io/");
         Driver.manage().window().maximize();

         Driver.findElement(By.id("username")).sendKeys("super.admin");
         Driver.findElement(By.id("password")).sendKeys("Secret");
         Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();
         
         //ERMI UPLOAD CHECK (failed)
         //Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-cloud-upload'])")).click();
         //Driver.findElement(By.xpath("(//*[@class='btn btn-success btn-block'])")).click();
         
         //ERMI UPLOAD CHECK (PASSED)
         Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-cloud-upload'])")).click();
         Driver.findElement(By.xpath("(//*[@class='file-upload-browse btn btn-primary'])")).click();
         Driver.findElement(By.xpath("(//*[@class='btn btn-success btn-block'])")).click();
        }
    }
