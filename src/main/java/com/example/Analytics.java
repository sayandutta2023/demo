package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Analytics {

    public static void main(String[] args) {
        WebDriver Driver =new ChromeDriver();
        Driver.get("http://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-elevation-rise'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/analytics/fx-profit-and-loss?referer=%252Fanalytics");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/analytics/new-customer-transactions-report?referer=%252Fanalytics");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-outline-light text-dark'])")).click();
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/analytics/platform-based-transactions-report?referer=%252Fanalytics");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-outline-light text-dark'])")).click();
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/analytics/document-verification-performance-report?referer=%252Fanalytics");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/analytics/payout-partner-performance-report?referer=%252Fanalytics");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/analytics/destination-country-delivery-report?referer=%252Fanalytics");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])")).click();
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-logout'])")).click();
        Driver.quit();

    }
    
}
