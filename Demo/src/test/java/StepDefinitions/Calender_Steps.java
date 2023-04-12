package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Calender;

import java.io.IOException;

public class Calender_Steps {

    Calender cal = new Calender();

    public Calender_Steps() throws IOException {
    }

    @Given("User navigates to demoqa sites")
    public void user_navigates_to_demoqa_sites() {
       cal.getSite();
    }

    @Then("user clicks on the datepicker button")
    public void user_clicks_on_the_datepicker_button() {
        cal.clickDatePicker();
    }
    @And("he selects the required date")
    public void he_selects_the_required_date() throws InterruptedException {
        cal.selectDate();
    }

}
