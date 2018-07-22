package com.argos.stepDefs;

import com.argos.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomeStepdefs {
    HomePage homepage;

    public HomeStepdefs()
    {
        homepage=new HomePage();
    }

    @Given("^user should be on Amazon home page$")
    public void userShouldBeOnAmazonHomePage() throws Throwable {
        homepage.printMessage();

    }

    @When("^user clicks the \"([^\"]*)\" link$")
    public void userClicksTheLink(String arg0) throws Throwable {
     homepage.signinMessage();

    }
}