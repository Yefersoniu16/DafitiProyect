package co.com.sistecredito.certification.stepDefinitions;

import co.com.sistecredito.certification.dafiti.models.RegisterModel;
import co.com.sistecredito.certification.dafiti.tasks.RegisterUserPage;
import co.com.sistecredito.certification.dafiti.utils.AppiumDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.net.MalformedURLException;
import java.util.List;

public class RegisterPageStedDefinitions {

    @Given("^User is in the app register page$")
    public void userIsInTheAppRegisterPage() throws MalformedURLException {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Tso");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(AppiumDriver.app()));
    }


    @When("^the user enters the registration data$")
    public void theUserEntersTheRegistrationData(List<RegisterModel> users) {
      theActorInTheSpotlight().attemptsTo(RegisterUserPage.register(users));

    }

    @Then("^the user enters the page$")
    public void theUserEntersThePage() {

    }
}
