package array;

public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n){
		int res=m+n-1;
		int num1 = m-1;
		int num2 = n-1;
		while(num1>0 && num2>0){
			if(nums1[num1]>=nums2[num2]){
				nums1[res]=nums1[num1--];
			}else{
				nums1[res]=nums2[num2--];
			}
			res--;
		}
		
		while(num2>0){
			nums1[res--]=nums2[num2--];
		}
		
		
	}
	
	
	
	
}
