package com.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class NavigateWindow {
    WebDriver driver = null;

    @Test()
    public void suiteTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php ");
        driver.findElement(By.xpath("//*[@title='Contact Us']")).click();

        WebElement drop= driver.findElement(By.xpath("//*[@id='id_contact']"));
        Select select=new Select(drop);
        select.selectByIndex(1);

        WebElement e=driver.findElement(By.name("from"));
        e.sendKeys("urvashi.singh@tothenew.com");
        System.out.println(e.getAttribute("value"));

        WebElement order= driver.findElement(By.name("id_order"));
        order.sendKeys("1234");
        System.out.println(order.getAttribute("value"));

        WebElement message=driver.findElement(By.name("message"));
        message.sendKeys("Message");
        System.out.println(message.getAttribute("value"));

        WebElement attach = driver.findElement(By.name("fileUpload"));
        attach.sendKeys( "C:\\Users\\Urvashi\\Downloads\\0.jpg");

        driver.findElement(By.name("submitMessage")).click();

        }

    }
