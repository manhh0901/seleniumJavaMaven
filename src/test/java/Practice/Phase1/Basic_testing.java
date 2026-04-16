package Practice.Phase1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Basic_testing extends BaseTestPrac {

    @Test
    public void addRemoveElement() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Add Element']")));
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        Thread.sleep(2000);

        WebElement btndelete = driver.findElement(By.xpath("//button[text()='Delete']"));
        wait.until(ExpectedConditions.visibilityOf(btndelete));
        SoftAsserPrac.assertEquals(btndelete.getText(), "Delete", "Text không đúng");
        Thread.sleep(2000);
        btndelete.click();
        Thread.sleep(2000);

        wait.until(ExpectedConditions.invisibilityOf(btndelete));
        List<WebElement> listDelete = driver.findElements(By.xpath("//button[text()='Delete']"));

        if(listDelete.size() == 0){
            SoftAsserPrac.assertEquals(listDelete.size(), 0, "Element vẫn còn tồn tại");
        }


    }

    @Test
    public void handleAlertAuthen() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
        driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
        driver.findElement(By.xpath("//a[@id='alert']")).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert Alertpopup = driver.switchTo().alert();
        Alertpopup.accept();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@id='empty-alert']")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert2 = driver.switchTo().alert();
        Actions action = new Actions(driver);
        Thread.sleep(2000);
        alert2.accept();
        Thread.sleep(2000);

    }

}
