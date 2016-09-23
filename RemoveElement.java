package array;

public class RemoveElement {
	 public int removeElement(int[] nums, int val) {
	       
	        int i = 0, j = nums.length - 1;
	        for(i = 0; i <= j; i++){
	        while(nums[i] == val && i <= j){
	        
	        nums[i] = nums[j--];
	        }
	        }
	        System.out.println("j is "+(j+1));
	        return (j+1);
	       
	    }
	 
	 
	 public static void main(String args[]){
		 int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
		 RemoveElement re=new RemoveElement();
		 re.removeElement(arr,4);
	 }
}
