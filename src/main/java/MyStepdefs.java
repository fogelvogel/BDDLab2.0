import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import project.Card;
import project.Durak;

public class MyStepdefs {
    private Durak instance;
    private String operand1;
    private String operand2;
    private Card card;
    @cucumber.api.java.en.Given("^i have my Durak class$")
    public void iHaveMyDurakClass() {
        this.instance = new Durak();
    }

    @And("^i have createCard function$")
    public void iHaveCreateCardFunction() {
        this.instance.CreateCard();
    }

    @When("^i have entered \"([^\"]*)\" as first operand$")
    public void iHaveEnteredAsFirstOperand(String arg0) throws Throwable {
        this.operand1 = arg0;
    }

    @And("^i have entered \"([^\"]*)\" as second operand$")
    public void iHaveEnteredAsSecondOperand(String arg0) throws Throwable {
        this.operand2 = arg0;
    }

    @Then("^the Card should be created$")
    public void theCardShouldBeCreated() {
        this.card = this.instance.CreateCard(operand1,operand2);
        Assert.assertEquals(this.operand1, card.getSuit());
        Assert.assertEquals(this.operand2, card.getNumber());
    }
}
