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
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage;
    LoginTests loginTest;
    WalletProcessPage walletProcessPage;
    TestCreateKYCPage testCreateKYCPage;
    KYCDocumentPage kYCDocumentPage;
    MyDocumentsPage myDocumentsPage;
    CashOutPage cashOutPage;
    CashInPage cashInPage;
    UnitsPage unitsPage;
    UsersTests usersTests;
    MyTransactionsPage myTransactionsPage;
    CreateSMEPage createSMEPage;
    MyDocumentsTestCases myDocumentsTestCases;
    UsersPage usersPage;
    CreateKYCTests createKYCTests;
    SubmitNewKYCPage submitNewKYCPage;
    WorkFlowPage returnedSMEPage;
    MySMEDetailsPage mySMEDetailsPage;

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
        driver.manage().window().maximize();
        String url = "http://youxeldev.eastus.cloudapp.azure.com/Check/Portal/Account/Login";
//        String url = "https://agentstg.axispay.app";
        driver.navigate().to(url);
        loginPage = new LoginPage();
        loginTest = new LoginTests();
        usersTests = new UsersTests();
        dashboardPage = new DashboardPage(driver);
        walletProcessPage = new WalletProcessPage(driver);
        kYCDocumentPage = new KYCDocumentPage(driver);
        myDocumentsPage = new MyDocumentsPage(driver);
        myDocumentsTestCases = new MyDocumentsTestCases();
        cashOutPage = new CashOutPage(driver);
        cashInPage = new CashInPage(driver);
        unitsPage = new UnitsPage(driver);
        myTransactionsPage = new MyTransactionsPage(driver);
        createSMEPage = new CreateSMEPage(driver);
        usersPage = new UsersPage(driver);
        testCreateKYCPage = new TestCreateKYCPage(driver);
        createKYCTests = new CreateKYCTests();
        submitNewKYCPage = new SubmitNewKYCPage(driver);
        returnedSMEPage = new WorkFlowPage(driver);
        mySMEDetailsPage = new MySMEDetailsPage(driver);
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