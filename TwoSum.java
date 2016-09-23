/**
 * 2016/9/11
 * Given an array of integers, 
 * return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 */
package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public  int[] twosum(int[] nums, int target){
		Map<Integer,Integer> hs = new HashMap<Integer,Integer>();
		//Map<Integer,Integer> res = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
				for(int j=i+1;j<nums.length;j++){
					if(nums[i]+nums[j]==target){
						hs.put(0, i);
						hs.put(1, j);
					}
				}
			}
			
		
		int[] arr = new int[2];
		arr[0]=hs.get(0);
		arr[1]=hs.get(1);
		for(int m=0;m<arr.length;m++){
			System.out.print(arr[m]);
		}
		return arr;
		}

	public static void main(String args[]){
		TwoSum ts = new TwoSum();
		int[] arr = new int[]{2,9,11,15};
		
		ts.twosum(arr, 17);
	}
}
