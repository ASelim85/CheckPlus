package Utility;

import Pages.BasePage;
import io.qameta.allure.Allure;
import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;
import java.io.File;

import static Pages.BasePage.driver;
import static Pages.BasePage.getCurrentDate;
import static Utility.SendMailSSLWithAttachment.sendPDFReportByGMail;
import static Utility.SendMailSSLWithAttachment.sendReportByEMail;

public class ListenerTest implements ITestListener {

    @SneakyThrows
    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Allure.addAttachment(result.getName(), new ByteArrayInputStream(
                ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                TakesScreenshot screenshot = (TakesScreenshot) driver;
                File src = screenshot.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(src, new File(
                        ".\\TestData\\ScreenShots\\" + getClass().getName() + "\\" + result.getName() + "_" + BasePage.getCurrentDate() + ".png"));
            } catch (Exception ignored) {
            }
        }
        driver.quit();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Allure.addAttachment(result.getName(), new ByteArrayInputStream(
                ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        //			if (res == 200) {
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                TakesScreenshot screenshot = (TakesScreenshot) driver;
                File src = screenshot.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(src, new File(
                        ".\\TestData\\ScreenShots\\" + getClass().getName() + "\\" + result.getName() + "_" + BasePage.getCurrentDate() + ".png"));
            } catch (Exception ignored) {
            }
        }
		driver.quit();
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        Allure.addAttachment(result.getName(), new ByteArrayInputStream(
                ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                TakesScreenshot screenshot = (TakesScreenshot) driver;
                File src = screenshot.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(src, new File(
                        ".\\TestData\\ScreenShots\\" + getClass().getName() + "\\" + result.getName() + "_" + BasePage.getCurrentDate() + ".png"));
            } catch (Exception ignored) {
            }
        }
		driver.quit();
    }

    @SneakyThrows
    @Override
    public void onStart(ITestContext context) {
        ScreenshotFailedCases.deleteScreenShots();
        Runtime.getRuntime().exec("cmd /c allure generate --clean --output .\\allure-results");
        Runtime.getRuntime().exec("cmd /c allure generate --clean --output D:\\Web_Automation\\AgentPortal\\TestData\\allureReport");
    }

    @SneakyThrows
    @Override
    public void onFinish(ITestContext result) {
        Runtime.getRuntime().exec("cmd /c allure serve .\\allure-results");
        Runtime.getRuntime().exec("cmd /c allure-combine D:\\Web_Automation\\AgentPortal\\allure-results --dest D:\\Web_Automation\\AgentPortal\\TestData\\allureReport --auto-create-folders");
        Runtime.getRuntime().exec("cmd /c allure-combine D:\\Web_Automation\\AgentPortal\\TestData\\allureReport --remove-temp-files");
        Runtime.getRuntime().exec("cmd /c allure-combine D:\\Web_Automation\\AgentPortal\\TestData\\allureReport --ignore-utf8-errors");
        Thread.sleep(5000);
//        sendPDFReportByGMail("mail.test.env@gmail.com", "xwbpeiycbnaqyflt", "aselim@axisapp.com","Testing Report" + getCurrentDate(), "");
//        sendReportByEMail("mail.test.env@gmail.com", "xwbpeiycbnaqyflt", "aselim@axisapp.com","Testing Report" + getCurrentDate(), "");

    }
}