package week3.Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeconsLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>() {{add(3); add(2); add(11); add(4); add(6); add(7);}}; 
		
		int length = list.size();
		
		Collections.sort(list);
		System.out.println(list.get(length-2));

	}

}
