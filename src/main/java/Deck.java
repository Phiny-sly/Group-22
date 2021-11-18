import java.util.*;


public class Deck {

    private List<String> rank = List.of("two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "Jack", "Queen", "King", "Ace");
    private List<String> suits = List.of("Hearts", "Diamonds", "Clubs", "Spades");
    Map<String,Integer> deckOfCards = new HashMap<>();
    List<String> keys;
    List<Integer> values;



    private String concat;

    public void deck() {


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++)
            {
                int points = 0;
                concat = rank.get(j) + " of " + suits.get(i);
                deckOfCards.put(concat,0);

            }
        }

    }

    public void shuffle() {

        keys =  new ArrayList(deckOfCards.keySet());
        Collections.shuffle(keys);

        for(String card:keys)
        {
            int points = 0;

            if(card.contains("two")) points=2;
            else if(card.contains("three")) points=3;
            else if(card.contains("four")) points=4;
            else if(card.contains("five")) points=5;
            else if(card.contains("six")) points=6;
            else if(card.contains("seven")) points=7;
            else if(card.contains("eight")) points=8;
            else if(card.contains("nine")) points=9;
            else if(card.contains("ten")) points=10;
            else if(card.contains("Jack")) points=10;
            else if(card.contains("Queen")) points=10;
            else if(card.contains("King")) points=10;
            else if(card.contains("Ace")) points=11;
            deckOfCards.put(card,points);
        }





    }

    public List<String> getDeckOfCards() {
        return keys;

    }

    public List<Integer> getValueOfCards()
    {
        values = new ArrayList(deckOfCards.values());
        return values;

    }

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.deck();

        deck.shuffle();
        System.out.println(deck.getDeckOfCards());
        System.out.println(deck.getValueOfCards());

        Player player1 = new Player("Phiny");
        player1.hand(deck);
        System.out.println(player1.getCardInHand());
        System.out.println(player1.getPoints());
        System.out.println(deck.getDeckOfCards());

        Player player2 = new Player("Ray");
        player2.hand(deck);
        System.out.println(player2.getCardInHand());
        System.out.println(player2.getPoints());
        System.out.println(deck.getDeckOfCards());

        Player player3 = new Player("Grey");
        player3.hand(deck);
        System.out.println(player3.getCardInHand());
        System.out.println(player3.getPoints());



    }


}
