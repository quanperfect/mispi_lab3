package com.example.Web3.utils;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class HitCheckerTestNew {
    private double inputX;
    private double inputY;
    private int inputR;
    private Boolean expectedResult;
    private HitChecker hitChecker;

    @Before
    public void initialize() {
        hitChecker = new HitChecker();
    }

    // Each parameter should be placed as an argument here
    // Every time runner triggers, it will pass the arguments
    // from parameters we defined in primeNumbers() method

    public HitCheckerTestNew(double inputX, double inputY, int inputR, Boolean expectedResult) {
        this.inputX = inputX;
        this.inputY = inputY;
        this.inputR = inputR;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection points() {
        return Arrays.asList(new Object[][] {
                { -1,0.5,1, true },
                { 0,0,2, true },
                { -1,-1,4, true },
                { 1,1,1, false },
                { 2,-2,2, false },
                { -0.5,0.75,2, true },
                { 2,0.5,4, true }
        });
    }

    // This test will run 4 times since we have 5 parameters defined
    @Test
    public void testHitChecker() {
        System.out.println("{x, y, r, expectedResult}: " + inputX + " , " + inputY + " , " + inputR + " , expected: " + expectedResult);
        assertEquals(expectedResult,
                hitChecker.isHit(inputX, inputY, inputR));
    }
}