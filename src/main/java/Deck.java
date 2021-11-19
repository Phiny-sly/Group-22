import java.util.*;


public class Deck {

    private List<String> rank = List.of("two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "Jack", "Queen", "King", "Ace");
    private List<String> suits = List.of("Hearts", "Diamonds", "Clubs", "Spades");
    private List<String> cards = new ArrayList<>();
     Map<String,Integer> deckOfCards = new LinkedHashMap<>();
    private List<String> keys;
    private List<Integer> values;


    private String concat;

    public void deck() {


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                concat = rank.get(j) + " of " + suits.get(i);
                this.cards.add(concat);

            }
        }

    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public void shuffledDeckOfCards() {
        int rankValue = 0;
        System.out.println(this.cards);
        for (String card : this.cards) {
            if (card.startsWith("two")) rankValue = 2;
            if (card.startsWith("three")) rankValue = 3;
            if (card.startsWith("four")) rankValue = 4;
            if (card.startsWith("five")) rankValue = 5;
            if (card.startsWith("six")) rankValue = 6;
            if (card.startsWith("seven")) rankValue = 7;
            if (card.startsWith("eight")) rankValue = 8;
            if (card.startsWith("nine")) rankValue = 9;
            if (card.startsWith("ten")) rankValue = 10;
            if (card.startsWith("Jack")) rankValue = 10;
            if (card.startsWith("Queen")) rankValue = 10;
            if (card.startsWith("King")) rankValue = 10;
            if (card.startsWith("Ace")) rankValue = 11;

            this.deckOfCards.put(card, rankValue);
            System.out.print(this.deckOfCards.keySet() + " :" + this.deckOfCards.values() + " ");
        }


    }

    public List<String> getDeckOfCards() {
        keys= new ArrayList<>(deckOfCards.keySet());
        return keys;
    }
    public List<Integer> getValueOfCards() {
        values = new ArrayList<>(deckOfCards.values());
        return values;
    }

}



