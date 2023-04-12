package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.TableForm;

import java.io.IOException;

public class TableForm_Steps {

    TableForm tf = new TableForm();

    public TableForm_Steps() throws IOException {
    }

    @Given("user goes to site")
    public void user_goes_to_site() {
        tf.getSite();
    }
    @Then("adds new row to the table")
    public void adds_new_row_to_the_table() throws InterruptedException {
        tf.createRow();
    }
    @Then("updates a row in the table")
    public void updates_a_row_in_the_table() throws InterruptedException {
       tf.updateRow();
    }
    @Then("deletes a row in the table")
    public void deletes_a_row_in_the_table() throws InterruptedException {
        tf.deleteRow();

    }
    @Then("reads all the values from the table")
    public void reads_all_the_values_from_the_table() {
        tf.readTable();
    }



}
