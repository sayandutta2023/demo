package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AccessRole {
    public static void main(String[] args) {
        WebDriver Driver =new ChromeDriver();
        Driver.get("http://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/access-roles");
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/access-roles?status=active");
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/access-roles?status=disabled");
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/access-roles");
        Driver.findElement(By.xpath("(//*[@class='mdc-list-item__primary-text'])")).click();
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/access-roles/view/fecadebb-5b9d-46ba-8dfb-ad9ec9efbda1?referer=%252Faccess-roles");
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-outline-light border text-dark'])")).click();

        Driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-primary'])")).click();
        WebElement element =Driver.findElement(By.xpath("(//*[@class='selectize-input items not-full has-options'])"));
        Actions actions = new Actions(Driver);
        actions.moveToElement(element).click(element).sendKeys("Super Administrator").contextClick(element).build().perform();
        Driver.findElement(By.id("title")).sendKeys("QA Analyst");
        Driver.findElement(By.id("description")).sendKeys("HIHIHIHIHIHIHIHIHIhhhhhhhhhhhhhhhhhhhhhhhhiii");
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-logout'])")).click();
        Driver.quit();

    }
    
}
