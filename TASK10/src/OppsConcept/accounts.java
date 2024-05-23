package OppsConcept;

import java.util.Scanner;

public class accounts {
private double balance,amount;
	
	//Constructor with no arguments
	accounts(){
		balance=0.0;
		amount=0.0;
	}
	
	//constructor with arguments
	accounts(double bal){
		balance=bal;
	}
	//Creating getter and setter methods for the given attributes
	public double getbalance() {
		 return balance;
	}
	public void setbalance(double bal) {
		balance=bal;
	}
	//method withdraw to check the remaining balance
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance)
		{
			balance=balance-amount;
			System.out.println("The withdrawn amount is:" + amount);
		}
		else
		{
			System.out.println("You dont have enough amount");
		}
	}
	
	//To calculate the deposited amount and total the sum amount
	public void depositBalance(double amount) {
		if(amount>0)
		{
			balance=balance+amount;
			System.out.println("The deposited amount is:" + amount);
		}
		else 
		{
		System.out.println("Invalid Deposit");	
		}
	}
	public double balance1() {
		return balance;
	}
	public static void main(String[] args) {
		
		// create a circle object using the constructor with no arguments
		accounts acc=new accounts();
		System.out.println("Initial Balance is :" + acc.balance1());
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the amount to deposit:");
		double amount=sc.nextDouble();
		acc.depositBalance(amount);
		System.out.println("Your new balance after deposit is :"+ acc.balance1());
		
		System.out.println("Enter the amount to withdraw:");
		double drawn=sc.nextDouble();
		acc.withdraw(drawn);
		System.out.println("Your balance after withdrawn is:" + acc.balance1());
		
		// create a circle object using the constructor with one arguments\
		System.out.println("Your balance:");
		double ini=sc.nextDouble();
		accounts acc1=new accounts(ini);
		System.out.println("Your Balance after deposit :" +acc1.balance1());
		
		System.out.println("Enter the amount to Deposit:");
		double depo=sc.nextDouble();
		acc1.depositBalance(depo);
		System.out.println("Your new balance after Deposit is :"+ acc1.balance1());
		
		System.out.println("Enter the amount to withdraw:");
		double draw1=sc.nextDouble();
		acc1.withdraw(draw1);
		System.out.println("Your balance after withdrawn is:" + acc1.balance1());

	}

}


