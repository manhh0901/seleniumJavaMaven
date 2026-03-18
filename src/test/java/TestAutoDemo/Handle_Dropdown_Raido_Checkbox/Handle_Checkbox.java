package TestAutoDemo.Handle_Dropdown_Raido_Checkbox;

import TestAutoDemo.Bai5_Locators.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Handle_Checkbox {
    public static void main(String[] args) throws InterruptedException {
        // checkbox thì có input type checkbox
        // có thể tick dô label nếu nó đi kèm voiws checkbox

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin");
        Thread.sleep(2000);
        driver.manage().addCookie(new Cookie("sp_session", "8cc51e9b348d642baedc339d8b92c7ec891baacd"));
        Thread.sleep(1000);
        driver.get("https://crm.anhtester.com/admin/");
        driver.navigate().refresh();
        //click chọn check box
        driver.findElement(By.xpath(LocatorsCRM.menuCustomer)).click();
        Thread.sleep(1000);
        // click 1 check box
        driver.findElement(By.xpath(LocatorsCRM.checkBoxAll)).click();
        Thread.sleep(1000);
        boolean checkboxAllisSelected = driver.findElement(By.xpath(LocatorsCRM.checkBoxAll)).isSelected();
        System.out.println("Checkbox is selected = " + checkboxAllisSelected);

        driver.findElement(By.xpath(LocatorsCRM.checkBoxAll)).click();
        boolean checkboxAllisSelected2 = driver.findElement(By.xpath(LocatorsCRM.checkBoxAll)).isSelected();
        System.out.println("Checkbox is selected = " + checkboxAllisSelected2);
        driver.quit();
    }
}
