package com.example;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class Customers {
    public static void main(String[] args) throws InterruptedException {
        WebDriver Driver =new ChromeDriver();
        Driver.get("http://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-account-group'])")).click();
        WebElement element = Driver.findElement(By.id("q"));
        Actions actions = new Actions(Driver);
        actions.moveToElement(element).click(element).sendKeys("add add").contextClick(element).build().perform();
        //Driver.findElement(By.id("date-range")).sendKeys("27/01/2023 - 02/02/2023");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/customers/view/7b2c751e-3753-45de-8293-cf2f110489a4?referer=%252Fcustomers");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-cloud-upload'])")).click();
        Driver.findElement(By.id("document-number")).sendKeys("98HOP87");
        Driver.findElement(By.id("issuer")).sendKeys("SSTPWB005");
        Driver.findElement(By.id("place-of-issue")).sendKeys("INDIA");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-info'])")).click();
        Thread.sleep(3000);
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])")).click();
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/customers?status=live");
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/customers?status=blocked");
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/customers?status=suspended");
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/customers?status=flagged");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])")).click();
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-logout'])")).click();
        Driver.quit();


        
        
    }
    
}
