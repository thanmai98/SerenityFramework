package Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class SigninPage extends PageObject {

    @Step
    public void enterEmail(){
        $(By.id("email_create")).sendKeys("automationtest@yopmail.com");
    }

    @Step
    public void clickCreateBtn(){
        $(By.id("SubmitCreate")).click();
        $(By.className("page-heading")).isDisplayed();
    }
}
