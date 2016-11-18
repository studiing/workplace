package com.workplace.steps.serenity;

import com.workplace.pages.MainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Volodymyr_Zaverukha on 11/16/2016.
 */
public class MainPageSteps extends ScenarioSteps{

    MainPage mainPage;

    @Step
    public void loginWithSSO(){
        mainPage.getLoginWithSSOButton().click();
    }

    @Step
    public void openMainPage() {
        getPages().getPage(MainPage.class).open();
    }
    @Step
    public String accountMenuText() {
        new WebDriverWait(getDriver(), 2).
                until(ExpectedConditions.elementToBeClickable(mainPage.getHeader().getLogoutButton()));
        return mainPage.getHeader().getAccountPanel().getText();

    }
}
