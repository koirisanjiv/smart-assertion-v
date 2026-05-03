package com.qaverse.smart.assertion.listener;

public interface AssertionListener {

    void onSuccess(String message);

    void onFailure(String message, Throwable error);
}