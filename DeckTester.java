package CardProj;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 * 
	 * @param args
	 *            is not used.
	 */
	public static void main(String[] args) {  //I created 3 different tries, of all different values, to test. 
		String[] ranks1 = { "A", "B", "C" };
		String[] suits1 = { "Giraffes", "Lions" };
		int[] values1 = { 1, 2, 3 };
		System.out.println("Deck 1:");
		Deck myDeck1 = new Deck(ranks1, suits1, values1);
		System.out.print(myDeck1.toString());

		String[] ranks2 = { "Ace", "2", "3", "4", };
		String[] suits2 = { "Hearts", "Clubs", "Spades", "Diamonds" };
		int[] values2 = { 1, 2, 3, 4 };
		Deck myDeck2 = new Deck(ranks2, suits2, values2);
		System.out.println("Deck 2:");
		System.out.print(myDeck2.toString());

		String[] ranks3 = { "Jack", "Queen", "King" };
		String[] suits3 = { "Hearts", "Spades", "Diamonds" };
		int[] values3 = { 12, 13, 14 };
		Deck myDeck3 = new Deck(ranks3, suits3, values3);
		System.out.println("Deck 3:");
		System.out.print(myDeck3.toString());
	}
}
