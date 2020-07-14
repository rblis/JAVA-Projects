//**********************************************************
// Assignment: Account Lab
// Author: Ryan Biswas
// Period:	6	
// Purpose: practice and implementation of Class objects
// Date: 11/11/13
//
// Completion time: 15 min
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from nobody in designing and debugging my program.
 
//*********************************************************
public class Account {

	
	static int balance;
	
	public Account(){
		this.balance = 0; 
	}
	public Account(int bal){
		this.balance = bal;
	}
	public String toString(){
		return "Balance: : " + balance;
	}
	public boolean equals(Account other){
		return this.balance == other.balance;
	}
	public  void addMoney(int add){
		balance += add;
	}
	public void takeMoney(int take){
		balance -= take;
	}
	public int checkMoney(){
		return balance;
	}	
}

/*
Withdraw how much?// 55 withdrawn when I have only 50 :(
5$ penalty; Not enough funds
-10
*/