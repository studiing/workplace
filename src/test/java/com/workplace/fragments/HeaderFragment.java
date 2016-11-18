package com.workplace.fragments;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObject;

/**
 * Created by Volodymyr_Zaverukha on 11/16/2016.
 */
@ImplementedBy(HeaderFragmentImpl.class)
public interface HeaderFragment extends WidgetObject {
    WebElementFacade getLogoutButton();
    WebElementFacade getAccountPanel();
    void logOut();

}
