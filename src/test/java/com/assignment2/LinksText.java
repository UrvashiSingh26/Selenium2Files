package com.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class LinksText {

        @Test
        public void suite() {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/");
            List<WebElement> items = driver.findElements(By.tagName("a"));
            for (int i = 0; i < items.size(); i++) {
                System.out.println(items.get(i).getText());
            }

        }
    }

