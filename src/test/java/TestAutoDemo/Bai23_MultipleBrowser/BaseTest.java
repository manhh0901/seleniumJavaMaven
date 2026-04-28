package TestAutoDemo.Bai23_MultipleBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    @Parameters({"browser"})
    public void createDriver(@Optional("chrome") String browser){
            innitDriver(browser);
    }

    public void innitDriver(String browser) {
        switch (browser) {
            case "chrome":
                driver = initWithChrome();
                break;
            case "firefox":
                driver = initWithFireFox();
                break;
            case "edge":
                driver = initWithEdge();
                break;
            default:
                System.out.println("Browser not supported");
        }
    }




    public WebDriver initWithChrome(){
        System.out.println("Launching Chrome browser...");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Create driver successfully");
        return driver;

    }

    public WebDriver initWithFireFox(){
        System.out.println("Launching Firefox browser...");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        System.out.println("Create driver successfully");
        return driver;

    }

    public WebDriver initWithEdge(){
        System.out.println("Launching Edge browser...");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        System.out.println("Create driver successfully");
        return driver;
    }
}
