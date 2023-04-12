package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.SeleniumPractice;

import java.io.IOException;

public class SeleniumPractice_Steps {

    SeleniumPractice sp=new SeleniumPractice();

    public SeleniumPractice_Steps() throws IOException {
    }

    @Given("user navigates to selenium automation practice site")
    public void user_navigates_to_selenium_automation_practice_site() throws InterruptedException {
        sp.getSite();
        Thread.sleep(2000);

    }
    @Then("user enters first name in the practice form")
    public void user_enters_first_name_in_the_practice_form() throws InterruptedException {
        sp.firstName();
        Thread.sleep(2000);

    }
    @Then("user enters last name")
    public void user_enters_last_name() throws InterruptedException{
        sp.lastName();
        Thread.sleep(2000);

    }
    @Then("user enters email address")
    public void user_enters_email_address() throws InterruptedException{
        sp.eMail();
        Thread.sleep(2000);

    }
    @Then("user selects gender")
    public void user_selects_gender() throws InterruptedException{
        sp.gender();
        Thread.sleep(2000);

    }
    @Then("user selects profession")
    public void user_selects_profession() throws InterruptedException{
        sp.profession();
        Thread.sleep(2000);

    }
    @Then("user chooses the country from drop down")
    public void user_chooses_the_country_from_drop_down() throws InterruptedException{
        sp.selectCountry();
        Thread.sleep(2000);

    }
    @Then("user selects skills from multiple select drop down")
    public void user_selects_skills_from_multiple_select_drop_down() throws InterruptedException{
        sp.multipleSkill();
        Thread.sleep(2000);

    }
    @Then("user clicks on click me! button")
    public void user_clicks_on_click_me_button() throws InterruptedException {
        sp.clickButton();
        Thread.sleep(2000);

    }
    @Then("user clicks on the pop up button")
    public void user_clicks_on_the_pop_up_button() throws InterruptedException {
        sp.clickAlert();
        Thread.sleep(2000);

    }


}
