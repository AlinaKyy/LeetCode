package array;

public class SellStock {

	public int maxProfit(int[] prices){
		int min = Integer.MAX_VALUE;
		int difference = 0;
		for(int n:prices){
			min = Math.min(min, n);
			difference = Math.max(difference, n-min);
		}
		System.out.println(difference);
		return difference;
	}
	
	
	
	public static void main(String args[]){
		
		int[] arr = new int[]{7,6,4,3,1};
		SellStock ss = new SellStock();
		ss.maxProfit(arr);
	}
}
