package week5.casino;

public class Hand {
	
	private Card[] cards;
	
	
	
	
	public Hand(int n){
		
		//you will need to initialise the cards variable with an array of size n
		cards = new Card[n];
		
	}
	
	
	/*
	 * This method adds a Card to the cards array
	 */
	
	public void addCard(Card card){
		//You need to insert a Card to the array
		//You'll need to have kept track of how many cards have been added already
		//so that you add the card in the right place (i.e. immediately after the last added one)
		int i = 0;
		for ( i = 0; i < cards.length; i++)
		{
			if (cards[i] == null)//goes through array until finds first empty position
			{
				cards[i] = card;
				break;
			}
		}
		
	}
	
	/*
	 * This method prints out the hand
	 * e.g. Ace of Clubs, 3 of Diamonds, Jack of Hearts, etc
	 */
	
	public void show() {
		int i = 0;
		System.out.print("Hand:");
		for ( i = 0; i < cards.length; i++)
		{
			if (cards[i] != null)//goes through array until finds first empty position
			{
				System.out.print(cards[i].toString());
				System.out.print(";  ");
				
			}
		}
		//System.out.println(" ");
		
	}

}
