package com.nileshpatil.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium07_Selenium_Commands {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

        System.out.println("Title : " + driver.getTitle());
        System.out.println("Current URL : " + driver.getCurrentUrl());
        System.out.println("Page Source : " + driver.getPageSource());

        // When you are done with the browser,
        // you want to close all the tabs and browser.
        driver.quit();

    }
}
