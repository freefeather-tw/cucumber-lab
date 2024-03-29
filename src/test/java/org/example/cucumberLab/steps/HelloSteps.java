package org.example.cucumberLab.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@RunWith(Cucumber.class)
public class HelloSteps {

  @LocalServerPort
  private int port;

  @Autowired
  private TestRestTemplate restTemplate;

  private String result;

  @When("當我呼叫hello API")
  public void iCallHelloAPI() {
    this.result = this.restTemplate.getForObject("http://localhost:" + port + "/hello",
        String.class);
  }

  @Then("我應該看到response body顯示為 {string}")
  public void iShouldSeeTheResponseBody(String content) {
    assert (content.equals(this.result));
  }
}
