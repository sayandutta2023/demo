package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DocumentVerify {
    public static void main(String[] args) {
        WebDriver Driver =new ChromeDriver();
        Driver.get("http://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-passport'])")).click();
        Driver.findElement(By.id("q")).sendKeys("Dhruv Patel");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.findElement(By.xpath("(//*[@class='mdc-list-item__text'])")).click();
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/customer-kyc-documents/view/33702733-7d76-4b8e-813e-b37d2f2f8aed?referer=%252Fcustomer-kyc-documents%253Freferer%253D%2526date_range%253D%2526q%253DDhruv%252BPatel");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])")).click();
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-logout'])")).click();
        Driver.quit();
    

        
    
    }
    
}
