//Write a program to add two matrices of the same size.
package day13;

public class ex5 {
	public static void main(String[] args) {
		
		int a[][] = {{1,2,3},{2,3,4},{3,4,5}};
		int b[][] = {{2,1,3},{2,3,4},{3,4,5}};
		int c[][] = new int[3][3];
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				System.out.println(c[i][j]+ " ");
			}
			System.out.println("\n");
		}
; 	}

}
