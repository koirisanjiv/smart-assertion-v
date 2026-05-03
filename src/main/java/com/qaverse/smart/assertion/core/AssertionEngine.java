package com.qaverse.smart.assertion.core;

import com.qaverse.smart.assertion.listener.AssertionListener;
import com.qaverse.smart.contracts.assertion.AssertionStrategy;

public class AssertionEngine {

    private final AssertionStrategy strategy;
    private final AssertionListener listener;

    public AssertionEngine(AssertionStrategy strategy, AssertionListener listener) {
        this.strategy = strategy;
        this.listener = listener;
    }

    public void assertTrue(boolean condition, String message) {
        try {
            strategy.assertTrue(condition, message);
            listener.onSuccess(message);
        } catch (AssertionError e) {
            listener.onFailure(message, e);
            throw e;
        }
    }

    public void assertEquals(Object actual, Object expected, String message) {
        try {
            strategy.assertEquals(actual, expected, message);
            listener.onSuccess(message);
        } catch (AssertionError e) {
            listener.onFailure(message, e);
            throw e;
        }
    }

    public void assertAll() {
        strategy.assertAll();
    }
}