package Utility;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    int counter = 0;
    int retryLimit = 0;
    /*
     * (non-Javadoc)
     * @see org.testng.IRetryAnalyzer#retry(org.testng.ITestResult)
     *
     * This method decides how many times a CashInElements needs to be rerun.
     * TestNg will call this method every time a CashInElements fails. So we
     * can put some code in here to decide when to rerun the CashInElements.
     *
     * Note: This method will return true if a tests needs to be retried
     * and false it not.
     *
     */

    @Override
    public boolean retry(ITestResult result) {

        if(counter < retryLimit)
        {
            counter++;
            return true;
        }
        return false;
    }
}