package org.test;

import org.testng.*;

/** Hello world! */
public class TestngListener implements ITestListener, IInvokedMethodListener {
    public TestngListener() {
        System.out.println("Constructor called on Instance " + this );
    }

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("Instance " + this + " "+"beforeInvocation " + method.toString());
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("Instance " + this + " "+"afterInvocation" + method.toString());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Instance " + this + " "+"onTestStart");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Instance " + this + " "+"onTestSuccess");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Instance " + this + " "+"onTestFailure");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Instance " + this + " "+"onTestSkipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Instance " + this + " "+"onTestFailedButWithinSuccessPercentage");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Instance " + this + " "+"onStart");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Instance " + this + " "+"onFinish");
    }
}
