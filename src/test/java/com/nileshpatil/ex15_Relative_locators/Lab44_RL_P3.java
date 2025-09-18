package com.nileshpatil.ex15_Relative_locators;

import com.nileshpatil.ex07_WaitHelper.WaitHelpers;
import com.nileshpatil.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab44_RL_P3 extends CommonToAll {

        @Test
        public void test_relative_locator_again() {

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
            driver.manage().window().maximize();

            WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
            searchbox.sendKeys("india"  +Keys.ENTER);

            new WaitHelpers().waitJVM(5000);

            List<WebElement> locations = driver.findElements(By.xpath("//div[contains(@class,\"location-name\")]/p"));
            for (WebElement location : locations){

                String rank = driver.findElement(with(By.tagName("p")).toLeftOf(location)).getText();
                String aqi = driver.findElement(with(By.tagName("p")).toRightOf(location)).getText();
                String status = driver.findElement(with(By.className("aqi-status")).toRightOf(location)).getText();


                System.out.println(" | +" + rank + " | " + location.getText() + " | " + aqi + "|" + " | " + status + "|");

            }

            closeBrowser(driver);
        }




}
