package TestAutoDemo.Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsCRM {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang CRM
        driver.get("https://crm.anhtester.com/admin/authentication");

        // xpath tuyet doi của trang login
        driver.findElement(By.xpath("/html/body/div/h1"));// title Login
        driver.findElement(By.xpath ("/html/body/div/div[2]/form/div[1]/label"));// label Email Address
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input"));// input Email Address
        driver.findElement(By.xpath ("/html/body/div/div[2]/form/div[2]/label"));// label Password
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input"));// input Password
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input"));// input Password
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/label"));// remember me
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/input")); //check box remember
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[4]/button"));// Button login
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[5]/a")); //Forgot password
        // xpath menu customer
        driver.findElement(By.xpath("/html/body/aside/ul/li[3]"));

        // xpath tuong doi 1-5
        driver.findElement(By.xpath("//h1[normalize-space()='Login']"));// title Login
        driver.findElement(By.xpath("//label[@for='email']"));// label
        driver.findElement(By.xpath("//input[@id='email']")); // input email
        driver.findElement(By.xpath("//label[@for='password']"));// label password
        driver.findElement(By.xpath("//input[@id='password']")); // input password
        driver.findElement(By.xpath("//input[@id='remember']"));// checkbox remember
        driver.findElement(By.xpath("//label[@for='remember']"));// Label remember
        driver.findElement(By.xpath("//button[contains(@class,'btn-primary')]"));//button login
        driver.findElement(By.xpath("//a[@href='https://crm.anhtester.com/admin/authentication/forgot_password']")); // forgot password

        //xpath 1-5 menu Customers
        driver.findElement(By.xpath("//li[@class='menu-item-customers']"));// Menu customer

        // Bắt xpath trang Customers Summary (các button, input search, header, label)
        driver.findElement(By.xpath("//input[@id='search_input']")); // search input
        driver.findElement(By.xpath("//div[@id='top_search_button']"));// button search
        driver.findElement(By.xpath("//span[normalize-space()='Customers Summary']")); // title customer summary

        driver.findElement(By.xpath("//a[@href = 'https://crm.anhtester.com/admin/clients/client' and contains(@class, 'btn-primary')]"));
        driver.findElement(By.xpath("//a[@href = 'https://crm.anhtester.com/admin/clients/import' and contains(@class, 'btn-primary')]"));
        driver.findElement(By.xpath("//a[@href = 'https://crm.anhtester.com/admin/clients/all_contacts' and contains(@class, 'btn-default')]"));



        driver.findElement(By.xpath("//span[normalize-space()='Total Customers']")); //text total customer
        driver.findElement(By.xpath("//span[normalize-space()='Active Customers']"));
        driver.findElement(By.xpath("//span[normalize-space()='Inactive Customers']"));
        driver.findElement(By.xpath("//span[normalize-space()='Active Contacts']"));
        driver.findElement(By.xpath("//span[normalize-space()='Inactive Contacts']"));
        driver.findElement(By.xpath("//span[@data-title = 'Contacts Logged In Today']"));


















        driver.quit();







    }
}
