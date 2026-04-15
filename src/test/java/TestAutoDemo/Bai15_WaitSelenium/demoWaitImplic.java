package TestAutoDemo.Bai15_WaitSelenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

import static org.example.keywords.WebUI.waitForElement;

public class demoWaitImplic {
        WebDriver driver;

        @Test
        public void demoImplicitWait() throws InterruptedException {

            driver = new ChromeDriver();
            driver.manage().window().maximize();

            //Set timeout for

            // cho doi toi da 10s. vi dụ chwof tới 2s mà element xuất hiện thì sẽ hành động
            //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

            WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.get("https://hrm.anhtester.com/");

            // chờ đợi xem element có xuất hiện hay không.
           // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iusername")));
            //driver.findElement(By.id("iusername")).sendKeys("admin_example");

            // visible là element đó có hiển thị trên UI
            // presence là element đó có tồn tại trong DOM nhưng chưa chắc đã hiển thị trên UI

            waitForElement(driver, "admin_example", "iusername", 5);

            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iusername")));
            driver.findElement(By.id("ipassword")).sendKeys("123456");
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            //Click menu dự ánn đợi 10s
            wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("iusername")));
            Actions actions = new Actions(driver);
            actions.keyDown(Keys.ENTER).perform();
            actions.keyUp(Keys.ENTER).perform();

            wait2.until(ExpectedConditions.alertIsPresent());
            wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Projects')]")));
            driver.findElement(By.xpath("//span[contains(text(),'Projects')]")).click();

            driver.quit();
        }
    }


