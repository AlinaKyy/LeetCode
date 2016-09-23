package array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PascalTriangle {

	public List<List<Integer>> generate(int numRows){
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		List<Integer> temp = null;
		List<Integer> pre = null;
		
		for(int i=1;i<=numRows;i++){
			temp = new ArrayList<Integer>(i);
			temp.add(1);
			if(pre!= null){
				fill(temp,pre);
			}
			result.add(temp);
			pre=temp;
		}
		
		System.out.println(result.toString());
		return result;
	}
	
	public void fill(List<Integer> temp, List<Integer> pre){
		int size = pre.size();
		for(int i=1;i<size;i++){
			temp.add(pre.get(i)+pre.get(i-1));
		}
		temp.add(1);
	}
	
	
	public static void main(String args[]){
		PascalTriangle pt = new PascalTriangle();
		pt.generate(4);
	}
	
}
