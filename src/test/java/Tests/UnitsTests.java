package Tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UnitsTests extends BaseTest {
    SoftAssert softAssert = new SoftAssert();
    LoginTests loginTests = new LoginTests();
    UsersTests usersTests = new UsersTests();

    @Test(priority = 0, enabled = true)
    public void OpenBranchDocument() throws InterruptedException {
        usersTests.addNewUser();
//        loginTests.loginWithValidCredentials();
        unitsPage.clickUnits()
                .clickAddNewUnit()
                .setBasicUnitName()
                .setSecondaryUnitName()
//                .uploadUnitImage()
                .setUnitDirector()
                .setCode()
                .setPriDescription()
                .setSecDescription()
                .setEmail()
                .clickSave();
//        Assert.assertEquals(branchOperationsPage.CompletedText(), "Completed");
    }
}