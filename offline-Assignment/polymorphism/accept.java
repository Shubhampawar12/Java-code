package polymorhpism;

import java.util.Scanner;

public class accept {
	Scanner sc = new Scanner(System.in);
	public void accept1() {
		int n,n1;
		System.out.println("Enter the number to find the palindrome");
		n = sc.nextInt();
		System.out.println("Enter the lenght of the number");
		n1 = sc.nextInt();
		int arr[]  = new int[n1];
		System.out.println("Enter the digit");
		for(int i=0; i<n1; i++) {
			arr[i] = sc.nextInt();
		}
	}

}
