package polymorhpism;

import java.util.Scanner;

public class poly_main {

	public static void main(String[] args) {
		accept();
		
	}
		public static void accept() {
			Scanner sc =  new Scanner(System.in);
			int num1,num2,num3;
			Overloading1 obj= new Overloading1();
			 System.out.println("Enter number");
			 num1 = sc.nextInt();
			 obj.poly(num1);
			 System.out.println("Enter one number");
			 num1= sc.nextInt();
			 System.out.println("Enter two number");
			 num2= sc.nextInt();
			 obj.poly(num1, num2);
			System.out.println("Enter three numbers");
			num1= sc.nextInt();
			num2 = sc.nextInt();
			num3 = sc.nextInt();
			obj.poly(num1, num2, num3);
		}

	

}
