import java.util.Scanner;
public class Play {
private int hang = 5;
	public static void main(String[] args) {
		Hangman newGame = new Hangman();
		newGame.game();
	
	}

}
/*
 1
What is the name of the teacher?
_ _ _
Enter Letter: 
L
Correct
A
Incorrect 
You have 4 attempts 
Try Again
a
Correct
u
Correct
You escape the Gallows
-----------------------------------------------------
0
What is the name of this language?
_ _ _ _
Enter Letter: 
J
Correct
a
Correct
v
Correct
z
Incorrect 
You have 4 attempts 
Try Again
x
Incorrect 
You have 3 attempts 
Try Again
c
Incorrect 
You have 2 attempts 
Try Again
v
Incorrect 
You have 1 attempts 
Try Again
b
You have been Hung

 */

