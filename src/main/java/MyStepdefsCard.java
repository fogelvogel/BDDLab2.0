import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import project.Card;

public class MyStepdefsCard {
    private Card card;
    private String operand1;
    private String operand2;
    @Given("^i have my Card class$")
    public void iHaveMyCardClass() {
        this.card = new Card();
    }

    @When("^i have entered \"([^\"]*)\" as first operand in Card$")
    public void iHaveEnteredAsFirstOperandInCard(String arg0) throws Throwable {
        this.operand1 = arg0;
    }

    @And("^i have entered \"([^\"]*)\" as second operand in Card$")
    public void iHaveEnteredAsSecondOperandInCard(String arg0) throws Throwable {
        this.operand2 = arg0;
    }

    @Then("^the Card should be created with operands$")
    public void theCardShouldBeCreatedWithOperands() {
        this.card = new Card(this.operand1, this.operand2);
        Assert.assertEquals(this.operand1, card.getSuit());
        Assert.assertEquals(this.operand2, card.getNumber());
    }
}
