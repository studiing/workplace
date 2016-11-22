package com.workplace.steps.serenity;

import com.workplace.pages.PeoplePage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

/**
 * Created by Viktoriia_Marynchak on 11/18/2016.
 */
public class PeoplePageSteps {
    PeoplePage peoplePage;

    @Step
    public void openPeoplePage() {
        getPages().getPage(PeoplePage.class).open();
    }

    @Step
    public void search(String name) {
        peoplePage.getSearchInputField().click();
        peoplePage.getSearchInputField().type(name);
        peoplePage.getSearchButton().click();
    }

    @Step
    public int amountRows(){
        return peoplePage.getTable().findElements(By.xpath(".//tr")).toArray().length;
    }
}
