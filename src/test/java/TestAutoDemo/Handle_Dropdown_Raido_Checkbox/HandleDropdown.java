package TestAutoDemo.Handle_Dropdown_Raido_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HandleDropdown {

    public static void DropdownStatic(){
        // so luong gia tri trong dropdown khong thay doi
        //https://demoqa.com/select-menu
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/select-menu");

        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
        select.selectByVisibleText("red");
        select.selectByValue("6");

        select.selectByIndex(3);



    }

    public static void main(String[] args) {

    }
}
