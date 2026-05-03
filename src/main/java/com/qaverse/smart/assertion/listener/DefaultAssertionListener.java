package com.qaverse.smart.assertion.listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DefaultAssertionListener implements AssertionListener {

    private static final Logger logger =
            LogManager.getLogger(DefaultAssertionListener.class);

    @Override
    public void onSuccess(String message) {
        logger.info("ASSERT PASS: {}", message);
    }

    @Override
    public void onFailure(String message, Throwable error) {
        logger.error("ASSERT FAIL: {}", message, error);
    }
}