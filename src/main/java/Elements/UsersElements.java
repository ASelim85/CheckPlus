
package Elements;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsersElements extends BasePage {

    public UsersElements(WebDriver driver) {
        super(driver);
    }

    public By usersLink = By.xpath(setXpathByHref("/Check/Portal/Users/Index"));
    public By addUserLink = By.xpath(setXpathByClass("icon icon-add"));
    public By fullName = By.id("FullName");
    public By userNameText = By.id("Username");
    public By userCode = By.id("UserCode");
    public By userEmail = By.id("Email");
    public By userMobile = By.id("Mobile");
    public By userRole = By.id("role");
    public By saveButton = By.id("create-activity");
    int test = 944;

    public By tests = By.xpath(STR."//*[@href='/CHECK/POC/Awqaf/Site/reports/details/\{test}']");
}