package com.workplace.pages;

import com.workplace.fragments.HeaderFragment;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WebPage extends PageObject {
    public WebPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//div[@class='navigation']")
    private HeaderFragment header;

    public HeaderFragment getHeader() {
        return header;
    }

    public WebElementFacade getElementByContent(final String XPATH, String name) {
        WebElementFacade element = find(By.xpath(String.format(XPATH, name)));

        return element;
    }
}
