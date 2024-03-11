
package Pages;

import Elements.TestElements;
import org.openqa.selenium.WebDriver;

public class TestElementsPage extends TestElements {
    public TestElementsPage(WebDriver driver) {
        super(driver);
    }

    //create a method that sets username using userName element from TestElements class and setText method from BasePage class
    public TestElementsPage setUsername(String username) {
        setText(userNameField, username);
        return this;
    }

}