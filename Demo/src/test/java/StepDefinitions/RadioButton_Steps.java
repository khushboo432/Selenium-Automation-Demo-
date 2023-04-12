package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.RadioButton;

import java.io.IOException;

public class RadioButton_Steps {

    RadioButton rb = new RadioButton();

    public RadioButton_Steps() throws IOException {
    }


    @Given("user is navigates to the site")
    public void user_is_navigates_to_the_site() {
        rb.getSite();
    }
    @Then("clicks on the  radio button")
    public void clicks_on_the_radio_button() {
        rb.clickRadioButton();
    }
}
