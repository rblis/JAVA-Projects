import java.util.*;
public class Hand
{

    private ArrayList <Card> hand =  new ArrayList<Card>();
	public Hand()
	{}
	public Hand(Card c)
	{
		hand.add(c);
	}
	public int numberOfCards()
	{
		return hand.size();
	}
	public Card getCard(int c)
	{
		return hand.get(c);		
	}
	public void removeCard(int c)
	{
		hand.remove(c);
	}
	public boolean ifSameValue(int value)
	{
		for(int k =0; k < hand.size();k++){
			if(hand.get(k).getValue() == value){
				return true;
			}
		}
		return false;
	}
	public boolean ifSameSuit(int suit)
	{
		for(int k =0; k < hand.size();k++){
			if(hand.get(k).getSuit() == suit){
				return true;
			}
		}
		return false;
	}
	public String toString()
	{
		String printCards = "";int k = 0;
		while (k < hand.size())
		{printCards += "|"+hand.get(k) +"|"+ "\n";k++;} 
    	   return "||"+hand.size() + "||\n" + printCards;
	}
   public void addCard(int v, int s)
      {
	   Card added = new Card(v,s);boolean bad = false;
	   for (int k = 0; k < hand.size(); k++){		  
		   if (hand.get(k).equals(added)){
			   bad = true;
		   }   
	   }
	   if (bad == false){
		  hand.add(added);
	   }
      }	   
} // class
/*Deck
||52||
 |2C| |3C| |4C| |5C| |6C| |7C| |8C| |9C| |10C| |JC| |QC| |KC| |AC| |2D| |3D| |4D| |5D| |6D| |7D| |8D| |9D| |10D| |JD| |QD| |KD| |AD| |2H| |3H| |4H| |5H| |6H| |7H| |8H| |9H| |10H| |JH| |QH| |KH| |AH| |2S| |3S| |4S| |5S| |6S| |7S| |8S| |9S| |10S| |JS| |QS| |KS| |AS|||||||
||51||
 |3C| |4C| |5C| |6C| |7C| |8C| |9C| |10C| |JC| |QC| |KC| |AC| |2D| |3D| |4D| |5D| |6D| |7D| |8D| |9D| |10D| |JD| |QD| |KD| |AD| |2H| |3H| |4H| |5H| |6H| |7H| |8H| |9H| |10H| |JH| |QH| |KH| |AH| |2S| |3S| |4S| |5S| |6S| |7S| |8S| |9S| |10S| |JS| |QS| |KS| |AS|||||||
||52||
 |2H| |AC| |10S| |JD| |2D| |5S| |10D| |7D| |5D| |JH| |KC| |4D| |7S| |KH| |9S| |QD| |10C| |4S| |7C| |2C| |3S| |JC| |KD| |8S| |QS| |AH| |3H| |4H| |5H| |6H| |7H| |8H| |9H| |10H| |QC| |QH| |3D| |3C| |2S| |9C| |6D| |8C| |6S| |8D| |6C| |4C| |5C| |JS| |AD| |KS| |AS| |9D|||||||
||52||
 |10D| |10C| |7D| |JH| |3S| |6H| |3H| |2S| |2C| |3D| |9D| |6S| |JD| |6D| |2H| |8S| |KS| |QC| |7H| |10H| |4D| |8D| |4C| |AD| |JC| |2D| |KD| |8C| |4H| |5H| |7C| |AC| |8H| |9H| |3C| |5C| |QH| |KH| |AH| |9C| |6C| |4S| |5S| |KC| |7S| |QD| |9S| |10S| |JS| |QS| |5D| |AS|||||||
52
------Hand
1
AS
AC
true
true
false
false
||1||
|AC|
||0||
*/