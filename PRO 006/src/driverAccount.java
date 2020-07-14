import java.util.Scanner;
public class driverAccount {

	public static void main(String[] args) {
		Account Ryan = new Account(50);
		Scanner ABC = new Scanner(System.in);
		System.out.println("Withdraw how much?");
		int x = ABC.nextInt();
		if (x > Account.balance){
			System.out.println("5$ penalty; Not enough funds");
			Ryan.takeMoney(5);
			System.out.println(Account.balance - x + " you are in debt");
			}
	}

}
