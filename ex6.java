package day13;
import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter tge String");
		String str = in.nextLine();
		
		System.out.print("No. of Vowels in a string " + count_Vowels(str)+"\n");
	}
	public static int count_Vowels(String str) {
		int count = 0;
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
				count++;
			}
		}
		return count;
	}

}
