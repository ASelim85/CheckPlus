package Elements;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UnitsElements extends BasePage {
    public By unitsLink = By.xpath(setXpathByHref("/Check/Portal/Units/Index"));
    public By addNewUnitButton = By.xpath(setXpathByClass("icon icon-add"));
    public By unitPrimaryNameText = By.id(("Name"));
    public By unitSecondaryNameText = By.id(("NameAr"));
    public By unitManager = By.id("SelectedUnitManager");
    public By codeTextBox = By.id("ShortCode");
    public By priDescription = By.id(("Description"));
    public By secDescription = By.id(("DescriptionAr"));
    public By email = By.id(("Email"));
    public By submitButton = By.xpath(("//label[@type='submit']"));
    public By CreatedStatus = By.xpath(setXpathByDataID("KYCStatus_CREATED"));
    public By FailedStatus = By.xpath(setXpathByDataID("KYCStatus_FAILED"));
    public By DeletedStatus = By.xpath(setXpathByDataID("KYCStatus_DELETED"));
    public By NotCompletedStatus = By.xpath(setXpathByDataID("KYCStatus_NOT_COMPLETED"));
    public By ShowResult = By.xpath(setXpathByText("Show Results"));
    public By Complete = By.xpath(setXpathByText("Completed"));

    public UnitsElements(WebDriver driver) {
        super(driver);
    }
}
