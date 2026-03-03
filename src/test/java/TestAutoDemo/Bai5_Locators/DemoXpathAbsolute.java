package TestAutoDemo.Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoXpathAbsolute {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://crm.anhtester.com/authentication/login");

        //xpath tuyet doi
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/form/div/div/div[5]/button"));

        // xpath tuong doi, bat dau la dau 2 // attribute
        driver.findElement(By.xpath("//label[@for ='email']"));

        //1. xac dinh bang chuoi text(). co the thay bang dau "."
        //span[text()='   abc   ']

        //2. normalize-space: tuong tu text nhung no se trim space
        //span[normalize-space()='abc']

        //3. Xac dinh ham chua contains()
        //cu phap: //tagname[starts-with(@attribute, 'gia tri') hoac //tagname[starts-with(text, 'gia tri')
        // span[starts-with(text(),'Invoices')]

        //4. dùng starts-with:
        //cu phap: //tagname[contains(@attribute, 'gia tri') hoac //tagname[contains(tt, 'gia tri')

        //5. Dung toan tu, or va and
        // vi du: //[@class = 'form-control' or @id = 'user-message']
        //div[@id='page-content' or @class ='card-header']

        //6. Ancestor, tim kiem to tien cua the goc. Những thẻ bao bọc trực tiếp thẻ đó
        // vd: //div [@id='123']/ancestor::div

//
//        7. Xác định với Con cháu Descendant. Ngược lại với ancestor
//        Ví dụ : //div[@id='page-content']/descendant::div
//        1 - Đầu tiên, nó tìm phần tử có XPath là  //div[@id='page-content']

        // 8. Following. kiems nhưng phần từ nằm NGANG HÀNG và BÊN DƯỚI (ko nằm TRONG, NGOÀI, TRÊN)
        //Ví dụ : //div[@id='page-content']/following::div[1]

        // 9. Preceding. kiems nhưng phần từ nằm NGANG HÀNG và BÊN TRÊN (ko nằm TRONG, NGOÀI, DƯỚI)
        //Ví dụ : //div[@id='page-content']/preceding::div[1]

        //10. following-sibling và preceding-sibling


        //11. Xác định thông qua parent và child
//        Ví dụ: //div[@id='expense-dropzone']/parent::form
//        Nó tìm các thẻ form với vai trò là cha của //div[@id='expense-dropzone']





        Thread.sleep(2000);
        driver.quit();
    }
}
