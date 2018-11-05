package com.assignment2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PromptPopUp {
    WebDriver driver = null;

    @Test()
    public void suiteTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
        driver.findElement(By.xpath("//button[@onclick ='promptConfirm()']")).click();

        Alert al=  driver.switchTo().alert();
        al.sendKeys("Yes");
        Thread.sleep(2000);
        al.accept();
        driver.switchTo().defaultContent();
    }
}
