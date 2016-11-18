package com.workplace.fragments;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

/**
 * Created by Volodymyr_Zaverukha on 11/16/2016.
 */
public class HeaderFragmentImpl extends WidgetObjectImpl implements HeaderFragment {
    public HeaderFragmentImpl(PageObject page, ElementLocator locator, WebElement webElement, long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    public HeaderFragmentImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }

    @FindBy(xpath = ".//a[.='Logout']")
    WebElementFacade logoutButton;

    @FindBy(xpath = ".//ul[@class='navbar-login']")
    private WebElementFacade accountPanel;

    public WebElementFacade getAccountPanel() {
        return accountPanel;
    }
    public WebElementFacade getLogoutButton() {
        return logoutButton;
    }

    public void logOut(){
        logoutButton.click();
    }
}
