package Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePage extends PageObject {

    @Step
    public void openWebsite(){
//        Open.browserOn();
        assertThat(getDriver().getTitle()).isEqualTo("My Store");
    }

    @Step
    public void clickOnSignin(){
        $(By.xpath("//a[@class='login']")).click();
        $(By.className("page-heading")).isDisplayed();

    }
}
