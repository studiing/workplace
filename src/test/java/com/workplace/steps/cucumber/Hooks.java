package com.workplace.steps.cucumber;

import cucumber.api.java.Before;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


/**
 * Created by Volodymyr_Zaverukha on 11/16/2016.
 */
public class Hooks {

    @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        getDriver().manage().window().maximize();
        ThucydidesWebDriverSupport.getPages().
                getConfiguration().setDefaultBaseUrl("https://ecsd001006a8.epam.com/CWPTEST/");

    }
}



