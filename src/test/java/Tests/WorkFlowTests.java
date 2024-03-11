package Tests;

import org.testng.annotations.Test;

public class WorkFlowTests extends BaseTest {

    @Test(priority = 0, enabled = true)
    public void addNewWorkFlow() throws InterruptedException {
        loginTest.loginWithValidCredentials();
        workFlowPage.clickWorkFlow()
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


    // create a new work flow with different data
    @Test(priority = 1, enabled = true)
    public void addNewWorkFlow2() throws InterruptedException {
        loginTest.loginWithValidCredentials();
        workFlowPage.clickWorkFlow()
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

    // create a new work flow without selecting a unit
    @Test(priority = 2, enabled = true)
    public void addNewWorkFlow3() throws InterruptedException {
        loginTest.loginWithValidCredentials();
        workFlowPage.clickWorkFlow()
                .clickAddNewWorkFlow()
                .setPrimaryName()
                .setSecondaryName()
                .selectRole()
                .selectAssignedUnit()
                .selectAssignedTo()
                .selectAssignedTeam()
                .clickSubmitBtn();
    }
    // create new workflow without with only setting primary name

    @Test(priority = 3, enabled = true)
    public void addNewWorkFlow4() throws InterruptedException {
        loginTest.loginWithValidCredentials();
        workFlowPage.clickWorkFlow()
                .clickAddNewWorkFlow()
                .setPrimaryName()
                .clickSubmitBtn();
    }

    // create new workflow with but cancel the process
    @Test(priority = 4, enabled = true)
    public void addNewWorkFlow5() throws InterruptedException {
        loginTest.loginWithValidCredentials();
        workFlowPage.clickWorkFlow()
                .clickAddNewWorkFlow()
                .setPrimaryName()
                .setSecondaryName()
                .selectUnit()
                .selectRole()
                .selectAssignedUnit()
                .selectAssignedTo()
                .selectAssignedTeam()
                .clickCancelBtn();
    }

// call the method addNewUser from UsersPage and call addNewUnit from UnitsTests
    @Test(priority = 5, enabled = true)
    public void addNewUserAndUnit() throws InterruptedException {
        usersTests.addNewUser();
        unitsTests.addNewUnit();
    }

}




