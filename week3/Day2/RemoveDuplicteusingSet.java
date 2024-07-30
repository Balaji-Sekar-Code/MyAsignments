package week3.Day2;

import java.util.LinkedHashSet;
//import java.util.HashSet;
import java.util.Set;
//import java.util.TreeSet;

public class RemoveDuplicteusingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String str = "google";
		char[] charArr = str.toCharArray();		
		Set<Character> dups = new LinkedHashSet<Character>();		
		int len = charArr.length;		
		for(int i=0;i<len; i++) {
			dups.add(charArr[i]);			
		}
		System.out.println(dups);
		
		String str2 = new String();
		for(char ch: dups) {
			System.out.println(ch);
			str2 = str2 + ch;
		}
		System.out.println(str2.toString());		
	}

}
