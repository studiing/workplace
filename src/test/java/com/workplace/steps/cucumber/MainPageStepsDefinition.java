package com.workplace.steps.cucumber;

import com.workplace.pages.PeoplePage;
import com.workplace.steps.serenity.MainPageSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


/**
 * Created by Volodymyr_Zaverukha on 11/16/2016.
 */
public class MainPageStepsDefinition {

    @Steps
    MainPageSteps mainPageSteps;

    @Given("^user is on the home page$")
    public void userIsOnTheHomePage(){
        mainPageSteps.openMainPage();
    }

    @When("^user logs in with EPAM LOGIN$")
    public void userLogsInWithEPAMLOGIN(){
        mainPageSteps.loginWithSSO();
    }

    @Then("^people tab is opened$")
    public void peopleTabIsOpened(){
        mainPageSteps.getPages().currentPageAt(PeoplePage.class);
    }

    @And("^user sees \"([^\"]*)\" greeting$")
    public void userSeesGreeting(String hello){
        assertThat(mainPageSteps.accountMenuText(), containsString(hello));
    }


}
