package com.nileshpatil.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;


public class TestSelenium09_Assertion_TestNG {

    @Description("Verify that the title is visible. ")
    @Test
    public void TestSelenium09_Assertion_TestNG(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        // TestNG Assertion
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");

        // AssertJ
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotEmpty().isEqualTo("https://www.google.com/");

        // Rest Assured? (ValidatableResponse)

        driver.quit();

    }
}
