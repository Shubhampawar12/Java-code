package interface1;

import java.util.Scanner;

public class Accept implements abs_1{
Scanner sc = new Scanner(System.in);
int bal = 1000;
int accno;
int newamt;
	@Override
	public void deposit() {
		System.out.println("Enter account number");
		accno = sc.nextInt();
		System.out.println("Th amount avaliable is " + bal);
		System.out.println("Enter the amount you want to deposit");
		newamt = sc.nextInt();
		bal = newamt + bal;
		System.out.println("The available amount is :" + bal );
	}

	@Override
	public void withdraw() {
		int newamt1;
		System.out.println("Enter the amoutn you want to withdraw");
		newamt1 = sc.nextInt();
		if(newamt1 > bal) {
			System.out.println("Sorry you have insuficient balance");
		}else {
		bal  = bal- newamt1;
		System.out.println("The amount aftere withdrawn " + bal);
		}
	}
	static Accept  obj1;
	public static void main(String[] args) {
		obj1 = new Accept ();
//	obj1.deposit();
//	obj1.withdraw();
	obj1.mymood();
	}
	public void mymood() {
		int n;
		System.out.println("Enter your choice// 1: Deposit 2:Withdraw" );
		n= sc.nextInt();
		switch(n) {
		case 1: 
			obj1.deposit();
			
		break;
		case 2 : 
			obj1.withdraw();
		break;
		default :
			System.out.println("Enter valid number");
		}
	}

}
