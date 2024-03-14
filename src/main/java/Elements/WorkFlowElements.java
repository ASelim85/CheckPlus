package Elements;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkFlowElements extends BasePage {

    public WorkFlowElements(WebDriver driver) {
        super(driver);
    }
    public By workFlowLink = By.xpath("");
    //    comment
    public By addWorkFlowButton = By.xpath("");
    public By primaryName       = By.xpath("");
    public By secondaryName     = By.xpath("");
    public By saveButton        = By.xpath("");
    public By unitsList         = By.xpath("");
    public By firstUnit         = By.xpath("");
    public By assignedRole      = By.xpath("");
    public By assignedUnit      = By.xpath("");
    public By assignedUser      = By.xpath("");
    public By assignedTeam      = By.xpath("");
    public By addNewStepButton  = By.xpath("");

    public By cancelButton      = By.xpath("cancelButton");

}
