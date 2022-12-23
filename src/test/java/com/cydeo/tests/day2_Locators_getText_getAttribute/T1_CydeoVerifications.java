package com.cydeo.tests.day2_Locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://practice.cydeo.com");
        String expectedURL="cydeo";
        String actualURL=driver.getCurrentUrl();


        if (actualURL.contains(expectedURL)){
            System.out.println("URL pass");
        }else {
            System.out.println("URL verification failed");
        }

        String expectedTitle="Practice";
        String actualTitle=driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }

        driver.close();
    }
}
