package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class HomePage extends BasePage {

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement login;

    @FindBy(how = How.CLASS_NAME, using = "login-form-forgot")
    private WebElement forgotPasswordField;

    @FindBy(how = How.ID, using = "username")
    private WebElement userNameField;

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordField;

    @FindBy(how = How.ID, using = "remember")
    private WebElement rememberMe;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isHomePageDisplayed() {
        return login.isDisplayed();
    }

    public void login(String username, String password) {
        userNameField.sendKeys(username);
        passwordField.sendKeys(password);
        login.click();
    }

    public void forgotPassword() {
        forgotPasswordField.click();
    }

}
