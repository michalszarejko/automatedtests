package tests.loginTests;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoggedInPage;
import tests.BaseTest;
import utilities.ExtentReports.ExtentTestManager;


public class LoginTest extends BaseTest {

    @Test(priority = 0)
    @Parameters({"username", "password"})
    public void loginTestTC1(String username, String password) {

        ExtentTestManager.getTest().setDescription("Valid Login Scenario with correct username and password");
        Assert.assertTrue(page.GetInstance(HomePage.class).isHomePageDisplayed());
        page.GetInstance(HomePage.class).login(username, password);
        Assert.assertTrue(page.GetInstance(LoggedInPage.class).isLoggedInPageDisplayed());
    }

    @Test(priority = 0)
    @Parameters({"username", "emptyPassword"})
    public void loginTestTC2(String username, String emptyPassword) {
        ExtentTestManager.getTest().setDescription("Invalid Login Scenario with correct username and no password");
        Assert.assertTrue(page.GetInstance(HomePage.class).isHomePageDisplayed());
        page.GetInstance(HomePage.class).login(username, emptyPassword);
        Assert.assertTrue(page.GetInstance(HomePage.class).isHomePageDisplayed());
    }

    @Test(priority = 0)
    @Parameters({"username", "password"})
    public void loginTestTC3(String username, String password) {
        ExtentTestManager.getTest().setDescription("Invalid Login Scenario with uppercase correct username and correct password");
        Assert.assertTrue(page.GetInstance(HomePage.class).isHomePageDisplayed());
        page.GetInstance(HomePage.class).login(username.toUpperCase(), password);
        Assert.assertTrue(page.GetInstance(HomePage.class).isHomePageDisplayed());
    }

    @Test(priority = 0)
    @Parameters({"username", "password"})
    public void sampleFakeTest(String username, String password) {

        ExtentTestManager.getTest().setDescription("Valid Login Scenario with correct username and password");
        Assert.assertTrue(page.GetInstance(HomePage.class).isHomePageDisplayed());
        page.GetInstance(HomePage.class).login("fakeacc", "fakepass");
        Assert.assertTrue(page.GetInstance(LoggedInPage.class).isLoggedInPageDisplayed());
    }

    @Test(priority = 0)
    @Parameters({"username", "password"})
    public void sampleLoginTestsWithDetails(String username, String password) {

        ExtentTestManager.getTest().setDescription("Valid Login Scenario with correct username and password");
        Assert.assertTrue(page.GetInstance(HomePage.class).isHomePageDisplayed());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Home page displayed successfully");
        page.GetInstance(HomePage.class).login(username, password);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Providing correct credentials");
        Assert.assertTrue(page.GetInstance(LoggedInPage.class).isLoggedInPageDisplayed());
        ExtentTestManager.getTest().log(LogStatus.PASS, "User successfully logged in");
        ExtentTestManager.getTest().log(LogStatus.INFO, "Dashboard was displayed");
    }

}
