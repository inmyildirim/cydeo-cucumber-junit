package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String string) {

    }
    @Then("user see {string} in the google title")
    public void user_see_in_the_google_title(String string) {

    }

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        Driver.closeDriver();

    }

    @When("user types apple and clicks enter")
    public void userTypesAppleAndClicksEnter() {
        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);
    }

    @Then("user see apple in the google title")
    public void userSeeAppleInTheGoogleTitle() {

        String expectedTitle = "apple - Google'da Ara";
        String actualtitle = Driver.getDriver().getTitle();

        //Junit assertion accepts first argument as  expected and secondly accepts actual
        Assert.assertEquals(expectedTitle,actualtitle);

    }
}
