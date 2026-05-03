package com.qaverse.smart.assertion.api;

public interface TestHook<T> {

    void beforeTest(T context);

    void afterTest(T context);

    int order();
}