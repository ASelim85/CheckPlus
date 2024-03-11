package Pages;

import Elements.UsersElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static Data.GenerateNames.generateArabicName;

public class UsersPage extends UsersElements {


	public UsersPage(WebDriver driver) {
		super(driver);
	}

	public UsersPage clickUsersLink() {
		click(usersLink);
		return this;
	}

	public UsersPage clickAddNewUser() {
		click(addUserLink);
		return this;
	}

	public UsersPage setFullName() {
		setText(fullName, STR."\{generateArabicName()} \{generateArabicLastName()}");
		return this;
	}

	public UsersPage setUserName(String userName) {
		setText(userNameText, userName);
		return this;
	}

	public UsersPage setUserCode(String code) {
		setText(userCode, code);
		return this;
	}

	public UsersPage setUserEmail(String email){
		setText(userEmail, email);
		return this;
	}
	public UsersPage setUserMobile(String mobileNUmber) {
		setText(userMobile, mobileNUmber);
		return this;
	}

	public UsersPage setUserRole() {
		selectData(userRole, 4);
//		WebElement CompleteStatus = driver.findElement(By.id("SelectedUnitManager"));
//		Select dropdown = new Select(CompleteStatus);
//		dropdown.selectByVisibleText("1Test");
		return this;
	}

	public UsersPage clickSaveButton() {
		click(saveButton);
		return this;
	}

	public UsersPage selectCity() throws InterruptedException {
		WebElement city = driver.findElement(By.id("city"));
		city.click();
		Thread.sleep(2000);
		By cityValues = By.xpath(setXpathByDataID("City_15_MAYO"));
		click(cityValues);
		return this;
	}


	public UsersPage selectStatus(String statusVal) {
		By statusLocator = By.xpath(setXpathByDataID("status-input"));
		WebElement status = new WebDriverWait(driver, 10).until(
				ExpectedConditions.presenceOfElementLocated(statusLocator));
		status.click();
		By statusValue = By.xpath("//*[@title='" + statusVal + "']");
		WebElement statusElement =
				new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(statusValue));
		statusElement.click();
		return this;
	}

	public String MYSMETittle() {
		return getContent(fullName);
	}

	public UsersPage assertMYSMETittle() throws InterruptedException, IOException {
		softAssertionEqual(fullName, "My SMEs");
		return this;
	}
}



