package com.nileshpatil.Task;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task_28th_Aug_Start_Free_Trial {

    @Description("#TC1 - Click on Start free trial link and enter wrong email and verify the message")
    @Test
    public static void test_practice(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        // Step 1 - Click on start a free trial link
        // Step 2 - Find Business Email and Add abc
        // Step 3 - Find I Agree to VWO Policy Checkox and Checked
        // Step 4 - Click on Create a Free Trial Account
        // Step 5 - Wait some time.
        // Step 6 - Verify the message error message.

        // Step 1 - Click on start a free trial link

//        <a
//        href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
//        class="text-link Td(n)"
//        data-qa="bericafeqo">
//        Start a free trial</a>

//        WebElement trial_link = driver.findElement(By.className("text-link Td(n)"));
        driver.findElement(By.linkText("Start a free trial")).click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        // Step 2 - Find Business Email and Add

//        <input
//        class="W(100%) Py(14px)
//        input-text"
//        placeholder="name@yourcompany.com"
//        type="email"
//        id="page-v1-step1-email"
//        name="email"
//        data-qa="page-su-step1-v1-email"
//        required="">

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        // Step 3 - Find I Agree to VWO Policy Checkox and Checked

//        <input
//        class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)"
//        type="checkbox"
//        name="gdpr_consent_checkbox"
//        id="page-free-trial-step1-cu-gdpr-consent-checkbox"
//        value="true" data-qa="page-free-trial-step1-gdpr-consent-checkbox">

//        driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox")).click();
        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();

        // Step 4 - Click on Create a Free Trial Account
        //<button
        // type="submit"
        // disabled=""
        // class="button button--disabled-primary W(100%) btn-modal-form-submit"
        // data-qa="page-su-submit">
        // Create a Free Trial Account</button>

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        WebElement error_msg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_msg.getText(),"The email address you entered is incorrect.");

        driver.quit();

    }

}
