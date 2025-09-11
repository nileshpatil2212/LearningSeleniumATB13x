package com.nileshpatil.ex06_Input_Select_Alerts_Radio_Checkbox;

import com.nileshpatil.utils.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestSelenium26_Input_Checkbox_Radio extends CommonToAll {

        @Description("Enter First name , Checked Female and checked Automation Tester and Click on Button")
        @Test
        public void test_awesomeqa_practice() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        WebElement firstname = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        WebElement firstname1 = driver.findElement(By.name("firstname"));
        firstname.sendKeys("Nilesh");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // Radio Button

        WebElement femaleRadio  = driver.findElement(By.xpath("//input[@id=\"sex-1\"]"));
//        WebElement femaleRadio  = driver.findElement(By.xpath("//input[@value=\"Female\"]"));
        femaleRadio .click();

        WebElement YearOfExp = driver.findElement(By.xpath("//input[@id='exp-1']"));
        YearOfExp.click();

        // Radio Button
        WebElement profession = driver.findElement(By.xpath("//input[@id=\"profession-1\"]"));
        profession.click();

        WebElement submit_button = driver.findElement(By.xpath("//button[@id=\"submit\"]"));
        submit_button.click();


        closeBrowser(driver);

    }

}
