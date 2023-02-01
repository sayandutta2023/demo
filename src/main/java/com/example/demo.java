package com.example;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class demo {
    public static void main(String[] args) {
        
        //WebDriver.chromedriver();
        ChromeDriver Driver =new ChromeDriver();
        Driver.get("https://www.google.com/");
        Driver.navigate().to("https://www.youtube.com/");
        Driver.navigate().back(); 
        Driver.navigate().to("https://www.youtube.com/");
        Driver.navigate().back(); 
        Driver.navigate().to("https://www.youtube.com/");
        Driver.navigate().back(); 
        Driver.navigate().to("https://www.youtube.com/");
        Driver.navigate().back(); 
        Driver.navigate().to("https://www.youtube.com/");
    }
    }
