package day13;
import java.util.*;

public class ex51 {
	public static void main(String[] args) {
	
	int a[][]=new int[2][2];
	int b[][]=new int[2][2];
	int c[][]=new int[2][2];
	Scanner sc=new Scanner(System.in);
	
	System.out.println("\nmat a");
	
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("\n mat b");
	
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			b[i][j]=sc.nextInt();
		}

}
	System.out.println("\n mat c");
	
	
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			c[i][j]=sc.nextInt();
		}
}
	
	for(int i=0;i<2;i++) {
		for(int j=0;j<3;j++) {
			System.out.println(c[i][j]+ " ");
		}
		System.out.println("\n");
	}
}
}