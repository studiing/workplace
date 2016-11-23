package com.workplace.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.yecht.Data;
import sun.awt.windows.WEmbeddedFrame;

import java.lang.*;

/**
 * Created by Viktoriia_Marynchak on 11/21/2016.
 */
@DefaultUrl("/#/admin")
public class AdminPage extends WebPage {
    public AdminPage(WebDriver driver) {
        super(driver);
    }
    public static final String FORMATED_XPATH_DIRECTION =
            ".//tr[contains(., '%s')]//input";
    public static final String FORMATED_XPATH_EMPLOYEE = "//table[contains(@class, 'fixed-header-table')]//tr/td[contains(text(), '%s')]/../td/input";
    public static final String FORMATED_XPATH_EMPLOYEE_ROLE = "//table[contains(@class, 'fixed-header-table')]//td[contains(text(), '%s')]/..";

    @FindBy(xpath = ".//li[@id='adminTopMenuItem']")
    private WebElementFacade adminTab;

    @FindBy(xpath = ".//ul[@id='admin-left-menu-content']//li")
    private WebElementFacade peopleCategory;

    @FindBy(xpath = ".//li[@id='adminDirectionsSubmenu']")
    private WebElementFacade editDirectionsSubcategory;

    @FindBy(xpath = ".//li[@id='adminEmployeesSubmenu']")
    private WebElementFacade editEmployeeSubcategory;

    @FindBy(xpath = "//button[text()='Make manager']")
    private WebElementFacade makeManagerButton;

    @FindBy(xpath = "//button[@aria-label='No']")
    private WebElementFacade noButton;

    @FindBy(xpath = "//button[@aria-label='Yes']")
    private WebElementFacade yesButton;

    @FindBy(xpath = "//button[@aria-label='OK']")
    private WebElementFacade okButton;

    @FindBy(xpath = ".//button[contains(text(), 'Make active')]")
    private WebElementFacade makeActiveButton;

    @FindBy(xpath = ".//button[contains(text(), 'Make inactive')]")
    private WebElementFacade makeNotActiveButton;

    @FindBy(xpath = ".//div[@class='md-dialog-content custom-dialog-form__content']")
    private WebElementFacade notificationWindow;

    public WebElementFacade getAdminTab() {
        return adminTab;
    }

    public WebElementFacade getPeopleCategory() {
        return peopleCategory;
    }

    public WebElementFacade getEditDirectionsSubcategory() {
        return editDirectionsSubcategory;
    }

    public WebElementFacade getEditEmployeeSubcategory() {
        return editEmployeeSubcategory;
    }

    public WebElementFacade getDirectionCheckbox(String name) {
        WebElementFacade element = getElementByContent(FORMATED_XPATH_DIRECTION, name);

        return element;
    }

    public WebElementFacade getEmployeeCheckbox(String name) {
        WebElementFacade element = getElementByContent(FORMATED_XPATH_EMPLOYEE, name);
        return element;
    }

    public WebElementFacade

    getRole(String name){
        WebElementFacade element = getElementByContent(FORMATED_XPATH_EMPLOYEE_ROLE, name);
        return element;
    }



    public WebElementFacade getMakeActiveButton() {
        return makeActiveButton;
    }

    public WebElementFacade getMakeNotActiveButton() {
        return makeNotActiveButton;
    }

    public WebElementFacade getNotificationWindow() {
        return notificationWindow;
    }

    public WebElementFacade getMakeManagerButton() {
        return makeManagerButton;
    }

    public WebElementFacade getNoButton() {
        return noButton;
    }

    public WebElementFacade getYesButton() {
        return yesButton;
    }

    public WebElementFacade getOkButton() {
        return okButton;
    }
}
