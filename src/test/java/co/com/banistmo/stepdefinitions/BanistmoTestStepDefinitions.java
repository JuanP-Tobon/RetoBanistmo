package co.com.banistmo.stepdefinitions;

import co.com.banistmo.questions.ValidatePdf;
import co.com.banistmo.tasks.NavigateToDucument;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class BanistmoTestStepDefinitions {
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario QA");
    }

    @Given("^The user enter to the page$")
    public void the_user_enter_to_the_page() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Open.url("https://www.banistmo.com/wps/portal/banistmo/personas"));
    }

    @When("^The user download the us law document$")
    public void theUserDownloadTheUsLawDocument() {
        OnStage.theActorInTheSpotlight().attemptsTo(NavigateToDucument.on());
    }

    @Then("^He should see the pdf in this url (.*)$")
    public void heShouldSeeThePdfInThisUrl(String urlPdf) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidatePdf.with(urlPdf), is(equalTo(true))));
    }
}
