package TestAutoDemo.Bai10_Annotations;

import TestAutoDemo.common.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo_Annotaitons extends BaseTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class child");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class child");
    }

    @Test (groups = {"Success","Happy case"},alwaysRun = true, description = "Test case login success")
    public void loginSuccess() {
        System.out.println("Login Success");
    }
    @Test (groups = {"Failed"})
    public void loginFailed() {
        System.out.println("Login Failed");
    }

}
