package TestAutoDemo.Bai13_Alert_Popup_Iframe;

import TestAutoDemo.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Set;

public class testPopup extends BaseTest {
    @Test
    public void OpenNewWindow () throws InterruptedException {
        driver.get("https://anhtester.com/selenium-popup-v1");
        String window = driver.getWindowHandle();
        System.out.println(window);
        Thread.sleep(1000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(1000);
        driver.get("https://google.com");
        Thread.sleep(1000);
    }
    @Test
    public void OpenNewTab () throws InterruptedException {
        driver.get("http://demoqa.com/browser-windows");
        String window = driver.getWindowHandle();
        System.out.println("ID main browser: " + window);
        driver.findElement(By.xpath("//button[@id='tabButton']")).click();
        Thread.sleep(1000);


        // chỉ áp dụng cho 2 tab.
        Set <String> windows = driver.getWindowHandles();
        for (String id : windows){
            System.out.println("ID all browser: " + id);
            if(!id.equals(window)){
                driver.switchTo().window(id);
                Thread.sleep(1000);
                System.out.println("Title new tab: " + driver.getTitle());
                System.out.println("URL new tab: " + driver.getCurrentUrl());
                driver.close();
            }
        }
        driver.switchTo().window(window);
        System.out.println("Đã chuyển về main browser: " + driver.getTitle());
        Thread.sleep(1000);

    }

    @Test
    public void OpenNewTabPosition () throws InterruptedException {
        driver.get("http://demoqa.com/browser-windows");
        String window = driver.getWindowHandle();
        System.out.println("ID main browser: " + window);
        driver.findElement(By.xpath("//button[@id='tabButton']")).click();
        Thread.sleep(1000);

        Set <String> windows = driver.getWindowHandles();

        String newWindow = (String) windows.toArray()[0];
        String newWindow2 = (String) windows.toArray()[1];

        driver.switchTo().window(newWindow);
        Thread.sleep(3000);

        System.out.println("Title new tab: " + driver.getTitle());
        System.out.println("URL new tab: " + driver.getCurrentUrl());
        Thread.sleep(3000);

        driver.switchTo().window(newWindow2);
        System.out.println("Title new tab: " + driver.getTitle());
        System.out.println("URL new tab: " + driver.getCurrentUrl());
        Thread.sleep(3000);

        driver.switchTo().window(window);
        System.out.println("Đã chuyển về main browser: " + driver.getTitle());
        Thread.sleep(1000);

    }
}
