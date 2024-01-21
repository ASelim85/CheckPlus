package Tests;

import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class WorkFlowTests extends BaseTest {

    @Test(priority = 0, enabled = true)
    public void addNewWorkFlow() throws InterruptedException {
        loginTest.loginWithValidCredentials();
        returnedSMEPage.clickWorkFlow()
                .clickAddNewWorkFlow()
                .setPrimaryName()
                .setSecondaryName()
                .selectUnit()
                .selectRole()
                .selectAssignedUnit()
                .selectAssignedTo()
                .selectAssignedTeam()
                .clickSubmitBtn();
    }

    @Test(priority = 1, enabled = true)
    public void filterWithName() {
        loginTest.loginWithValidCredentials();
        returnedSMEPage.clickWorkFlow()
                .assertReturnedPage()
                .setName()
                .clickShowResultBtn()
                .clickExportFileBtn();
    }

    @Test(priority = 2, enabled = true)
    public void filterWithGovernorate() throws InterruptedException, IOException, AWTException {
        loginTest.loginWithValidCredentials();
        returnedSMEPage.clickWorkFlow()
                .assertReturnedPage();
        createSMEPage.uploadNationalIdAttachment()
                .uploadContractAttachment()
                .uploadCommercialRegistrationAttachment()
                .uploadTaxIdAttachment();
        returnedSMEPage.clickSubmitBtn()
                .selectRole()
                .setOTP1("4")
                .setOTP2("5")
                .setOTP3("3")
                .setOTP4("4")
                .setOTP5("5")
                .clickOK();
    }

    @Test(priority = 3, enabled = true)
    public void filterWithCity() {
        loginTest.loginWithValidCredentials();
        returnedSMEPage.clickWorkFlow()
                .assertReturnedPage()
                .selectCity()
                .clickShowResultBtn()
                .clickExportFileBtn();

    }
}


