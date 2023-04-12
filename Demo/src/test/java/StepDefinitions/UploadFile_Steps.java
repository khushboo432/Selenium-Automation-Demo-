package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.UploadFile;

import java.io.IOException;

public class UploadFile_Steps {

    UploadFile uf = new UploadFile();

    public UploadFile_Steps() throws IOException {
    }


    @Given("user goes to demoqa site")
    public void user_goes_to_demoqa_site() {
    uf.getSite();
    }
    @Then("uploads a file")
    public void uploads_a_file() {
    uf.fileUpload();
    }
}
