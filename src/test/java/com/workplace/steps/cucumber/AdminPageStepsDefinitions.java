package com.workplace.steps.cucumber;

import com.workplace.steps.serenity.AdminPageSteps;
import com.workplace.steps.serenity.PeoplePageSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by Viktoriia_Marynchak on 11/21/2016.
 */
public class AdminPageStepsDefinitions {
    @Steps
    AdminPageSteps adminPageSteps;

    @Given("admin is on the Admin tab")
    public void adminIsOnTheAdminTab() {
        adminPageSteps.openAdminPage();
    }

    @And("on Edit Directions subcategory")
    public void onEditDirectionsSubcategory() {
        adminPageSteps.goToEditDirectionSubcategory();
    }

    @When("admin chooses '(.*)'")
    public void adminChoosesTitle(String direction) {
        String[] directions = direction.split(", ");
        for ( int i = 0; i < directions.length; i++ ) {
            adminPageSteps.chooseDirection(directions[i]);
        }
    }

    @And("clicks on Make Active button")
    public void clickOnMakeActiveButton() {
        adminPageSteps.clickMakeActiveButton();
    }

    @And("clicks on Make Inactive button")
    public void clickOnMakeInactiveButton() {
        adminPageSteps.clickMakeNotActiveButton();
    }

    @Then("notification window appears")
    public void notificationWindowAppears() {
        assertThat(adminPageSteps.isNotificationWindowPresent(), is(equalTo(true)));
    }

    @And("window contains text '(.*)'")
    public void withText(String message) {
        String[] directions = message.split(", ");
        assertThat(adminPageSteps.getText(), is(equalTo(message)));
    }
}
