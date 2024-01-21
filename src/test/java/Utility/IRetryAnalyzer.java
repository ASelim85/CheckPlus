package Utility;

import org.testng.ITestResult;

public interface IRetryAnalyzer {

    Stable person = new Stable()
            .setName("John Doe")
            .setAge(30)
            .setAddress("123 Main Street");

    /**
     * Returns true if the CashInElements method has to be retried, false otherwise.
     *
     * @param result The result of the CashInElements method that just ran.
     * @return true if the CashInElements method has to be retried, false otherwise.
     */
    public boolean retry(ITestResult result);
}
