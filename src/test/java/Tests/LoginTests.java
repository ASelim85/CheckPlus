package Tests;

import Pages.LoginPage;
import io.qameta.allure.*;
import lombok.SneakyThrows;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//import CoreElements.*;
import java.io.IOException;

import static Utility.JsonReader.TestJson.getJson;


public class LoginTests extends BaseTest {
//    Driver driver = new Driver();
    LoginPage loginPage = new LoginPage();
    String Username = "agentuser3";//"agentuser3";
    String Password = "P@ssw0rd";
    String loginTestData = "TestData/Data/login.json";
    SoftAssert softassert = new SoftAssert();
    @SneakyThrows
    @Test(priority = 1, enabled = true, invocationCount = 1, groups="smoke")
    @Epic("Sign In flow")
    @Feature("Login form")
    @Story("User enters valid password")
    @Owner("QC Team")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test that verifies a user can sign in the page with valid username and password")
    public void loginWithValidCredentials() {
        //validLogin
        loginPage.setUsername(getJson(loginTestData, "username"))
                .setPassword(getJson(loginTestData, "password"))
                .clickSignIn()
                .assertDashboardTitle();
    }

    @Test(priority = 0, enabled = true, invocationCount = 1, groups="smoke")
    @Epic("Sign In flow")
    @Feature("Login form")
    @Story("User enters invalid password")
    @Owner("QC Team")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test that verifies a user cannot enter the page without logging in")
    public void loginWithInValidCredentials() throws IOException {
        loginPage.setUsername(getJson(loginTestData, "username"))
                .setPassword(getJson(loginTestData, "wrong password"))
                .clickSignIn()
                .assertInvalidLoginError()
                .softAssertAll();
    }

    @Test(priority = 2, enabled = true, invocationCount = 1, groups="smoke")
    @Epic("Sign In flow")
    @Feature("Login form")
    @Story("User enters empty password")
    @Owner("QC Team")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test that verifies a user cannot Login with empty password")
    public void loginWithEmptyPassword() throws IOException {
        loginPage.setUsername(getJson(loginTestData, "username"))
                .setPassword("")
                .clickSignIn()
                .assertEmptyPasswordError()
                .softAssertAll();
    }

    @Test
    public void tryAssert() throws IOException {
        loginPage.assertPageTitle()
                .softAssertAll();
    }
}