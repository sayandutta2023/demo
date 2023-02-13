package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Continents {
    public static void main(String[] args) throws InterruptedException {
        WebDriver Driver =new ChromeDriver();
        Driver.get("http://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-earth'])")).click();
        Driver.findElement(By.xpath("(//*[@class='mdc-list-item__text'])")).click();
        Driver.findElement(By.id("q")).sendKeys("afghanistan");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/countries/view/b2f3d4f8-0938-455a-8750-22efab180f6f?referer=%252Fcountries%253Fcontinent%253Df355e326-7046-48ec-8dd5-44e90648892f%2526referer%253D%2525252Fcontinents%2526q%253D");
        Driver.findElement(By.xpath("(//*[@class='mdc-list-item__primary-text'])")).click();
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        Driver.findElement(By.id("q")).sendKeys("pakistan");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/countries/view/05452b41-7361-4068-9c42-61172af9e173?referer=%252Fcountries%253Fcontinent%253Df355e326-7046-48ec-8dd5-44e90648892f%2526referer%253D%2525252Fcontinents%2526q%253Dpakistan");
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-logout'])")).click();
        Driver.quit();        



    
}
}
