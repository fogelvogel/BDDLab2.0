import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import project.Durak;
import project.Player;
import project.Table;

public class MyStepdefsLayingCard {
    private Durak instance;
    private Player player;
    private Table table;

    @Given("^i have instance of Durak class in game$")
    public void iHaveInstanceOfDurakClassInGame() {
        this.instance = new Durak();
    }

    @When("^i am creating player$")
    public void iAmCreatingPlayer() {
        this.player = new Player();
        this.player.AddCards(this.instance.CreateSixCards());
    }

    @And("^i have Table class$")
    public void iHaveTableClass() {
        this.table = new Table();
    }

    @And("^player is laying its card number (\\d+) on table$")
    public void playerIsLayingItsCardNumberOnTable(int arg0) {
        this.table.AddCards(this.player.GiveCard(arg0));
    }

    @Then("^the table has one card$")
    public void theTableHasOneCard() {
        Assert.assertNotNull(this.table.getCards()[0]);
    }


}
