package TestAutoDemo.Bai23_MultipleBrowser;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class TestDemoMultiple extends BaseTest {
    LoginPage lg;

    @Test
    public void getURL(){
       lg = new LoginPage(driver);
       driver.get("https://anhtester.com");
       System.out.println("URL: " + driver.getCurrentUrl());
    }

}
