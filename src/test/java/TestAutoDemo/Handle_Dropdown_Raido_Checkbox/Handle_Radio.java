package TestAutoDemo.Handle_Dropdown_Raido_Checkbox;

import TestAutoDemo.Bai5_Locators.LocatorsCRM;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Handle_Radio {
    public void HandleRadio2 () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin");
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPwd)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.inputPwd)).submit();

        Thread.sleep(1000);

        driver.findElement(By.xpath(LocatorsCRM.menuSales)).click();
        driver.findElement(By.xpath(LocatorsCRM.proposalSubMenu)).click();
        driver.findElement(By.xpath(LocatorsCRM.addNewProposal)).click();
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);
        List <WebElement> listRadio = driver.findElements(By.xpath("//div[@class = 'mtop10']//descendant::div"));

        System.out.println("So phan tu trong list: " + listRadio.size());

        // kiem tra xem list radio có bao nhieu cai chua check

        driver.quit();

    }

    public void HandleRaido1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin");
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPwd)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.inputPwd)).submit();

        Thread.sleep(1000);

        driver.findElement(By.xpath(LocatorsCRM.menuSales)).click();
        driver.findElement(By.xpath(LocatorsCRM.proposalSubMenu)).click();
        driver.findElement(By.xpath(LocatorsCRM.addNewProposal)).click();
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        Thread.sleep(1000);
        // check radio
        boolean qtyRadioisSelected =  driver.findElement(By.xpath("//input[@id ='1']")).isSelected();
        System.out.println("Qty Radio is selected = " + qtyRadioisSelected);

        Thread.sleep(1000);
        boolean hoursisSelected =  driver.findElement(By.xpath("//input[@id ='2']")).isSelected();
        System.out.println("Hours Radio is selected = " + hoursisSelected);

        Thread.sleep(1000);
        System.out.println("=====Kiem tra sau click hours");
        driver.findElement(By.xpath("//input[@id ='2']")).click();
        Thread.sleep(1000);
        System.out.println("Hours Radio is selected = " + hoursisSelected);
        System.out.println("Qty Radio is selected = " + qtyRadioisSelected);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        Handle_Radio a = new Handle_Radio();
        a.HandleRadio2();

    }
}
