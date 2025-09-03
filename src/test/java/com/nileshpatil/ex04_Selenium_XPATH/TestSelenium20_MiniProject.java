package com.nileshpatil.ex04_Selenium_XPATH;

import com.nileshpatil.utils.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium20_MiniProject extends CommonToAll {

    @Owner("Nilesh")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify login is working")
    @Test
    public void test_OHRM_login() {


        WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder ='Password']"));
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]"));

        //input[@placeholder='Password']

        input_username.sendKeys("admin");
        input_password.sendKeys("Hacker@4321");
        button.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement h6 = driver.findElement(By.xpath("/h6[text()=\"PIM\"]"));
        Assert.assertEquals(h6.getText(),"PIM");

        closeBrowser(driver);

    }



    }
