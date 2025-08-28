package com.nileshpatil.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17_Project_Locators_Selenium_ID_CLASSNAME_NAME {

    @Description("TC#1 - Verify that with invalid login, error message is displayed!")
    @Owner("Nilesh Patil")
    @Test
    public static void test_vwo_login_invalid_login(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com/#/login");

        // Maximize the Window
        //driver.manage().window().maximize();

        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // Step 2 - Find the Password  and enter the 1234.
        // Step 3 - Find the Submit  and click on the button.
        // Step 4 - Wait some time.
        // Step 5 - Verify the message error message.

        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.

        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // <input open Tag
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi"
        // data-gtm-form-interact-field-id="0"
        // > close Tag

        WebElement email_input_box =  driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.com");

        // Step 2 - Find the Password  and enter the 1234.

        //<input type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe"
        // fdprocessedid="6pko3h">

//        WebElement password_input_box = driver.findElement(By.id("login-password"));
        WebElement password_input_box = driver.findElement(By.name("password"));
        password_input_box.sendKeys("1234");


        // Step 3 - Find the Submit  and click on the button.

//        <button
//        type="submit"
//        id="js-login-btn"
//        class="btn btn--primary btn--inverted W(100%) H(48px) Fz(16px)"
//        onclick="login.login(event)"
//        data-qa="sibequkica" fdprocessedid="gsfyj">
//           data-qa="zuyezasugu">
//          </button>

        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();


        // Step 4 - Wait some time.

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


        // Step 5 - Verify the message error message.

        // class="notification-box-description"
        // data-qa="rixawilomi">
        // Your email, password, IP address or location did not match</div>


        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());


        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
