package com.qaverse.smart.assertion.strategy;

import org.testng.asserts.SoftAssert;

import com.qaverse.smart.contracts.assertion.AssertionStrategy;

public class SoftAssertionStrategy implements AssertionStrategy {

    private final SoftAssert softAssert = new SoftAssert();

    @Override
    public void assertTrue(boolean condition, String message) {
        softAssert.assertTrue(condition, message);
    }

    @Override
    public void assertEquals(Object actual, Object expected, String message) {
        softAssert.assertEquals(actual, expected, message);
    }

    @Override
    public void assertAll() {
        softAssert.assertAll();
    }
}