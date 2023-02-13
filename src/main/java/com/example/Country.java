package com.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Country {
    
    public static void main(String[] args) throws InterruptedException {
        WebDriver Driver =new ChromeDriver();
        Driver.get("http://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-flag'])")).click();
        Driver.findElement(By.id("q")).sendKeys("Brazil");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/countries/view/e4b17189-fac6-4e4e-9703-83e7c608954b?referer=%252Fcountries%253Fq%253Dbrazil");
        Driver.findElement(By.xpath("(//*[@class='mdc-list-item__primary-text'])")).click();
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='btn btn-outline-light border text-dark'])")).click();
        Driver.findElement(By.id("q")).sendKeys("United Kingdom");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/countries/view/d1e0a750-7175-4c76-9e21-9181994567d3?referer=%252Fcountries%253Fq%253DUnited%252BKingdom");
        Driver.findElement(By.xpath("(//*[@class='mdc-list-item__primary-text'])")).click();
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-logout'])")).click();
        Driver.quit();
        
    }
}