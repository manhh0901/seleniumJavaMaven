package TestAutoDemo.Annotations;

import org.testng.annotations.*;

public class Annotations {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Chạy trước toàn bộ suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Chạy sau toàn bộ suite");
    }

    @Test
    public static void loginSuccess (){
        System.out.println("Login success");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Chạy trước tất cả các test trong một thẻ <test>");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Chạy sau tất cả các test trong một thẻ <test>");
    }


    @Test
    public static void loginFailed (){
        System.out.println("Login falied");
    }



}
