package day13;
import java.io.*;
import java.util.*;

public class ec7 {
	public static void main(String[] args) {
		
		File myFile = new File("/home/kumar.shivam/Downloads/day13/src/day13/ec7.java");
		
		long modifiedValue = myFile.lastModified();
		Date modifiedDate = new Date(modifiedValue);
		System.out.println(modifiedDate);
	}
	

}
