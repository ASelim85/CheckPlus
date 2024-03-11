package Elements;
//import necessary classes for the below code
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TestElements extends BasePage {
        // create constructor from the class TestElements with driver as a parameter
        public TestElements(WebDriver driver) {
            super(driver);
        }

        // define a userNameField as a By element using xpath "username"
        public By userNameField = By.xpath("username");

        //define an expath for this element <span class="p-button-label ng-star-inserted" aria-hidden="false">New Survey</span>
        public By newSurveyButton = By.xpath("//span[@class='p-button-label ng-star-inserted' and text()='New Survey']");

}
