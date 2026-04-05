package TestAutoDemo.Assert;

import TestAutoDemo.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_Assert extends BaseTest {
    @Test(priority = 1)
    public void testHardAssert() {
        driver.get("https://anhtester.com");
        String expectedTitle = "Anh Tester";
        String originalTitle = driver.getTitle();
        System.out.println("*** Checking For The Title ***");
        Assert.assertEquals(originalTitle, expectedTitle);
    }
}
