package polymorhpism;



public class Overloading1 {
	public void poly(int n) {
		int r,sum = 0;
	
		while(n>0) {
		r = n%10;
		sum = sum*10+r;
	    n= n/10;	
		}
		System.out.println(" "+ sum);

	}
	public void poly(int m,int n) {
		
		System.out.println("Numbers before swaping " + m + " and " + n);
		 int temp;  
		 temp = n;
		 n = m;
		 m= temp;
		 System.out.println("Number after swaping " + m + " and " +n);

		
	}
	public void poly(int n1,int n2,int n3) {
		if(n1>n2 && n1>n3) {
			System.out.println( n1 + " n1 is greater ");
		}else if(n2>n1 && n2>n3) {
			System.out.println( n2 + " n2 is greater ");
		}else {
			System.out.println(n3 + " n3 is greater");
		}
		
	
	}
	}
