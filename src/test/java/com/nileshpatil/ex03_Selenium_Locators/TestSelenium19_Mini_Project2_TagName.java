package com.nileshpatil.ex03_Selenium_Locators;

import com.nileshpatil.utils.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.*;

public class TestSelenium19_Mini_Project2_TagName extends CommonToAll {

    @Owner("Pramod")
    @Description("Verify that the error message comes with invalid email on signup page.")
    @Test
    public void vwo_free_trail_error_verify(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://app.vwo.com/#/login");

        WebElement a_tag_partial_match = findElementByPartialText(driver,"trial");
        a_tag_partial_match.click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));


        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement checbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        checbox_policy.click();

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        WebElement error_msg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_msg.getText(),"The email address you entered is incorrect.");

        closeBrowser(driver);













    }
}
