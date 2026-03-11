package TestAutoDemo.Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.PanelUI;
import java.time.Duration;

public class LocatorsCRM {
    // mở trag url
    public static String url = "https://crm.anhtester.com/admin/authentication";

    // trang login
    public static String titleLogin = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//label[@for='email']";
    public static String inputPwd = "//input[@id='password']";
    public static String checkboxRemember = "//input[@id='remember']";
    public static String buttonLogin = "//button[contains(@class,'btn-primary')]" ;
    public static String forgotPwd = "//a[@href='https://crm.anhtester.com/admin/authentication/forgot_password']";
    public  static String messageError = "//div[contains(@class,'alert-danger')]";
    public static String alertRequireEmail = "//div[normalize-space()='The Email Address field is required']";
    public static String alertRequirePwd = "//div[normalize-space()='The Password field is required']";

    // trang dashboard

    public static String menuDashboard = "//span[@class='menu-text' and normalize-space()='Dashboard']";
    public static String menuCustomer = "//span[@class='menu-text' and normalize-space()='Customer']";
    public static String menuContracts= "//span[@class='menu-text' and normalize-space()='Contracts']";
    public static String menuProjects = "//span[@class='menu-text' and normalize-space()='Projects']";
    public static String menuSales = "//span[@class='menu-text' and normalize-space()='Sales']";

    //
    public static String addNewCus = "//a[contains(@href, 'client') and contains(@class, 'btn-primary')]";
    public static String importCustomer = "//a[contains(@href, 'import') and contains(@class, 'btn-primary')]";
    public static String allContacts= "//a[contains(@href, 'all_contacts') and contains(@class, 'btn-default')]";
    public static String searchCustomer;

    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        //xpath 1-5 menu Customers
        driver.findElement(By.xpath("//li[@class='menu-item-customers']"));// Menu customer

        // Bắt xpath trang Customers Summary (các button, input search, header, label)
        driver.findElement(By.xpath("//input[@id='search_input']")); // search input
        driver.findElement(By.xpath("//div[@id='top_search_button']"));// button search
        driver.findElement(By.xpath("//span[normalize-space()='Customers Summary']")); // title customer summary




        driver.findElement(By.xpath("//span[normalize-space()='Total Customers']")); //text total customer
        driver.findElement(By.xpath("//span[normalize-space()='Active Customers']"));
        driver.findElement(By.xpath("//span[normalize-space()='Inactive Customers']"));
        driver.findElement(By.xpath("//span[normalize-space()='Active Contacts']"));
        driver.findElement(By.xpath("//span[normalize-space()='Inactive Contacts']"));
        driver.findElement(By.xpath("//span[@data-title = 'Contacts Logged In Today']"));

        driver.findElement(By.xpath("//select[@name = 'clients_length']"));
        driver.findElement(By.xpath("//button[contains(@class, 'buttons-collection')]"));
        driver.findElement(By.xpath("//span[text() = 'Bulk Actions']"));
        driver.findElement(By.xpath("//button[@data-original-title = 'Reload']"));
        driver.findElement(By.xpath("//span[@class = 'input-group-addon']"));
        driver.findElement(By.xpath("//input[@type= 'search' and @class = 'form-control input-sm']"));

        //list table
        driver.findElement(By.xpath("//input[@id = 'mass_select_all']"));//check box all
        driver.findElement(By.xpath("//th[@id = 'th-number']"));//sort
        driver.findElement(By.xpath("//th[@id = 'th-company']"));// header company
        driver.findElement(By.xpath("//th[@id = 'th-primary-contact']"));
        driver.findElement(By.xpath("//th[@id = 'th-primary-contact-email']"));
        driver.findElement(By.xpath("//th[@id = 'th-phone']"));
        driver.findElement(By.xpath("//th[@id = 'th-active']"));
        driver.findElement(By.xpath("//th[@id = 'th-groups']"));
        driver.findElement(By.xpath("//th[@id = 'th-date-created']"));

        // add new customer
        driver.findElement(By.xpath("//label[@for = 'company']"));
        driver.findElement(By.xpath("//input[@id = 'company']"));
        driver.findElement(By.xpath("//label[@for = 'vat']"));
        driver.findElement(By.xpath("//input[@id = 'vat']"));
        driver.findElement(By.xpath("//label[@for = 'phonenumber']"));
        driver.findElement(By.xpath("//input[@id = 'phonenumber']"));
        driver.findElement(By.xpath("//label[@for = 'website']"));
        driver.findElement(By.xpath("//input[@id = 'website']"));
        driver.findElement(By.xpath("//label[text()= 'Groups']"));
        driver.findElement(By.xpath("//button[@type= 'button' and @data-id='groups_in[]']"));
        driver.findElement(By.xpath("//a[@class ='btn btn-default' and @data-toggle ='modal' ]"));
        driver.findElement(By.xpath("//label[text() = 'Currency']"));
        driver.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-default bs-placeholder' and @data-id = 'default_currency']"));
        driver.findElement(By.xpath("//label[text() = 'Currency']"));
        driver.findElement(By.xpath("//label[normalize-space()='Default Language']"));
        driver.findElement(By.xpath("//button[@data-id='default_language']"));
        driver.findElement(By.xpath("//label[text()='Address']"));
        driver.findElement(By.xpath("//textarea[@id='address']"));
        driver.findElement(By.xpath("//label[text()='City' and @for = 'city']"));
        driver.findElement(By.xpath("//input[@id='city']"));
        driver.findElement(By.xpath("//label[text()='State' and @for = 'state']"));
        driver.findElement(By.xpath("//input[@id='state']"));
        driver.findElement(By.xpath("//label[text()='Zip Code' and @for ='zip']"));
        driver.findElement(By.xpath("//input[@id='zip']"));
        driver.findElement(By.xpath("//label[@for='country']"));
        driver.findElement(By.xpath("//button[@data-id='country']"));
        driver.findElement(By.xpath("//button[normalize-space()='Save and create contact']"));;

        driver.findElement(By.xpath("//button[normalize-space()='Save' and contains(@class, 'only-save')]"));



































        driver.quit();







    }
}
