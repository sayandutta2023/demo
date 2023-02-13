package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exchangerates {
    public static void main(String[] args) {

        WebDriver Driver =new ChromeDriver();
        Driver.get("http://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();

        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-swap-horizontal-bold'])")).click();
        Driver.findElement(By.id("q")).sendKeys("GBP");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.findElement(By.xpath("(//*[@class='mdc-list-item__text'])")).click();
        WebElement element = Driver.findElement(By.id("date-range"));
        Actions actions = new Actions(Driver);
        actions.moveToElement(element).click(element).sendKeys("27/01/2023 - 02/02/2023").contextClick(element).build().perform();
        //Driver.findElement(By.id("date-range")).sendKeys("27/01/2023 - 02/02/2023");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[3]/ul/li[1]/a/span[1]")).click();
        Driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/a/span[2]")).click();
        Driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/form/div/span[2]/a/i")).click();
        Driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/a")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a/span[2]/i")).click();
        Driver.findElement(By.xpath("(//*[@id='refreshMaterializedViewModal']/div/form/div[2]/div[2]/div/button[2])")).click();
        Driver.navigate().refresh();
    
}
}