package week3.Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<String> list = new ArrayList<String>();
			list.add("HCL");
			list.add("Wipro");
			list.add("CTS");
			list.add("Aspire Systems");
			
			Collections.sort(list,Collections.reverseOrder());
			
			System.out.print(list);
	}

}
