package stepdefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

public class HomePageStepDef {

    @Steps
    HomePage homePage;

    @Given("user launches required site on chrome browser")
    public void launchURL(){
        homePage.open();
        homePage.openWebsite();
    }

    @Then("user clicks on Login button")
    public void clickLoginButton() {
        homePage.clickLogin();
    }
}
