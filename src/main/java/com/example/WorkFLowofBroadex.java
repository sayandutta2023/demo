package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkFLowofBroadex {

    public static void main(String[] args) throws InterruptedException {
        // WebDriver.chromedriver();

        // LOGIN //

        WebDriver Driver = new ChromeDriver();
        Driver.get("http://e336-122-163-122-32.ngrok.io/");
        Driver.manage().window().maximize();

        Driver.findElement(By.id("username")).sendKeys("super.admin");
        Driver.findElement(By.id("password")).sendKeys("Secret");

        // LOGIN HISTORY DETAILS//

        Driver.findElement(By.xpath("(//*[@class='btn btn-primary submit-btn btn-block'])")).click();
        if (Driver.findElement(By.xpath("(//*[@class='container-scroller'])")).isDisplayed())
            ;
        {
            System.out.println("Successfully Installed");
        }
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/user-login-logs/me");

        Driver.findElement(By.id("date-range")).click();

        WebElement element = Driver.findElement(By.id("date-range"));
        Actions actions = new Actions(Driver);
        actions.moveToElement(element).click(element).sendKeys("31/12/2022-03/01/2023").doubleClick(element)
                .contextClick(element).build().perform();
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.findElement(By.xpath("(//*[@class='btn btn-outline-light border text-dark'])")).click();

        // BACK TO DASHBOARD //
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();

        // ERMI UPLOAD CHECK (failed)
        // Driver.findElement(By.xpath("(//*[@class='menu-icon mdi
        // mdi-cloud-upload'])")).click();
        // Driver.findElement(By.xpath("(//*[@class='btn btn-success
        // btn-block'])")).click();

        // ERMI UPLOAD CHECK (PASSED) //
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-cloud-upload'])")).click();
        Driver.findElement(By.xpath("(//*[@class='file-upload-browse btn btn-primary'])")).click();
        Driver.findElement(By.xpath("(//*[@class='btn btn-success btn-block'])")).click();

        // BACK TO DASHBOARD//
        Driver.navigate().refresh();

        // ORDER SECTION//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-cart'])")).click();
        Driver.findElement(By.xpath("(//*[@class='btn btn-outline-light border text-dark dropdown-toggle'])")).click();
        Driver.findElement(By.xpath("//a[@href ='/orders?limit=200']")).click();
        Driver.navigate().back();
        Driver.navigate().refresh();
        Driver.findElement(By.id("q")).sendKeys("Pawan Kumar");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Thread.sleep(10000);

        // BACK TO DASHBOARD//
        Driver.navigate().refresh();
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();

        // REFUND//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-cash-refund'])")).click();
        WebElement elements = Driver.findElement(By.id("date-range"));
        Actions actions1 = new Actions(Driver);
        actions1.moveToElement(elements).click(elements).sendKeys("27/01/2023 - 28/01/2023").contextClick(elements)
                .build().perform();
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])"))
                .click();

        // BACK TO DASHBOARD//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();
        Driver.navigate().refresh();
        Driver.navigate().refresh();

        // ANALYTICS//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-elevation-rise'])")).click();
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/analytics/fx-profit-and-loss?referer=%252Fanalytics");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])"))
                .click();
        Driver.navigate().to(
                "http://e336-122-163-122-32.ngrok.io/analytics/new-customer-transactions-report?referer=%252Fanalytics");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-outline-light text-dark'])")).click();
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])"))
                .click();
        Driver.navigate().to(
                "http://e336-122-163-122-32.ngrok.io/analytics/platform-based-transactions-report?referer=%252Fanalytics");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-outline-light text-dark'])")).click();
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])"))
                .click();
        Driver.navigate().to(
                "http://e336-122-163-122-32.ngrok.io/analytics/document-verification-performance-report?referer=%252Fanalytics");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])"))
                .click();
        Driver.navigate().to(
                "http://e336-122-163-122-32.ngrok.io/analytics/payout-partner-performance-report?referer=%252Fanalytics");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])"))
                .click();
        Driver.navigate().to(
                "http://e336-122-163-122-32.ngrok.io/analytics/destination-country-delivery-report?referer=%252Fanalytics");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])"))
                .click();

        // BACK TO DASHBOARD//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();
        Driver.navigate().refresh();

        // EARNING STATEMENT AND SETTLEMENT//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-receipt'])")).click();
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/partner-commission-earnings?status=active");
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/partner-commission-earnings?status=disabled");
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-file-cabinet'])")).click();
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/partner-commission-settlements?type=due");
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/partner-commission-settlements?type=processed");

        // BACK TO DASHBOARD//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();
        Driver.navigate().refresh();

        // CUSTOMERS//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-account-group'])")).click();
        WebElement element2 = Driver.findElement(By.id("q"));
        Actions actions2 = new Actions(Driver);
        actions2.moveToElement(element2).click(element2).sendKeys("add add").contextClick(element2).build().perform();
        // Driver.findElement(By.id("date-range")).sendKeys("27/01/2023 - 02/02/2023");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.navigate().to(
                "http://e336-122-163-122-32.ngrok.io/customers/view/7b2c751e-3753-45de-8293-cf2f110489a4?referer=%252Fcustomers");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-cloud-upload'])")).click();
        Driver.findElement(By.id("document-number")).sendKeys("98HOP87");
        Driver.findElement(By.id("issuer")).sendKeys("SSTPWB005");
        Driver.findElement(By.id("place-of-issue")).sendKeys("INDIA");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-info'])")).click();
        Thread.sleep(3000);
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])"))
                .click();
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])"))
                .click();
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/customers?status=live");
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/customers?status=blocked");
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/customers?status=suspended");
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/customers?status=flagged");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])"))
                .click();

        // BACK TO DASHBOARD//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();
        Driver.navigate().refresh();

        // DOCUMENT VERIFICATION//
        Driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[13]/a/i")).click();
        Driver.findElement(By.id("q")).sendKeys("Dhruv Patel");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.findElement(By.xpath("(//*[@class='mdc-list-item__text'])")).click();
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])"))
                .click();
        Driver.navigate().to(
                "http://e336-122-163-122-32.ngrok.io/customer-kyc-documents/view/33702733-7d76-4b8e-813e-b37d2f2f8aed?referer=%252Fcustomer-kyc-documents%253Freferer%253D%2526date_range%253D%2526q%253DDhruv%252BPatel");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])"))
                .click();

        // BACK TO DASHBOARD//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();
        Driver.navigate().refresh();

        // CUSTOMER DOCUMENT//
        Driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[14]/a/i")).click();
        Driver.findElement(By.id("q")).sendKeys("Vivek Indra");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/customer-kyc-documents/all");
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/customer-kyc-documents/all?status=pending");
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/customer-kyc-documents/all?status=accepted");
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/customer-kyc-documents/all?status=rejected");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm text-nowrap btn-outline-light border text-dark'])"))
                .click();

        // BACK TO DASHBOARD//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();
        Driver.navigate().refresh();

        // CUSTOMER LOGIN LOGS//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-fingerprint'])")).click();
        WebElement element4 = Driver.findElement(By.id("date-range"));
        Actions actions4 = new Actions(Driver);
        actions4.moveToElement(element4).click(element4).sendKeys("01/02/2023 - 03/02/2023").contextClick(element4)
                .build().perform();
        // Driver.findElement(By.id("date-range")).sendKeys("27/01/2023 - 02/02/2023");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.findElement(By.xpath("(//*[@class='mdc-list-item__text'])")).click();
        Driver.findElement(
                By.xpath("(//*[@class='leaflet-container leaflet-fade-anim leaflet-grab leaflet-touch-drag'])"))
                .click();

        // BACK TO DASHBOARD//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();
        Driver.navigate().refresh();

        // ACCESSROLE//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-incognito'])")).click();
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/access-roles?status=active");
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/access-roles?status=disabled");
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/access-roles");
        Driver.findElement(By.xpath("(//*[@class='mdc-list-item__primary-text'])")).click();
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        Driver.navigate().to(
                "http://e336-122-163-122-32.ngrok.io/access-roles/view/fecadebb-5b9d-46ba-8dfb-ad9ec9efbda1?referer=%252Faccess-roles");
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-outline-light border text-dark'])")).click();
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-primary'])")).click();
        WebElement element3 = Driver
                .findElement(By.xpath("(//*[@class='selectize-input items not-full has-options'])"));
        Actions actions3 = new Actions(Driver);
        actions3.moveToElement(element3).click(element3).sendKeys("Super Administrator").contextClick(element3).build()
                .perform();
        Driver.findElement(By.id("title")).sendKeys("QA Analyst");
        Driver.findElement(By.id("description")).sendKeys("HIHIHIHIHIHIHIHIHIhhhhhhhhhhhhhhhhhhhhhhhhiii");
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();

        // BACK TO DASHBOARD//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();
        Driver.navigate().refresh();

        // CONSOLE USERS//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-account-multiple'])")).click();
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/users?status=active");
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/users?status=blocked");
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/users?status=suspended");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-primary'])")).click();
        Driver.findElement(By.id("first-name")).sendKeys("Sayan");
        Driver.findElement(By.id("middle-name")).sendKeys("Kumar");
        Driver.findElement(By.id("last-name")).sendKeys("Dutta");
        Driver.findElement(By.id("username")).sendKeys("sayan99");
        Driver.findElement(By.id("password")).sendKeys("Sayandutta@99");
        Driver.findElement(By.xpath("(//*[@class='btn btn-outline-secondary'])")).click();
        Driver.findElement(By.id("confirm-password")).sendKeys("Sayandutta@99");
        // WebElement element = Driver.findElement(By.id("settings-nationality-id"));
        // Actions actions = new Actions(Driver);
        // actions.moveToElement(element).click(element).sendKeys("Independent
        // Agent").contextClick(element).build().perform();
        // Driver.findElement(By.xpath("(//*[@class='btn
        // btn-outline-secondary'])")).click();
        Driver.findElement(By.id("email")).sendKeys("Sayandutta199@gmail.com");
        Driver.findElement(By.id("address-address-line-1")).sendKeys("Rishra");
        Driver.findElement(By.id("address-address-line-2")).sendKeys("Hooghly");
        Driver.findElement(By.id("address-city")).sendKeys("Rishra");
        Driver.findElement(By.id("address-region")).sendKeys("Santa Cruz");
        Driver.findElement(By.id("address-postcode")).sendKeys("712248");
        Driver.findElement(By.id("address-mobile-number")).sendKeys("6290287547");
        Driver.findElement(By.id("address-phone-number")).sendKeys("7439953591");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-success'])")).click();
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        Driver.navigate().to(
                "http://e336-122-163-122-32.ngrok.io/users/view/3ef04c75-1d6e-4af7-b200-b637b9f316ee?referer=%252Fusers");
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();

        // BACK TO DASHBOARD//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();
        Driver.navigate().refresh();

        // CONTINENTS//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-earth'])")).click();
        Driver.findElement(By.xpath("(//*[@class='mdc-list-item__text'])")).click();
        Driver.findElement(By.id("q")).sendKeys("afghanistan");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.navigate().to(
                "http://e336-122-163-122-32.ngrok.io/countries/view/b2f3d4f8-0938-455a-8750-22efab180f6f?referer=%252Fcountries%253Fcontinent%253Df355e326-7046-48ec-8dd5-44e90648892f%2526referer%253D%2525252Fcontinents%2526q%253D");
        Driver.findElement(By.xpath("(//*[@class='mdc-list-item__primary-text'])")).click();
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        Driver.findElement(By.id("q")).sendKeys("pakistan");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.navigate().to(
                "http://e336-122-163-122-32.ngrok.io/countries/view/05452b41-7361-4068-9c42-61172af9e173?referer=%252Fcountries%253Fcontinent%253Df355e326-7046-48ec-8dd5-44e90648892f%2526referer%253D%2525252Fcontinents%2526q%253Dpakistan");
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();

        // BACK TO DASHBOARD//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();
        Driver.navigate().refresh();

        // COUNTRY//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-flag'])")).click();
        Driver.findElement(By.id("q")).sendKeys("Brazil");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.navigate().to(
                "http://e336-122-163-122-32.ngrok.io/countries/view/e4b17189-fac6-4e4e-9703-83e7c608954b?referer=%252Fcountries%253Fq%253Dbrazil");
        Driver.findElement(By.xpath("(//*[@class='mdc-list-item__primary-text'])")).click();
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='btn btn-outline-light border text-dark'])")).click();
        Driver.findElement(By.id("q")).sendKeys("United Kingdom");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.navigate().to(
                "http://e336-122-163-122-32.ngrok.io/countries/view/d1e0a750-7175-4c76-9e21-9181994567d3?referer=%252Fcountries%253Fq%253DUnited%252BKingdom");
        Driver.findElement(By.xpath("(//*[@class='mdc-list-item__primary-text'])")).click();

        // BACK TO DASHBOARD//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();
        Driver.navigate().refresh();

        // CURRENCIES//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-currency-usd'])")).click();
        Driver.findElement(By.id("q")).sendKeys("Brazil");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.navigate().to(
                "http://e336c-122-163-122-32.ngrok.io/currencies/view/a8083599-7ec7-4edb-8d4e-04858bccb9c7?referer=%2Fcurrencies%3Fstatus%3D%26q%3Dbrazil");
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-close'])")).click();
        Driver.findElement(By.id("q")).sendKeys("united states");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.navigate().to(
                "http://e336-122-163-122-32.ngrok.io/currencies/view/3ebdacc6-52d6-47bf-8923-81fcd0500d4e?referer=%2Fcurrencies%3Fstatus%3D%26q%3Dunited%2Bstates");
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-close'])")).click();
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/currencies?status=active");
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/currencies?status=disabled");

        // BACK TO DASHBOARD//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();
        Driver.navigate().refresh();

        // TRANSFER CHNAGES//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-coin'])")).click();
        Driver.findElement(By.id("q")).sendKeys("AUD");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.findElement(By.xpath("(//*[@class='mdc-list-item__text'])")).click();
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-primary'])")).click();
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/charges");
        Driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-success'])")).click();
        Driver.findElement(By.xpath("(//*[@id='refreshMaterializedViewModal']/div/form/div[2]/div[2]/div/button[2])"))
                .click();
        Driver.navigate().refresh();
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/charges?status=active");
        Driver.navigate().to("http://e336-122-163-122-32.ngrok.io/charges?status=disabled");

        // BACK TO DASHBOARD//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();
        Driver.navigate().refresh();

        // EXCHANGE RATES//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-swap-horizontal-bold'])")).click();
        Driver.findElement(By.id("q")).sendKeys("GBP");
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.findElement(By.xpath("(//*[@class='mdc-list-item__text'])")).click();
        WebElement element5 = Driver.findElement(By.id("date-range"));
        Actions actions5 = new Actions(Driver);
        actions5.moveToElement(element5).click(element5).sendKeys("27/01/2023 - 02/02/2023").contextClick(element5)
                .build().perform();
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[3]/ul/li[1]/a/span[1]")).click();
        Driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/a/span[2]")).click();
        Driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/form/div/span[2]/a/i"))
                .click();
        Driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/a")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a/span[2]/i")).click();
        Driver.findElement(By.xpath("(//*[@id='refreshMaterializedViewModal']/div/form/div[2]/div[2]/div/button[2])"))
                .click();
        Driver.navigate().refresh();

        // BACK TO DASHBOARD//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();
        Driver.navigate().refresh();

        // POS SETTLEMENTS RATES
        Driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[26]/a/i")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a/span[2]")).click();
        Driver.navigate().refresh();

        // BACK TO DASHBOARD//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();
        Driver.navigate().refresh();

        // PLATFORMS
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-console-line'])")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/ul/li[1]/a/span[1]")).click();
        Driver.findElement(By.xpath("(//*[@class='mdc-list-item__primary-text'])")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[2]/span[2]")).click();
        Driver.findElement(By.id("domain")).sendKeys("www.remitall.co.uk");
        Driver.findElement(By.id("title")).sendKeys("Mobile App");
        Driver.findElement(By.id("description")).sendKeys("Mobile App is an interesting part of the development");
        // Driver.findElement(By.id("whitelisted-ips")).sendKeys("10.10.12.165");
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div/button/span[2]")).click();
        Driver.navigate().refresh();
        Driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/a[1]/span[2]")).click();
        Driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/a[1]/span[2]")).click();
        Driver.navigate().refresh();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/ul/li[3]/a/span[1]")).click();
        // Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[3]/ul/li/a/span[1]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[2]/span[2]")).click();
        Driver.findElement(By.id("domain")).sendKeys("www.remitall.co.uk");
        Driver.findElement(By.id("title")).sendKeys("Mobile App");
        Driver.findElement(By.id("description")).sendKeys("Mobile App is an interesting part of the development");
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div/button/span[2]")).click();
        Driver.navigate().refresh();

        // BACK TO DASHBOARD//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();
        Driver.navigate().refresh();

        // IOS VERSION
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-apple-ios'])")).click();

        // BACK TO DASHBOARD//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();
        Driver.navigate().refresh();

        // ANDROID VERSION
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-android'])")).click();
        WebElement element6 = Driver.findElement(By.id("q"));
        Actions actions6 = new Actions(Driver);
        actions6.moveToElement(element6).click(element6).sendKeys("1.0.2").doubleClick(element6).contextClick(element6)
                .build().perform();
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/a[2]/span[2]")).click();
        Driver.findElement(By.id("version-name")).sendKeys("1.5.2.0");
        Driver.findElement(By.id("message")).sendKeys("For Test");
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div/button/span[2]")).click();
        Driver.navigate().refresh();
        // Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div/a/span[2]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/a[1]/span[2]")).click();
        Driver.navigate().refresh();

        // BACK TO DASHBOARD//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();
        Driver.navigate().refresh();

        // RISk MITIGATION
        Driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[30]/a/i")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/div[2]/ul/li[2]/a")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/div[2]/ul/li[3]/a")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a/span[2]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div/a/span[2]/i")).click();

        // BACK TO DASHBOARD//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();
        Driver.navigate().refresh();

        // AML
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-filter-remove'])")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/a/div[1]/h1")).click();

        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[2]/span[2]")).click();
        Driver.findElement(By.id("code")).sendKeys("559");
        Driver.findElement(By.id("title")).sendKeys("QA TEST");
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div/div/button/span[2]")).click();
        Driver.navigate().refresh();
        Driver.findElement(By.xpath("(//*[@class='d-none d-sm-block'])")).click();

        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[1]/span[2]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[2]/a/div[1]/h1")).click();

        WebElement element8 = Driver.findElement(By.id("q"));
        Actions actions8 = new Actions(Driver);
        actions8.moveToElement(element).click(element8).sendKeys("telephone").contextClick(element8).build().perform();
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();

        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[2]/span[2]")).click();
        Driver.findElement(By.id("code")).sendKeys("210");
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div/div/button/span[2]")).click();
        Driver.navigate().refresh();

        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div/div/a/span[2]")).click();
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-close'])")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[1]")).click();

        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[3]/a/div[1]/h4")).click();

        WebElement element9 = Driver.findElement(By.id("q"));
        Actions actions9 = new Actions(Driver);
        actions9.moveToElement(element9).click(element9).sendKeys("eu").contextClick(element9).build().perform();
        Driver.findElement(By.xpath("(//*[@class='mdi mdi-magnify'])")).click();

        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[3]/ul/li[1]/a/span[1]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[3]/ul/li[4]/a/span[1]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/div/a")).click();

        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[1]/span[2]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[1]/span[2]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[4]/a/div[1]")).click();

        Driver.findElement(By.id("lookup-value")).sendKeys("Sayan");
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/div/div/form/button")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/a/span[2]")).click();

        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/a/span[2]")).click();

        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[5]/a/div[1]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/a/span[2]")).click();

        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[6]/a/div[1]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[3]/span[2]")).click();

        Driver.findElement(By.id("code")).sendKeys("032");
        Driver.findElement(By.id("title")).sendKeys("QA TESTs");
        Driver.findElement(By.xpath("//*[@id='reasonModal']/div/div/form/div[3]/button")).click();
        Driver.navigate().refresh();
        Driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/a[1]/span[2]")).click();

        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[7]/a/div[1]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[1]/span[2]")).click();

        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[8]/a/div[1]")).click();
        Driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/a[1]/span[2]")).click();

        // BACK TO DASHBOARD//
        Driver.findElement(By.xpath("(//*[@class='menu-icon mdi mdi-monitor-dashboard'])")).click();
        Driver.navigate().refresh();

        Driver.quit();

    }
}