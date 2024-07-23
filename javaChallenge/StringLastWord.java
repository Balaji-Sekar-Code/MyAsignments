package javaChallenge;
import java.util.Scanner;

public class nonSpaceCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.nextLine();
		
		String[] tempStr = str.split(" ");
		int len = tempStr.length;
		
		System.out.println(tempStr[len-1]);
		
	}

}
