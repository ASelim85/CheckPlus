package Pages;

import Elements.LoginElements;
import io.qameta.allure.Step;

import static CoreElements.Click.click1;

public class LoginPage extends LoginElements {

    public LoginPage() {
		super(driver);
    }

    @Step("insert username value")
    public LoginPage setUsername(String username) {
        setText(userNameField, username);
        return this;
    }

    @Step("insert password value")
    public LoginPage setPassword(String password) {
        setText(passwordField, password);
        return this;
    }

    @Step("clicks login button")
    public LoginPage clickSignIn() {
        click1(signInButton);
        return this;
    }

    @Step("Get invalid login error message")
    public String GetErrorMSG() {
        waitElement(signInErrorMessage);
        return find(signInErrorMessage).getText();
    }

    @Step("insert OTP")
    public LoginPage setOTP(String otp) {
        setText(OTPField, otp);
        return this;
    }

    @Step("clicks verify OTP")
    public LoginPage clickVerifyOTP() {
        click(verifyOTPField);
        return this;
    }

    @Step("assert dashboard title")
    public LoginPage assertDashboardTitle() {
        softAssertionImageEqual(dashboardTitleLabel, "http://youxeldev.eastus.cloudapp.azure.com/Check/Portal/Images/logo-login.png", "http://youxeldev.eastus.cloudapp.azure.com/Check/Portal/Images/logo-login.png");
        softAssert.assertAll();
        return this;
    }

    @Step("assert invalid login message")
    public LoginPage assertInvalidLoginError() {
        softAssertionEqual(signInErrorMessage, "Invalid Login");
        return this;
    }

    @Step("assert empty password error")
    public LoginPage assertEmptyPasswordError() {
        softAssertionEqual(emptyPasswordErrorLabel, "A password is required");
        return this;
    }

    @Step("assert page title")
    public LoginPage assertPageTitle() {
        softAssertionEqual(welcomeToPortalPageTitle, "Welcome to our portal");
        return this;
    }
}
