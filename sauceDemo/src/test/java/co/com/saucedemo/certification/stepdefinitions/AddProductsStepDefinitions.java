package co.com.saucedemo.certification.stepdefinitions;

import co.com.saucedemo.certification.questions.ValidateAddProduct;
import co.com.saucedemo.certification.questions.ValidateNotAddProduct;
import co.com.saucedemo.certification.tasks.AddProduct;
import co.com.saucedemo.certification.tasks.LogInSuccessful;
import co.com.saucedemo.certification.tasks.LogInWithProblemUser;
import co.com.saucedemo.certification.tasks.TryToAddProduct;
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

public class AddProductsStepDefinitions {
    @Before
    public void setThestago() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();
    }

    @Given("^the user enter to the web page to add products$")
    public void theUserEnterToTheWebPageToAddProducts() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }


    @Given("^log in to add products$")
    public void logInToAddProducts() {
        theActorInTheSpotlight().attemptsTo(LogInSuccessful.enterInfo());
    }

    @When("^the user adds products in the shopping cart$")
    public void theUserAddsProductsInTheShoppingCart() {
        theActorInTheSpotlight().attemptsTo(AddProduct.add());
    }

    @Then("^the user can see the increase in the cart$")
    public void theUserCanSeeTheIncreaseInTheCart() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateAddProduct.ValidateAddProduct()));
    }

    ////Unsuccessful/////
    @Given("^log in to add products with a problem user$")
    public void logInToAddProductsWithAProblemUser() {
        theActorInTheSpotlight().attemptsTo(LogInWithProblemUser.enterInfo());
    }


    @When("^the user adds products that are not Sauce Labs Fleece Jacket$")
    public void theUserAddsProductsThatAreNotSauceLabsFleeceJacket() {
        theActorInTheSpotlight().attemptsTo(TryToAddProduct.add());
    }

    @Then("^the user can see the another products$")
    public void theUserCanSeeTheAnotherProducts() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateNotAddProduct.ValidateNotAddProduct()));
    }
}
