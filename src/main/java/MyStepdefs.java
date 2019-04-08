import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import project.Durak;

public class MyStepdefs {
    private Durak instance;
    @cucumber.api.java.en.Given("^i have my Durak class$")
    public void iHaveMyDurakClass() {
        this.instance = new Durak();
    }

    @And("^i have createCard function$")
    public void iHaveCreateCardFunction() {
    }

    @When("^i have entered \"([^\"]*)\" as first operand$")
    public void iHaveEnteredAsFirstOperand(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^i have entered \"([^\"]*)\" as second operand$")
    public void iHaveEnteredAsSecondOperand(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the Card should be created$")
    public void theCardShouldBeCreated() {
    }
}
