package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class headercheck {
   

    private static Object actualtext;

    /**
     * @param args
     */
    public static void main(String[] args) {
       //WebDriver.chromedriver();
        WebDriver Driver =new ChromeDriver();
        Driver.get("https://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");

        //for wrong ID and password Invalid page will open and warm you for the attempts left
        //Driver.findElement(By.id("password")).sendKeys("Secret1");

        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();
        if(Driver.findElement(By.xpath("(//*[@class='container-scroller'])")).isDisplayed());
        {
            System.out.println("Successfully Installed");
        }
        Driver.navigate().to("https://ccec-122-163-122-32.ngrok.io/user-login-logs/me");
        //Driver.navigate().to("https://ccec-122-163-122-32.ngrok.io/user-login-logs/me");
        Driver.findElement(By.id("date-range")).click();

        WebElement element = Driver.findElement(By.id("date-range"));
        Actions actions = new Actions(Driver);
        actions.moveToElement(element).click(element).sendKeys("31/12/2022-03/01/2023").doubleClick(element).contextClick(element).build().perform();
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();

        Driver.findElement(By.xpath("(//*[@class='btn btn-outline-light border text-dark'])")).click();
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-logout'])")).click();
        Driver.quit();
        if(actualtext.equals("You've successfully logged out."))
        {
            System.out.println("matched");
        }
        else
        {
            System.out.println("not matched");
        }
        
        






        //WebElement Element=Driver.findElement(By.xpath("//select[@class='nav-link dropdown-toggle']"));//click();
        //Select select =new Select(Element);
        //select.selectByValue("az");
      //a.selectByIndex(2);
        //select.selectByVisibleText("Login History");
    }//
    
}
    
