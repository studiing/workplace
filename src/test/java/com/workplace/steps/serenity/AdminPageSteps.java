package com.workplace.steps.serenity;

import com.workplace.pages.AdminPage;
import com.workplace.pages.PeoplePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by Viktoriia_Marynchak on 11/21/2016.
 */
public class AdminPageSteps {
    AdminPage adminPage;

    @Step
    public void openAdminPage() {
        getPages().getPage(AdminPage.class).open();
    }

    @Step
    public void goToEditDirectionSubcategory() {
        adminPage.getAdminTab().click();
        adminPage.getPeopleCategory().click();
        adminPage.getEditDirectionsSubcategory().click();
    }

    @Step
    public void chooseDirection(String direction) {
        adminPage.getDirectionCheckbox(direction).click();
    }

    @Step
    public void clickMakeActiveButton() {
        adminPage.getMakeActiveButton().click();
    }

    @Step
    public void clickMakeNotActiveButton() {
        adminPage.getMakeNotActiveButton().click();
    }

    @Step
    public String getText() {
        return adminPage.getNotificationWindow().getText();
    }

    @Step
    public boolean isNotificationWindowPresent() {
        return adminPage.element(adminPage.getNotificationWindow()).isPresent();
    }
}
