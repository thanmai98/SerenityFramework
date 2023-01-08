package Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class SigninPage extends PageObject {

    @Step
    public void enterCredentials(){
        $(By.id("user-name")).sendKeys("standard_user");
        $(By.id("password")).sendKeys("secret_sauce");
    }

    @Step
    public void clickCreateBtn(){
        $(By.id("SubmitCreate")).click();
        $(By.className("page-heading")).isDisplayed();
    }
}
