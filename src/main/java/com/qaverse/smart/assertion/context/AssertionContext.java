package com.qaverse.smart.assertion.context;

import com.qaverse.smart.assertion.core.AssertionEngine;

public class AssertionContext {

    private AssertionEngine engine;

    public AssertionEngine getEngine() {
        return engine;
    }

    public void setEngine(AssertionEngine engine) {
        this.engine = engine;
    }
}