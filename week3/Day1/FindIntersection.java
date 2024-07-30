package week3.Day1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<Integer>() {{ add(3); add(2); add(11); add(4); add(6); add(7);}};
		
		List<Integer> list2 = new ArrayList<Integer>() {{ add(1); add(2); add(8); add(4); add(9); add(7);}};
		//list1.add(null)
		
		System.out.println("List1:"+list1+"\n"+"List2:"+list2);
						
		
		for(int i=0; i<list1.size(); i++) {
			for(int j=0; j<list2.size(); j++) {
				if(list1.get(i) == list2.get(j)) {
					System.out.print(list1.get(i)+" ");
				}
			}
		}
	}

}
