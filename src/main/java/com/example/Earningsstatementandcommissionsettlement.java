package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Earningsstatementandcommissionsettlement {
    public static void main(String[] args) {
        WebDriver Driver =new ChromeDriver();
        Driver.get("http://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-receipt'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/partner-commission-earnings?status=active");
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/partner-commission-earnings?status=disabled");
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-file-cabinet'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/partner-commission-settlements?type=due");
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/partner-commission-settlements?type=processed");
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-logout'])")).click();
        Driver.quit();


    }
    
}
