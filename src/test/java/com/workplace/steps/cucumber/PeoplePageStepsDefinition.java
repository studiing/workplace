package com.workplace.steps.cucumber;

import com.sun.org.apache.xpath.internal.operations.Equals;
import com.workplace.steps.serenity.PeoplePageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by Viktoriia_Marynchak on 11/18/2016.
 */
public class PeoplePageStepsDefinition {
    @Steps
    PeoplePageSteps peoplePageSteps;

    @Given("user is on the people page")
    public void userIsOnThePeoplePage() {
        peoplePageSteps.openPeoplePage();
    }

    @When("user search by student's '(.*)'")
    public void userSearchByName(String name) {
        peoplePageSteps.search(name);
    }

    @Then("table contains '(.*)' rows")
    public void tableContains(int rows){
        assertThat(rows, is(equalTo(peoplePageSteps.amountRows())));
    }
}
