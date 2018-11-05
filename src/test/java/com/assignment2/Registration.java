package com.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Registration {
    WebDriver driver = null;

    @Test()
    public void suiteTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/mercuryregister.php");
        driver.findElement(By.name("firstName")).sendKeys("Urvashi");
        driver.findElement(By.name("lastName")).sendKeys("Singh");
        driver.findElement(By.name("phone")).sendKeys("7053625482");
        driver.findElement(By.name("userName")).sendKeys("urvashi.singh@tothenew.com");
        driver.findElement(By.name("address1")).sendKeys("Amrapali Sapphire, U Tower");
        driver.findElement(By.name("city")).sendKeys("Noida");
        driver.findElement(By.name("state")).sendKeys("Uttar Pradesh");
        driver.findElement(By.name("postalCode")).sendKeys("201301");
        WebElement drop= driver.findElement(By.name("country"));
//        drop.findElements(By.tagName("option"));
        Select select=new Select(drop);
        select.selectByVisibleText("INDIA");
        driver.findElement(By.name("email")).sendKeys("urvashi.songh@tothenow.com");
        driver.findElement(By.name("password")).sendKeys("urvashi@");
        driver.findElement(By.name("confirmPassword")).sendKeys("urvashi@");
        driver.findElement(By.name("register")).click();
    }
}
