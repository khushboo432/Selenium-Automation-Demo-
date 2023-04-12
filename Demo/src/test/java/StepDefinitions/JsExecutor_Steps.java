package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.JsExecutor;

import java.io.IOException;

public class JsExecutor_Steps {

    JsExecutor jse = new JsExecutor();
    //WebDriver driver;

    public JsExecutor_Steps() throws IOException {
    }

    @Given("user goes to two plugs site")
    public void user_goes_to_two_plugs_site() {
        jse.getSite();

    }
    @Then("user clicks the flash button")
    public void user_clicks_the_flash_button() throws InterruptedException {
        jse.blink();
    }
}
