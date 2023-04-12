package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Checkbox;
//import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;


public class CheckBox_steps {

    Checkbox cb=new Checkbox();

    public CheckBox_steps() throws IOException {
    }

    @Given("user is on the site")
    public void user_is_on_the_site() {
        cb.getSite();
    }

    @Then("he clicks on the home checkbox")
    public void he_clicks_on_the_home_checkbox() throws IOException {
        cb.clickCheckbox();
        cb.captureElement();
    }

}

