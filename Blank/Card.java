public class Card{
	public final static int SPADES=0;//for 4 suits plus joker
	public final static int HEARTS=1;
	public final static int DIAMONDS=2;
	public final static int CLUBS=3;
	public final static int JOKER=4;

	public final static int ACE=1;//for non-numeric cards
	public final static int JACK=11;
	public final static int QUEEN=12;
	public final static int KING=13;

	private final int suit;
	private final int value;

	public Card(){
		suit=JOKER;
		value=1;
	}
	public Card(int theValue,int theSuit){
		if(theSuit!=SPADES&&theSuit!=HEARTS&&theSuit!=DIAMONDS&&theSuit!=CLUBS
			&&theSuit!=JOKER)
			throw new IllegalArgumentException("Illegal playing card suit.");
		if(theSuit!=JOKER&&(theValue<1||theValue>13))
			throw new IllegalArgumentException("Illegal playing card value.");
		value=theValue;
		suit=theSuit;
	}
	public int getSuit(){
		return suit;
	}
	public int getValue(){
		return value;
	}
	public String getSuitAsString(){
		switch (suit) {
			case SPADES:return "SPADES";
			case HEARTS:return "HEARTS";
			case DIAMONDS:return "DIAMONDS";
			case CLUBS:return "CLUBS";
			default:return "JOKER";
		}
	}
	public String getValueAsString(){
		if(suit==JOKER)
			return ""+value;
		else{
			switch (value) {
				case ACE:return "ACE";
				case JACK:return "JACK";
				case QUEEN:return "QUEEN";
				case KING:return "KING";
				default:return ""+value;
			}
		}
	}
	public String toString(){
		if(suit==JOKER){
			if (value==1) {
				return "JOKER";
			}else{
				return "JOKER #"+value;
			}
		}else{
			return getValueAsString()+" of "+getSuitAsString();
		}
	}
}