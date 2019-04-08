import cucumber.api.java.en.Given;
import project.Card;

public class MyStepdefsCard {
    private Card card;
    @Given("^i have my Card class$")
    public void iHaveMyCardClass() {
        this.card = new Card();
    }
}
