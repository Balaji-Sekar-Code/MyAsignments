package week1.day3;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter range:");
		Scanner obj = new Scanner(System.in);
		int range = obj.nextInt();
		
		int x=-1, x1=1, x2=0;
	//	System.out.print(x+" ");
		for(int count=1; count<=range; count++) {
			x2 =x1 + x;
			System.out.print(x2+" ");
			x=x1;
			x1=x2;
			
			
		}

	}

}
