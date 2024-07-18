package week1.day4;

public class FindDups {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num = {2,5,7,7,5,9,2,3,7,2};
		int arrLen = num.length;
		int k=0;
		int [] arr2 = {};
		for(int i=0; i<arrLen; i++) {	
			for(int j=i+1;j<arrLen;j++) {
				if(num[i] == num[j]) {										
					/*arr2[k++] = num[i];
					break;*/
					System.out.print(num[i]+" ");
				}				
			}
		}
	}
}
