package project;

public class Card {
    private String suit;

    public String getSuit() {
        return suit;
    }

    public String getNumber() {
        return number;
    }

    private String number;
    public Card() {
    }
    public Card(String operand1, String operand2) {
        this.suit = operand1;
        this.number = operand2;
    }
}
