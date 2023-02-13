package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;




public class order1 {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver Driver =new ChromeDriver();
        Driver.get("http://ccec-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");
        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();

        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/orders");

        WebElement element = Driver.findElement(By.id("date-range"));
        Actions actions = new Actions(Driver);
        actions.moveToElement(element).click(element).sendKeys("27/01/2023 - 02/02/2023").contextClick(element).build().perform();
        //Driver.findElement(By.id("date-range")).sendKeys("27/01/2023 - 02/02/2023");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/orders");
        Driver.navigate().refresh();
        //Driver.navigate().to("http://ccec-122-163-122-32.ngrok.io/orders?ip_address=&customer=&payment_reference=&payment_instrument_pan=&send_amount_start=&send_amount_end=&discount_code=&payout_reference=&payout_amount_start=&payout_amount_end=&recipient=&range_type=created&date_range=27%2F01%2F2023+-+02%2F02%2F2023&q=");
        Driver.findElement(By.id("q")).sendKeys("Pawan Kumar");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Thread.sleep(10000);
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-logout'])")).click();
        Driver.quit();
        //river.findElement(By.xpath("(//*[@class='dropdown-menu dropdown-menu-right show'])")).click();
		//drp.selectByVisibleText("Export Default Report");
        //Driver.navigate().to("http://f2d3-122-163-122-32.ngrok.io/orders.xlsx?ip_address=&amp;customer=&amp;payment_reference=&amp;payment_instrument_pan=&amp;send_amount_start=&amp;send_amount_end=&amp;discount_code=&amp;payout_reference=&amp;payout_amount_start=&amp;payout_amount_end=&amp;recipient=&amp;range_type=created&amp;date_range=27%2F01%2F2023+-+02%2F02%2F2023&amp;q=&amp;order_state%5B0%5D=INITIAL_STATE&amp;export_type=DEFAULT");
        
        //Driver.findElement(By.xpath("(//*[@class='btn btn-outline-light border text-dark dropdown-toggle'])")).click();
        
        //Select drp = new Select(Driver.findElement(By.xpath("(//*[@class='item'])")));
		//drp.selectByVisibleText("Payment Pending");
        //Driver.findElement(By.xpath("(//*[@class='btn btn-outline-light border text-dark'])")).click();
		//drp.selectByIndex(1);


    }
}
