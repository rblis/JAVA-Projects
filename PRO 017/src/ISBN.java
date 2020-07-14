/*Ryan Biswas
Period 6 Lau
12/24/13
ISBN CHECKER
Purpose: Practice using String methods and converting values 
Completion time:  30 min
Honor code: I pledge that this program represents
my own program code. Google how-to: 'parseInt', ' 'toString', 'toUpperCase'*/
import java.util.Scanner;
public class ISBN {
	public static void main(String[] args) {
		Scanner IO = new Scanner(System.in);
		System.out.println("Enter ISBN: ");
		System.out.println(checkISBN(IO.nextLine()));	
	}
	public static boolean checkISBN(String isbn){
		String xxx = noDash(isbn);
		int check = 0;
		int checker = 10;
		int num;
		for (int k =0; k <9; k++){                                                        
			num = Integer.parseInt(xxx.substring(k,k+1));
			check += checker * num;
			checker--;
		}
		check = check % 11;
		check = 11 - check;
		
		String sumMod = Integer.toString(check);
		String lastDig = lastDigit(xxx); 
		
		if ((sumMod.equals(lastDig)) || ((sumMod.equals("10")) && (lastDig.equals("X")))) return true;
		else return false;	
	}
	public static String lastDigit(String isbn){
		return isbn.substring(9,10).toUpperCase();
	}
	public static String noDash(String dash){
		String xxx = "";
		for (int k = 0; k< dash.length(); k++){
			if (!(dash.substring(k, k+1).equals("-"))){
				xxx += dash.substring(k,k+1);
			}
		}
		return xxx;
	}
}
/*
Enter ISBN: 
0670-03441-x
true
Enter ISBN: 
0-201-45858-3
false*/