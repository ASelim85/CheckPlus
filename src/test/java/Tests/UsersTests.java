package Tests;

import Pages.LoginPage;
import Pages.UsersPage;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class UsersTests extends BaseTest {
    Faker faker = new Faker();
    LoginTests loginTests = new LoginTests();
    UsersPage usersPage = new UsersPage(driver);
    @Test(priority = 1, enabled = true)
    public void addNewUser() {
        String userName = faker.name().username();
        String code = faker.number().digits(7);
        String email = faker.internet().emailAddress();
        String mobileNumber = "0110" + faker.number().digits(7);
        loginTests.loginWithValidCredentials();
        usersPage.clickUsersLink()
                .clickAddNewUser()
                .setFullName()
                .setUserName(userName)
                .setUserCode(code)
                .setUserEmail(email)
                .setUserMobile(mobileNumber)
                .setUserRole()
                .clickSaveButton();
    }
/*
    @Test(priority = 2, enabled = true)
    public void filterWithGovernarate() throws InterruptedException {
        loginTest.loginWithValidCredentials();
        usersPage.clickSMEs()
                .clickMySMEs()
                .selectGovernorate()
                .selectCity()
                .clickShowResultBtn()
                .clickExportList();
    }

    @Test(priority = 3, enabled = true)
    public void filterWithStatusPending() {
        loginTest.loginWithValidCredentials();
        mySMEsPage.clickSMEs()
                .clickMySMEs()
                .selectStatus("Pending")
                .clickShowResultBtn()
                .clickExportList();
    }

    @Test(priority = 4, enabled = true)
    public void filterWithStatusActive() {
        loginTest.loginWithValidCredentials();
        mySMEsPage.clickSMEs()
                .clickMySMEs()
                .selectStatus("Active")
                .clickShowResultBtn()
                .clickExportList();
    }

    @Test(priority = 5, enabled = true)
    public void filterWithStatusCompleted() {
        loginTest.loginWithValidCredentials();
        mySMEsPage.clickSMEs()
                .clickMySMEs()
                .selectStatus("Completed")
                .clickShowResultBtn()
                .clickExportList();
    }

    @Test(priority = 6, enabled = true)
    public void filterWithStatusReturned() {
        loginTest.loginWithValidCredentials();
        mySMEsPage.clickSMEs()
                .clickMySMEs()
                .selectStatus("Returned")
                .clickShowResultBtn()
                .clickExportList();
    }

    @Test(priority = 7, enabled = true)
    public void filterWithStatusSuspend() {
        loginTest.loginWithValidCredentials();
        mySMEsPage.clickSMEs()
                .clickMySMEs()
                .selectStatus("Suspended")
                .clickShowResultBtn()
                .clickExportList();

    }
*/
}
