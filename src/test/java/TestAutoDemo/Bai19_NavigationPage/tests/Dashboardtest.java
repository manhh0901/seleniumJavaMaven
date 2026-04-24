package TestAutoDemo.Bai19_NavigationPage.tests;

import TestAutoDemo.Bai19_NavigationPage.pages.DashboardPage;
import TestAutoDemo.Bai19_NavigationPage.pages.LoginPage;
import TestAutoDemo.common.BaseTest;
import org.testng.annotations.Test;

public class Dashboardtest extends BaseTest {
    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    @Test
    public void testLabelProjectInProgress() {
        loginPage = new LoginPage(driver);
        loginPage.loginCRM("admin@example.com", "123456");
        loginPage.verifyLoginSuccess();

        dashboardPage = new DashboardPage(driver);
        dashboardPage.verifyDashboardPageDisplayed();

        String totalProjectsInProgressOnDashboard = dashboardPage.getTotalProjectsInProgress();


        //dashboardPage.verifyTotalProjectsInProgress();
    }
}
