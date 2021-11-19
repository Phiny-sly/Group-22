import java.util.ArrayList;
import java.util.List;

public class Player {


    private String name;
    private Deck deck = new Deck();
    private List<String> cardInHand = new ArrayList<>();
    private int score = 0;

    public Player(String name) {
        this.name = name;

    }

    public void hand(Deck deck) {
        this.deck = deck;
        cardInHand.add(this.deck.getDeckOfCards().get(0));
        score += deck.getValueOfCards().get(0);
        this.deck.deckOfCards.remove(this.deck.getDeckOfCards().get(0),deck.getValueOfCards().get(0));


        cardInHand.add(this.deck.getDeckOfCards().get(0));
        score += deck.getValueOfCards().get(0);
        this.deck.deckOfCards.remove(this.deck.getDeckOfCards().get(0),deck.getValueOfCards().get(0));

    }

    public void hit()
    {
        System.out.println("Hit");
        cardInHand.add(this.deck.getDeckOfCards().get(0));
        score += deck.getValueOfCards().get(0);
        this.deck.deckOfCards.remove(this.deck.getDeckOfCards().get(0),deck.getValueOfCards().get(0));
    }

    public void stick()
    {
        System.out.println(" Stick");
    }

    public List<String> getCardInHand() {
        return cardInHand;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

}
