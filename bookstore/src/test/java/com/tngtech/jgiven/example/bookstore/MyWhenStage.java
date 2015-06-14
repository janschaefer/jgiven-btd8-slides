package com.tngtech.jgiven.example.bookstore;

import com.tngtech.jgiven.annotation.ExpectedScenarioState;

public class MyWhenStage {
    @ExpectedScenarioState
    private int prestate;

    public void some_action() {
        //throw new IllegalArgumentException("foo");
    }
}
