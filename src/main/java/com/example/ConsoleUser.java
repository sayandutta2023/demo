package com.example;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;



public class ConsoleUser {
    public static void main(String[] args) {
        WebDriver Driver =new ChromeDriver();
        Driver.get("http://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-account-multiple'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/users?status=active");
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/users?status=blocked");
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/users?status=suspended");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-primary'])")).click();

        Driver.findElement(By.id("first-name")).sendKeys("Sayan");
        Driver.findElement(By.id("middle-name")).sendKeys("Kumar");
        Driver.findElement(By.id("last-name")).sendKeys("Dutta");
        Driver.findElement(By.id("username")).sendKeys("sayan99");
        Driver.findElement(By.id("password")).sendKeys("Sayandutta@99");

        Driver.findElement(By.xpath("(//*[@class='btn btn-outline-secondary'])")).click();

        Driver.findElement(By.id("confirm-password")).sendKeys("Sayandutta@99");
        
        //WebElement element = Driver.findElement(By.id("settings-nationality-id"));
        //Actions actions = new Actions(Driver);
        //actions.moveToElement(element).click(element).sendKeys("Independent Agent").contextClick(element).build().perform();
        
    
        //Driver.findElement(By.xpath("(//*[@class='btn btn-outline-secondary'])")).click();

        Driver.findElement(By.id("email")).sendKeys("Sayandutta199@gmail.com");
        Driver.findElement(By.id("address-address-line-1")).sendKeys("Rishra");
        Driver.findElement(By.id("address-address-line-2")).sendKeys("Hooghly");
        Driver.findElement(By.id("address-city")).sendKeys("Rishra");
        Driver.findElement(By.id("address-region")).sendKeys("Santa Cruz");
        Driver.findElement(By.id("address-postcode")).sendKeys("712248");
        Driver.findElement(By.id("address-mobile-number")).sendKeys("6290287547");
        Driver.findElement(By.id("address-phone-number")).sendKeys("7439953591");
        
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-success'])")).click();

        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/users/view/3ef04c75-1d6e-4af7-b200-b637b9f316ee?referer=%252Fusers");
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        Driver.close();



    }
    
}
