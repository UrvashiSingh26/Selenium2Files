package com.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Login {
    WebDriver driver = null;

    @Test()
    public void suiteTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(" https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.findElement(By.xpath("//input[@id ='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id = 'txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id ='btnLogin']")).click();

          List<WebElement> list = driver.findElements(By.xpath("//div[@class='menu']/ul/li"));
        for (WebElement driver : list) {
            String abc = driver.getText();
            System.out.println(abc);
        }
        Actions actions=new Actions(driver);
        List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='menu']/ul/li[1]/ul"));
        for (WebElement driver : list1) {
            actions.moveToElement(list.get(0)).perform();
            String str = driver.getText();
            System.out.println(str + "\n \n The SubMenu are \n");
        }

        List<WebElement> list2 = driver.findElements(By.xpath("//div[@class='menu']/ul/li[2]/ul[1]"));
        for (WebElement driver : list2) {
            actions.moveToElement(list.get(1)).perform();
            String str1 = driver.getText();
            System.out.println(str1);
       }
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.id("welcome")).click();
        driver.findElement(By.xpath("//a[text() ='Logout']")).click();

    }
}