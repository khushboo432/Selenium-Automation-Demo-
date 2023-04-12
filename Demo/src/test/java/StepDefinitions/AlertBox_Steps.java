package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.example.AlertBox;

import java.io.IOException;

public class AlertBox_Steps {

    AlertBox ab = new AlertBox();

    public AlertBox_Steps() throws IOException {

    }

    @Given("user goes to alert box url")
    public void user_goes_to_alert_box_url() {
        ab.getSite();
    }
    @Then("he clicks first alert button")
    public void he_clicks_first_alert_button() throws InterruptedException, IOException {
        ab.firstAlert();
        ab.captureScreenshot();
    }


    @Then("he clicks second alert button")
    public void he_clicks_second_alert_button() throws InterruptedException, IOException {
        ab.secondAlert();
        ab.captureScreenshot();
    }
    @Then("he clicks third alert button")
    public void he_clicks_third_alert_button() throws InterruptedException, IOException{
        ab.thirdAlert();
        ab.captureScreenshot();
    }
    @And("he clicks fourth alert button")
    public void he_clicks_fourth_alert_button() throws InterruptedException, IOException {
        ab.fourthAlert();
        ab.captureScreenshot();
    }



}
