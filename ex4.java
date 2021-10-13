//Write a program to get the contents of a given string as a byte array.
package day13;

public class ex4 {
	public static void main(String[] args) {
		
		String str = " hello every";
		
		byte[] byte_arr = str.getBytes();
		
		String new_str = new String(byte_arr);
		
		System.out.println("new string is " + new_str + " ");
		
	}

}
