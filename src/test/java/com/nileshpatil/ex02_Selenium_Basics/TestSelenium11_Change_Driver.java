package com.nileshpatil.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium11_Change_Driver {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver = new FirefoxDriver();


    }
}
