package com.qaverse.smart.assertion.hooks;

import org.testng.Assert;

import com.qaverse.smart.contracts.assertion.AssertionStrategy;

public class AssertionHook implements AssertionStrategy {

    @Override
    public void assertTrue(boolean condition, String message) {
        Assert.assertTrue(condition, message);
    }

    @Override
    public void assertEquals(Object actual, Object expected, String message) {
        Assert.assertEquals(actual, expected, message);
    }

    @Override
    public void assertAll() {}
}