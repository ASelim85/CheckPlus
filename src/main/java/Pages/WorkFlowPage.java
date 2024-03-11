package Pages;

import Elements.WorkFlowElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WorkFlowPage extends WorkFlowElements {


	public WorkFlowPage(WebDriver driver) {
		super(driver);
	}

	public WorkFlowPage clickWorkFlow() {
		click(workFlowLink);
		return this;
	}

	public WorkFlowPage clickAddNewWorkFlow(){
		click(addWorkFlowButton);
		return this;
	}
	public WorkFlowPage setPrimaryName() {
		setText(primaryName, STR."Test\{generateRNumber()}");
		return this;
	}

	public WorkFlowPage setSecondaryName() {
		setText(secondaryName, STR."Test\{generateRNumber()}");
		return this;
	}

	public WorkFlowPage clickSubmitBtn() {
		click(saveButton);
		return this;
	}

	public WorkFlowPage selectUnit (){
		click(unitsList);
		click(firstUnit);
		return this;
	}

	public WorkFlowPage selectRole() {
		selectData(assignedRole, 1);
		return this;
	}

	public WorkFlowPage selectAssignedUnit() {
		selectData(assignedUnit, 1);
		return this;
	}

	public WorkFlowPage selectAssignedTo() {
		selectData(assignedUser, 0);
		return this;
	}

	public WorkFlowPage selectAssignedTeam() {
		selectData(assignedTeam, 1);
		return this;
	}
	public WorkFlowPage clickCancelBtn() {
		click(cancelButton);
		return this;
	}
}

