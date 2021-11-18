import java.util.*;


public class Deck {

    private List<String> rank = List.of("two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "Jack", "Queen", "King", "Ace");
    private List<String> suits = List.of("Hearts", "Diamonds", "Clubs", "Spades");
    LinkedHashMap<String,Integer> deckOfCards = new LinkedHashMap<>();
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
        int points = 0;
        keys =  new ArrayList(deckOfCards.keySet());
        Collections.shuffle(keys);
        if(String.valueOf(keys).equals("two")) points=2;
        if(String.valueOf(keys).equals("three")) points=3;
        if(String.valueOf(keys).equals("four")) points=4;
        if(String.valueOf(keys).equals("five")) points=5;
        if(String.valueOf(keys).equals("six")) points=6;
        if(String.valueOf(keys).equals("seven")) points=7;
        if(String.valueOf(keys).equals("eight")) points=8;
        if(String.valueOf(keys).equals("nine")) points=9;
        if(String.valueOf(keys).equals("ten")) points=10;
        if(String.valueOf(keys).equals("Jack")) points=10;
        if(String.valueOf(keys).equals("Queen")) points=10;
        if(String.valueOf(keys).equals("King")) points=10;
        if(String.valueOf(keys).equals("Ace")) points=11;


        deckOfCards.put(String.valueOf(keys),points);
        values = new ArrayList<>(deckOfCards.values());


    }

    public List<String> getDeckOfCards() {
        return keys;

    }

    public List<Integer> getValueOfCards()
    {

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
