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
    public static String inputEmail = "//input[@id='email']";
    public static String inputPwd = "//input[@id='password']";
    public static String checkboxRemember = "//input[@id='remember']";
    public static String buttonLogin = "//button[contains(@class,'btn-primary')]" ;
    public static String forgotPwd = "//a[@href='https://crm.anhtester.com/admin/authentication/forgot_password']";
    public  static String messageError = "//div[contains(@class,'alert-danger')]";
    public static String alertRequireEmail = "//div[normalize-space()='The Email Address field is required']";
    public static String alertRequirePwd = "//div[normalize-space()='The Password field is required']";

    // trang dashboard
    public static String menuDashboard = "//span[@class='menu-text' and normalize-space()='Dashboard']";
    public static String menuCustomer = "//span[@class='menu-text' and normalize-space()='Customers']";
    public static String menuContracts= "//span[@class='menu-text' and normalize-space()='Contracts']";
    public static String menuProjects = "//span[@class='menu-text' and normalize-space()='Projects']";
    public static String menuSales = "//span[@class='menu-text' and normalize-space()='Sales']";
    public static String dashboardOptions = "//div[normalize-space() ='Dashboard Options']";

    //Menu Sale - Proposals
    public static String proposalSubMenu = "//span[normalize-space() ='Proposals']";
    public static String addNewProposal = "//a[normalize-space() ='New Proposal']";


    //customer summary
    public static String addNewCus = "//a[contains(@href, 'client') and contains(@class, 'btn-primary')]";
    public static String importCustomer = "//a[contains(@href, 'import') and contains(@class, 'btn-primary')]";
    public static String allContacts= "//a[contains(@href, 'all_contacts') and contains(@class, 'btn-default')]";

    public static String titleCustomerSummary = "//span[normalize-space()='Customers Summary']";
    public static String totalCustomer ="//span[normalize-space()='Total Customers']";
    public static String activeCustomer = "//span[normalize-space()='Active Customers']";
    public static String inactiveCustomer = "//span[normalize-space()='Inactive Customers']";
    public static String activeContacts ="//span[normalize-space()='Active Contacts']";
    public static String inactiveContacts = "//span[normalize-space()='Inactive Contacts']";
    public static String contactsLoginToday = "//span[@data-title = 'Contacts Logged In Today']";
    public static String searchCustomer = "//input[@type= 'search' and contains(@class, 'form-control input-sm')]";

    // session export, bulk actions
    public static String numberItemsOnaPage = "//select[@name = 'clients_length']";
    public static String exportButton ="//span[text()= 'Export']";
    public static String bulkActions = "//span[text() = 'Bulk Actions']";
    public static String reloadButton = "//button[@data-original-title= 'Reload']";

    // header column
    public static String checkBoxAll = "//input[@id = 'mass_select_all']";
    public static String number = "//th[@id = 'th-number']";
    public static String headerCompany = "//th[@id = 'th-company']";
    public static String headerPrimaryContact = "//th[@id = 'th-primary-contact']";
    public static String headerPrimaryEmail = "//th[@id = 'th-primary-contact-email']";
    public static String headerPhone = "//th[@id = 'th-phone']";
    public static String headerActive = "//th[@id = 'th-active']";
    public static String headerGroups = "//th[@id = 'th-groups']";
    public static String headerDateCreated = "//th[@id = 'th-date-created']";

    // Add new customer - customer page
    public static String inputCompany= "//input[@id = 'company']";
    public static String inputVAT= "//input[@id = 'vat']";
    public static String inputPhoneNumber= "//input[@id = 'phonenumber']";
    public static String inputWebsite= "//input[@id = 'website']";
    public static String selectGroups ="//button[@data-id='groups_in[]']";
    public static String formSearchInput = "//button[@data-id='groups_in[]']//following-sibling::div/div/input";
    public static String itemVIP ="//button[@data-id='groups_in[]']/following-sibling::div//span[normalize-space()='VIP']";
    public static String selectAllButton ="//button[@data-id='groups_in[]']/following-sibling::div//button[text() = 'Select All']";
    public static String deselectAllButton ="//button[@data-id='groups_in[]']/following-sibling::div//button[text() = 'Deselect All']";
    public static String currencyDropdown = "//button[@data-id = 'default_currency']";
    public static String optionLanguageDynamic = "//span[normalize-space() = '%s']";

    public static String SelectXpathLanguage(String language){
        return String.format(optionLanguageDynamic, language);
    }


    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // add new customer
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
