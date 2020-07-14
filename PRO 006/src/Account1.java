
	import java.util.Scanner;

	public class Account1
	{
	   private String AccountName;
	   private double balance;

	   public Account1()
	   {
	      AccountName = "John Doe";
	      balance = 0;
	   }
	   
	   public Account1(String AccountName, double balance)
	   {
	      this.AccountName = AccountName;
	      this.balance = balance;
	   }
	   
	   public void withdraw(double amount)
	   {
	      if (amount > balance)
	      {
	         balance -= 5;
	      }
	      else balance -= amount;
	   }
	   
	   public void deposit(double amount)
	   {
	      balance += amount;
	   }
	   
	   public String toString()
	   {
	      return "Account Holder: " + AccountName +
	          "\nBalance: $" + balance;
	   }
	   
	   public boolean checkEquals(Account other)
	   {
	      return this.AccountName.equals(other) &&
	             this.balance == other.balance;
	   
	   }
	}

