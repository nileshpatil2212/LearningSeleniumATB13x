package com.nileshpatil.ex14_JS_ShadowDOM;

import com.nileshpatil.utils.CommonToAll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static com.nileshpatil.ex07_WaitHelper.WaitHelpers.waitJVM;

public class Lab41_JS_Code_ShadowDOM extends CommonToAll {

    @Test
    public void test_js() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        waitJVM(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector('div#app2').shadowRoot.querySelector('#pizza');");
        inputboxPizza.sendKeys("farmhouse");

        closeBrowser(driver);
    }
}
