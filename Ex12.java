package day13;
import java.util.Scanner;


public class Ex12 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		double x = in.nextDouble();
		System.out.println("Enter the 2nd number");
		double y = in.nextDouble();
		System.out.println("Enter the 3rd number");
		double z = in.nextDouble();
		if(x < y && y< z) {
			System.out.println("Increasing order");
		}
		else if (x > y && y > z) {
			System.out.println("Decreasing order");
		}
		else {
			System.out.println("NEither Increasing or Decreasing order");
		}
	}

}
