import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import project.Durak;
import project.Player;

public class MyStepdefsPlayer {
    private Player player;
    private Durak instance;
    @Given("^i have instance of Player class$")
    public void iHaveInstanceOfPlayerClass() {
        this.player = new Player();
    }
    @And("^i have instance of Durak class too$")
    public void iHaveInstanceOfDurakClassToo() {
        this.instance = new Durak();
    }

    @When("^i want to give him six cards$")
    public void iWantToGiveHimSixCards() {
        player.AddCards(instance.CreateSixCards());
    }

    @Then("^player should have six cards$")
    public void playerShouldHaveSixCards() {
    }


}
