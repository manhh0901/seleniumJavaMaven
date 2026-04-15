package org.example.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebUI {

    public static void highlight(WebDriver driver, WebElement element) {
     String script = "arguments[0].style.border='3px solid red'";
        ((JavascriptExecutor) driver).executeScript(script, element);
    }
    public static void highlight(WebDriver driver, WebElement element, String color) {
        String script = "arguments[0].style.border='3px solid " + color + "'";
        ((JavascriptExecutor) driver).executeScript(script, element);
    }

    public static void waitForElement(WebDriver driver, String value, String attribute, int timeout) {
        // Implement wait logic here (e.g., WebDriverWait)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(attribute)));
        driver.findElement(By.id(attribute)).sendKeys(value);

    }

}