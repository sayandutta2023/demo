package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomerDocuments {
    public static void main(String[] args) {
        WebDriver Driver =new ChromeDriver();
        Driver.get("http://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-passport'])")).click();
        //Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/customer-kyc-documents/all");
        Driver.findElement(By.id("q")).sendKeys("Vivek Indra");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/customer-kyc-documents/all");
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/customer-kyc-documents/all?status=pending");
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/customer-kyc-documents/all?status=accepted");
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/customer-kyc-documents/all?status=rejected");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])")).click();
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-logout'])")).click();
        Driver.quit();

    
    }
    
}
