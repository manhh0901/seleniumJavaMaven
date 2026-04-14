package TestAutoDemo.Bai12_ActionsClass_RobotClass;
import java.awt.*;
import java.awt.event.KeyEvent;

import TestAutoDemo.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RobotClass extends BaseTest {
    //Robot class là class thuộc JAVA.
    // Gần giống với Actions class
    //https://docs.oracle.com/javase/8/docs/api/java/awt/Robot.html
    @Test
    public void inputText() throws InterruptedException, AWTException {

        driver.get("https://anhtester.com/");

        Thread.sleep(1000);
        WebElement inputCourseElement = driver.findElement(By.name("key"));

        inputCourseElement.click();


        Robot robot = new Robot();
        // Nhập từ khóa selenium
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_U);
        robot.keyPress(KeyEvent.VK_M);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        // Khi thực hiện press phím thì nên thả phím ra để tránh bị lỗi. Do Java đang điều khiển bàn phím ảo , ếu press mà hogn release sẽ
        // giống như mình thao tác nhấn phím đó liên tục
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        Thread.sleep(2000);
    }
}
