package stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import tasks.AddToCart;
import tasks.LogIn;
import tasks.NavegateToFinishShopping;
import userinterface.CheckoutPage;

public class ShoppingStepDefinition {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario QA");
    }

    @Given("the user is on the main page")
    public void theUserIsOnTheMainPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Open.url("https://www.saucedemo.com/")
        );
    }

    @When("he buy products from the shopping cart")
    public void heBuyProductsFromTheShoppingCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LogIn.successfully(),
                AddToCart.products("jacket","backpack"),
                NavegateToFinishShopping.successfully()
        );
    }

    @Then("it should the successful purchase message")
    public void itShouldTheSuccessfulPurchaseMessage() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(CheckoutPage.TEXT_FINISH).text().isEqualTo("Thank you for your order!")
        );
    }

}
