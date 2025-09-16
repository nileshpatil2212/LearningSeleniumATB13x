package com.nileshpatil.ex10_File_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab37_FileUpload {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));
        String user_dir =System.getProperty("user.dir");

        // If From Selenium upload and then want to upload any file then use below given code

//      String path = user_dir + "\\src\\test\\java\\com\\nileshpatil\\ex10_File_Upload\\testdata.txt";

        // If From local storage want to upload any file then use below given code
        String path = "C:\\Users\\Nilesh\\Downloads\\Smoker_POS_jira_import_sample.csv";

        uploadFileInput.sendKeys(path);
        driver.findElement(By.name("submit")).click();

    }
}
