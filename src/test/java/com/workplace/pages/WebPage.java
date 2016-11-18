package com.workplace.pages;

import com.workplace.fragments.HeaderFragment;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;


public class WebPage extends PageObject {
    public WebPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//div[@class='navigation']")
    private HeaderFragment header;

    public HeaderFragment getHeader() {
        return header;
    }
}
