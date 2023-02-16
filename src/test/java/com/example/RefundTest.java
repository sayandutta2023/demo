package com.example;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.Before;    
    
public class RefundTest {

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
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-cash-refund'])")).click();
        WebElement element = Driver.findElement(By.id("date-range"));
        Actions actions = new Actions(Driver);
        actions.moveToElement(element).click(element).sendKeys("27/01/2023 - 28/01/2023").contextClick(element).build().perform();
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])")).click();
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-logout'])")).click();
        Driver.quit();
        
    }
}
    