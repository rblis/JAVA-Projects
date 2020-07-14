import java.util.Scanner;
public class vfsuj {

	public static void main(String []args){
		Scanner ABC = new Scanner(System.in);
		int small = ABC.nextInt();
		int big = ABC.nextInt();
		int goal = ABC.nextInt();
		if ((small +5*big >= goal)&&(small>=big*5))
			System.out.println("true");
		else
			System.out.println("false");
		
	}
}