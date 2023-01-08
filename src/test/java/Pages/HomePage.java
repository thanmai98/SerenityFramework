package Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePage extends PageObject {

    @Step
    public void openWebsite(){
//        Open.browserOn();
        assertThat(getDriver().getTitle()).isEqualTo("Swag Labs");
    }

    @Step
    public void clickLogin(){
        $(By.id("login-button")).click();
        assertThat(getDriver().getCurrentUrl()).isEqualTo("https://www.saucedemo.com/inventory.html");
    }
}
