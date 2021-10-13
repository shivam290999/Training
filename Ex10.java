package day13;
import java.io.*;
import java.util.*;

public class Ex10 {
	public static void main(String[] args) throws IOException {
		FileReader fd = new FileReader("/home/kumar.shivam/Downloads/sample/client.txt\"");
		Scanner sc = new Scanner(fd);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		
	}

}
