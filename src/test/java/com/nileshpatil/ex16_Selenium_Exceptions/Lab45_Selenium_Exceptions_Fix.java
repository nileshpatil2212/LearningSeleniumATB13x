package com.nileshpatil.ex16_Selenium_Exceptions;

import com.nileshpatil.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab45_Selenium_Exceptions_Fix extends CommonToAll {

    @Test
    public void test_selenium_exceptions() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");

        try {
            driver.findElement(By.id("nilesh"));
        } catch (NoSuchElementException e) {
            System.out.println("Element not found !!");
        }


        // org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#pramod"}
        //  (Session info: chrome=139.0.7258.139)    }
    }

}
