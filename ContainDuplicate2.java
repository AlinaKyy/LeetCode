package array;

import java.util.HashMap;
import java.util.Map;

public class ContainDuplicate2 {

	public void show(){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Integer i = map.put(0, 1);
		System.out.println(i);
	}
	public static void main(String args[]){
		ContainDuplicate2 c = new ContainDuplicate2();
		c.show();
	
	}
}
