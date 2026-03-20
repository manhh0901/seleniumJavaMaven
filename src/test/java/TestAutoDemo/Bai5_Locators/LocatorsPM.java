package TestAutoDemo.Bai5_Locators;

public class LocatorsPM {

    //login page
    public static String inputUserAccount = "//input[@name = 'email']";
    public static String inputPassword ="//input[@name = 'password']";
    public static String btnLogin ="//button[@type='submit']";

    // Navigate menu
    public static String menuPayout ="//li[@data-title='Payout']";
    public static String menuDashboard ="//li[@data-title='Dashboard']";


    //element tại trang Payout
    public static String btnCreatePayoutSingle = "//button[contains(text(),'Tạo lệnh chuyển tiền') or contains(text(),'Create transfer order')]";

    //elements tại form tạo lệnh chuyển tiền
    public static String inputAmountPayout = "//input[@name='amount']";

}
