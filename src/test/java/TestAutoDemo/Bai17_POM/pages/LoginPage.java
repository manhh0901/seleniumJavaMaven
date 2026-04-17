package TestAutoDemo.Bai17_POM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    private WebDriver driver;

    //khai bao ham xau dung
    public LoginPage(WebDriver driver){
        this.driver = driver;
        //driver = _driver (_driver là tham số truyền vao ham)

    }

    // khai bao doi tuong element thuoc ve trang login
    private By inputEmail = By.id("email");
    private By inputPassword = By.id("password");
    private By checkboxRememberMe = By.id("remember");
    private By buttonLogin = By.xpath("//button[normalize-space()='Login']");
    private By errormessage = By.id("alerts");

    // có thể viết chung 1 hàm, truyen tham so vao
    private By errorMessageRequirePass = By.xpath("//div[normalize-space()='The Password field is required.']");
    private By errorMessageRequireEmail = By.xpath("//div[normalize-space()='The Email Address field is required.']");

    // khai bao cac Phuong thuc, ham xu ly trong noi bo trang login

    private void enterEmail(String email){
        driver.findElement(inputEmail).sendKeys(email);
    }

    private void enterPassword(String password){
        driver.findElement(inputPassword).sendKeys(password);
    }

    private void clickLoginButton(){
        driver.findElement(buttonLogin).click();
    }

    public void loginCRM(String email, String password){
        driver.get("https://crm.anhtester.com/admin/authentication");
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

    public void verifyLoginSuccess(){
        boolean isElementPresent = driver.findElements(By.xpath("//span[normalize-space()='Dashboard']")).size() > 0 ;
        Assert.assertTrue(isElementPresent,"Not found");
    }

    public void verifyLoginFailedWithInvalidEmail(){
        boolean isElementPresent1 =  driver.findElements(errorMessageRequireEmail).size() > 0;
        Assert.assertTrue(isElementPresent1,"Error message is not found");

    }

    public void verifyLoginFailedWithInvalidPassword(){
        boolean isElementPresent =  (driver.findElements(errorMessageRequirePass)).size() > 0;
        Assert.assertTrue(isElementPresent,"Error message is not found");

    }



}
