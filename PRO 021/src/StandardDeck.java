 import java.util.*;
    public class StandardDeck
   {
      ArrayList<Card> deck = new ArrayList<Card>(52);
       public StandardDeck()
      {
         buildDeck();
      }
       public void buildDeck()
      {
      int value, suit;
      for (int k = 0; k<4; k++){
    	  for (int i = 0; i < 13; i++){
    		  value = i; suit = k;
    		  Card newCard = new Card(value,suit);
    		  deck.add(newCard);
    	  }
      }
      }
       public Card removeFirstCard()
      {
    	   return deck.remove(0);
      }
       public void shuffleDeck()//basic clone method with Math.random implementation 
      {
    	   Card temp1, temp2; int randShuffle;
      for (int k = 0; k< deck.size()/2; k++){
    	  randShuffle = (int)(Math.random()*deck.size());
    	  temp1  = deck.get(k);
    	  temp2 = deck.get(randShuffle);
    	  deck.set(k,  temp2);
    	  deck.set(randShuffle, temp1); 
      }
      }
       public int numberOfCards()
      {
		return deck.size();
      }
       public void addCard(int v, int s)
      { 
    	   Card added = new Card(v,s);boolean bad = false;
    	   for (int k = 0; k < deck.size(); k++){		  
    		   if (deck.get(k).equals(added)){
    			   bad = true;
    		   }   
    	   }
    	   if (bad == false){
			  deck.add(added);
    	   }   	   
      }
       public String toString()
      {
		String printCards = "";int k = 0;
		while (k < deck.size())
		{printCards += " |"+deck.get(k) +"|";k++;} 
    	   return "||"+deck.size() + "||\n" + printCards + "||||||";
      }
       public void reset(){
    	   int k = deck.size()-1;
    	   while (k != -1){
    		   deck.remove(k);
    		   k--;
    	   }
    	   buildDeck();
    	   shuffleDeck();
      }
       public static int factorial(int x) { int factorial = 1; while (x > 1) { factorial = factorial * x; x--; } return factorial; }
       public static void main(String [] args)
      {
         System.out.println(factorial(52));
    	  StandardDeck s = new StandardDeck();
         System.out.println(s);
         s.removeFirstCard();
         System.out.println(s); // testing removeFirstCard() method, and it works
         s.addCard(0,0); // testing the addCard() method, to see if it will add a card that is already in the deck; it doesn't so it works
         s.shuffleDeck(); // testing shuffleDeck() method
         System.out.println(s); // printing s after it has been shuffled, and it printed as I expected it to
         s.reset(); // testing reset() method
         System.out.println(s); // now should contain cards all shuffled
         System.out.println(s.numberOfCards()); // should return 52	

         Card c = new Card(12, 0);
         Hand h =new Hand();  // default constructor
         Hand h2 = new Hand(c); // non-default constructor
         h.addCard(12, 3); // adding a card to h
         System.out.println(h.numberOfCards()); // should return 1
         System.out.println(h.getCard(0) + "\n" + h2.getCard(0)); // should return Ace of Spades and Ace of Clubs
         System.out.println(h.ifSameValue(12) + "\n" + h.ifSameSuit(3)); // true true
         System.out.println(h2.ifSameValue(3) + "\n" + h2.ifSameSuit(3)); // false false
         h.removeCard(0); // removes card
         System.out.println(h2); // tests toString method
         System.out.println(h); // tests toString method again
      } // end of main   	
   } // class
