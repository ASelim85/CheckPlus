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

	public WorkFlowPage setOTP1(String otp) {
		setText(txtOTP1, otp);
		return this;
	}

	public WorkFlowPage setOTP2(String otp) {
		setText(txtOTP2, otp);
		return this;
	}

	public WorkFlowPage setOTP3(String otp) {
		setText(txtOTP3, otp);
		return this;
	}

	public WorkFlowPage setOTP4(String otp) {
		setText(txtOTP4, otp);
		return this;
	}

	public WorkFlowPage setOTP5(String otp) {
		setText(txtOTP5, otp);
		return this;
	}

	public WorkFlowPage clickOK() {
		click(btnOK);
		return this;
	}


	public WorkFlowPage setMobileNumber(String mobileNumber) throws InterruptedException {
		setText(unitsList, "01111353830");
		return this;
	}

	public WorkFlowPage setName() {
		setText(assignedRole, "pay");
		return this;
	}

	public WorkFlowPage selectGovernorate() {
		WebElement governorate = driver.findElement(By.id("governorate"));
		governorate.click();
		By governValues = By.xpath(setXpathByDataID("Governorate_CAIRO"));
		click(governValues);
		return this;
	}

	public WorkFlowPage selectCity() {
		WebElement city = driver.findElement(By.id("city"));
		city.click();
		By cityValues = By.xpath(setXpathByDataID("City_15_MAYO"));
		click(cityValues);
		return this;
	}

	public String getReturnedSMEsTitle() {
		return getContent(returnedSMEsTitle);
	}

	public WorkFlowPage clickShowResultBtn() {
		click(showResultBtn);
		return this;
	}

	public WorkFlowPage clickExportFileBtn() {
		click(exportListBtn);
		return this;
	}

	public WorkFlowPage assertReturnedPage() {
		softAssertionEqual(returnedSMEsTitle, "Returned SMEs");
		return this;
	}
}

