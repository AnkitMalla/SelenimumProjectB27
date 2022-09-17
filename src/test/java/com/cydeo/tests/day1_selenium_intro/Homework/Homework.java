package com.cydeo.tests.day1_selenium_intro.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {
        /*
        TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to
https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
       Expected: Practice

         */
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com ");
        String expectedUrl = "cydeo";
        String actualURL = driver.getCurrentUrl();
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualURL.contains(expectedUrl)) {
            if (actualTitle.equals(expectedTitle)) {
                System.out.println(" Verification passed");
            }

        } else {
            System.out.println("Verification failed");
        }
    }
}





