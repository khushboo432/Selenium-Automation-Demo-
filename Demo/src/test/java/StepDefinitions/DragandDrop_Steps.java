package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.DragandDrop;

import java.io.IOException;

public class DragandDrop_Steps {

    DragandDrop dd= new DragandDrop();

    public DragandDrop_Steps() throws IOException {
    }

    @Given("user is on drag and drop site")
    public void user_is_on_drag_and_drop_site() {
        dd.getSite();

    }
    @Then("user drags the dropabble element")
    public void user_drags_the_dropabble_element() {
        dd.dragElement();
    }

}
