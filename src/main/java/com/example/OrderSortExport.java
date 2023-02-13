package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderSortExport {
    public static void main(String[] args) {
        WebDriver Driver =new ChromeDriver();
        Driver.get("http://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();

        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/orders");
        Driver.findElement(By.xpath("(//*[@class='btn btn-outline-light border text-dark ml-1 btn-sm dropdown-toggle'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/orders.xlsx?ip_address=&amp;customer=&amp;payment_reference=&amp;payment_instrument_pan=&amp;send_amount_start=&amp;send_amount_end=&amp;discount_code=&amp;payout_reference=&amp;payout_amount_start=&amp;payout_amount_end=&amp;recipient=&amp;range_type=created&amp;date_range=27%2F01%2F2023+-+02%2F02%2F2023&amp;q=&amp;order_state%5B0%5D=INITIAL_STATE&amp;export_type=DEFAULT");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-download mr-1'])")).click();
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])")).click();
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-logout'])")).click();
        Driver.quit();


        
    }
    
}
