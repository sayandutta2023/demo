package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class Advancedfilterorder {
    public static void main(String[] args) {
        WebDriver Driver =new ChromeDriver();
        Driver.get("http://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();

        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/orders");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-filter'])")).click();

        WebElement element = Driver.findElement(By.id("q-order-platform"));
        Actions actions =new Actions(Driver);
        actions.keyDown(Keys.SHIFT).sendKeys(element, " Mobile Applications ").build().perform();






        //Select se = new Select(Driver.findElement(By.xpath("//*[@id='q-order-platform']")));
        //se.selectByIndex(2);

        //WebElement dropdown = Driver.findElement(By.id("q-order-platform"));
        
        // Create a Select object to handle the dropdown
        //Select select = new Select(dropdown);
        
        // Select the option with value "option_value"
        //select.selectByValue("APP");
        
        // Close the browser
        //Driver.close();


        //Select drpCountry = new Select(Driver.findElement(By.name("platform[]")));
        //drpCountry.selectByVisibleText("Mobile Applications");

       
        //WebElement element = Driver.findElement(By.xpath("(//*[@class='search'])"));
        //Actions actions = new Actions(Driver);
        //actions.moveToElement(element).click(element).sendKeys("Mobile Applications").doubleClick(element).contextClick(element).build().perform();
        
        //WebElement element2 = Driver.findElement(By.xpath("(//*[@class='menu transition hidden'])"));
        //Actions actions2 = new Actions(Driver);
        //actions2.moveToElement(element2).click(element2).sendKeys("Krish Money Transfer").doubleClick(element).contextClick(element).build().perform();



        
    
    }
    
}
