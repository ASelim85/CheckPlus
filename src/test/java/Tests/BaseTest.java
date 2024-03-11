package Tests;

import Pages.*;
import Utility.WebDriverEventHandler;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

@Listeners({Utility.ListenerTest.class, Utility.SuiteListener.class, Utility.MyListener.class})
public class BaseTest extends WebDriverEventHandler {
    public WebDriver driver;
    public final SoftAssert softAssert = new SoftAssert();
    LoginPage loginPage;
    LoginTests loginTest;
    UnitsPage unitsPage;
    UsersTests usersTests;
    WorkFlowPage workFlowPage;
    UsersPage usersPage;
    UnitsTests unitsTests;
    @BeforeSuite
    void setEnvironment() {
    }

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*")
                .addArguments("--incognito");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
        String url = "http://youxeldev.eastus.cloudapp.azure.com/Check/Portal/Account/Login";
        driver.navigate().to(url);
        loginPage = new LoginPage();
        loginTest = new LoginTests();
        usersTests = new UsersTests();
        unitsPage = new UnitsPage(driver);
        workFlowPage = new WorkFlowPage(driver);
        usersPage = new UsersPage(driver);
        unitsTests = new UnitsTests();
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    @AfterMethod
    public void tearDown() {
//        driver.quit();
    }

    @AfterClass
    public void generateReport() throws IOException {
        //onGenerateAllureReport();
        FileUtils.deleteDirectory(new File("target/allure-results"));

    }

    public void switchTab() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void refresh() {
        driver.navigate().refresh();
    }
}