package com.workplace.pages;

import com.workplace.fragments.HeaderFragment;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;


/**
 * Created by Volodymyr_Zaverukha on 11/16/2016.
 */
//@DefaultUrl("https://epuakyiw0699.kyiv.epam.com/CWPTEST")
//@DefaultUrl("https://ecsd001006a8.epam.com/CWPTEST/")
    //@DefaultUrl("#HOST")
public class MainPage extends WebPage {

    @FindBy(xpath = ".//button[@ng-click='login()']")
    private WebElementFacade loginWithSSOButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public WebElementFacade getLoginWithSSOButton() {
        return loginWithSSOButton;
    }
}
