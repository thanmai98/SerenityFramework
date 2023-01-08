package stepdefinitions;

import Pages.HomePage;
import Pages.SigninPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class SigninStepDef {

    @Steps
    SigninPage signinPage;

    @Then("user enters username and password")
    public void enterUsernameAndPassword() {
        signinPage.enterCredentials();
    }
    @Then("user clicks on create an account button")
    public void clickOnCreateAccountButton() {
        signinPage.clickCreateBtn();
    }

}
