package TestAutoDemo.Annotations;

import org.testng.annotations.*;

public class Annotations_2 {
    // Nếu chạy 1 package nhiều class. nếu có chứa @besforesuite thì method có gán sẽ chạy trc tất cả các class
    // với beforeclass sẽ chỉ  áp dụng cho nội bộ class
    // before method chạy trước mỗi phương thức
    @BeforeClass
    public static void runClass(){
        System.out.println("BeforeClass chạy trước trong class annotation 2");
    }


    @BeforeMethod
    public static void runMethod(){
        System.out.println("@BeforeMethod: chạy trước MỖI testcase annotation 2");
    }

    @Test
    public static void loginSuccess (){
        System.out.println("annotation 2: Login success");
    }

    @Test
    public static void loginFailed (){
        System.out.println("annotation 2: Login falied");
    }



}
