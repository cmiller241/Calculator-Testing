package com.revature.steps;

import com.revature.MainRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.revature.MainRunner.driver;

public class CalculateSteps {

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        driver.get(MainRunner.homeUrl);
    }
    @When("User clicks {string} button")
    public void user_clicks_button(String string) throws InterruptedException {
        WebElement theButton = driver.findElement(By.xpath("//button[text()='" + string + "']"));
        theButton.click();
        Thread.sleep(500);
    }
    @Then("User should see {string} value in console")
    public void user_should_see_value_in_console(String string) {
        String theConsole = driver.findElement(By.id("viewMath")).getAttribute("value");
        System.out.println("The console says: " + theConsole);
        Assert.assertEquals(theConsole.equals(string), true, "Error: Answer is not right!");
    }
}
