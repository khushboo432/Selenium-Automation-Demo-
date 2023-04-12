package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Frames;

import java.io.IOException;

public class Frames_Steps {

    Frames f = new Frames();

    public Frames_Steps() throws IOException {
    }

    @Given("user navigates to demoqa site")
    public void user_navigates_to_demoqa_site() {
        f.getSite();
    }
    @Then("he inputs text in single frame")
    public void he_inputs_text_in_single_frame() throws InterruptedException {
    f.inputFirstFrame();
    }
    @Then("he inputs text in multiple frame")
    public void he_inputs_text_in_multiple_frame() throws InterruptedException {
    f.inputSecondFrame();
    }
}
