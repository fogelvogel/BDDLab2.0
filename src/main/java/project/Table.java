package project;

public class Table {
    private Card[] cards;
    private int countCards;

    public Card[] getCards() {
        return cards;
    }

    public Table() {
        cards = new Card[36];
    }



    public int AddCards(Card[] createSixCards) {
        int len = createSixCards.length;
        for (int i = 0; i < len; i++) {
            cards[countCards] = createSixCards[i];
            countCards++;
        }
        return 0;
    }
}
