package week1.day3;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generate123d method stub
	System.out.println("Enter Number:");
		Scanner obj = new Scanner(System.in);
		int orgNum = obj.nextInt();
		
		int tempNum = orgNum;
		int op=0, rem;
		
		
		for(int i = tempNum ; i>0; i=tempNum) {
			rem = i%10;
			op = (op*10) + rem;
			tempNum = tempNum/10;
		}
		
		if(op == orgNum ) 
			System.out.println(orgNum + " is palindrome");
		else
			System.out.println(orgNum + " is not a palindrome");
		
	}

}
