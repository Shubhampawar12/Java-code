package polymorhpism;

public class overrinding  {
	public void add() {
		int n=0,sum=0;
		int n1=0;
		int arr[] = new int[n1];
		while(n>0) {
			sum = sum+n%10;
			n=n/10;
		}
		System.out.println("The sum of the digit is " +sum);
	}

}
