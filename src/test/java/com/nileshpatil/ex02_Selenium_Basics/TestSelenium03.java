package com.nileshpatil.ex02_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {


    @Test
    public void test_selenium01(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
    }
}
