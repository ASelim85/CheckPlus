package Elements;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginElements extends BasePage {

    public LoginElements(WebDriver driver) {
        super(driver);
    }

    public By userNameField = By.id ("login-email");
    public By passwordField = By.id ("login-password");
    public By signInButton = By.id ("trigger-spinner");
    public By signInErrorMessage = By.xpath (setXpathByClassText("ant-notification-notice-message","Invalid Login"));
    public By OTPField = By.id ("basic_otp");
    public By verifyOTPField = By.xpath ("//button[@type='submit']");
    public By dashboardTitleLabel = By.xpath ("//img[@class='logo-img']");
    public By emptyPasswordErrorLabel = By.id("basic_password_help");
    public By welcomeToPortalPageTitle = By.xpath(setXpathByDataID("welcome-to-portal-page-title"));

}
