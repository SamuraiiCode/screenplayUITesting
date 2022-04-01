package co.com.saucedemo.certification.stepdefinitions;

import co.com.saucedemo.certification.questions.ValidatePurchase;
import co.com.saucedemo.certification.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConfirmPurchaseStepDefinitions {

    @Before
    public void setThestago() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();
    }

    @Given("^the user enter to the web page to confirm purchase$")
    public void theUserEnterToTheWebPageToConfirmPurchase() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @Given("^log in to confirm purchase standard user$")
    public void logInToConfirmPurchaseStandardUser() {
        theActorInTheSpotlight().attemptsTo(LogInSuccessful.enterInfo());
    }

    @Given("^the user adds products in the shopping cart to confirm purchase$")
    public void theUserAddsProductsInTheShoppingCartToConfirmPurchase() {
        theActorInTheSpotlight().attemptsTo(AddProduct.add());
    }

    @Given("^the user enter the info to confirm purchase$")
    public void theUserEnterTheInfoToConfirmPurchase() {
        theActorInTheSpotlight().attemptsTo(EnterInfo.enterInfo());
    }

    @When("^the user ends the purchase$")
    public void theUserEndsThePurchase() {
        theActorInTheSpotlight().attemptsTo(ConfirmPurchase.finish());
    }

    @Then("^the user can see the order complete$")
    public void theUserCanSeeTheOrderComplete() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatePurchase.ValidatePurchase()));
    }
    /////Performance glitch user ////
    @Given("^log in to confirm purchase performance glitch user$")
    public void logInToConfirmPurchasePerformanceGlitchUser() {
        theActorInTheSpotlight().attemptsTo(LogInWithPerformance.enterInfo());
    }


    @Given("^the user adds products in the shopping cart to confirm purchase performance glitch user$")
    public void theUserAddsProductsInTheShoppingCartToConfirmPurchasePerformanceGlitchUser() {
        theActorInTheSpotlight().attemptsTo(AddProduct.add());
    }

    @Given("^the user enter the info to confirm purchase performance glitch user$")
    public void theUserEnterTheInfoToConfirmPurchasePerformanceGlitchUser() {
        theActorInTheSpotlight().attemptsTo(EnterInfo.enterInfo());
    }

    @When("^the user ends the purchase performance glitch user$")
    public void theUserEndsThePurchasePerformanceGlitchUser() {
        theActorInTheSpotlight().attemptsTo(ConfirmPurchase.finish());
    }

    @Then("^the user can see the order complete performance glitch user$")
    public void theUserCanSeeTheOrderCompletePerformanceGlitchUser() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatePurchase.ValidatePurchase()));
    }
}
