//Write a program to check whether a given string starts with the contents of another string.
package day13;

public class ex3 {
	public static void main(String[] args) {
	
	String str1 = "Kumar is my first name";
	String str2 = "Shivam is my second name";
	
	String startStr = "Kumar";
	
	boolean starts1 = str1.startsWith(startStr);
	boolean starts2 = str2.startsWith(startStr);
	
	System.out.println(str1 + " Starts with " + startStr + " ? " + starts1);
	System.out.println(str2 + " Starts with " + startStr + " ? " + starts2);
	
	
	
}
}