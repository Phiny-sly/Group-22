import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private Deck deck = new Deck();
    private List<String> cardInHand = new ArrayList<>();

    int index;
    String rank = " ";
    private int points = 0;


    public Player(String name) {
        this.name = name;

    }

    public void hand(Deck deck) {
        this.deck = deck;
        cardInHand.add(this.deck.getDeckOfCards().get(0));
        points += deck.getValueOfCards().get(0);

        cardInHand.add(this.deck.getDeckOfCards().get(1));
         points += deck.getValueOfCards().get(1);


        this.deck.getDeckOfCards().get(index).contains(rank);


        this.deck.getDeckOfCards().remove(0);
        this.deck.getDeckOfCards().remove(0);


    }

    public List<String> getCardInHand() {
        return cardInHand;
    }

    public int getPoints() {
        return points;
    }

    public static void main(String[] args) {


    }
}
