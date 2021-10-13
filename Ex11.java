package day13;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = in.nextInt();
		if (n > 0)
		{
			System.out.print("Number is positive");
			
		}
		else if (n<0) {
			System.out.print("Number is negitive");
		}
		else
		{
			System.out.print("Number is Zero");
		}
	}
}
