import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import project.Card;
import project.Durak;

public class MyStepdefsSixCards {
    private Durak instance;
    private Card[] cards;
    @Given("^i have instance of Durak class$")
    public void iHaveInstanceOfDurakClass() {
        this.instance = new Durak();
    }

    @When("^i want to create six cards$")
    public void iWantToCreateSixCards() {
        this.cards = this.instance.CreateSixCards();
    }

    @Then("^six Cards should be created$")
    public void sixCardsShouldBeCreated() {
        Assert.assertEquals(6, this.cards.length);
    }
}
