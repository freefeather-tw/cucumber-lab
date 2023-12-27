package org.example.cucumberLab.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import java.time.LocalDate;
import org.example.cucumberLab.utils.TGIFUtil;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class FridaySteps {

  private LocalDate today;

  private String answer;

  @Given("today is Year {int}, Month {int}, Day {int}")
  public void todayIsYearYearMonthMonthDayDay(Integer year, Integer month, Integer day) {
    this.today = LocalDate.of(year, month, day);
  }

  @When("I ask whether it's Friday yet")
  public void iAskWhetherItSFridayYet() {
    this.answer = TGIFUtil.isFriday(today);
  }

  @Then("I should be told {string}")
  public void iShouldBeTold(String string) {
    assertEquals(string, answer);
  }
}
