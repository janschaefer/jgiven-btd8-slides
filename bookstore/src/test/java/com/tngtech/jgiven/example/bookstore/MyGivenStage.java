package com.tngtech.jgiven.example.bookstore;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;

public class MyGivenStage extends Stage<MyGivenStage> {
    @ProvidedScenarioState
    private int prestate;

    public MyGivenStage some_prestate() {
        prestate = 5;

        return self();
    }

    public void some_other_state() {

    }
}
