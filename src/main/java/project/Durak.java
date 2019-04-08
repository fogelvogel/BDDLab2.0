package project;

public class Durak {
    public Card CreateCard() {
        return new Card();
    }

    public Card CreateCard(String operand1, String operand2) {
        return new Card(operand1, operand2);
    }

    public Card[] CreateSixCards() {
        return new Card[] {this.CreateCard(), this.CreateCard(), this.CreateCard(), this.CreateCard(), this.CreateCard(), this.CreateCard()};
    }
}
