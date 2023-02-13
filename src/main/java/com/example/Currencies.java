package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Currencies {

    public static void main(String[] args) {

        WebDriver Driver =new ChromeDriver();
        Driver.get("http://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();
        


         Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-currency-usd'])")).click();
         Driver.findElement(By.id("q")).sendKeys("Brazil");
         Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
         Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/currencies/view/a8083599-7ec7-4edb-8d4e-04858bccb9c7?referer=%2Fcurrencies%3Fstatus%3D%26q%3Dbrazil");
         Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
         Driver.findElement(By.xpath("(//*[@class='mdi mdi-close'])")).click();
         //Driver.findElement(By.xpath("(//*[@class='btn btn-outline-light border text-dark'])")).click();
         Driver.findElement(By.id("q")).sendKeys("united states");
         Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
         Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/currencies/view/3ebdacc6-52d6-47bf-8923-81fcd0500d4e?referer=%2Fcurrencies%3Fstatus%3D%26q%3Dunited%2Bstates");
         Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
         Driver.findElement(By.xpath("(//*[@class='mdi mdi-close'])")).click();
         Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/currencies?status=active");
         Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/currencies?status=disabled");

    }
    
}
