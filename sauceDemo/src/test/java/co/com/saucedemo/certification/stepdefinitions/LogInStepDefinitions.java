package co.com.saucedemo.certification.stepdefinitions;

import co.com.saucedemo.certification.questions.ValidateErrorLogIn;
import co.com.saucedemo.certification.questions.ValidateLogIn;
import co.com.saucedemo.certification.tasks.LogInSuccessful;
import co.com.saucedemo.certification.tasks.UnsuccessfulLogIn;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LogInStepDefinitions {
    @Before
    public void setThestago() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();
    }

    @Given("^the user enter to the web page$")
    public void theUserEnterToTheWebPage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));

    }


    @When("^the user log in with standard user$")
    public void theUserLogInWithStandardUser() {
        theActorInTheSpotlight().attemptsTo(LogInSuccessful.enterInfo());
    }

    @Then("^the user can see products in the web page$")
    public void theUserCanSeeProductsInTheWebPage() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateLogIn.ValidateLogIn()));
    }

    ////@UnsuccessfulLogin////
    @When("^the user log in with locked out user$")
    public void theUserLogInWithLockedOutUser() {
        theActorInTheSpotlight().attemptsTo(UnsuccessfulLogIn.enterInfo());
    }


    @Then("^the user can see the error message$")
    public void theUserCanSeeTheErrorMessage() {
      theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateErrorLogIn.ValidateErrorLogIn()));
    }


}
