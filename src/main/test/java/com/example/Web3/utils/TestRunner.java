package com.example.Web3.utils;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.Test;


public class TestRunner {
    @Test
    public void main() {
        Result result = JUnitCore.runClasses(HitCheckerTestNew.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        if (result.wasSuccessful()) {
            System.out.println("\nTests were successful, all points matched their expectedResults.");
        }
        else {
            System.out.println("\nTest set failed, not all points matched their expectedResults.");
        }
        //System.out.println(result.wasSuccessful());
    }
}