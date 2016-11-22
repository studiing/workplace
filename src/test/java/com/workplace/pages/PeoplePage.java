package com.workplace.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Volodymyr_Zaverukha on 11/16/2016.
 */
//@At(urls = {"#HOST/#/employees"})
@DefaultUrl("/#/employees")
//@DefaultUrl("https://ecsd001006a8.epam.com/CWPTEST/")
public class PeoplePage extends WebPage{
    public PeoplePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='input-group clearable-input']/input[@class='form-control employees-search-input']")
    private WebElementFacade searchInputField;

    @FindBy(xpath = "//div[@class='input-group-btn']/button[@class='btn btn-default']")
    private WebElementFacade searchButton;

    @FindBy(xpath = "//table[@id='table-employee-first-column-body']")
    private WebElementFacade table;

    public WebElementFacade getSearchInputField() {
        return searchInputField;
    }

    public WebElementFacade getSearchButton() {
        return searchButton;
    }

    public WebElementFacade getTable() {
        return table;
    }
}
