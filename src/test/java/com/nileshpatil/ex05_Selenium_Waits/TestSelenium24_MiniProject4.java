package com.nileshpatil.ex05_Selenium_Waits;

import com.nileshpatil.ex07_WaitHelper.WaitHelpers;
import com.nileshpatil.utils.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium24_MiniProject4 extends CommonToAll {

    @Description("Verify , makemytrip open with modal")
    @Test
    public void testCloseModal(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com");
        System.out.println(driver.getTitle());

        new WaitHelpers().waitForVisibility(driver,10,"//span[@data-cy=\"closeModal\"]");

        WebElement closeModal = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        closeModal.click();


        closeBrowser(driver);



    }

}
