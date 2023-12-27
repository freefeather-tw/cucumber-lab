package org.example.cucumberLab.steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.example.cucumberLab.entity.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(Cucumber.class)
public class UserSteps {

  private String name;

  private String answer;

  @Autowired
  private User user;


  @Given("I have a name {string}")
  public void iHaveAName(String name) {
    this.name = name;
  }

  @When("I ask if my name is correct")
  public void iAskIfMyNameIsCorrect() {
    this.answer = (name.equals(user.getName())) ? "Yes" : "No";
  }

  @Then("I should see {string}")
  public void iShouldSee(String arg0) {
    assertEquals(arg0, answer);
  }

}
