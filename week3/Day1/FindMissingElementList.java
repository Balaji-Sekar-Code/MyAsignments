package week3.Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>() {{  add(3); add(4); add(10); add(6); add(8); add
(15);}};
		
			
		Collections.sort(list);
		
		System.out.println("List:"+list);
		for(int i=0; i<(list.size())-1; i++) {
			if(list.get(i+1) != list.get(i)+1 ) {			
				for(int j=list.get(i) +1; j<list.get(i+1); j++ ) {				
					System.out.print(j+" ");
				}
			}
		}
	}

}
