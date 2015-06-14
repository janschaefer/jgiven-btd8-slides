package com.tngtech.jgiven.example.bookstore;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;

public class MyScenarioTest
    extends ScenarioTest
    <MyGivenStage, MyWhenStage, MyThenStage> {

    @Test
    public void my_first_scenario_should_work() {

        given().some_prestate()
            .and().some_other_state();

        when().some_action();

        then().the_result_is_correct();

    }
}
