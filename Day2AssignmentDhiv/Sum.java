import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int a,b,sum;
		System.out.println("Enter 1st number: ");
		Scanner s = new  Scanner(System.in);
		a= s.nextInt();
		System.out.println("The 1st number you have entered is: "+a);
		s.nextLine();
		System.out.println("Enter 2nd number: ");
		Scanner sc = new  Scanner(System.in);
		b=sc.nextInt();
		System.out.println("The 2nd number you have entered is: "+b);
		sum= a+b;
		System.out.println("Sum of two number is: "+sum);
	}
}
