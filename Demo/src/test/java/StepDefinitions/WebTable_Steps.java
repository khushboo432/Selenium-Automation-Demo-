package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.WebTable;

import java.io.IOException;

public class WebTable_Steps {

    WebTable wt = new WebTable();

    public WebTable_Steps() throws IOException {
    }


    @Given("user goes to the demoqa {string} site")
    public void user_goes_to_the_demoqa_site(String string) {
        wt.getSite();
    }
    @Then("user checks the number of rows")
    public void user_checks_the_number_of_rows() {
        wt.getHeader();

        wt.getRows();
    }

}
