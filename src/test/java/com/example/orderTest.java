package com.example;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;    
    
public class orderTest {

    @Before
    public void setup(){

    }
        
    @Test
    public void test() {
        WebDriver Driver =new ChromeDriver();
        Driver.get("http://e336-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();

        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/orders");
        Driver.findElement(By.xpath("(//*[@class='btn btn-outline-light border text-dark dropdown-toggle'])")).click();
      
       
        Driver.findElement(By.xpath("//a[@href ='/orders?limit=200']")).click();
       Driver.quit();
        
    }
}
    