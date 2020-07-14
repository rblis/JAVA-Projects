/*Ryan Biswas
Period 6 Lau
12/19/13
PALINDROME + SENTENCEINFO
Purpose: Practice using String methods

Completion time:  5 hours

Honor code: I pledge that this program represents
my own program code. I have received help from Max Zheng
in designing and debugging my program. */
import java.util.Scanner;
public class Palindrome {
	public static void main (String [] args){
		String s;
		Scanner IO = new Scanner (System.in);
		
		for (int k = 1; k < 8; k++){
			System.out.print("Enter a string: ");
			s = IO.nextLine();
			
			stat(s);
		}
	}
	public static boolean check(String s){
		s = space(s);
		int begin = 0;
		int end = s.length()-1;
		
		
		boolean Pal = false;
		char endChar, beginChar;
		
		while(end>begin){
			
			endChar = s.charAt(end);
			
			beginChar = s.charAt(begin);
			
			if (beginChar == (endChar)) return true;
			else if (s.length()%2 == 0 && end-begin == 1) return true;
			
			
			end--;	//a and b are counters that start from opposite sides of the string
			begin++;	//the while loop terminates when they both equal the same (middle point on string)
		}
		return false;
	}
	
	public static String noSpace(String s){//not working
		String ns = "";
		int k, j =0;
		while(true){
		k = s.indexOf(' ');		// finds space in s String
		j++;					//counter for amount of spaces in string
		ns += s.substring(0,k); //adds the letters between 0 and k(space) to new String ns
		s = s.substring(k);		//Sets s String to all the characters after k (space)
		
		if (ns.length() == s.length()-j) break;
		}
		return ns;
	}	
	
	public static String space(String s){//max helped me on this, i did change it to my own though
		String word="";

	      for(int i=0;i<=s.length()-1;i++)
	      {
	         if(!(s.substring(i,i+1).equals(" ")))
	            word+=s.substring(i,i+1);
	      }       
	      return word;   
	}
	 public static double word(String s){//max helped me on this, i did change it to my own though
			double word = 1;

		      for(int i=0;i<=s.length()-1;i++)
		      {
		         if((s.substring(i,i+1).equals(" ")))
		            word++;;
		      }       
		      return word;   
		}
		
		public static void stat(String s){
			System.out.println("Length of Sentence: " + s.length() + "\nNumber of Words: " 
			+ word(s) + "\nAverage word length: " + word(s)/s.length() + "\nPalindrome? " + check(s) + "\n");
		}
		
	
}
/*
Enter a string: radar
Length of Sentence: 5
Number of Words: 1.0
Average word length: 0.2
Palindrome? true

Enter a string: 727
Length of Sentence: 3
Number of Words: 1.0
Average word length: 0.3333333333333333
Palindrome? true

Enter a string: a Toyota
Length of Sentence: 8
Number of Words: 2.0
Average word length: 0.25
Palindrome? true

Enter a string: race car
Length of Sentence: 8
Number of Words: 2.0
Average word length: 0.25
Palindrome? true

Enter a string: not palindrome
Length of Sentence: 14
Number of Words: 2.0
Average word length: 0.14285714285714285
Palindrome? false

 */
	
	
	