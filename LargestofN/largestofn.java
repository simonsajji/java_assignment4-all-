package LargestofN;

public class largestofn {
public static void main(String args[]) {
		
		int[] arr= {3,77,34,12,12,33,56,23,88,33,5,7,8};
		int max=0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
			
		}
		System.out.println("the max of N numebers is:"+max);

}
}
