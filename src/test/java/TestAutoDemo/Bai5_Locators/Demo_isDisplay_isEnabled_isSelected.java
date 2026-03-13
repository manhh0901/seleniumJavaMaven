package TestAutoDemo.Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_isDisplay_isEnabled_isSelected {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");

// kiểm tra title login có hiển thị hya không và dùng hàm isDisplayed để hứng biến true/ false
        boolean checkHeaderLoginPage = driver.findElement(By.xpath(LocatorsCRM.titleLogin)).isDisplayed();
        System.out.println("Header is " + checkHeaderLoginPage);
// isEnable: ví dụ button bị disable thì ko click dc, khi nào nó enable thì mới hiển thị. là có bấm đc hay hong


        // isSelected đối với radio/checkbox
        boolean checkboxRememberSelected = driver.findElement(By.xpath(LocatorsCRM.checkboxRemember)).isSelected();
        System.out.println("Checkbox Remember before Selected " + checkboxRememberSelected);

        driver.findElement(By.xpath(LocatorsCRM.checkboxRemember)).click();
        boolean checkboxRememberSelectedAfter = driver.findElement(By.xpath(LocatorsCRM.checkboxRemember)).isSelected();
        System.out.println("Checkbox Remember after Selected " + checkboxRememberSelectedAfter);
//--------------------------------------------------------
        Thread.sleep(2000);
        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");
        driver.findElement(By.xpath("//span[text()='Run this project']")).click();
        Thread.sleep(3000);

        boolean buttonSubmitDisplay = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isDisplayed();
        System.out.println("Button login is " + buttonSubmitDisplay);
        boolean buttonSubmit = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled();
        System.out.println("Button login is " + buttonSubmit);




        // verify header page


        driver.quit();
    }
}
