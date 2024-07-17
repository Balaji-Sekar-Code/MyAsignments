package week1.day3;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a Number:");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		
		if(num <0 )
			System.out.println(num +" is not a prine number");
				
		for(int i=2; i<=(num/2); i++) {
			if (num%i !=0 ) {
				System.out.println(num+" is prime number");
				break;
			}	
			else{
			
				System.out.println(num+" is not a prime number");
				break;
			}
		}

	}

}
