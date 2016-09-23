package array;

public class RotateArray {
	 public void rotate(int[] nums, int k) {
//         for(int i=0; i<k; i++){ 
//         int previous = nums[nums.length-1];
//             for(int j=0; j<nums.length;j++){
//				int temp = nums[j];
//				nums[j] = previous;
//				//nums[nums.length-1]=temp;给数组赋值，错的
//				previous=temp;
//				for(int q=0;q<nums.length;q++){
//					System.out.print(nums[q]);
//				}
//		 }
//         }
//         
//         for(int m=0; m<nums.length;m++){
//        	 System.out.print(" "+nums[m]);
//         }
		 
		 
		 int[] a = new int[nums.length];
		 for(int i=0;i<nums.length;i++){
			 a[(i+k)%nums.length]=nums[i];
		 }
		 
		 for(int j=0; j<nums.length;j++){
			 nums[j]=a[j];
		 }
		 
		 for(int m=0;m<nums.length;m++){
			 System.out.print(nums[m]);
		 }
		 
 }
	 
	 public static void main(String args[]){
		 int[] arr = new int[]{1,2,3};
		 RotateArray ra = new RotateArray();
		 ra.rotate(arr, 1);
	 }
}
