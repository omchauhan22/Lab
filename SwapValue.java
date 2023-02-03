package Feb2Lab;

public class SwapValue {
	public static void main(String[] args) {
		int a=10,b=5,temp;
		System.out.println("Before swapping value of a is: "+a);
		System.out.println("Before swapping value of b is: "+b);
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping value of a is: "+a);
		System.out.println("After swapping value of b is: "+b);
	}
}
