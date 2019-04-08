import project.Durak;

public class MyStepdefs {
    private Durak instance;
    @cucumber.api.java.en.Given("^i have my Durak class$")
    public void iHaveMyDurakClass() {
        this.instance = new Durak();
    }
}
