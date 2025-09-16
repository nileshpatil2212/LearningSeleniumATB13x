package com.nileshpatil.ex09_Actions_Class;

import com.nileshpatil.ex07_WaitHelper.WaitHelpers;
import com.nileshpatil.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class Lab34_ActionClass_MakeMyTRIP_example extends CommonToAll {

    @Test
    public void test_actions_p4() {

        WebDriver driver = new ChromeDriver();
        String URL = "https://www.makemytrip.com/";
        driver.get(URL);
        driver.manage().window().maximize();

//        // We need to for the modal and close it
//        WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));
//
        new WaitHelpers().waitForVisibility(driver, 5, "//span[@data-cy='closeModal']");
        // This will close the modal
        WebElement model = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        // close
        model.click();

        new WaitHelpers().waitJVM(5000);

        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]"));
        WebElement toCity = driver.findElement(By.xpath("//input[@data-cy=\"toCity\"]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(fromCity).click().sendKeys("IXC").build().perform();

        new WaitHelpers().waitJVM(3000);

        List<WebElement> list_auto_complete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

        try {
            for (WebElement e:list_auto_complete){
                if (e.getText().contains("Chandigarh")){
                    e.click();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
