package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Aml 
{
    
    public static void main(String[] args) {

        WebDriver Driver =new ChromeDriver();
        Driver.get("http://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();

        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-filter-remove'])")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/a/div[1]/h1")).click();
        
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[2]/span[2]")).click();
        Driver.findElement(By.id("code")).sendKeys("559");
        Driver.findElement(By.id("title")).sendKeys("QA TEST");
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div/div/button/span[2]")).click();
        Driver.navigate().refresh();
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[1]/span[2]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[2]/a/div[1]/h1")).click();

        WebElement element = Driver.findElement(By.id("q"));
        Actions actions = new Actions(Driver);
        actions.moveToElement(element).click(element).sendKeys("telephone").contextClick(element).build().perform();
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();

        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[2]/span[2]")).click();
        Driver.findElement(By.id("code")).sendKeys("210");
        Driver.findElement(By.id("title")).sendKeys("QA Test");
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div/div/button/span[2]")).click();
        Driver.navigate().refresh();

        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div/div/a/span[2]")).click();
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-close'])")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[1]")).click();

        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[3]/a/div[1]/h4")).click();

        WebElement element6 = Driver.findElement(By.id("q"));
        Actions actions6 = new Actions(Driver);
        actions6.moveToElement(element6).click(element6).sendKeys("eu").contextClick(element6).build().perform();
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();

        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[3]/ul/li[1]/a/span[1]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[3]/ul/li[4]/a/span[1]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/div/a")).click();
        
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[1]/span[2]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[1]/span[2]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[4]/a/div[1]")).click();

        Driver.findElement(By.id("lookup-value")).sendKeys("Sayan");
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/div/div/form/button")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/a/span[2]")).click();
        
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/a/span[2]")).click();

        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[5]/a/div[1]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/a/span[2]")).click();

        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[6]/a/div[1]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[3]/span[2]")).click();

        Driver.findElement(By.id("code")).sendKeys("805");
        Driver.findElement(By.id("title")).sendKeys("QA TEST");
        Driver.findElement(By.xpath("//*[@id='reasonModal']/div/div/form/div[3]/button")).click();
        Driver.navigate().refresh();
        Driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/a[1]/span[2]")).click();

        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[7]/a/div[1]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[1]/span[2]")).click();

        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[8]/a/div[1]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[1]/span[2]")).click();




      
}
}

