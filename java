write a program to find area of the circle and circumfernece of the circle

import java.util.Scanner;

public class Area{
 
  public static void main(String[] args){
  
  double radius , area, circum;
  Scanner input = new Scanner(System.in);
  
   System.out.println("Enter the radius of the circle");
   radius = input.nextDouble();
   input.close();
   
   area = Math.PI * radius * radius;
   circum = 3.14*2*radius;
   System.out.println("Area of the Circle is "+area);
   System.out.println("Circumference of a circle is "  +circum);
   }
   }
   
   
   
   Write  a program to calculate the simple interest
   
   public class Si
 {  
   public static void main (String args[])  
    {   float p, r,  t,  si; 
	// principal amount, rate, time and simple interest respectively  
              p = 13000;  r = 12; t = 2;  
               si  = (p*r*t)/100;   
              System.out.println("Simple Interest is: " +si);  
    }
	}
