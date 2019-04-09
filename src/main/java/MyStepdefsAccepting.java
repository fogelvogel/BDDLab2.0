import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import project.Card;
import project.Durak;
import project.Player;

public class MyStepdefsAccepting {
    private Durak instance;
    private Player player;

    @Given("^i have another instance of Durak class in game$")
    public void iHaveAnotherInstanceOfDurakClassInGame() {
        this.instance = new Durak();
    }

    @When("^i am creating new player$")
    public void iAmCreatingNewPlayer() {
        this.player = new Player();
    }

    @And("^player is accepting card$")
    public void playerIsAcceptingCard() {
        this.player.AddCards(new Card[] {new Card("spades","5")});
    }

    @Then("^player should have one card$")
    public void playerShouldHaveOneCard() {
        Assert.assertNotNull(this.player.getCards()[0]);
    }
}
