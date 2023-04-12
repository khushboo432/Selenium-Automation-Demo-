package StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.DropDown;

import java.io.IOException;

public class DropDown_Steps {

    DropDown dd = new DropDown();

    public DropDown_Steps() throws IOException {
    }

    @Given("user navigates to the dropdown site")
    public void user_navigates_to_the_dropdown_site() throws InterruptedException {
        dd.getSite();
    }

    @Then("he selects required values from drop down menu")
    public void he_selects_required_values_from_drop_down_menu() throws InterruptedException {
        dd.dropDown();

    }

}