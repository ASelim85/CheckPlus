package Pages;

import Elements.UnitsElements;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UnitsPage extends UnitsElements {
    Faker faker = new Faker();

    public UnitsPage(WebDriver driver) {
        super(driver);
    }

    public UnitsPage clickUnits() {
        click(unitsLink);
        return this;
    }

    public UnitsPage clickAddNewUnit() {
        click(addNewUnitButton);
        return this;
    }

    public UnitsPage setBasicUnitName() {
        setText(unitPrimaryNameText, generateUnitName());
        return this;
    }

    public UnitsPage setSecondaryUnitName() {
        setText(unitSecondaryNameText, generateUnitName());
        return this;
    }

    public UnitsPage uploadUnitImage() {
        WebElement unitImage = driver.findElement(By.xpath("//*[@id='upload-image-input']"));
        String imagePath = "D:\\Selim\\Automation\\AgentPortal-main\\UploadedFiles\\Riyadh_Municipality_logo.png";
        System.out.println(imagePath);
        unitImage.sendKeys(imagePath);
//        setText(unitImage, imagePath);
        return this;
    }

    public UnitsPage setCode() {
        String code = faker.number().digits(6);
        setText(codeTextBox, code);
        return this;
    }

    public UnitsPage setPriDescription() {
        setText(priDescription, generateUnitName());
        return this;
    }

    public UnitsPage setSecDescription() {
        setText(secDescription, generateUnitName());
        return this;
    }

    public UnitsPage setUnitDirector() {
        selectData(unitManager, 1);
//        WebElement CompleteStatus = driver.findElement(By.id("SelectedUnitManager"));
//        Select dropdown = new Select(CompleteStatus);
//        dropdown.selectByVisibleText("1Test");
        return this;
    }

    public UnitsPage setEmail() {
        String emailAddress = faker.internet().emailAddress();
        setText(email, emailAddress);
        return this;
    }

    public UnitsPage clickSave() {
        click(submitButton);
        return this;
    }

    public void ClickCreatedStatus() {
        click(CreatedStatus);
    }

    public void ClickFailedStatus() {
        click(FailedStatus);
    }

    public void ClickDeletedStatus() {
        click(DeletedStatus);
    }

    public void ClickNotCompletedStatus() {
        click(NotCompletedStatus);
    }


    public void ClickShowResult() {
        click(ShowResult);
    }

    public String CompletedText() {
        return getContent(Complete);
    }
}



