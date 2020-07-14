import java.util.Scanner;
public class Hangman {
	private String word;
	private int hang = 5;
	
	public void question(){
		int x = (int) (Math.random()*3);
		System.out.println(x);
		if (x == 0){
			System.out.println("What is the name of this language?");
			System.out.println("_ _ _ _");
			word = "Java";
		}
		else if (x == 1){
			System.out.println("What is the name of the teacher?");
			System.out.println("_ _ _");
			word = "Lau";
		}
		else if (x ==2){
			System.out.println("What is the name of this game?");
			System.out.println("_ _ _ _ _ _ _");
			word = "Hangman";
		}
	}
	public void game(){
		question();
		System.out.println("Enter Letter: ");
		int k = 0;
		Scanner IO = new Scanner(System.in);
		String input;
		while (k < word.length()){
			input =  IO.nextLine();
			if (input.equals( word.substring(k,k+1) ) ){
				right();
				k++;
			}
			else {
				wrong();
			}
		}
		System.out.println("You escape the Gallows");
	}
	public void right(){
		System.out.println("Correct");	
	}
	public void wrong(){
		hang--;
		if (hang == 0) {
			System.out.println("You have been Hung");
			System.exit(0);
		}
		else System.out.println("Incorrect \nYou have " + hang + " attempts \nTry Again");
	}
}