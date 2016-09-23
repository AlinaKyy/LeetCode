package array;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicated {
	public boolean containsDuplicated(int[] nums){
		Set<Integer> hs= new HashSet<>(nums.length);
		for(int n: nums){
			if(hs.contains(n)){
				return true;
			}else{
				hs.add(n);	
			}
		}
		return false;
		
	}
	
	public static void main(String args[]){
		int[] arr = new int[]{3,4,4,5};
		ContainDuplicated c = new ContainDuplicated();
		c.containsDuplicated(arr);
		
	}

	
}
