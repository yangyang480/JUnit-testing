package com.perscholas.junitprotected;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

import javax.xml.transform.Result;

public class TestRunner {
    public static void main(String[] args) {
        Result result = (Result) JUnitCore.runClasses(TestSuite.class);

        for (Failure failure : ((org.junit.runner.Result) result).getFailures()) {
            System.out.println(failure.toString());
            System.out.println("U SUCK UR TESTS FAILED");
        }

        System.out.println(((org.junit.runner.Result) result).wasSuccessful());
        if(((org.junit.runner.Result) result).wasSuccessful()) {
            System.out.println("HOORAY WE PASSED THE TESTS");
        }
    }
}
