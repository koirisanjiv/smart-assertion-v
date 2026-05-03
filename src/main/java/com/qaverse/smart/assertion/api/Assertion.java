package com.qaverse.smart.assertion.api;

import com.qaverse.smart.assertion.context.AssertionContext;

public final class Assertion {

    private Assertion() {}

    public static void assertTrue(AssertionContext ctx, boolean condition, String message) {
        ctx.getEngine().assertTrue(condition, message);
    }

    public static void assertEquals(AssertionContext ctx, Object actual, Object expected, String message) {
        ctx.getEngine().assertEquals(actual, expected, message);
    }

    public static void assertAll(AssertionContext ctx) {
        ctx.getEngine().assertAll();
    }
}