package Feb2Lab;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter second number: ");
		int num2=sc.nextInt();
		System.out.println("Enter third number: ");
		int num3=sc.nextInt();
		System.out.println("Enter fourth number: ");
		int num4=sc.nextInt();
		System.out.println("Enter fivth number: ");
		int num5=sc.nextInt();
		System.out.println("The average  of all number is: "+(num1+num2+num3+num4+num5)/5);
		
	}
	
}
