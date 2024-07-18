package week1.day4;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 4,3,2,8, 6, 7,10,11,12,14,19};
		Arrays.sort(arr);
		
		for(int i=0;i<(arr.length)-1;i++) {		
			int k =	(arr[i+1]) - (arr[i]);			
			if(k > 1){
				for(int j=1; j<=(k-1) ; j++) 
				System.out.print(arr[i] + j +" ");				
			}
			
		}

	}

}
