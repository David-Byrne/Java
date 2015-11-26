package week5.casino;



public class Deck {

	private Card[] cards = null; 
	
	/*
	 * public Constructor with arguments.
	 */
	public Deck() {
		//initialise the cards array (size 52)
		//then insert a new unique (and valid) Card for each of the array slots
		//Your deck can't include duplicates
		cards = new Card[52];
		int i = 0;
		for(i=0; i < 52; i++)
		{
			int rank = i%13;
			int suit = i%4;
			cards[i] = new Card(suit, rank);
		}
	} 

	
	/*
	 * returns a String representation of the array of Card
	 * e.g Ace of Clubs, Two of Clubs, Three of Clubs,..
	 */
	public String toString()
	{
		String cardList = "";
		for (Card tempCard : this.cards)
		{
			cardList += (tempCard+" ");
		}
		return cardList;
	}
	
	
	/*
	 * This method shuffles the deck.
	 * There are many ways to do this
	 * One such way would be to select two random positions in the deck and swap the cards
	 * Then do this a number of times
	 */
	public void shuffle(){

		//To get a random position in the deck you could use the math.random() function
		int i = 0;
		for (i = 0; i < 100; i++)//100 swaps should be enough...
		{
		
			int pos1 = (int)(Math.random()*52);
			int pos2 = (int)(Math.random()*52);
			Card tempCard = new Card(0,0);
			tempCard = this.cards[pos1];
			this.cards[pos1] = this.cards[pos2];
			this.cards[pos2] = tempCard;
		}
	}
	
	/*
	 * This method selects the top card from the Deck
	 * It then copies all the Cards (except the top Card) in the cards array into a new array 
	 * and then sets the cards variable to point to that array
	 * This has the effect of reducing the size of he deck by one every time this 
	 * method is called
	 * The method returns the Card selected in the first step
	 */
	
	public Card removeTopCard(){
		
		
		Card selectedCard = this.cards[this.cards.length - 1];
		Card[] remainder = new Card[this.cards.length - 1] ;
		int i = 0;
		for (i = 0; i < this.cards.length -1; i++)
		{
			remainder[i] = this.cards[i];
		}
		cards = remainder;
		return selectedCard;
	}
	
}


