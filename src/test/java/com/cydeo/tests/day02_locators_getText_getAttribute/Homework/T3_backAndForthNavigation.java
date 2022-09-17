package com.cydeo.tests.day02_locators_getText_getAttribute.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_backAndForthNavigation {
    public static void main(String[] args) {
        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Click to Gmail from top right.

        WebElement gmail = driver.findElement(By.className("gb_d"));
        gmail.click();


        //4- Verify title contains:Expected: Gmail
        String expected = "Gmail";
        String actual = driver.getTitle();

        if(actual.contains(expected)){
            System.out.println("Title verification passed");
        }else {
            System.out.println("Title verification failed");
        }


        //5- Go back to Google by using the .back();
driver.navigate().back();

        //6- Verify title equals:Expected: Google
        expected = "Google";
        actual = driver.getTitle();

        if(actual.equals(expected)){
            System.out.println("Title Verification Passed");
        }else{
            System.out.println("Title Verification Failed");
        }
        driver.quit();

    }
}
