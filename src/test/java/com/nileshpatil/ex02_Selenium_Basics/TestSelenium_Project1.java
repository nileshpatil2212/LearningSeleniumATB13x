package com.nileshpatil.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_Project1 {

    @Description("TC#1 - Verify that a particular text exists on the Katalon website ")
    @Test
    public void test_verify_text_katalon(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");


        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getPageSource());
        if (driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Test Case Passed");
            Assert.assertTrue(true);
        }
        else {
            System.out.println("Test Case Failed");
            Assert.fail();
        }

        driver.quit();

    }
}
