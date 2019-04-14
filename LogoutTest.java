package tests.loginTests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoggedInPage;
import tests.BaseTest;
import utilities.ExtentReports.ExtentTestManager;

public class LogoutTest extends BaseTest {

    @Test(priority = 0)
    @Parameters({"username", "password"})
    public void logoutTestTC1(String username, String password) {

        ExtentTestManager.getTest().setDescription("Logout scenario");
        Assert.assertTrue(page.GetInstance(HomePage.class).isHomePageDisplayed());
        page.GetInstance(HomePage.class).login(username, password);
        Assert.assertTrue(page.GetInstance(LoggedInPage.class).isLoggedInPageDisplayed());
        page.GetInstance(LoggedInPage.class).logOut();
        Assert.assertTrue(page.GetInstance(HomePage.class).isHomePageDisplayed());
    }
}