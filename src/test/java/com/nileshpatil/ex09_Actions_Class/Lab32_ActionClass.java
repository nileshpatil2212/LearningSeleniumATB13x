package com.nileshpatil.ex09_Actions_Class;

import com.nileshpatil.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class Lab32_ActionClass extends CommonToAll {

    @Test
    public void test_actions(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        WebElement from_input = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
        Actions actions = new Actions(driver);
        actions.moveToElement(from_input).click().sendKeys("BLR").moveToElement(from_input).build().perform();

        WebElement to_input = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-destination\"]/div/div/input"));
        actions.moveToElement(to_input).click().sendKeys("DEL").build().perform();

        closeBrowser(driver);

    }

}
