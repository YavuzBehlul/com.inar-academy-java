package chapters.chapter_07;

public class Exercise_29 {
    public static void main(String[] args) {

        int[] deck = makeDeck();
        int picks = 0;
        int sum = 0;
        while (sum != 24) {
            picks++;
            sum = randomDraw4Cards(deck);

            System.out.println("Summation was " + sum);
        }
        System.out.println("Drew cards " + picks + " times.");
    }

    private static int randomDraw4Cards(int[] deck) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += deck[(int) (Math.random() * 51)];
        }
        return sum;
    }


    public static int[] makeDeck() {
        int[] deck = new int[52];
        int cardNumber = 1;

        for (int i = 0; i < deck.length; i++) {
            deck[i] = cardNumber;

            if (cardNumber == 13) {
                cardNumber = 1;
                continue;
            }
            cardNumber++;

        }
        return deck;
    }
}
