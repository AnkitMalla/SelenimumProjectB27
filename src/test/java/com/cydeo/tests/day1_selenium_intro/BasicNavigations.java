package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // make the window that you open full screen


       // driver.get("https:/www.tesla.com");

        driver. navigate().to("https:/www.tesla.com"); // this is the same as the .get method

        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        //driver.close();

        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com");

        String currentTitle = driver.getTitle();

        System.out.println("title = " + currentTitle);

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        driver.quit();


    }

}
