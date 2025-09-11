package com.nileshpatil.ex06_Input_Select_Alerts_Radio_Checkbox;

import com.nileshpatil.utils.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium28_Alerts extends CommonToAll {

    @Test
    public void test_alerts(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

//        WebElement element = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
//        element.click();

//        WebElement element_confirm = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
//        element_confirm.click();

        WebElement element_prompt = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        element_prompt.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String name = "NILESH";
        alert.sendKeys(name);
        alert.accept();
//        alert.dismiss();


        String result = driver.findElement(By.id("result")).getText();
//        Assert.assertEquals(result,"You successfully clicked an alert");
//        Assert.assertEquals(result,"You clicked: Ok");
//        Assert.assertEquals(result,"You clicked: Cancel");
        Assert.assertEquals(result,"You entered: NILESH");


        closeBrowser(driver);
    }


}
