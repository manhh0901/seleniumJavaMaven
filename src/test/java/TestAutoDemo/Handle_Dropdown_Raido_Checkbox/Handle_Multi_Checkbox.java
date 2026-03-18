package TestAutoDemo.Handle_Dropdown_Raido_Checkbox;

import TestAutoDemo.Bai5_Locators.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Handle_Multi_Checkbox {

    public static void HandleMulti () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin");
        Thread.sleep(2000);
        driver.manage().addCookie(new Cookie("sp_session", "8cc51e9b348d642baedc339d8b92c7ec891baacd"));
        Thread.sleep(1000);
        driver.get("https://crm.anhtester.com/admin/");
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.dashboardOptions)).click();
        List <WebElement> listDashboardCheckBox = driver.findElements(By.xpath("//div[@id ='dashboard-options']//input[@type = 'checkbox']"));
        Thread.sleep(1000);
        System.out.println("So luong phan tu la: "+listDashboardCheckBox.size());
        Thread.sleep(1000);
        for (int i = 0; i < listDashboardCheckBox.size(); i++){
            System.out.println("Check box " +(i+1) + " " + listDashboardCheckBox.get(i).isSelected());
        }
        // bo tick chon 5 phan tu dau tien
        Thread.sleep(1000);
        for (int j =0 ; j < listDashboardCheckBox.size(); j++){
            listDashboardCheckBox.get(j).click();
        }
        System.out.println("=======================================");
        // kiem tra so luong check box sau khi tinh lai
        Thread.sleep(1000);
        for (int i = 0; i < listDashboardCheckBox.size(); i++){
            System.out.println("Check box " +(i+1) + " " + listDashboardCheckBox.get(i).isSelected());
        }
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        HandleMulti();


    }
}
