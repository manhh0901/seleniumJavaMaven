package TestAutoDemo.Bai19_NavigationPage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Basepages {

    private WebDriver driver;

    public Basepages(WebDriver driver) {
        this.driver = driver;
    }

    //Element chung cho tất cả các trang
    public By menuDashboard = By.xpath("//span[normalize-space()='Dashboard' and @class='menu-text']");
    public By menuCustomers = By.xpath("//span[normalize-space()='Customers' and @class='menu-text']");
    public By menuProjects = By.xpath("//span[normalize-space()='Projects' and @class='menu-text']");
    public By menuTasks = By.xpath("//span[normalize-space()='Tasks' and @class='menu-text']");

    public By iconProfile = By.xpath("//li[@class='icon header-user-profile']");
    public By optionLogout = By.xpath("//a[text()='Logout']");



}
