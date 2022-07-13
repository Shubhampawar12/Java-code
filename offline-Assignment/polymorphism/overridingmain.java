package polymorhpism;

import java.util.Scanner;

public class overridingmain extends Overiding {

	public static void main(String[] args) {

		Overiding obj1 = new Overiding();
//		obj1.palin();
	
		overridingmain obj2 = new overridingmain();
//		obj2.palin();
		Overiding obj3 = new overridingmain();
		obj3.palin();

		
		
	}
	public void palin() {
		System.out.println("Child method");
		
	}
	
}
	
	


