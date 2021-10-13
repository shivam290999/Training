package day13;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ex8 {
	public static void main(String[] args) throws FileNotFoundException {
		
		new Ex8().findLongestWords();
	}
	public String findLongestWords() throws FileNotFoundException {
		String longest_word = "";
		String current;
		Scanner sc = new Scanner (new File("/home/kumar.shivam/Downloads/sample/client.txt"));
		
		while (sc.hasNext()) {
			current = sc.next();
			if (current.length()>longest_word.length()) {
				longest_word = current;
			}
		}
		System.out.println("\n" + longest_word + "\n");
		return longest_word;
	}
}