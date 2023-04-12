package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.MouseHover;

import java.io.IOException;

public class MouseHover_Steps {

    MouseHover mh = new MouseHover();

    public MouseHover_Steps() throws IOException {
    }

    @Given("User goes to ebay site")
    public void user_goes_to_ebay_site() throws InterruptedException {
        mh.getSite();
    }
    @And("hovers over electronics button")
    public void hovers_over_electronics_button() throws InterruptedException {
        mh.mouseHover();
    }
}
